package Visual;

import Modelo.Aparelho;
import java.util.ArrayList;
import Modelo.Cliente;
import Modelo.Conserto;
import Modelo.DAOAparelho;
import Modelo.DAOConserto;
import Modelo.DAOTecnico;
import Modelo.Tecnico;
import javax.swing.JOptionPane;

/**
 *
 * @author CelsoAugusto
 */
public class FormConserto extends javax.swing.JDialog {

    DAOTecnico daoTecnico = new DAOTecnico();
    DAOAparelho daoAparelho = new DAOAparelho();
    DAOConserto daoConserto = new DAOConserto();
    /**
     * Creates new form FormAparelho
     */
    public FormConserto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        atualizaTabela();
        listAparelho.clear();
        listAparelho.addAll(daoAparelho.getLista());
        listTecnico.clear();
        listTecnico.addAll(daoTecnico.getLista());
    }
    
    public boolean validaCampos() {
        
        if (!(txtPrecoConserto.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o preço do conserto");
            txtPrecoConserto.requestFocus();
            return false;
        }
        
        if (!(cbxTecnico.getSelectedIndex() >= 0)) {
            JOptionPane.showMessageDialog(null, "Informe o técnico");
            cbxTecnico.requestFocus();
            return false;
        }
        
        if (!(cbxAparelho.getSelectedIndex() >= 0)) {
            JOptionPane.showMessageDialog(null, "Informe o aparelho");
            cbxAparelho.requestFocus();
            return false;
        }
        
        return true;
    }
    
    private void trataEdicao(boolean editando) {
        btnCancelarAparelho.setEnabled(editando);
        btnSalvarAparelho.setEnabled(editando);
        btnEditarAparelho.setEnabled(!editando);
        int linha = listConserto.size() - 1;
        if (linha < 0) {
            btnExcluirAparelho.setEnabled(false);
            txtCodigoVenda.setText("");
            txtPrecoConserto.setText("");
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
        txtPrecoConserto.setEnabled(editando);
    }
    
    public void atualizaTabela() {
        listConserto.clear();
        listConserto.addAll(daoConserto.getLista());
        int linha = listConserto.size() - 1;
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

        listConserto = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Conserto>());
        listTecnico = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Tecnico> ( ) );
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
        painelDadosAparelho = new javax.swing.JPanel();
        painelAcaoAparelho = new javax.swing.JPanel();
        btnNovoAparelho = new javax.swing.JButton();
        btnEditarAparelho = new javax.swing.JButton();
        btnCancelarAparelho = new javax.swing.JButton();
        btnSalvarAparelho = new javax.swing.JButton();
        btnExcluirAparelho = new javax.swing.JButton();
        txtCodigoAparelhos = new javax.swing.JLabel();
        txtCodigoVenda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxTecnico = new javax.swing.JComboBox<>();
        txtPrecoConserto = new javax.swing.JTextField();
        txtCodigoAparelhos1 = new javax.swing.JLabel();
        cbxAparelho = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizador de Vendas");

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

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listConserto, tblResumoVenda);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idConserto}"));
        columnBinding.setColumnName("Id Conserto");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${precoConserto}"));
        columnBinding.setColumnName("Preco Conserto");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idTecnico}"));
        columnBinding.setColumnName("Tecnico responsável");
        columnBinding.setColumnClass(Modelo.Tecnico.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idAparelho}"));
        columnBinding.setColumnName("Id Aparelho");
        columnBinding.setColumnClass(Modelo.Aparelho.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tblResumoVenda);

        abaListagem.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        abas.addTab("Listagem", abaListagem);

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

        txtCodigoAparelhos.setText("Código:");

        txtCodigoVenda.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblResumoVenda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idConserto}"), txtCodigoVenda, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtCodigoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoVendaActionPerformed(evt);
            }
        });

        jLabel3.setText("Técnico:");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listTecnico, cbxTecnico);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblResumoVenda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idTecnico}"), cbxTecnico, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        txtPrecoConserto.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblResumoVenda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.precoConserto}"), txtPrecoConserto, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtPrecoConserto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoConsertoActionPerformed(evt);
            }
        });

        txtCodigoAparelhos1.setText("Preço:");

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listAparelho, cbxAparelho);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblResumoVenda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idAparelho}"), cbxAparelho, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jLabel4.setText("Aparelho:");

        javax.swing.GroupLayout painelDadosAparelhoLayout = new javax.swing.GroupLayout(painelDadosAparelho);
        painelDadosAparelho.setLayout(painelDadosAparelhoLayout);
        painelDadosAparelhoLayout.setHorizontalGroup(
            painelDadosAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosAparelhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAcaoAparelho, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(painelDadosAparelhoLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(painelDadosAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelDadosAparelhoLayout.createSequentialGroup()
                        .addComponent(txtCodigoAparelhos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDadosAparelhoLayout.createSequentialGroup()
                        .addGroup(painelDadosAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodigoAparelhos1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelDadosAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecoConserto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(txtPrecoConserto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoAparelhos1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(painelDadosAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(painelDadosAparelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxAparelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        abas.addTab("Dados", painelDadosAparelho);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelNavegacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelNavegacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abas, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
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

    private void btnNovoAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAparelhoActionPerformed
        // TODO add your handling code here:
        listConserto.add((Conserto) new Conserto());
        int linha = listConserto.size() -1;
        tblResumoVenda.setRowSelectionInterval(linha, linha);
        txtPrecoConserto.requestFocus();
        trataEdicao(true);
    }//GEN-LAST:event_btnNovoAparelhoActionPerformed

    private void btnEditarAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAparelhoActionPerformed
        // TODO add your handling code here:
        trataEdicao(true);
        txtPrecoConserto.requestFocus();
    }//GEN-LAST:event_btnEditarAparelhoActionPerformed

    private void btnCancelarAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAparelhoActionPerformed
        // TODO add your handling code here:
        trataEdicao(false);
        atualizaTabela();
    }//GEN-LAST:event_btnCancelarAparelhoActionPerformed

    private void btnSalvarAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAparelhoActionPerformed
        // TODO add your handling code here:
        if(validaCampos()){
            int linhaSelecionada = tblResumoVenda.getSelectedRow();
            Conserto obj = listConserto.get(linhaSelecionada);
            daoConserto.salvar(obj);
            atualizaTabela();
            trataEdicao(false);
        }
    }//GEN-LAST:event_btnSalvarAparelhoActionPerformed

    private void btnExcluirAparelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAparelhoActionPerformed
        // TODO add your handling code here:
        int opcao = JOptionPane.showOptionDialog(null, "Confirma a exclusão?",
            "Pergunta",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, new String [] {"Sim","Não"},"Sim");
        if(opcao==0){
            int linhaSelecionada = tblResumoVenda.getSelectedRow();
            Conserto obj = listConserto.get(linhaSelecionada);
            daoConserto.remover(obj);
            atualizaTabela();
            trataEdicao(false);
        }
    }//GEN-LAST:event_btnExcluirAparelhoActionPerformed

    private void txtCodigoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoVendaActionPerformed

    private void txtPrecoConsertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoConsertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoConsertoActionPerformed

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
            java.util.logging.Logger.getLogger(FormConserto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConserto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConserto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConserto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormConserto dialog = new FormConserto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelarAparelho;
    private javax.swing.JButton btnEditarAparelho;
    private javax.swing.JButton btnExcluirAparelho;
    private javax.swing.JButton btnFecharAparelho;
    private javax.swing.JButton btnNovoAparelho;
    private javax.swing.JButton btnPrimeiroAparelho;
    private javax.swing.JButton btnProximoAparelho;
    private javax.swing.JButton btnSalvarAparelho;
    private javax.swing.JButton btnUltimoAparelho;
    private javax.swing.JComboBox<String> cbxAparelho;
    private javax.swing.JComboBox<String> cbxTecnico;
    private Modelo.ConverteData converteData1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.util.List<Aparelho> listAparelho;
    private java.util.List<Cliente> listCliente;
    private java.util.List<Conserto> listConserto;
    private java.util.List<Tecnico> listTecnico;
    private javax.swing.JPanel painelAcaoAparelho;
    private javax.swing.JPanel painelDadosAparelho;
    private javax.swing.JPanel painelNavegacao;
    private javax.swing.JTable tblResumoVenda;
    private javax.swing.JLabel txtCodigoAparelhos;
    private javax.swing.JLabel txtCodigoAparelhos1;
    private javax.swing.JTextField txtCodigoVenda;
    private javax.swing.JTextField txtPrecoConserto;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
