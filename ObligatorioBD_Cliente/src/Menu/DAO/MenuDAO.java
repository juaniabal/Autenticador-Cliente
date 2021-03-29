/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu.DAO;

import DataBase.DatabaseConnection;
import Menu.Model.Menu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author juani
 */
public class MenuDAO implements IMenuDAO {

    private String selectRolMenues = "select m.idmenu as idmenu,m.nombre as nombre from rol_menu rm, menu m where rm.idrol=";
    private String selectMenu = "select * from menu where idmenu=";
    DatabaseConnection dbconn = DatabaseConnection.getInstance();

    @Override
    public HashMap<String, Integer> getMenuesID(ArrayList<Integer> idRol,int idaplicacion) {
        Connection con = dbconn.getCurrentConnection();
        try {
            HashMap<String, Integer> selectedItems = new HashMap<>();

            Statement s = con.createStatement();
            for (Integer id : idRol) {
                int i = 0;
                ResultSet rs = s.executeQuery(selectRolMenues + "'" + id + "' and rm.idmenu = m.idmenu and m.idaplicacion = " + idaplicacion);

                while (rs.next()) {
                    selectedItems.put(rs.getString("nombre"), rs.getInt("idmenu"));
                    i++;
                }
            }

            return selectedItems;

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return null;
    }

    @Override
    public Menu getMenu(int idMenu
    ) {
        Connection con = dbconn.getCurrentConnection();
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(selectMenu + "'" + idMenu + "'");

            while (rs.next()) {
                return new Menu(rs.getString("nombre"), rs.getInt("idmenu"), rs.getInt("idaplicacion"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return null;
    }

}
