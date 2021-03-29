/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu.Controller;

import Menu.Model.Menu;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author Agroa
 */
public interface IMenuController {
    HashMap<String,Integer> getMenues(ArrayList<Integer> idRol, int idAplicacion);
    Menu getMenu(int idMenu);
}
