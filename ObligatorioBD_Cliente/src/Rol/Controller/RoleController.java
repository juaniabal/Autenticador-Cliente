/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rol.Controller;

import Models.CodeResponse;
import Rol.DAO.IRoleDAO;
import Rol.DAO.RoleDAO;
import java.util.ArrayList;

/**
 *
 * @author juani
 */
public class RoleController implements IRoleController{
    IRoleDAO roleDAO = new RoleDAO();
    
    @Override
    public ArrayList<Integer> getIDRole(String userName) {
        try {
            ArrayList<Integer> response = roleDAO.getIDRole(userName);
            return response;
        } catch (Exception ex) {
            return null;
        }
    }    
}
    

