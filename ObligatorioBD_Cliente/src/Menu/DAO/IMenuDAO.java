/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu.DAO;

import Menu.Model.Menu;
import Models.CodeResponse;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Agroa
 */
public interface IMenuDAO {
    HashMap<String, Integer> getMenuesID(ArrayList<Integer> idRol,int idaplicacion);
    Menu getMenu(int idMenu);
}
