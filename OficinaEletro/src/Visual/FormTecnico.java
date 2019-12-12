package Visual;

import Modelo.DAOTecnico;
import Modelo.Tecnico;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ceila
 */
public class FormTecnico extends javax.swing.JDialog {

    DAOTecnico daoTecnico = new DAOTecnico();
    
    /**
     * Creates new form FormTecnico
     */
    public FormTecnico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        atualizaTabela();
        trataEdicao(false);
    }

    public boolean validaCampos() {
        if (!(txtNomeTecnico.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o nome do técnico");
            txtNomeTecnico.requestFocus();
            return false;
        }
        if (!(txtCpfTecnico.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o cpf do técnico");
            txtCpfTecnico.requestFocus();
            return false;
        }
        if (!(txtRgTecnico.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o rg do técnico");
            txtRgTecnico.requestFocus();
            return false;
        }
        if (!(txtCarteiraTecnico.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe a CTPS do técnico");
            txtCarteiraTecnico.requestFocus();
            return false;
        }
        if (!(txtSalarioTecnico.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o salário do técnico");
            txtSalarioTecnico.requestFocus();
            return false;
        }
        if (!(cbxEspecialidadeTecnico.getSelectedIndex() >= 0)) {
            JOptionPane.showMessageDialog(null, "Informe a especialidade do técnico");
            cbxEspecialidadeTecnico.requestFocus();
            return false;
        }
        
        if (!(txtRuaTecnico.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe a rua do técnico");
            txtRuaTecnico.requestFocus();
            return false;
        }
        if (!(txtCasaTecnico.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o número da casa do técnico");
            txtCasaTecnico.requestFocus();
            return false;
        }
        if (!(txtBairroTecnico.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o bairro do técnico");
            txtBairroTecnico.requestFocus();
            return false;
        }
        if (!(txtCidadeTecnico.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe a cidade do técnico");
            txtCidadeTecnico.requestFocus();
            return false;
        }
        if (!(cbxUfTecnico.getSelectedIndex() >= 0)) {
            JOptionPane.showMessageDialog(null, "Informe a UF do técnico");
            cbxUfTecnico.requestFocus();
            return false;
        }
        return true;
    }
    
    private void trataEdicao(boolean editando) {
        btnCancelarTecnico.setEnabled(editando);
        btnSalvarTecnico.setEnabled(editando);
        btnEditarTecnico.setEnabled(!editando);
        int linha = listTecnico.size() - 1;
        if (linha < 0) {
            btnExcluirTecnico.setEnabled(false);
            txtCodigoTecnico.setText("");
            txtNomeTecnico.setText("");
            txtCpfTecnico.setText("");
            txtRgTecnico.setText("");
            txtCarteiraTecnico.setText("");
            txtSalarioTecnico.setText("");
            txtRuaTecnico.setText("");
            txtCasaTecnico.setText("");
            txtBairroTecnico.setText("");
            txtCidadeTecnico.setText("");
            txtEmailTecnico.setText("");
            txtTelefoneTecnico.setText("");
        } else {
            btnExcluirTecnico.setEnabled(!editando);
        }
        btnExcluirTecnico.setEnabled(!editando);
        btnNovoTecnico.setEnabled(!editando);
        btnFecharTecnico.setEnabled(!editando);
        btnPrimeiroTecnico.setEnabled(!editando);
        btnProximoTecnico.setEnabled(!editando);
        btnAnteriorTecnico.setEnabled(!editando);
        btnUltimoTecnico.setEnabled(!editando);
        txtNomeTecnico.setEnabled(editando);
        txtCpfTecnico.setEnabled(editando);
        txtRgTecnico.setEnabled(editando);
        txtCarteiraTecnico.setEnabled(editando);
        txtSalarioTecnico.setEnabled(editando);
        txtRuaTecnico.setEnabled(editando);
        txtCasaTecnico.setEnabled(editando);
        txtBairroTecnico.setEnabled(editando);
        txtCidadeTecnico.setEnabled(editando);
        txtEmailTecnico.setEnabled(editando);
        txtTelefoneTecnico.setEnabled(editando);
        cbxEspecialidadeTecnico.setEnabled(editando);
        cbxUfTecnico.setEnabled(editando);
        tblTecnico.setEnabled(editando);
    }
    
    public void atualizaTabela() {
        listTecnico.clear();
        listTecnico.addAll(daoTecnico.getLista());
        int linha = listTecnico.size() - 1;
        if (linha >= 0) {
            tblTecnico.setRowSelectionInterval(linha, linha);
            tblTecnico.scrollRectToVisible(tblTecnico.getCellRect(linha, linha, true));
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

        listTecnico =  org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList <Tecnico> ( ) );
        painelNavegacaoTecnico = new javax.swing.JPanel();
        btnPrimeiroTecnico = new javax.swing.JButton();
        btnAnteriorTecnico = new javax.swing.JButton();
        btnProximoTecnico = new javax.swing.JButton();
        btnUltimoTecnico = new javax.swing.JButton();
        btnFecharTecnico = new javax.swing.JButton();
        abas = new javax.swing.JTabbedPane();
        abaListagem = new javax.swing.JPanel();
        painelListagem = new javax.swing.JScrollPane();
        tblTecnico = new javax.swing.JTable();
        abaDados = new javax.swing.JPanel();
        painelAcoes = new javax.swing.JPanel();
        btnNovoTecnico = new javax.swing.JButton();
        btnEditarTecnico = new javax.swing.JButton();
        btnCancelarTecnico = new javax.swing.JButton();
        btnSalvarTecnico = new javax.swing.JButton();
        btnExcluirTecnico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoTecnico = new javax.swing.JTextField();
        txtNomeTecnico = new javax.swing.JTextField();
        txtRgTecnico = new javax.swing.JTextField();
        txtCpfTecnico = new javax.swing.JTextField();
        txtCarteiraTecnico = new javax.swing.JTextField();
        txtSalarioTecnico = new javax.swing.JTextField();
        cbxEspecialidadeTecnico = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtRuaTecnico = new javax.swing.JTextField();
        txtCasaTecnico = new javax.swing.JTextField();
        txtBairroTecnico = new javax.swing.JTextField();
        txtCidadeTecnico = new javax.swing.JTextField();
        txtEmailTecnico = new javax.swing.JTextField();
        txtTelefoneTecnico = new javax.swing.JTextField();
        cbxUfTecnico = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Técnicos");

        painelNavegacaoTecnico.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));
        painelNavegacaoTecnico.setLayout(new java.awt.GridLayout(1, 0));

        btnPrimeiroTecnico.setText("Primeiro");
        btnPrimeiroTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroTecnicoActionPerformed(evt);
            }
        });
        painelNavegacaoTecnico.add(btnPrimeiroTecnico);

        btnAnteriorTecnico.setText("Anterior");
        btnAnteriorTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorTecnicoActionPerformed(evt);
            }
        });
        painelNavegacaoTecnico.add(btnAnteriorTecnico);

        btnProximoTecnico.setText("Próximo");
        btnProximoTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoTecnicoActionPerformed(evt);
            }
        });
        painelNavegacaoTecnico.add(btnProximoTecnico);

        btnUltimoTecnico.setText("Último");
        btnUltimoTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoTecnicoActionPerformed(evt);
            }
        });
        painelNavegacaoTecnico.add(btnUltimoTecnico);

        btnFecharTecnico.setText("Fechar");
        btnFecharTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharTecnicoActionPerformed(evt);
            }
        });
        painelNavegacaoTecnico.add(btnFecharTecnico);

        abaListagem.setLayout(new java.awt.BorderLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listTecnico, tblTecnico);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idTecnico}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomeTecnico}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${carteiraTrabalho}"));
        columnBinding.setColumnName("CTPS");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpfTecnico}"));
        columnBinding.setColumnName("CPF");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${especialidadeTecnico}"));
        columnBinding.setColumnName("Especialidade");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rgTecnico}"));
        columnBinding.setColumnName("RG");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ruaTecnico}"));
        columnBinding.setColumnName("Rua");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroCasaTecnico}"));
        columnBinding.setColumnName("Numero da casa");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bairroTecnico}"));
        columnBinding.setColumnName("Bairro");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cidadeTecnico}"));
        columnBinding.setColumnName("Cidade");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ufTecnico}"));
        columnBinding.setColumnName("UF");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${salario}"));
        columnBinding.setColumnName("Salário");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefoneTecnico}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${emailTecnico}"));
        columnBinding.setColumnName("E-mail");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        painelListagem.setViewportView(tblTecnico);

        abaListagem.add(painelListagem, java.awt.BorderLayout.CENTER);

        abas.addTab("Listagem", abaListagem);

        painelAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        painelAcoes.setLayout(new java.awt.GridLayout(1, 0));

        btnNovoTecnico.setText("Novo");
        btnNovoTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoTecnicoActionPerformed(evt);
            }
        });
        painelAcoes.add(btnNovoTecnico);

        btnEditarTecnico.setText("Editar");
        btnEditarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTecnicoActionPerformed(evt);
            }
        });
        painelAcoes.add(btnEditarTecnico);

        btnCancelarTecnico.setText("Cancelar");
        btnCancelarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarTecnicoActionPerformed(evt);
            }
        });
        painelAcoes.add(btnCancelarTecnico);

        btnSalvarTecnico.setText("Salvar");
        btnSalvarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarTecnicoActionPerformed(evt);
            }
        });
        painelAcoes.add(btnSalvarTecnico);

        btnExcluirTecnico.setText("Excluir");
        btnExcluirTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTecnicoActionPerformed(evt);
            }
        });
        painelAcoes.add(btnExcluirTecnico);

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("RG:");

        jLabel5.setText("Especialidade:");

        jLabel6.setText("Carteira de Trabalho:");

        jLabel7.setText("Salario:");

        txtCodigoTecnico.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblTecnico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idTecnico}"), txtCodigoTecnico, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblTecnico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nomeTecnico}"), txtNomeTecnico, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblTecnico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.rgTecnico}"), txtRgTecnico, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblTecnico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cpfTecnico}"), txtCpfTecnico, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblTecnico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.carteiraTrabalho}"), txtCarteiraTecnico, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblTecnico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.salario}"), txtSalarioTecnico, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        cbxEspecialidadeTecnico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mecânico", "Eletrônico", "Geral" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblTecnico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.especialidadeTecnico}"), cbxEspecialidadeTecnico, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jLabel9.setText("Rua:");

        jLabel10.setText("Numero da casa:");

        jLabel11.setText("Bairro:");

        jLabel12.setText("Cidade:");

        jLabel13.setText("UF:");

        jLabel14.setText("E-mail:");

        jLabel15.setText("Telefone:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblTecnico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.ruaTecnico}"), txtRuaTecnico, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtRuaTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaTecnicoActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblTecnico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.numeroCasaTecnico}"), txtCasaTecnico, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblTecnico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.bairroTecnico}"), txtBairroTecnico, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblTecnico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cidadeTecnico}"), txtCidadeTecnico, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtCidadeTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeTecnicoActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblTecnico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.emailTecnico}"), txtEmailTecnico, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblTecnico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.telefoneTecnico}"), txtTelefoneTecnico, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        cbxUfTecnico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblTecnico, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.ufTecnico}"), cbxUfTecnico, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout abaDadosLayout = new javax.swing.GroupLayout(abaDados);
        abaDados.setLayout(abaDadosLayout);
        abaDadosLayout.setHorizontalGroup(
            abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(abaDadosLayout.createSequentialGroup()
                        .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abaDadosLayout.createSequentialGroup()
                                .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(abaDadosLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(abaDadosLayout.createSequentialGroup()
                                        .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRuaTecnico)
                                            .addComponent(txtCpfTecnico))))
                                .addGap(18, 18, 18)
                                .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(abaDadosLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCasaTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBairroTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxEspecialidadeTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(abaDadosLayout.createSequentialGroup()
                                        .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNomeTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRgTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaDadosLayout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addComponent(jLabel7)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCarteiraTecnico)
                                            .addComponent(txtSalarioTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(abaDadosLayout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCidadeTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(abaDadosLayout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtEmailTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(abaDadosLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefoneTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxUfTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 449, Short.MAX_VALUE)))
                .addContainerGap())
        );
        abaDadosLayout.setVerticalGroup(
            abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaDadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abaDadosLayout.createSequentialGroup()
                                .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtCodigoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNomeTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCpfTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRgTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaDadosLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel3))))
                            .addGroup(abaDadosLayout.createSequentialGroup()
                                .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCarteiraTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtSalarioTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtEmailTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(abaDadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidadeTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtRuaTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCasaTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtBairroTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbxEspecialidadeTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(abaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtTelefoneTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cbxUfTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(367, Short.MAX_VALUE))
        );

        abas.addTab("Dados", abaDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelNavegacaoTecnico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelNavegacaoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abas)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharTecnicoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnFecharTecnicoActionPerformed

    private void btnNovoTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoTecnicoActionPerformed
        // TODO add your handling code here:
        listTecnico.add((Tecnico) new Tecnico());
        int linha = listTecnico.size() -1;
        tblTecnico.setRowSelectionInterval(linha, linha);
        txtNomeTecnico.requestFocus();
        trataEdicao(true);
    }//GEN-LAST:event_btnNovoTecnicoActionPerformed

    private void btnSalvarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTecnicoActionPerformed
        // TODO add your handling code here:
        if(validaCampos()){
            int linhaSelecionada = tblTecnico.getSelectedRow(); 
            Tecnico obj = listTecnico.get(linhaSelecionada);
            daoTecnico.salvar(obj); 
            atualizaTabela();
            trataEdicao(false);
        }
    }//GEN-LAST:event_btnSalvarTecnicoActionPerformed

    private void btnEditarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTecnicoActionPerformed
        // TODO add your handling code here:
         trataEdicao(true);  
         txtNomeTecnico.requestFocus();
    }//GEN-LAST:event_btnEditarTecnicoActionPerformed

    private void btnCancelarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarTecnicoActionPerformed
        // TODO add your handling code here:
         trataEdicao(false);        
         atualizaTabela();
    }//GEN-LAST:event_btnCancelarTecnicoActionPerformed

    private void btnExcluirTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTecnicoActionPerformed
        // TODO add your handling code here:
        int opcao = JOptionPane.showOptionDialog(null, "Confirma a exclusão?", 
                 "Pergunta",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                 null, new String [] {"Sim","Não"},"Sim");     
         if(opcao==0){    
             int linhaSelecionada = tblTecnico.getSelectedRow();         
             Tecnico obj = listTecnico.get(linhaSelecionada);        
             daoTecnico.remover(obj);        
             atualizaTabela();   
             trataEdicao(false);      
         } 
    }//GEN-LAST:event_btnExcluirTecnicoActionPerformed

    private void btnPrimeiroTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroTecnicoActionPerformed
        // TODO add your handling code here:
        tblTecnico.setRowSelectionInterval(0, 0);
        tblTecnico.scrollRectToVisible(tblTecnico.getCellRect(0, 0, true));
    }//GEN-LAST:event_btnPrimeiroTecnicoActionPerformed

    private void btnAnteriorTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorTecnicoActionPerformed
        // TODO add your handling code here:
        int linha = tblTecnico.getSelectedRow();
        if ((linha - 1) >= 0) {
            linha--;
        }
        tblTecnico.setRowSelectionInterval(linha, linha);
        tblTecnico.scrollRectToVisible(tblTecnico.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnAnteriorTecnicoActionPerformed

    private void btnProximoTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoTecnicoActionPerformed
        // TODO add your handling code here:
        int linha = tblTecnico.getSelectedRow();
        if ((linha + 1) <= tblTecnico.getRowCount() - 1) {
            linha++;
        }
        tblTecnico.setRowSelectionInterval(linha, linha);
        tblTecnico.scrollRectToVisible(tblTecnico.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnProximoTecnicoActionPerformed

    private void btnUltimoTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoTecnicoActionPerformed
        // TODO add your handling code here:
        int linha = tblTecnico.getSelectedRow();
        if ((linha + 1) <= tblTecnico.getRowCount() - 1) {
            linha++;
        }
        tblTecnico.setRowSelectionInterval(linha, linha);
        tblTecnico.scrollRectToVisible(tblTecnico.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnUltimoTecnicoActionPerformed

    private void txtRuaTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaTecnicoActionPerformed

    private void txtCidadeTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeTecnicoActionPerformed

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
            java.util.logging.Logger.getLogger(FormTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormTecnico dialog = new FormTecnico(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel abaDados;
    private javax.swing.JPanel abaListagem;
    private javax.swing.JTabbedPane abas;
    private javax.swing.JButton btnAnteriorTecnico;
    private javax.swing.JButton btnCancelarTecnico;
    private javax.swing.JButton btnEditarTecnico;
    private javax.swing.JButton btnExcluirTecnico;
    private javax.swing.JButton btnFecharTecnico;
    private javax.swing.JButton btnNovoTecnico;
    private javax.swing.JButton btnPrimeiroTecnico;
    private javax.swing.JButton btnProximoTecnico;
    private javax.swing.JButton btnSalvarTecnico;
    private javax.swing.JButton btnUltimoTecnico;
    private javax.swing.JComboBox<String> cbxEspecialidadeTecnico;
    private javax.swing.JComboBox<String> cbxUfTecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private java.util.List<Tecnico> listTecnico;
    private javax.swing.JPanel painelAcoes;
    private javax.swing.JScrollPane painelListagem;
    private javax.swing.JPanel painelNavegacaoTecnico;
    private javax.swing.JTable tblTecnico;
    private javax.swing.JTextField txtBairroTecnico;
    private javax.swing.JTextField txtCarteiraTecnico;
    private javax.swing.JTextField txtCasaTecnico;
    private javax.swing.JTextField txtCidadeTecnico;
    private javax.swing.JTextField txtCodigoTecnico;
    private javax.swing.JTextField txtCpfTecnico;
    private javax.swing.JTextField txtEmailTecnico;
    private javax.swing.JTextField txtNomeTecnico;
    private javax.swing.JTextField txtRgTecnico;
    private javax.swing.JTextField txtRuaTecnico;
    private javax.swing.JTextField txtSalarioTecnico;
    private javax.swing.JTextField txtTelefoneTecnico;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
