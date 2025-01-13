

package com.proyect.preubas2.swing.pokeapi;

import javax.swing.Icon;

public class Model_card {

    public Icon getIcon() {
        return icon;
    }


    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getExpedicion() {
        return expedicion;
    }

    public void setExpedicion(String expedicion) {
        this.expedicion = expedicion;
    }    

   // public String getDescription() {
    //    return description;
    //}

  
    //public void setDescription(String description) {
    //    this.description = description;
    //}
    public Model_card(Icon icon,String title,String numero,String expedicion){
        this.icon=icon;
        this.title=title;
        //this.description=description;
        this.numero=numero;
        this.expedicion=expedicion;
    }
    private Icon icon;
    private String title;
   // private String description;
    private String numero;
    private String expedicion;
}
