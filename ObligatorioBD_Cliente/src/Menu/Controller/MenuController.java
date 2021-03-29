/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu.Controller;

import Menu.DAO.IMenuDAO;
import Menu.DAO.MenuDAO;
import Menu.Model.Menu;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author juani
 */
public class MenuController implements IMenuController {
    IMenuDAO menuDao = new MenuDAO();;    
    @Override
    public HashMap<String, Integer> getMenues(ArrayList<Integer> idRol, int idaplicacion) {
        
        return menuDao.getMenuesID(idRol,idaplicacion);
    }
    public Menu getMenu(int idMenu){
        return menuDao.getMenu(idMenu);
    }
}
