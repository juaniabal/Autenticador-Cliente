/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application.DAO;

import DataBase.DatabaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author juani
 */
public class ApplicationDAO implements IApplicationDAO {

    private String selectUser = "select * from aplicacion where idaplicacion =";
    DatabaseConnection dbconn = DatabaseConnection.getInstance();

    @Override
    public String getApplicationName(String idApplication) {
        Connection con = dbconn.getCurrentConnection();
        try {
            Statement s = con.createStatement();

            ResultSet rs = s.executeQuery(selectUser  + idApplication );
            while (rs.next()) {
                return rs.getInt("idaplicacion") + "-" + rs.getString("nombre");
            }

            return null;

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return null;
    }
}
