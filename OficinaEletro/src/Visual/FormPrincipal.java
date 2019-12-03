/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author pedri
 */
public class FormPrincipal extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame
     */
    public FormPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        btnAparelho = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnTecnico = new javax.swing.JButton();
        btnImagem = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuAparelho = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenuItem();
        menuEstoque = new javax.swing.JMenuItem();
        menuTecnico = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(240, 240, 240));
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.gray);

        btnAparelho.setBackground(java.awt.Color.darkGray);
        btnAparelho.setForeground(new java.awt.Color(255, 255, 255));
        btnAparelho.setText("Aparelho");
        btnAparelho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAparelhoActionPerformed(evt);
            }
        });

        btnCliente.setBackground(java.awt.Color.darkGray);
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setText("Cliente");
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnVenda.setBackground(java.awt.Color.darkGray);
        btnVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVenda.setText("Venda");
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnTecnico.setBackground(java.awt.Color.darkGray);
        btnTecnico.setForeground(new java.awt.Color(255, 255, 255));
        btnTecnico.setText("Técnico");
        btnTecnico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecnicoActionPerformed(evt);
            }
        });

        btnImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tamanho.png"))); // NOI18N
        btnImagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagemActionPerformed(evt);
            }
        });

        btnEstoque.setBackground(java.awt.Color.darkGray);
        btnEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btnEstoque.setText("Estoque");
        btnEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuCadastro.setText("Cadastro");

        menuAparelho.setText("Aparelho");
        menuAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAparelhoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuAparelho);

        menuCliente.setText("Cliente");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCliente);

        menuEstoque.setText("Estoque");
        menuEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEstoqueActionPerformed(evt);
            }
        });
        menuCadastro.add(menuEstoque);

        menuTecnico.setText("Tecnico");
        menuTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTecnicoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuTecnico);

        barraMenu.add(menuCadastro);

        menuAjuda.setText("Ajuda");

        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuSobre);

        barraMenu.add(menuAjuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Sistema de Gerenciamento para Oficinas de Assistência Técnica. \n\tDireitos Reservados");
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAparelhoActionPerformed
        // TODO add your handling code here:
        FormAparelho form = new FormAparelho(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);//não deixa fechar a janela pelo x
        form.setLocationRelativeTo(null); // centralizar a janela
        form.setResizable(true); // retirar o botão de maximizar
        form.setVisible(true);
    }//GEN-LAST:event_menuAparelhoActionPerformed

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        // TODO add your handling code here:
        FormCliente form = new FormCliente(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);//não deixa fechar a janela pelo x
        form.setLocationRelativeTo(null); // centralizar a janela
        form.setResizable(true); // retirar o botão de maximizar
        form.setVisible(true);
    }//GEN-LAST:event_menuClienteActionPerformed

    private void btnAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAparelhoActionPerformed
        // TODO add your handling code here:
        FormAparelho form = new FormAparelho(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);//não deixa fechar a janela pelo x
        form.setLocationRelativeTo(null); // centralizar a janela
        form.setResizable(true); // retirar o botão de maximizar
        form.setVisible(true);
    }//GEN-LAST:event_btnAparelhoActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
        FormCliente form = new FormCliente(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);//não deixa fechar a janela pelo x
        form.setLocationRelativeTo(null); // centralizar a janela
        form.setResizable(true); // retirar o botão de maximizar
        form.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecnicoActionPerformed
        // TODO add your handling code here:
        FormTecnico form = new FormTecnico(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);//não deixa fechar a janela pelo x
        form.setLocationRelativeTo(null); // centralizar a janela
        form.setResizable(true); // retirar o botão de maximizar
        form.setVisible(true);
    }//GEN-LAST:event_btnTecnicoActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        // TODO add your handling code here:
        FormVenda form = new FormVenda(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);//não deixa fechar a janela pelo x
        form.setLocationRelativeTo(null); // centralizar a janela
        form.setResizable(true); // retirar o botão de maximizar
        form.setVisible(true);
    }//GEN-LAST:event_btnVendaActionPerformed

    private void menuEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEstoqueActionPerformed
        // TODO add your handling code here:
        FormEstoque form = new FormEstoque(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);//não deixa fechar a janela pelo x
        form.setLocationRelativeTo(null); // centralizar a janela
        form.setResizable(true); // retirar o botão de maximizar
        form.setVisible(true);
    }//GEN-LAST:event_menuEstoqueActionPerformed

    private void menuTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTecnicoActionPerformed
        // TODO add your handling code here:
        FormTecnico form = new FormTecnico(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);//não deixa fechar a janela pelo x
        form.setLocationRelativeTo(null); // centralizar a janela
        form.setResizable(true); // retirar o botão de maximizar
        form.setVisible(true);
    }//GEN-LAST:event_menuTecnicoActionPerformed

    private void btnImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagemActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Sistema de Gerenciamento para Oficinas de Assistência Técnica.\nDireitos Reservados");
    }//GEN-LAST:event_btnImagemActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        // TODO add your handling code here:
        FormEstoque form = new FormEstoque(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);//não deixa fechar a janela pelo x
        form.setLocationRelativeTo(null); // centralizar a janela
        form.setResizable(true); // retirar o botão de maximizar
        form.setVisible(true);
    }//GEN-LAST:event_btnEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormPrincipal from = new FormPrincipal();
                from.setLocationRelativeTo(null);
                from.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnAparelho;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnImagem;
    private javax.swing.JButton btnTecnico;
    private javax.swing.JButton btnVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAparelho;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenuItem menuEstoque;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JMenuItem menuTecnico;
    // End of variables declaration//GEN-END:variables
}
