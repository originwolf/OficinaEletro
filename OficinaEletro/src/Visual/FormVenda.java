/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Modelo.Cliente;
import Modelo.DAOCliente;
import Modelo.DAOVenda;
import Modelo.Venda;

/**
 *
 * @author pedri
 */
public class FormVenda extends javax.swing.JDialog {

    DAOVenda daoVenda = new DAOVenda();
    DAOCliente daoCliente = new DAOCliente();
    /**
     * Creates new form FormAparelho
     */
    public FormVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        atualizaTabela();
        trataEdicao(false);
        listCliente.clear();
        listCliente.addAll(daoCliente.getLista());
    }

    public boolean validaCampos() {

        if (!(txtDataVenda.getText().length() > 0)) {;
            JOptionPane.showMessageDialog(null, "Informe a data de venda do aparelho");
            txtDataVenda.requestFocus();
            return false;
        }
        
        //if (!(cbxCliente.getSelectedIndex() >= 0)) {
        //    JOptionPane.showMessageDialog(null, "Informe o dono do aparelho");
        //    cbxCliente.requestFocus();
        //    return false;
        //}
        
        return true;
    }
    
    private void trataEdicao(boolean editando) {
        btnCancelarAparelho.setEnabled(editando);
        btnSalvarAparelho.setEnabled(editando);
        btnEditarAparelho.setEnabled(!editando);
        int linha = listVenda.size() - 1;
        if (linha < 0) {
            btnExcluirAparelho.setEnabled(false);
            txtDataVenda.setText("");
        } else {
            btnExcluirAparelho.setEnabled(!editando);
        }
        btnExcluirAparelho.setEnabled(!editando);
        btnNovoAparelho.setEnabled(!editando);
        btnFecharAparelho.setEnabled(!editando);
        btnPrimeiroAparelho.setEnabled(!editando);
        btnProximoAparelho.setEnabled(!editando);
        btnAnteriorAparelho.setEnabled(!editando);
        btnUltimoAparelho.setEnabled(!editando);
        txtCodigoVenda.setEnabled(!editando);
        txtDataVenda.setEditable(editando);
        //cbxCliente.setEnabled(editando);
        tblVenda.setEnabled(editando);
    }
    
    public void atualizaTabela() {
        listVenda.clear();
        listVenda.addAll(daoVenda.getLista());
        int linha = listVenda.size() - 1;
        if (linha >= 0) {
            tblVenda.setRowSelectionInterval(linha, linha);
            tblVenda.scrollRectToVisible(tblVenda.getCellRect(linha, linha, true));
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

        listVenda = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Venda> ( ) );
        listCliente = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Cliente>());
        converteData1 = new Modelo.ConverteData();
        painelNavegacao = new javax.swing.JPanel();
        btnPrimeiroAparelho = new javax.swing.JButton();
        btnAnteriorAparelho = new javax.swing.JButton();
        btnProximoAparelho = new javax.swing.JButton();
        btnUltimoAparelho = new javax.swing.JButton();
        btnFecharAparelho = new javax.swing.JButton();
        abaDados = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVenda = new javax.swing.JTable();
        painelDadosAparelho = new javax.swing.JPanel();
        painelAcaoAparelho = new javax.swing.JPanel();
        btnNovoAparelho = new javax.swing.JButton();
        btnEditarAparelho = new javax.swing.JButton();
        btnCancelarAparelho = new javax.swing.JButton();
        btnSalvarAparelho = new javax.swing.JButton();
        btnExcluirAparelho = new javax.swing.JButton();
        txtCodigoAparelhos = new javax.swing.JLabel();
        txtCodigoVenda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter maskData = null;

        try{
            maskData = new javax.swing.text.MaskFormatter("##/##/####");
            maskData.setPlaceholderCharacter('_');
        }catch(Exception e){

        }
        txtDataVenda = new javax.swing.JFormattedTextField(maskData);
        jLabel3 = new javax.swing.JLabel();
        cbxCliente = new javax.swing.JComboBox<>();

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

        jPanel1.setLayout(new java.awt.BorderLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listVenda, tblVenda);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCliente}"));
        columnBinding.setColumnName("Id Cliente");
        columnBinding.setColumnClass(Modelo.Cliente.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idVenda}"));
        columnBinding.setColumnName("Id Venda");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataVendaFormatado}"));
        columnBinding.setColumnName("Data Venda");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tblVenda);

        jPanel1.add(jScrollPane2, java.awt.BorderLayout.PAGE_START);

        abaDados.addTab("Listagem", jPanel1);

        painelAcaoAparelho.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        painelAcaoAparelho.setLayout(new java.awt.GridLayout(1, 0));

        btnNovoAparelho.setText("Novo");
        btnNovoAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAparelhoActionPerformed(evt);
            }
        });
        painelAcaoAparelho.add(btnNovoAparelho);

        btnEditarAparelho.setText("Editar");
        btnEditarAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAparelhoActionPerformed(evt);
            }
        });
        painelAcaoAparelho.add(btnEditarAparelho);

        btnCancelarAparelho.setText("Cancelar");
        btnCancelarAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAparelhoActionPerformed(evt);
            }
        });
        painelAcaoAparelho.add(btnCancelarAparelho);

        btnSalvarAparelho.setText("Salvar");
        btnSalvarAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAparelhoActionPerformed(evt);
            }
        });
        painelAcaoAparelho.add(btnSalvarAparelho);

        btnExcluirAparelho.setText("Excluir");
        btnExcluirAparelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAparelhoActionPerformed(evt);
            }
        });
        painelAcaoAparelho.add(btnExcluirAparelho);

        txtCodigoAparelhos.setLabelFor(abaDados);
        txtCodigoAparelhos.setText("Código:");

        txtCodigoVenda.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblVenda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idAparelho}"), txtCodigoVenda, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtCodigoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoVendaActionPerformed(evt);
            }
        });

        jLabel2.setText("Data de Recebimento:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblVenda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataRecebimentoAparelho}"), txtDataVenda, org.jdesktop.beansbinding.BeanProperty.create("value"));
        binding.setConverter(converteData1);
        bindingGroup.addBinding(binding);

        jLabel3.setText("Cliente:");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listCliente, cbxCliente);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblVenda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idCliente}"), cbxCliente, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout painelDadosAparelhoLayout = new javax.swing.GroupLayout(painelDadosAparelho);
        painelDadosAparelho.setLayout(painelDadosAparelhoLayout);
        painelDadosAparelhoLayout.setHorizontalGroup(
            painelDadosAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosAparelhoLayout.createSequentialGroup()
                .addGroup(painelDadosAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosAparelhoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelDadosAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelAcaoAparelho, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                            .addGroup(painelDadosAparelhoLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(painelDadosAparelhoLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(painelDadosAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosAparelhoLayout.createSequentialGroup()
                                .addComponent(txtCodigoAparelhos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosAparelhoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelDadosAparelhoLayout.setVerticalGroup(
            painelDadosAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosAparelhoLayout.createSequentialGroup()
                .addComponent(painelAcaoAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(painelDadosAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoAparelhos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        abaDados.addTab("Dados", painelDadosAparelho);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelNavegacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelNavegacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abaDados, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharAparelhoActionPerformed
        // TODO add your handling code here:
        dispose(); //fechar janela
    }//GEN-LAST:event_btnFecharAparelhoActionPerformed

    private void btnNovoAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAparelhoActionPerformed
        // TODO add your handling code here:
        listVenda.add((Venda) new Venda());
        int linha = listVenda.size() -1;
        tblVenda.setRowSelectionInterval(linha, linha);
        txtDataVenda.requestFocus();
        trataEdicao(true);
    }//GEN-LAST:event_btnNovoAparelhoActionPerformed

    private void btnSalvarAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAparelhoActionPerformed
        // TODO add your handling code here:
        if(validaCampos()){
            int linhaSelecionada = tblVenda.getSelectedRow(); 
            Venda obj = listVenda.get(linhaSelecionada);
            daoVenda.salvar(obj); 
            atualizaTabela();
            trataEdicao(false);
        }
    }//GEN-LAST:event_btnSalvarAparelhoActionPerformed

    private void btnEditarAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAparelhoActionPerformed
        // TODO add your handling code here:
        trataEdicao(true);
        txtDataVenda.requestFocus();
    }//GEN-LAST:event_btnEditarAparelhoActionPerformed

    private void btnCancelarAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAparelhoActionPerformed
        // TODO add your handling code here:
        trataEdicao(false);
        atualizaTabela();
    }//GEN-LAST:event_btnCancelarAparelhoActionPerformed

    private void btnExcluirAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAparelhoActionPerformed
        // TODO add your handling code here:
         int opcao = JOptionPane.showOptionDialog(null, "Confirma a exclusão?", 
                 "Pergunta",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                 null, new String [] {"Sim","Não"},"Sim");     
         if(opcao==0){    
             int linhaSelecionada = tblVenda.getSelectedRow();         
             Venda obj = listVenda.get(linhaSelecionada);        
             daoVenda.remover(obj);        
             atualizaTabela();   
             trataEdicao(false);      
         }     
    }//GEN-LAST:event_btnExcluirAparelhoActionPerformed

    private void btnPrimeiroAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroAparelhoActionPerformed
        // TODO add your handling code here:
        tblVenda.setRowSelectionInterval(0, 0);
        tblVenda.scrollRectToVisible(tblVenda.getCellRect(0, 0, true));
    }//GEN-LAST:event_btnPrimeiroAparelhoActionPerformed

    private void btnAnteriorAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorAparelhoActionPerformed
        // TODO add your handling code here:
        int linha = tblVenda.getSelectedRow();
        if ((linha - 1) >= 0) {
            linha--;
        }
        tblVenda.setRowSelectionInterval(linha, linha);
        tblVenda.scrollRectToVisible(tblVenda.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnAnteriorAparelhoActionPerformed

    private void btnProximoAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoAparelhoActionPerformed
        // TODO add your handling code here:
        int linha = tblVenda.getSelectedRow();
        if ((linha + 1) <= tblVenda.getRowCount() - 1) {
            linha++;
        }
        tblVenda.setRowSelectionInterval(linha, linha);
        tblVenda.scrollRectToVisible(tblVenda.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnProximoAparelhoActionPerformed

    private void btnUltimoAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoAparelhoActionPerformed
        // TODO add your handling code here:
        int linha = tblVenda.getSelectedRow();
        if ((linha + 1) <= tblVenda.getRowCount() - 1) {
            linha++;
        }
        tblVenda.setRowSelectionInterval(linha, linha);
        tblVenda.scrollRectToVisible(tblVenda.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnUltimoAparelhoActionPerformed

    private void txtCodigoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoVendaActionPerformed

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
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormVenda dialog = new FormVenda(new javax.swing.JFrame(), true);
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
    private javax.swing.JTabbedPane abaDados;
    private javax.swing.JButton btnAnteriorAparelho;
    private javax.swing.JButton btnCancelarAparelho;
    private javax.swing.JButton btnEditarAparelho;
    private javax.swing.JButton btnExcluirAparelho;
    private javax.swing.JButton btnFecharAparelho;
    private javax.swing.JButton btnNovoAparelho;
    private javax.swing.JButton btnPrimeiroAparelho;
    private javax.swing.JButton btnProximoAparelho;
    private javax.swing.JButton btnSalvarAparelho;
    private javax.swing.JButton btnUltimoAparelho;
    private javax.swing.JComboBox<String> cbxCliente;
    private Modelo.ConverteData converteData1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.util.List<Cliente> listCliente;
    private java.util.List<Venda> listVenda;
    private javax.swing.JPanel painelAcaoAparelho;
    private javax.swing.JPanel painelDadosAparelho;
    private javax.swing.JPanel painelNavegacao;
    private javax.swing.JTable tblVenda;
    private javax.swing.JLabel txtCodigoAparelhos;
    private javax.swing.JTextField txtCodigoVenda;
    private javax.swing.JFormattedTextField txtDataVenda;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
