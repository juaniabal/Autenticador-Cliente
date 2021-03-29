/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login.DAO;

import java.util.HashMap;

/**
 *
 * @author Agroa
 */
public interface IUserDAO {
    
    /**
     * Funcion que realiza la prueba de logueo del usuario.
     * @param usuario
     * @param contrasena
     * @return 
     */
    int logIn(String usuario, String contrasena);
    /**
     * Funcion que verifica si el usuario se encuentra en la base de datos.
     * @param usuario
     * @param contrasena
     * @return 
     */
    boolean selectUser(String usuario, String contrasena);
    /**
     * Funcion que obtiene todas las funcionalidades de un usuario especifico
     * @param usuario
     * @param contrasena
     * @return 
     */
    HashMap<Integer,String>  selectApplications();
}
