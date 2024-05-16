/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author sebas
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
         this.setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));
        
        Home h=new Home();
        h.setSize(982,740);
        h.setLocation(0,0);
        
        contenedor.removeAll();
        contenedor.add(h,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelRound1 = new modelo.JpanelRound();
        jpanelRound2 = new modelo.JpanelRound();
        jLabel1 = new javax.swing.JLabel();
        btnCategorias = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnClientes = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnRecibimiento = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnHome = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnProveedor = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnUsuarios = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnSalidas = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnAcercaDe = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnSalir = new RSMaterialComponent.RSButtonMaterialIconDos();
        jSeparator2 = new javax.swing.JSeparator();
        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        jpanelRound2.setBackground(new java.awt.Color(137, 175, 182));
        jpanelRound2.setRoundBottomLeft(25);
        jpanelRound2.setRoundBottomRight(25);
        jpanelRound2.setRoundTopLeft(25);
        jpanelRound2.setRoundTopRight(25);

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INVENTARIO");

        btnCategorias.setBackground(new java.awt.Color(137, 175, 182));
        btnCategorias.setText("CATEGORIAS");
        btnCategorias.setBackgroundHover(new java.awt.Color(86, 110, 114));
        btnCategorias.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DASHBOARD);
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(137, 175, 182));
        btnClientes.setText("CLIENTES");
        btnClientes.setBackgroundHover(new java.awt.Color(86, 110, 114));
        btnClientes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnRecibimiento.setBackground(new java.awt.Color(137, 175, 182));
        btnRecibimiento.setText("RECIBIMIENTO");
        btnRecibimiento.setBackgroundHover(new java.awt.Color(86, 110, 114));
        btnRecibimiento.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KEYBOARD_ARROW_DOWN);
        btnRecibimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibimientoActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(137, 175, 182));
        btnHome.setText("HOME");
        btnHome.setBackgroundHover(new java.awt.Color(86, 110, 114));
        btnHome.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnProveedor.setBackground(new java.awt.Color(137, 175, 182));
        btnProveedor.setText("PROVEEDOR");
        btnProveedor.setBackgroundHover(new java.awt.Color(86, 110, 114));
        btnProveedor.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CONTACTS);
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(137, 175, 182));
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setBackgroundHover(new java.awt.Color(86, 110, 114));
        btnUsuarios.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.GROUP_ADD);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnSalidas.setBackground(new java.awt.Color(137, 175, 182));
        btnSalidas.setText("SALIDAS");
        btnSalidas.setBackgroundHover(new java.awt.Color(86, 110, 114));
        btnSalidas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.KEYBOARD_ARROW_UP);
        btnSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidasActionPerformed(evt);
            }
        });

        btnAcercaDe.setBackground(new java.awt.Color(137, 175, 182));
        btnAcercaDe.setText("ACERCA DE");
        btnAcercaDe.setBackgroundHover(new java.awt.Color(86, 110, 114));
        btnAcercaDe.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HELP);
        btnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(137, 175, 182));
        btnSalir.setText("SALIR");
        btnSalir.setBackgroundHover(new java.awt.Color(86, 110, 114));
        btnSalir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound2Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(51, 51, 51))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound2Layout.createSequentialGroup()
                                    .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRecibimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(19, 19, 19)))))
                    .addGroup(jpanelRound2Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))))
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecibimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcercaDeActionPerformed

    private void btnSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalidasActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        btnHome.setSelected(true);
        btnCategorias.setSelected(false);
        Home h=new Home();
        h.setSize(982,740);
        h.setLocation(0,0);
        
        contenedor.removeAll();
        contenedor.add(h,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnRecibimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecibimientoActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        // TODO add your handling code here:
        btnCategorias.setSelected(true);
        btnHome.setSelected(false);
        
        Categorias c=new Categorias();
        c.setSize(982,740);
        c.setLocation(0,0);
        
        contenedor.removeAll();
        contenedor.add(c,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_btnCategoriasActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnAcercaDe;
    private RSMaterialComponent.RSButtonMaterialIconDos btnCategorias;
    private RSMaterialComponent.RSButtonMaterialIconDos btnClientes;
    private RSMaterialComponent.RSButtonMaterialIconDos btnHome;
    private RSMaterialComponent.RSButtonMaterialIconDos btnProveedor;
    private RSMaterialComponent.RSButtonMaterialIconDos btnRecibimiento;
    private RSMaterialComponent.RSButtonMaterialIconDos btnSalidas;
    private RSMaterialComponent.RSButtonMaterialIconDos btnSalir;
    private RSMaterialComponent.RSButtonMaterialIconDos btnUsuarios;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator2;
    private modelo.JpanelRound jpanelRound1;
    private modelo.JpanelRound jpanelRound2;
    // End of variables declaration//GEN-END:variables
}