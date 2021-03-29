/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application.Controller;

import Application.DAO.ApplicationDAO;
import Application.DAO.IApplicationDAO;

/**
 *
 * @author juani
 */
public class ApplicationController implements IApplicationController{
    IApplicationDAO appDAO = new ApplicationDAO();
    @Override
    public String selectApplication(String idApplication) {
        return appDAO.getApplicationName(idApplication);
    }
    
}
