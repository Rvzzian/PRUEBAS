package com.proyect.preubas2.model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Model_Menu {
 public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public Model_Menu(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public Model_Menu() {
    }

    private String icon;
    private String name;
    private MenuType type;

    public Icon toIcon() {
    java.net.URL resource = getClass().getResource("/com/proyect/preubas2/icon/" + icon + ".png");
    if (resource == null) {
        System.err.println("Imagen no encontrada: /com/proyect/preubas2/icon/" + icon + ".png");
        return null; 
    }
    return new ImageIcon(resource);
}

    public static enum MenuType {
        TITLE, MENU, EMPTY
    }
}
