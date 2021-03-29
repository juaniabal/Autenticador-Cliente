/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functionality.DAO;

import Models.CodeResponse;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Agroa
 */
public interface IFunctionalityDAO {
        /**
     * Funcion que devuelve las funcionalidades dependiendo del id del menu
     * @param idMenu id del menu
     * @return 
     */
    ArrayList<String> selectFuncionalities(String idMenu);
}
