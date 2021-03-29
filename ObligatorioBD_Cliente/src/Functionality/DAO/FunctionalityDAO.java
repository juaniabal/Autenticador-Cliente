/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functionality.DAO;

import DataBase.DatabaseConnection;
import Models.CodeResponse;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author juani
 */
public class FunctionalityDAO implements IFunctionalityDAO {

    DatabaseConnection dbconn = DatabaseConnection.getInstance();
    private String selectFun = "select * from funcionalidad where idmenu=";

    @Override
    public ArrayList<String> selectFuncionalities(String idMenu) {
        ArrayList<String> functionalities = new ArrayList<>();
        Connection con = dbconn.getCurrentConnection();
        try {
            Statement s = con.createStatement();

            ResultSet rs = s.executeQuery(selectFun  + idMenu);
            while (rs.next()) {
                functionalities.add(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return functionalities;
    }

}
