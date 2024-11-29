
package com.proyect.preubas2.component;

import com.proyect.preubas2.event.Event_Menu;
import com.proyect.preubas2.model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JPanel {
    private Event_Menu event;
 
   public void addEvent_Menu(Event_Menu event) {
        this.event = event;
        listMenu1.addEventMenuSelected(event);
    }
    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }
    private void init(){
         
        listMenu1.addItem(new Model_Menu("1","REPORTES",Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("3","USUARIO",Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("2","HISTORIAL",Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY)); // Espacio vacío
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY)); // Espacio vacío
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY)); // Espacio vacío
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY)); // Espacio vací
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY)); // Espacio vacío
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY)); // Espacio vacío
        listMenu1.addItem(new Model_Menu("5","SALIR",Model_Menu.MenuType.MENU));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu1 = new com.proyect.preubas2.swing.ListMenu<>();

        setPreferredSize(new java.awt.Dimension(215, 499));

        PanelMoving.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyect/preubas2/icon/4 (2).png"))); // NOI18N
        jLabel1.setText(" ");

        javax.swing.GroupLayout PanelMovingLayout = new javax.swing.GroupLayout(PanelMoving);
        PanelMoving.setLayout(PanelMovingLayout);
        PanelMovingLayout.setHorizontalGroup(
            PanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMovingLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50))
        );
        PanelMovingLayout.setVerticalGroup(
            PanelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#808285"), 0, getHeight(), Color.decode("#808285"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        PanelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        PanelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMoving;
    private javax.swing.JLabel jLabel1;
    private com.proyect.preubas2.swing.ListMenu<String> listMenu1;
    // End of variables declaration//GEN-END:variables
}
