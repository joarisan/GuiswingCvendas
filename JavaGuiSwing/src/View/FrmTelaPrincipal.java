/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author clebe
 */
public class FrmTelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public FrmTelaPrincipal() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jDsktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnSistema = new javax.swing.JMenu();
        jMnItmSair = new javax.swing.JMenuItem();
        jMnCadastro = new javax.swing.JMenu();
        jMnItmCliente = new javax.swing.JMenuItem();
        jMnItmFornecedor = new javax.swing.JMenuItem();
        jMnItmProduto = new javax.swing.JMenuItem();
        jMnVendas = new javax.swing.JMenu();
        jMnItmRegistrar = new javax.swing.JMenuItem();
        jMnItmConsultarVendas = new javax.swing.JMenuItem();
        jMnAjuda = new javax.swing.JMenu();
        jMnItmSobre = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Java GUI Swing - TADS 2023 ! ! !");

        jDsktopPane.setPreferredSize(new java.awt.Dimension(700, 600));

        javax.swing.GroupLayout jDsktopPaneLayout = new javax.swing.GroupLayout(jDsktopPane);
        jDsktopPane.setLayout(jDsktopPaneLayout);
        jDsktopPaneLayout.setHorizontalGroup(
            jDsktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        jDsktopPaneLayout.setVerticalGroup(
            jDsktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );

        jMnSistema.setMnemonic('s');
        jMnSistema.setText("Sistema");

        jMnItmSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnItmSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jMnItmSair.setText("Sair");
        jMnItmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnItmSairActionPerformed(evt);
            }
        });
        jMnSistema.add(jMnItmSair);

        jMenuBar1.add(jMnSistema);

        jMnCadastro.setMnemonic('c');
        jMnCadastro.setText("Cadastro");

        jMnItmCliente.setMnemonic('l');
        jMnItmCliente.setText("Cliente");
        jMnItmCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnItmClienteActionPerformed(evt);
            }
        });
        jMnCadastro.add(jMnItmCliente);

        jMnItmFornecedor.setMnemonic('f');
        jMnItmFornecedor.setText("Fornecedor");
        jMnItmFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnItmFornecedorActionPerformed(evt);
            }
        });
        jMnCadastro.add(jMnItmFornecedor);

        jMnItmProduto.setMnemonic('p');
        jMnItmProduto.setText("Produto");
        jMnItmProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnItmProdutoActionPerformed(evt);
            }
        });
        jMnCadastro.add(jMnItmProduto);

        jMenuBar1.add(jMnCadastro);

        jMnVendas.setMnemonic('v');
        jMnVendas.setText("Vendas");

        jMnItmRegistrar.setMnemonic('r');
        jMnItmRegistrar.setText("Registrar Vendas");
        jMnVendas.add(jMnItmRegistrar);

        jMnItmConsultarVendas.setMnemonic('c');
        jMnItmConsultarVendas.setText("Consultar Vendas");
        jMnVendas.add(jMnItmConsultarVendas);

        jMenuBar1.add(jMnVendas);

        jMnAjuda.setMnemonic('a');
        jMnAjuda.setText("Ajuda");

        jMnItmSobre.setText("Sobre");
        jMnItmSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnItmSobreActionPerformed(evt);
            }
        });
        jMnAjuda.add(jMnItmSobre);

        jMenuBar1.add(jMnAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDsktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDsktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMnItmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnItmSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMnItmSairActionPerformed

    private void jMnItmProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnItmProdutoActionPerformed
      
    }//GEN-LAST:event_jMnItmProdutoActionPerformed

    private void jMnItmSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnItmSobreActionPerformed
        //JOptionPane.showMessageDialog(this, "Java GUI Swing - TADS 2023! - IFMT/ROO\nTurma 2022", "Informação", JOptionPane.INFORMATION_MESSAGE);
        FrmSobre tela = new FrmSobre();
        tela.setVisible(true);
        jDsktopPane.add(tela);
    }//GEN-LAST:event_jMnItmSobreActionPerformed

    private void jMnItmClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnItmClienteActionPerformed
        FrmCliente tela = new FrmCliente();
        tela.setVisible(true);
        jDsktopPane.add(tela);
    }//GEN-LAST:event_jMnItmClienteActionPerformed

    private void jMnItmFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnItmFornecedorActionPerformed
        FrmFornecedor tela = new FrmFornecedor();
        tela.setVisible(true);
        jDsktopPane.add(tela);
    }//GEN-LAST:event_jMnItmFornecedorActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDsktopPane;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMnAjuda;
    private javax.swing.JMenu jMnCadastro;
    private javax.swing.JMenuItem jMnItmCliente;
    private javax.swing.JMenuItem jMnItmConsultarVendas;
    private javax.swing.JMenuItem jMnItmFornecedor;
    private javax.swing.JMenuItem jMnItmProduto;
    private javax.swing.JMenuItem jMnItmRegistrar;
    private javax.swing.JMenuItem jMnItmSair;
    private javax.swing.JMenuItem jMnItmSobre;
    private javax.swing.JMenu jMnSistema;
    private javax.swing.JMenu jMnVendas;
    // End of variables declaration//GEN-END:variables
}
