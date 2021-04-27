package Vistas;

import Entidades.DirectorioTelefonico;


public class ViewPrincipal extends javax.swing.JFrame {

    
    public ViewPrincipal() {
        initComponents();
    }
    DirectorioTelefonico directorio = new DirectorioTelefonico();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        principal = new javax.swing.JDesktopPane();
        jAgregarCliente = new javax.swing.JButton();
        jBuscarCliente = new javax.swing.JButton();
        jBorrarCliente = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principal.setBackground(new java.awt.Color(25, 48, 3));
        principal.setToolTipText("");

        jAgregarCliente.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jAgregarCliente.setText("Agregar Cliente");
        jAgregarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarClienteActionPerformed(evt);
            }
        });

        jBuscarCliente.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jBuscarCliente.setText("Buscar Cliente");
        jBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarClienteActionPerformed(evt);
            }
        });

        jBorrarCliente.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jBorrarCliente.setText("Borrar Cliente");
        jBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBorrarClienteActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        principal.setLayer(jAgregarCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        principal.setLayer(jBuscarCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        principal.setLayer(jBorrarCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        principal.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarClienteActionPerformed
        ViewAgregarCliente nuevo = new ViewAgregarCliente(this.directorio);
        nuevo.setVisible(true);
        principal.add(nuevo);
        principal.moveToFront(nuevo);
       
    }//GEN-LAST:event_jAgregarClienteActionPerformed

    private void jBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarClienteActionPerformed
        ViewBuscarCliente buscar = new ViewBuscarCliente(directorio);
        buscar.setVisible(true);
        principal.add(buscar);
        principal.moveToFront(buscar);
    }//GEN-LAST:event_jBuscarClienteActionPerformed

    private void jBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBorrarClienteActionPerformed
        ViewBorrarCliente borrar = new ViewBorrarCliente(directorio);
        borrar.setVisible(true);
        principal.add(borrar);
        principal.moveToFront(borrar);
    }//GEN-LAST:event_jBorrarClienteActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAgregarCliente;
    private javax.swing.JButton jBorrarCliente;
    private javax.swing.JButton jBuscarCliente;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton jbSalir;
    private javax.swing.JDesktopPane principal;
    // End of variables declaration//GEN-END:variables
}
