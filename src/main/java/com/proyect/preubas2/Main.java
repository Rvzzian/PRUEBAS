package com.proyect.preubas2;
import java.awt.Color;
import com.proyect.preubas2.event.Event_Menu;
import com.proyect.preubas2.form.Form_historial;
import com.proyect.preubas2.form.Form_reportes;
import com.proyect.preubas2.form.Form_usuarios;
import com.proyect.preubas2.form.FormHome;
import com.proyect.preubas2.swing.pokeapi.Api;
import com.proyect.preubas2.swing.pokeapi.Api.Pokemon;
import com.proyect.preubas2.swing.pokeapi.InfoReportes;
import com.proyect.preubas2.swing.pokeapi.PerfilUsuario;
import java.util.List;

import javax.swing.JComponent;

public class Main extends javax.swing.JFrame {
    
    private  Form_reportes Form_1;
    private  Form_usuarios Form_2;
    private  Form_historial Form_3;
    private  FormHome Form_0;
    private  InfoReportes Form_4;
    private  PerfilUsuario Form_5;

    public Main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        Form_0= new FormHome();
        Form_1 = new Form_reportes ();
        Form_2 = new Form_usuarios(this);
        Form_3= new Form_historial();
        Form_4 =new InfoReportes(this);
        Form_5 = new PerfilUsuario(this);
        menu.initMoving(Main.this);
        menu.addEvent_Menu(new Event_Menu() {
            @Override
    public void selected(int index) {
        switch (index) {
            case 0: 
                 setForm(new FormHome());
                break;
            case 1: 
                setForm(new Form_reportes());
                break;
            case 2: 
               setForm(Form_2);
                break;
            case 3: 
                setForm(new Form_historial());
                break;
            case 4: 
                
                break;  
            case 5: 
                
                break;
            case 6: 
                // Espacio vacío
                break;
            case 7: 
                // Espacio vacío
                break;
            case 8: 
                // Espacio vacío
                break;
            case 9: 
                 
                break;
            case 10: 
            
                break;
            case 11: 
                 System.exit(0); // Cerrar la aplicación
                break;                
        }
    }
        });
        setForm(new Form_reportes());
    }
    public void setForm(JComponent com) {
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

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setPreferredSize(new java.awt.Dimension(1180, 657));

        mainPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainPanel1.setOpaque(false);
        mainPanel1.setPreferredSize(new java.awt.Dimension(0, 12));
        mainPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                    .addComponent(mainPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 1207, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
