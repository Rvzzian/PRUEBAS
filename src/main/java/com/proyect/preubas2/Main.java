
package com.proyect.preubas2;

import java.awt.Color;
import com.proyect.preubas2.event.Event_Menu;
import com.proyect.preubas2.form.Form_historial;
import com.proyect.preubas2.form.Form_reportes;
import com.proyect.preubas2.form.Form_usuarios;
import javax.swing.JComponent;
/**
 *
 * @author Usuario
 */
public class Main extends javax.swing.JFrame {
    private  Form_reportes Form_1;
    private  Form_usuarios Form_2;
    private  Form_historial Form_3;
    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        Form_1 = new Form_reportes ();
        Form_2 = new Form_usuarios();
        Form_3= new Form_historial();
        menu.initMoving(Main.this);
        menu.addEvent_Menu(new Event_Menu() {
            @Override
            public void selected(int index) {
    switch(index) {
        case 0:
            setForm(Form_1);
            break;
        case 1:
            setForm(Form_2);
            break;
        case 2:
            setForm(Form_3);
            break;
        default:
            setForm(Form_1); // Valor por defecto
    }
}

        });
        //  set when system open start with home form
        setForm(new Form_reportes());
        
    }
    private void setForm(JComponent com) {
        mainPanel1.removeAll();
        mainPanel1.add(com);
        mainPanel1.repaint();
        mainPanel1.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.proyect.preubas2.swing.PanelBorder();
        menu = new com.proyect.preubas2.component.Menu();
        header1 = new com.proyect.preubas2.component.Header();
        mainPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1180, 657));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setPreferredSize(new java.awt.Dimension(1180, 657));

        mainPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mainPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(mainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 1403, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.proyect.preubas2.component.Header header1;
    private javax.swing.JPanel mainPanel1;
    private com.proyect.preubas2.component.Menu menu;
    private com.proyect.preubas2.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
