/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.proyect.preubas2.component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
/**
 *
 * @author Usuario
 */
public class Breportes extends javax.swing.JPanel {
    private Color backgroundColor = new Color(200, 200, 200);
    private ActionListener actionListener;

    public Breportes() {
        initComponents();
        setOpaque(false); // Hacer que el panel no sea opaco para personalizar el fondo
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                backgroundColor = new Color(144, 238, 144); // Verde claro al presionar
                repaint(); // Redibujar el botón
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                backgroundColor = new Color(200, 200, 200); // Regresa a gris claro al soltar
                repaint(); // Redibujar el botón
                 if (actionListener != null) {
                    actionListener.actionPerformed(null); // llamar al método actionPerformed pasandole un valor nulo pues solo necesito la accion y no el objeto
                }
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyect/preubas2/icon/7 .png"))); // NOI18N
        jLabel1.setText("EN ESPERA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Color de fondo (gris)
        g2.setColor(backgroundColor);
        // Dibujar un rectángulo con esquinas redondeadas
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30); // Esquinas redondeadas (30px)
    }
    public void addActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables


}
