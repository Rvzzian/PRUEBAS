package com.proyect.preubas2.form;
import com.proyect.preubas2.Main;
import com.proyect.preubas2.swing.pokeapi.Api;
import com.proyect.preubas2.swing.pokeapi.Api.Pokemon;
import com.proyect.preubas2.swing.pokeapi.Card;
import com.proyect.preubas2.swing.pokeapi.InfoReportes;
import com.proyect.preubas2.swing.pokeapi.Model_card;
import com.proyect.preubas2.swing.pokeapi.ScrollBar;
import com.proyect.preubas2.swing.pokeapi.WrapLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
//este form tiene como titulo usuarios, pero no es usuarios es de reportes por que es de pruebas 
//lo puede haber hecho en  el de reportes directamente pero ps ya lo estaba utilizando para consumir una api de pruebas 

public class Form_usuarios extends javax.swing.JPanel {
    private Main mainFrame;
    public Form_usuarios(Main mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        init();
        addListeners(); 
    }    
    private void init() {
      
        Panel.setLayout(new WrapLayout(WrapLayout.LEADING));
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
    }
    private void addListeners() {
        breportes1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica cuando se presiona breportes1
                aprobados();
            }
            
        });
        breportes21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // logica cuando se presiona breportes21
                porAprobar();
            }
        });
    }
    
    public void porAprobar(){
        //aca en teoria se pondra el bucle para que las targetas se creen dependiendo la cantidad del array traido 
        //por la api y dentrod dentro del getResorce se pondra lasrespectivas variables del los datos que se triagan
        Panel.removeAll();  //limpiar el panel antes de agregar las nuevas tarjetas
        Panel.add(new Card(new Model_card(new ImageIcon(getClass().getResource("/com/proyect/preubas2/icon/documentos/1.jpg")), "marianita", "100", "12-1-1")));
        Panel.add(new Card(new Model_card(new ImageIcon(getClass().getResource("/com/proyect/preubas2/icon/documentos/2.jpg")), "luisito comunica", "101", "12-1-1")));
        Panel.add(new Card(new Model_card(new ImageIcon(getClass().getResource("/com/proyect/preubas2/icon/documentos/3.jpg")), "luis nocomunica", "102","12-1-1")));
        Panel.add(new Card(new Model_card(new ImageIcon(getClass().getResource("/com/proyect/preubas2/icon/documentos/4.jpg")), "david", "103","12-1-1")));
        Panel.add(new Card(new Model_card(new ImageIcon(getClass().getResource("/com/proyect/preubas2/icon/documentos/5.jpg")), "juan", "104","12-1-1")));
        Panel.add(new Card(new Model_card(new ImageIcon(getClass().getResource("/com/proyect/preubas2/icon/documentos/6.jpg")), "epep", "105","12-1-1")));
        Panel.add(new Card(new Model_card(new ImageIcon(getClass().getResource("/com/proyect/preubas2/icon/documentos/7.jpg")), "pepe", "106","12-1-1")));
        Panel.add(new Card(new Model_card(new ImageIcon(getClass().getResource("/com/proyect/preubas2/icon/documentos/8.jpg")), "bob", "107","12-1-1")));
        Panel.add(new Card(new Model_card(new ImageIcon(getClass().getResource("/com/proyect/preubas2/icon/documentos/9.jpg")), "pep", "108","12-1-1")));
        Panel.add(new Card(new Model_card(new ImageIcon(getClass().getResource("/com/proyect/preubas2/icon/documentos/10.jpg")), "jaramillo", "109","12-1-1")));
        Panel.add(new Card(new Model_card(new ImageIcon(getClass().getResource("/com/proyect/preubas2/icon/documentos/11.jpg")), "terreneitor", "110","12-1-1")));
        Panel.revalidate();
        Panel.repaint();
    }
    public void aprobados(){
        //aca en teoria se pondra el bucle para que las targetas se creen dependiendo la cantidad del array traido 
        //por la api y dentrod dentro del getResorce se pondra lasrespectivas variables del los datos que se triagan
         try {
           // Obtener los Pokémon de tipo fuego mediante la API
            List<Pokemon> firePokemon = Api.getFirePokemon();

            // Iterar sobre la lista de Pokémon y crear una tarjeta para cada uno
            for (Pokemon pokemon : firePokemon) {
                 // Crear ImageIcon desde URL
                ImageIcon imageIcon = new ImageIcon(new URL(pokemon.imageUrl));
                // Crear una tarjeta para cada Pokémon
                Panel.add(new Card(new Model_card(
                    imageIcon,  // Usar la URL de la imagen del Pokémon
                    pokemon.name,                     // Nombre del Pokémon
                    String.valueOf(pokemon.weight),    // Peso del Pokémon
                    String.valueOf(pokemon.height)     // Altura del Pokémon
                )));
                System.out.println("Image URL: " + pokemon.imageUrl);
            }
        } catch (Exception e) {
            e.printStackTrace();  // Si ocurre un error, lo imprimimos
            
    }
        Panel.revalidate();
        Panel.repaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Panel = new javax.swing.JPanel();
        breportes1 = new com.proyect.preubas2.component.Breportes();
        breportes21 = new com.proyect.preubas2.component.Breportes2();
        anteriorButton = new javax.swing.JButton();
        siguienteButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setBorder(null);

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1598, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(Panel);

        anteriorButton.setText("atras");

        siguienteButton.setText("adelante");
        siguienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(anteriorButton)
                                .addGap(52, 52, 52)
                                .addComponent(siguienteButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(breportes1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(breportes21, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(breportes1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(breportes21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anteriorButton)
                    .addComponent(siguienteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siguienteButtonActionPerformed
    
    private void onInfoReporteButtonClicked() {
         if (mainFrame != null) {
            mainFrame.setForm(new InfoReportes(mainFrame));// Cambiar al panel InfoReportes
        }
    }
    public void botonCardActionPerformed(java.awt.event.ActionEvent evt) {
        onInfoReporteButtonClicked();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton anteriorButton;
    private com.proyect.preubas2.component.Breportes breportes1;
    private com.proyect.preubas2.component.Breportes2 breportes21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton siguienteButton;
    // End of variables declaration//GEN-END:variables
}
