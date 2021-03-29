/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Login.DAO.IUserDAO;
import Login.DAO.UserDAO;
import javax.swing.JFrame;

/**
 *
 * @author Agroa
 */
public interface IScreenController {

    /**
     *
     */
    void showMainScreen(UserDAO udao);

    /**
     *
     */
    void showAppScreen(String applicationName,String userName);


    /**
     *
     * @param frame
     */
    void hideScreen(JFrame frame);

}
