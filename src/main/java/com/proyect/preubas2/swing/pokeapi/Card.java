 
package com.proyect.preubas2.swing.pokeapi;
import com.proyect.preubas2.form.Form_usuarios;
import com.proyect.preubas2.swing.pokeapi.Model_card;
import com.proyect.preubas2.swing.pokeapi.InfoReportes;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Card extends javax.swing.JPanel {
    private final Model_card data;

    public Card(Model_card data) {
        this.data=data;
        initComponents();
        //setOpaque(false);
        setPreferredSize(new Dimension(300, 150)); // Cambia según el tamaño deseado
        setMinimumSize(new Dimension(300, 150));
        setMaximumSize(new Dimension(300, 150));
        img.setPreferredSize(new Dimension(150, 160)); // Establece el tamaño deseado
        img.setMinimumSize(new Dimension(150, 160));   // Tamaño mínimo
        img.setMaximumSize(new Dimension(150, 160));   // Tamaño máximo

        // Redimensionar la imagen solo cuando el JLabel tenga un tamaño válido
        img.revalidate();
        img.repaint();
        Title.setText(data.getTitle());
        Numero.setText(data.getNumero());
        Expedicion.setText(data.getExpedicion());     
    }
       @Override
    public void paintComponent(Graphics grphcs) {
        // Asegúrate de que el JLabel tenga un tamaño mayor que 0
        if (img.getWidth() > 0 && img.getHeight() > 0) {
            // Escalar la imagen usando las dimensiones del JLabel
            ImageIcon icon = (ImageIcon) data.getIcon();
            Image scaledImage = icon.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
            img.setIcon(new ImageIcon(scaledImage));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        Expedicion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        img = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Title.setText("jLabel1");
        Title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Title.setMaximumSize(new java.awt.Dimension(20, 20));

        Numero.setText("jLabel1");
        Numero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Expedicion.setText("jLabel2");
        Expedicion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        img.setText("img");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Numero)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(Expedicion))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Numero)
                        .addGap(26, 26, 26)
                        .addComponent(Expedicion)))
                .addGap(0, 0, 0)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    //el metodo findParentFormUsuarios busca los componentes padres hasta dar con el que se llama Form_usuario si encuentra nada devuielve el nu
    //Por ejemplo, si el Card está en un JPanel y ese jpanel está en un Form_usuarios, este metodo llegara hasta el Form_usuarios 
    //si es encontrado ejecuta la accion del 
    private Form_usuarios findParentFormUsuarios() {
        java.awt.Container parent = getParent();
        while (parent != null) {
            if (parent instanceof Form_usuarios) {
                return (Form_usuarios) parent;
            }
            parent = parent.getParent();
        }
        return null; // Si no se encuentra, devuelve null
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("Ingresa al botón card de card");
    // Buscar el componente padre que sea Form_usuarios
        Form_usuarios parentForm = findParentFormUsuarios();
        if (parentForm != null) {
            parentForm.botonCardActionPerformed(evt);
        } else {
            System.out.println("No se encontró el Form_usuarios.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Expedicion;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
