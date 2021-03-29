/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rol.Controller;

import Models.CodeResponse;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author juanizquierdo
 */
public interface IRoleController {

    /**
     * Funcion que obtiene el respectivo ID de un rol de un especifico usuario
     *
     * @param userID
     * @return
     */
    ArrayList<Integer> getIDRole(String userName);


}
