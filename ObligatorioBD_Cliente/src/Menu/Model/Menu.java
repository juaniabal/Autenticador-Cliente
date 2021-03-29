/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu.Model;

/**
 *
 * @author juanizquierdo
 */
public class Menu {
    private String nombre;
    private int idaplicacion;
    private int idmenu;
    public Menu(String name,int idapp,int idmenu){
        this.nombre = name;
        this.idaplicacion = idapp;
        this.idmenu = idmenu;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the idaplicacion
     */
    public int getIdaplicacion() {
        return idaplicacion;
    }

    /**
     * @param idaplicacion the idaplicacion to set
     */
    public void setIdaplicacion(int idaplicacion) {
        this.idaplicacion = idaplicacion;
    }

    /**
     * @return the idmenu
     */
    public int getIdmenu() {
        return idmenu;
    }

    /**
     * @param idmenu the idmenu to set
     */
    public void setIdmenu(int idmenu) {
        this.idmenu = idmenu;
    }
}
