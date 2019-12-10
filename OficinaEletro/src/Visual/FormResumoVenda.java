package Visual;

import Modelo.Aparelho;
import java.util.ArrayList;
import Modelo.Cliente;
import Modelo.DAOAparelho;
import Modelo.DAOCliente;
import Modelo.DAOResumoVenda;
import Modelo.DAOVenda;
import Modelo.ResumoVenda;
import Modelo.Venda;

/**
 *
 * @author CelsoAugusto
 */
public class FormResumoVenda extends javax.swing.JDialog {

    DAOCliente daoCliente = new DAOCliente();
    DAOVenda daoVenda = new DAOVenda();
    DAOAparelho daoAparelho = new DAOAparelho();
    DAOResumoVenda daoResumo = new DAOResumoVenda();
    /**
     * Creates new form FormAparelho
     */
    public FormResumoVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        atualizaTabela();
        listCliente.clear();
        listCliente.addAll(daoCliente.getLista());
        listAparelho.clear();
        listAparelho.addAll(daoAparelho.getLista());
        listVenda.clear();
        listVenda.addAll(daoVenda.getLista());
    }
    
    public void atualizaTabela() {
        listResumo.clear();
        listResumo.addAll(daoResumo.getLista());
        int linha = listResumo.size() - 1;
        if (linha >= 0) {
            tblResumoVenda.setRowSelectionInterval(linha, linha);
            tblResumoVenda.scrollRectToVisible(tblResumoVenda.getCellRect(linha, linha, true));
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        listResumo =  org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList <ResumoVenda>());
        listVenda = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Venda> ( ) );
        listCliente = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Cliente>());
        listAparelho = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Aparelho>());
        converteData1 = new Modelo.ConverteData();
        painelNavegacao = new javax.swing.JPanel();
        btnPrimeiroAparelho = new javax.swing.JButton();
        btnAnteriorAparelho = new javax.swing.JButton();
        btnProximoAparelho = new javax.swing.JButton();
        btnUltimoAparelho = new javax.swing.JButton();
        btnFecharAparelho = new javax.swing.JButton();
        abas = new javax.swing.JTabbedPane();
        abaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResumoVenda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Aparelhos");

        painelNavegacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));
        painelNavegacao.setLayout(new java.awt.GridLayout(1, 0));

        btnPrimeiroAparelho.setText("Primeiro");
        btnPrimeiroAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroAparelhoActionPerformed(evt);
            }
        });
        painelNavegacao.add(btnPrimeiroAparelho);

        btnAnteriorAparelho.setText("Anterior");
        btnAnteriorAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorAparelhoActionPerformed(evt);
            }
        });
        painelNavegacao.add(btnAnteriorAparelho);

        btnProximoAparelho.setText("Próximo");
        btnProximoAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoAparelhoActionPerformed(evt);
            }
        });
        painelNavegacao.add(btnProximoAparelho);

        btnUltimoAparelho.setText("Último");
        btnUltimoAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoAparelhoActionPerformed(evt);
            }
        });
        painelNavegacao.add(btnUltimoAparelho);

        btnFecharAparelho.setText("Fechar");
        btnFecharAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharAparelhoActionPerformed(evt);
            }
        });
        painelNavegacao.add(btnFecharAparelho);

        abaListagem.setLayout(new java.awt.BorderLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listResumo, tblResumoVenda);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tblResumoVenda);

        abaListagem.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        abas.addTab("Listagem", abaListagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelNavegacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abas, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelNavegacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abas, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharAparelhoActionPerformed
        // TODO add your handling code here:
        dispose(); //fechar janela
    }//GEN-LAST:event_btnFecharAparelhoActionPerformed

    private void btnPrimeiroAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroAparelhoActionPerformed
        // TODO add your handling code here:
        tblResumoVenda.setRowSelectionInterval(0, 0);
        tblResumoVenda.scrollRectToVisible(tblResumoVenda.getCellRect(0, 0, true));
    }//GEN-LAST:event_btnPrimeiroAparelhoActionPerformed

    private void btnAnteriorAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorAparelhoActionPerformed
        // TODO add your handling code here:
        int linha = tblResumoVenda.getSelectedRow();
        if ((linha - 1) >= 0) {
            linha--;
        }
        tblResumoVenda.setRowSelectionInterval(linha, linha);
        tblResumoVenda.scrollRectToVisible(tblResumoVenda.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnAnteriorAparelhoActionPerformed

    private void btnProximoAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoAparelhoActionPerformed
        // TODO add your handling code here:
        int linha = tblResumoVenda.getSelectedRow();
        if ((linha + 1) <= tblResumoVenda.getRowCount() - 1) {
            linha++;
        }
        tblResumoVenda.setRowSelectionInterval(linha, linha);
        tblResumoVenda.scrollRectToVisible(tblResumoVenda.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnProximoAparelhoActionPerformed

    private void btnUltimoAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoAparelhoActionPerformed
        // TODO add your handling code here:
        int linha = tblResumoVenda.getSelectedRow();
        if ((linha + 1) <= tblResumoVenda.getRowCount() - 1) {
            linha++;
        }
        tblResumoVenda.setRowSelectionInterval(linha, linha);
        tblResumoVenda.scrollRectToVisible(tblResumoVenda.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnUltimoAparelhoActionPerformed

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
            java.util.logging.Logger.getLogger(FormResumoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormResumoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormResumoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormResumoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormResumoVenda dialog = new FormResumoVenda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaListagem;
    private javax.swing.JTabbedPane abas;
    private javax.swing.JButton btnAnteriorAparelho;
    private javax.swing.JButton btnFecharAparelho;
    private javax.swing.JButton btnPrimeiroAparelho;
    private javax.swing.JButton btnProximoAparelho;
    private javax.swing.JButton btnUltimoAparelho;
    private Modelo.ConverteData converteData1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.util.List<Aparelho> listAparelho;
    private java.util.List<Cliente> listCliente;
    private java.util.List<ResumoVenda> listResumo;
    private java.util.List<Venda> listVenda;
    private javax.swing.JPanel painelNavegacao;
    private javax.swing.JTable tblResumoVenda;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}