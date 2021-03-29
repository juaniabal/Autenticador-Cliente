/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login.DAO;

import DataBase.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author Agroa
 */
public class UserDAO implements IUserDAO {

    private String update = "UPDATE USUARIO SET ";
    private String select = "SELECT * FROM USUARIO WHERE ";
    private String insert = "INSERT INTO USUARIO (nomusu,contrasena,ci_persona,idestado,primerautorizador,fechaprimerautorizacion) values ";
    private String delete = "DELETE FROM USUARIO WHERE ";
    private String user = null;
    private String contrasena = "";
    DatabaseConnection dbconn = DatabaseConnection.getInstance();
    public String userName;
    private String createPerson = "insert into persona (ci_persona,nombre,apellido,telefono,email) values (";

    @Override
    public int logIn(String usuario, String contrasena) {
        Connection con = null;
        try {
            dbconn.setUser(usuario);
            userName = usuario;
            dbconn.setPassword(contrasena);
            con = dbconn.getCurrentConnection();
            Statement s = con.createStatement();

            ResultSet rs = s.executeQuery("select * from usuario");
            return 100;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            if (e.getMessage().contains("password authentication")) {
                return 101;
            } else if (e.getMessage().contains("El intento de conexión falló")) {
                return 102;
            } else {
                return 103;
            }

        }
    }

    @Override
    public boolean selectUser(String usuario, String contrasena) {
        Connection con = null;
        try {
            con = dbconn.getCurrentConnection();
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from usuario");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public HashMap<Integer, String> selectApplications() {
        Connection con = null;
        HashMap<Integer, String> applications = new HashMap<>();
        try {
            con = dbconn.getCurrentConnection();
            Statement s = con.createStatement();

            ResultSet rs = s.executeQuery("select * from usu_aplicacion where usu_apl_nomusu = " + "'" + dbconn.getUser() + "' and reg_status = 0");
            while (rs.next()) {
                applications.put(rs.getInt("idaplicacion"), rs.getString("usu_apl_nomusu"));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return applications;
        }
        return applications;
    }

}
/*
    public HashMap<Integer,String> selectMenu() {
        try {
            HashMap<Integer,String> selectedItems = new HashMap<>();
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://192.168.56.102:5432/proyecto";
            try (Connection con = DriverManager.getConnection(url, dbconn.getUser(), dbconn.getPassword());
                    Statement s = con.createStatement()) {

                ResultSet rs = s.executeQuery("select * from menu");
                while(rs.next()){
                    selectedItems.put(rs.getInt("idmenu"), rs.getString("nombre"));
                }
 */
