/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rol.DAO;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author juanizquierdo
 */
public interface IRoleDAO {

    /**
     * Metodo que obtiene el respectivo ID de un rol de un especifico usuario
     *
     * @param userName
     * @return
     */
    ArrayList<Integer> getIDRole(String userName);

}
