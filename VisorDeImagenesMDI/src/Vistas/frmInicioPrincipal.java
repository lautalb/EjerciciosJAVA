/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author alumno
 */
public class frmInicioPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form fmrInicioPrincipal
     */
    public frmInicioPrincipal() {
        initComponents();
        //para mostrar la ventana completa
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmFotos = new javax.swing.JMenu();
        btnAbrirFoto = new javax.swing.JMenuItem();
        btnCerrarFoto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jmFotos.setText("Fotos");

        btnAbrirFoto.setText("Abrir foto");
        btnAbrirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirFotoActionPerformed(evt);
            }
        });
        jmFotos.add(btnAbrirFoto);

        btnCerrarFoto.setText("Cerrar foto");
        btnCerrarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarFotoActionPerformed(evt);
            }
        });
        jmFotos.add(btnCerrarFoto);

        jMenuBar1.add(jmFotos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirFotoActionPerformed
       int respuesta;
       String ruta;
        JFileChooser VentanaArchivos=new JFileChooser();
        respuesta=VentanaArchivos.showOpenDialog(this);
        if(respuesta==JFileChooser.APPROVE_OPTION)
        {
            frmFoto frm = new frmFoto();
            frm.setMaximizable(true);
            frm.setClosable(true);
            frm.setResizable(true);
            pnlPrincipal.add(frm);
            ruta=VentanaArchivos.getSelectedFile().toString();
            
            frm.setTitle(ruta);
            frm.setFoto(ruta);
            frm.setVisible(true);
        }
        
    }//GEN-LAST:event_btnAbrirFotoActionPerformed

    private void btnCerrarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarFotoActionPerformed
        frmFoto frm= new frmFoto();
        frm.setTitle("NuevaFoto");
        //mostramos el formulario de frm foto en el principal
        //empieza maximisada
        frm.setMaximizable(true);
        //permite cerrarla
        frm.setClosable(true);
        //permite ajustarla
        frm.setResizable(true);
        //agregamos el form al pnl principal
        pnlPrincipal.add(frm);
        frm.setVisible(true);
        
    }//GEN-LAST:event_btnCerrarFotoActionPerformed

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
            java.util.logging.Logger.getLogger(frmInicioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicioPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAbrirFoto;
    private javax.swing.JMenuItem btnCerrarFoto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmFotos;
    private javax.swing.JDesktopPane pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
