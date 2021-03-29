/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rol.DAO;

import DataBase.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author juani
 */
public class RoleDAO implements IRoleDAO {

    private String selectUser = "select * from rol_usuario where rol_usu_nomusu=";
    DatabaseConnection dbconn = DatabaseConnection.getInstance();

    @Override
    public ArrayList<Integer> getIDRole(String userName) {
        Connection con = dbconn.getCurrentConnection();
        ArrayList<Integer> idRoles = new ArrayList<>();
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(selectUser + "'" + userName + "' and reg_status = 0");
            while (rs.next()) {
                idRoles.add(rs.getInt("rol_usu_idrol"));
            }
            return idRoles;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return null;
    }

}
