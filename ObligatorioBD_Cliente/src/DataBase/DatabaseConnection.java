/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Agroa
 */
public class DatabaseConnection {
    private String user ="";
    private String password = "";
    private String userActual = "";
    private static DatabaseConnection instance; //note this is static
    Connection conn = null;

    private DatabaseConnection() { //note this is private
    }

    public static DatabaseConnection getInstance() { //note this is static
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public Connection getCurrentConnection(){
        try {
            String url = "jdbc:postgresql://192.168.56.102:5432/proyecto";
            if(conn==null){
                conn = DriverManager.getConnection(url, this.getUser(), this.getPassword());
            }
             conn.setAutoCommit(false);
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the userActual
     */
    public String getUserActual() {
        return userActual;
    }

    /**
     * @param userActual the userActual to set
     */
    public void setUserActual(String userActual) {
        this.userActual = userActual;
    }
}
