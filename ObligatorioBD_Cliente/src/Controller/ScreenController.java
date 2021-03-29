    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Views.AppScreen;
import Views.MainScreen;
import Login.DAO.IUserDAO;
import Login.DAO.UserDAO;
import javax.swing.JFrame;

/**
 *
 * @author Agroa
 */
public class ScreenController implements IScreenController {

    private String[] functionalitiesExample = {"Administracion de Usuarios","Administracion de roles", "Administracion de menues","Administracion de aplicaciones","Administración de funcionalidades","Bandeja de entrada Autorizador"};
    

    public String[] getFunctionalities() {
        return functionalitiesExample;
    }
    @Override
    public void hideScreen(JFrame frame) {
        frame.setVisible(false);
    }

    @Override
    public void showMainScreen(UserDAO udao) {
        MainScreen ms = new MainScreen(udao);
        
        ms.setVisible(true);
    }

    @Override
    public void showAppScreen(String applicationName,String userName) {
        AppScreen appScreen = new AppScreen(applicationName,userName);
        appScreen.setVisible(true);
    }
    

}
