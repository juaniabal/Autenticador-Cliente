/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functionality.Controller;

import Functionality.DAO.FunctionalityDAO;
import Functionality.DAO.IFunctionalityDAO;
import Models.CodeResponse;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author juani
 */
public class FunctionalityController implements IFunctionalityController{
    IFunctionalityDAO functionalityDAO = new FunctionalityDAO();
    @Override
    public ArrayList<String> getFuncionalities(String idMenu) {
        ArrayList<String> response = functionalityDAO.selectFuncionalities(idMenu);
        return response;
    }
    
}
