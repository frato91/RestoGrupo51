/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restogrupo51.views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import restogrupo51.accesoAdatos.MesaData;
import restogrupo51.entidades.Mesa;



public class Principal extends javax.swing.JFrame {

   private javax.swing.JToggleButton[] TB = new javax.swing.JToggleButton[8];
    
    MesaData mesaData = new MesaData();
    int mesaSelect = 0;
    
    public Principal() {
        initComponents();
        TB[0] = TBmesa1;
        TB[1] = TBmesa2;
        TB[2] = TBmesa3;
        TB[3] = TBmesa4;
        TB[4] = TBmesa5;
        TB[5] = TBmesa6;
        TB[6] = TBmesa7;
        TB[7] = TBmesa8;
        ActualizarPantallaPrincipal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane(){

            ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
            Image image = icon.getImage();

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jPanel1 = new javax.swing.JPanel();
        TBmesa1 = new javax.swing.JToggleButton();
        TBmesa3 = new javax.swing.JToggleButton();
        TBmesa4 = new javax.swing.JToggleButton();
        TBmesa2 = new javax.swing.JToggleButton();
        TBmesa6 = new javax.swing.JToggleButton();
        TBmesa8 = new javax.swing.JToggleButton();
        TBmesa5 = new javax.swing.JToggleButton();
        TBmesa7 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jbtnMesas = new javax.swing.JButton();
        Bpedidos = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(255, 205, 110));

        TBmesa1.setBackground(new java.awt.Color(255, 255, 204));
        TBmesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesaIcon.png"))); // NOI18N
        TBmesa1.setToolTipText("");
        TBmesa1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TBmesa1.setEnabled(false);
        TBmesa1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TBmesa1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TBmesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBmesa1ActionPerformed(evt);
            }
        });

        TBmesa3.setBackground(new java.awt.Color(255, 255, 204));
        TBmesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesaIcon.png"))); // NOI18N
        TBmesa3.setToolTipText("");
        TBmesa3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TBmesa3.setEnabled(false);
        TBmesa3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TBmesa3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TBmesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBmesa3ActionPerformed(evt);
            }
        });

        TBmesa4.setBackground(new java.awt.Color(255, 255, 204));
        TBmesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesaIcon.png"))); // NOI18N
        TBmesa4.setToolTipText("");
        TBmesa4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TBmesa4.setEnabled(false);
        TBmesa4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TBmesa4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TBmesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBmesa4ActionPerformed(evt);
            }
        });

        TBmesa2.setBackground(new java.awt.Color(255, 255, 204));
        TBmesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesaIcon.png"))); // NOI18N
        TBmesa2.setToolTipText("");
        TBmesa2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TBmesa2.setEnabled(false);
        TBmesa2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TBmesa2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TBmesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBmesa2ActionPerformed(evt);
            }
        });

        TBmesa6.setBackground(new java.awt.Color(255, 255, 204));
        TBmesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesaIcon.png"))); // NOI18N
        TBmesa6.setToolTipText("");
        TBmesa6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TBmesa6.setEnabled(false);
        TBmesa6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TBmesa6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TBmesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBmesa6ActionPerformed(evt);
            }
        });

        TBmesa8.setBackground(new java.awt.Color(255, 255, 204));
        TBmesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesaIcon.png"))); // NOI18N
        TBmesa8.setToolTipText("");
        TBmesa8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TBmesa8.setEnabled(false);
        TBmesa8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TBmesa8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TBmesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBmesa8ActionPerformed(evt);
            }
        });

        TBmesa5.setBackground(new java.awt.Color(255, 255, 204));
        TBmesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesaIcon.png"))); // NOI18N
        TBmesa5.setToolTipText("");
        TBmesa5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TBmesa5.setEnabled(false);
        TBmesa5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TBmesa5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TBmesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBmesa5ActionPerformed(evt);
            }
        });

        TBmesa7.setBackground(new java.awt.Color(255, 255, 204));
        TBmesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesaIcon.png"))); // NOI18N
        TBmesa7.setToolTipText("");
        TBmesa7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TBmesa7.setEnabled(false);
        TBmesa7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TBmesa7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TBmesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBmesa7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TBmesa5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBmesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TBmesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBmesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TBmesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(TBmesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TBmesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TBmesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TBmesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBmesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBmesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBmesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TBmesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBmesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBmesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBmesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productIcon3.png"))); // NOI18N
        jButton1.setText("Productos");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jbtnMesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mesaIcon2.png"))); // NOI18N
        jbtnMesas.setText("Mesas");
        jbtnMesas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnMesas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMesasActionPerformed(evt);
            }
        });

        Bpedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pedidosIcon.png"))); // NOI18N
        Bpedidos.setText("Pedidos");
        Bpedidos.setEnabled(false);
        Bpedidos.setPreferredSize(new java.awt.Dimension(125, 58));
        Bpedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpedidosActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultaIcon.png"))); // NOI18N
        jButton4.setText("Consultas");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Freestyle Script", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(224, 224, 224));
        jLabel1.setText("Resto Grupo51");

        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jbtnMesas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(Bpedidos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jbtnMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addComponent(Bpedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                        .addComponent(Bpedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBmesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBmesa1ActionPerformed
        //TBmesa2.setEnabled(false);
        ActDescBotones(TBmesa1);
    }//GEN-LAST:event_TBmesa1ActionPerformed

    private void jbtnMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMesasActionPerformed
        escritorio.repaint();
        MesasView MsV = new MesasView();
        MsV.setVisible(true);
        escritorio.add(MsV);
        escritorio.moveToFront(MsV);
    }//GEN-LAST:event_jbtnMesasActionPerformed

    private void TBmesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBmesa3ActionPerformed
        ActDescBotones(TBmesa3);
    }//GEN-LAST:event_TBmesa3ActionPerformed

    private void TBmesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBmesa4ActionPerformed
        ActDescBotones(TBmesa4);
    }//GEN-LAST:event_TBmesa4ActionPerformed

    private void TBmesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBmesa2ActionPerformed
        ActDescBotones(TBmesa2);
    }//GEN-LAST:event_TBmesa2ActionPerformed

    private void TBmesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBmesa6ActionPerformed
        ActDescBotones(TBmesa6);
    }//GEN-LAST:event_TBmesa6ActionPerformed

    private void TBmesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBmesa8ActionPerformed
        ActDescBotones(TBmesa8);
    }//GEN-LAST:event_TBmesa8ActionPerformed

    private void TBmesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBmesa5ActionPerformed
        ActDescBotones(TBmesa5);
    }//GEN-LAST:event_TBmesa5ActionPerformed

    private void TBmesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBmesa7ActionPerformed
        ActDescBotones(TBmesa7);
    }//GEN-LAST:event_TBmesa7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BpedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpedidosActionPerformed
        System.out.println("La mesa seleccionada es la: " + mesaSelect);
        ActualizarPantallaPrincipal();
    }//GEN-LAST:event_BpedidosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bpedidos;
    private javax.swing.JToggleButton TBmesa1;
    private javax.swing.JToggleButton TBmesa2;
    private javax.swing.JToggleButton TBmesa3;
    private javax.swing.JToggleButton TBmesa4;
    private javax.swing.JToggleButton TBmesa5;
    private javax.swing.JToggleButton TBmesa6;
    private javax.swing.JToggleButton TBmesa7;
    private javax.swing.JToggleButton TBmesa8;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnMesas;
    // End of variables declaration//GEN-END:variables
    

    
    public void ActDescBotones(javax.swing.JToggleButton TBSelect){

        if (TBSelect.isSelected()) {
            int aux = 0;
            for (javax.swing.JToggleButton botones : TB){
            TB[aux].setSelected(false);
            TB[aux].setBackground(new Color(255,255,204));
            aux++;
            }

            TBSelect.setBackground(new Color(156, 255, 51)); //Verde Color de activado
            TBSelect.setSelected(true);
            mesaSelect = Integer.parseInt(TBSelect.getText().split(" ")[1]);
            //System.out.println(mesaSelect);
            Bpedidos.setEnabled(true);
 
        } else if (!TBSelect.isSelected()) {
            
            TBSelect.setBackground(new Color(255,255,204));// color Normal
            mesaSelect=0;
            Bpedidos.setEnabled(false);
        }
    }
    
    public void ActualizarPantallaPrincipal (){
        int aux=0;
            
        for (javax.swing.JToggleButton botones : TB){
            TB[aux].setText("");
            TB[aux].setEnabled(false);
            aux++;
        }
        aux=0;
        for (Mesa mesa : mesaData.listarMesas()){
            TB[aux].setText("Mesa " + mesa.getNumeroMesa());
            TB[aux].setEnabled(true);
            aux++;
        }
    }
}
