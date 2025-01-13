
package com.proyect.preubas2.swing;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class reportes extends javax.swing.JPanel {

    public reportes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        foto = new javax.swing.JLabel();
        txtnombre = new javax.swing.JLabel();

        setLayout(new java.awt.GridLayout(1, 2,5,5));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        foto = new javax.swing.JLabel();
        foto.setHorizontalAlignment(SwingConstants.CENTER); // Centrar imagen
        foto.setPreferredSize(new Dimension(48, 48)); // Asegurar tamaño fijo
        add(foto);
        
        txtnombre = new javax.swing.JLabel();
        txtnombre.setHorizontalAlignment(SwingConstants.CENTER); // Centrar texto
        txtnombre.setFont(new Font("Arial", Font.PLAIN, 14)); // Opcional: Cambiar fuente
        add(txtnombre);
    }// </editor-fold>                        
    public void setTxtnombre(String nombre) {
        txtnombre.setText(nombre);
    }

    public void setFoto(ImageIcon imagen) {
        foto.setIcon(imagen);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel foto;
    private javax.swing.JLabel txtnombre;
    // End of variables declaration                   
}
