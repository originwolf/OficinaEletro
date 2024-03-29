package Visual;

import Modelo.Cliente;
import Modelo.DAOCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aline
 */
public class FormCliente extends javax.swing.JDialog {

    DAOCliente daoCliente = new DAOCliente();
    
    /**
     * Creates new form FormCliente
     */
    public FormCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        atualizaTabela();
        trataEdicao(false);
    }

    public boolean validaCampos() {
        if (!(txtNomeCliente.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o nome do cliente");
            txtNomeCliente.requestFocus();
            return false;
        }
        if (!(txtTelefoneCliente.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o telefone do cliente");
            txtTelefoneCliente.requestFocus();
            return false;
        }
        return true;
    }
    
    private void trataEdicao(boolean editando) {
        btnCancelarCliente.setEnabled(editando);
        btnSalvarCliente.setEnabled(editando);
        btnEditarCliente.setEnabled(!editando);
        int linha = listClientes.size() - 1;
        if (linha < 0) {
            btnExcluirCliente.setEnabled(false);
            txtCodigoCliente.setText("");
            txtNomeCliente.setText("");
            txtTelefoneCliente.setText("");
            txtCpfCliente.setText("");
            txtEmailCliente.setText("");
            txtRuaCliente.setText("");
            txtBairroCliente.setText("");
            txtCidadeCliente.setText("");
            txtNumeroCasaCliente.setText("");
        } else {
            btnExcluirCliente.setEnabled(!editando);
        }
        btnExcluirCliente.setEnabled(!editando);
        btnNovoCliente.setEnabled(!editando);
        btnFecharCliente.setEnabled(!editando);
        btnPrimeiroCliente.setEnabled(!editando);
        btnProximoCliente.setEnabled(!editando);
        btnAnteriorCliente.setEnabled(!editando);
        btnUltimoCliente.setEnabled(!editando);
        txtNomeCliente.setEnabled(editando);
        txtCpfCliente.setEnabled(editando);
        txtEmailCliente.setEnabled(editando);
        txtRuaCliente.setEnabled(editando);
        txtBairroCliente.setEnabled(editando);
        txtCidadeCliente.setEnabled(editando);
        txtNumeroCasaCliente.setEnabled(editando);
    }
    
    public void atualizaTabela() {
        listClientes.clear();
        listClientes.addAll(daoCliente.getLista());
        int linha = listClientes.size() - 1;
        if (linha >= 0) {
            tblCliente.setRowSelectionInterval(linha, linha);
            tblCliente.scrollRectToVisible(tblCliente.getCellRect(linha, linha, true));
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

        jLabel4 = new javax.swing.JLabel();
        listClientes = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Modelo.Cliente>());
        painelNavegacaoCliente = new javax.swing.JPanel();
        btnPrimeiroCliente = new javax.swing.JButton();
        btnAnteriorCliente = new javax.swing.JButton();
        btnProximoCliente = new javax.swing.JButton();
        btnUltimoCliente = new javax.swing.JButton();
        btnFecharCliente = new javax.swing.JButton();
        abaDadosClientes = new javax.swing.JTabbedPane();
        abaListagemClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        abaDadoClientes = new javax.swing.JPanel();
        painelAcoes = new javax.swing.JPanel();
        btnNovoCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
        btnSalvarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        txtTelefoneCliente = new javax.swing.JTextField();
        txtCpfCliente = new javax.swing.JTextField();
        txtEmailCliente = new javax.swing.JTextField();
        txtRuaCliente = new javax.swing.JTextField();
        txtBairroCliente = new javax.swing.JTextField();
        txtCidadeCliente = new javax.swing.JTextField();
        cbxUf = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtNumeroCasaCliente = new javax.swing.JTextField();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        painelNavegacaoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));
        painelNavegacaoCliente.setLayout(new java.awt.GridLayout(1, 0));

        btnPrimeiroCliente.setText("Primeiro");
        btnPrimeiroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroClienteActionPerformed(evt);
            }
        });
        painelNavegacaoCliente.add(btnPrimeiroCliente);

        btnAnteriorCliente.setText("Anterior");
        btnAnteriorCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorClienteActionPerformed(evt);
            }
        });
        painelNavegacaoCliente.add(btnAnteriorCliente);

        btnProximoCliente.setText("Próximo");
        btnProximoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoClienteActionPerformed(evt);
            }
        });
        painelNavegacaoCliente.add(btnProximoCliente);

        btnUltimoCliente.setText("Último");
        btnUltimoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoClienteActionPerformed(evt);
            }
        });
        painelNavegacaoCliente.add(btnUltimoCliente);

        btnFecharCliente.setText("Fechar");
        btnFecharCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharClienteActionPerformed(evt);
            }
        });
        painelNavegacaoCliente.add(btnFecharCliente);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listClientes, tblCliente);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCliente}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bairroCliente}"));
        columnBinding.setColumnName("Bairro");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cidadeCliente}"));
        columnBinding.setColumnName("Cidade");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpfCliente}"));
        columnBinding.setColumnName("CPF");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${emailCliente}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomeCliente}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroCasaCliente}"));
        columnBinding.setColumnName("Casa");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ruaCliente}"));
        columnBinding.setColumnName("Rua");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefoneCliente}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ufCliente}"));
        columnBinding.setColumnName("Uf");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tblCliente);

        javax.swing.GroupLayout abaListagemClientesLayout = new javax.swing.GroupLayout(abaListagemClientes);
        abaListagemClientes.setLayout(abaListagemClientesLayout);
        abaListagemClientesLayout.setHorizontalGroup(
            abaListagemClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListagemClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                .addContainerGap())
        );
        abaListagemClientesLayout.setVerticalGroup(
            abaListagemClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaListagemClientesLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );

        abaDadosClientes.addTab("Listagem", abaListagemClientes);

        painelAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        painelAcoes.setLayout(new java.awt.GridLayout(1, 0));

        btnNovoCliente.setText("Novo");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });
        painelAcoes.add(btnNovoCliente);

        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });
        painelAcoes.add(btnEditarCliente);

        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });
        painelAcoes.add(btnCancelarCliente);

        btnSalvarCliente.setText("Salvar");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });
        painelAcoes.add(btnSalvarCliente);

        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });
        painelAcoes.add(btnExcluirCliente);

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Telefone:");

        jLabel5.setText("CPF:");

        jLabel6.setText("E-mail:");

        jLabel7.setText("Rua:");

        jLabel8.setText("Bairro:");

        jLabel9.setText("Cidade:");

        jLabel10.setText("Estado:");

        txtCodigoCliente.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idCliente}"), txtCodigoCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoClienteActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nomeCliente}"), txtNomeCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.telefoneCliente}"), txtTelefoneCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtTelefoneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneClienteActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cpfCliente}"), txtCpfCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.emailCliente}"), txtEmailCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtEmailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailClienteActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.ruaCliente}"), txtRuaCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.bairroCliente}"), txtBairroCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtBairroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroClienteActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cidadeCliente}"), txtCidadeCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtCidadeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeClienteActionPerformed(evt);
            }
        });

        cbxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.ufCliente}"), cbxUf, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jLabel11.setText("Número da Casa:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblCliente, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.numeroCasaCliente}"), txtNumeroCasaCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout abaDadoClientesLayout = new javax.swing.GroupLayout(abaDadoClientes);
        abaDadoClientes.setLayout(abaDadoClientesLayout);
        abaDadoClientesLayout.setHorizontalGroup(
            abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaDadoClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, abaDadoClientesLayout.createSequentialGroup()
                        .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(txtCidadeCliente))
                        .addGap(18, 18, 18)
                        .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCpfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(txtNumeroCasaCliente))
                        .addGap(18, 18, 18)
                        .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRuaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(txtEmailCliente))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(abaDadoClientesLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abaDadoClientesLayout.setVerticalGroup(
            abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaDadoClientesLayout.createSequentialGroup()
                .addComponent(painelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txtNumeroCasaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addComponent(txtRuaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(abaDadoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 293, Short.MAX_VALUE))
        );

        abaDadosClientes.addTab("Dados", abaDadoClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelNavegacaoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaDadosClientes))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelNavegacaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abaDadosClientes))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharClienteActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnFecharClienteActionPerformed

    private void txtCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoClienteActionPerformed

    private void txtEmailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailClienteActionPerformed

    private void txtBairroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroClienteActionPerformed

    private void txtTelefoneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneClienteActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        // TODO add your handling code here:
        listClientes.add((Cliente) new Cliente());
        int linha = listClientes.size() -1;
        tblCliente.setRowSelectionInterval(linha, linha);
        txtNomeCliente.requestFocus();
        trataEdicao(true);
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        // TODO add your handling code here:
        if(validaCampos()){
            int linhaSelecionada = tblCliente.getSelectedRow(); 
            Cliente obj = listClientes.get(linhaSelecionada);
            daoCliente.salvar(obj); 
            atualizaTabela();
            trataEdicao(false);
        } 
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        // TODO add your handling code here:
        trataEdicao(true);
        txtNomeCliente.requestFocus();
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        // TODO add your handling code here:
        trataEdicao(false);
        atualizaTabela();
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        // TODO add your handling code here:
        int opcao = JOptionPane.showOptionDialog(null, "Confirma a exclusão?", 
                 "Pergunta",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                 null, new String [] {"Sim","Não"},"Sim");     
         if(opcao==0){    
             int linhaSelecionada = tblCliente.getSelectedRow();         
             Cliente obj = listClientes.get(linhaSelecionada);        
             daoCliente.remover(obj);        
             atualizaTabela();   
             trataEdicao(false);      
         }  
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnPrimeiroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroClienteActionPerformed
        // TODO add your handling code here:
        tblCliente.setRowSelectionInterval(0, 0);
        tblCliente.scrollRectToVisible(tblCliente.getCellRect(0, 0, true));
    }//GEN-LAST:event_btnPrimeiroClienteActionPerformed

    private void btnAnteriorClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorClienteActionPerformed
        // TODO add your handling code here:
        int linha = tblCliente.getSelectedRow();
        if ((linha - 1) >= 0) {
            linha--;
        }
        tblCliente.setRowSelectionInterval(linha, linha);
        tblCliente.scrollRectToVisible(tblCliente.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnAnteriorClienteActionPerformed

    private void btnProximoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoClienteActionPerformed
        // TODO add your handling code here:
        int linha = tblCliente.getSelectedRow();
        if ((linha + 1) <= tblCliente.getRowCount() - 1) {
            linha++;
        }
        tblCliente.setRowSelectionInterval(linha, linha);
        tblCliente.scrollRectToVisible(tblCliente.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnProximoClienteActionPerformed

    private void btnUltimoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoClienteActionPerformed
        // TODO add your handling code here:
        int linha = tblCliente.getSelectedRow();
        if ((linha + 1) <= tblCliente.getRowCount() - 1) {
            linha++;
        }
        tblCliente.setRowSelectionInterval(linha, linha);
        tblCliente.scrollRectToVisible(tblCliente.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnUltimoClienteActionPerformed

    private void txtCidadeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeClienteActionPerformed

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
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormCliente dialog = new FormCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel abaDadoClientes;
    private javax.swing.JTabbedPane abaDadosClientes;
    private javax.swing.JPanel abaListagemClientes;
    private javax.swing.JButton btnAnteriorCliente;
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnFecharCliente;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnPrimeiroCliente;
    private javax.swing.JButton btnProximoCliente;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JButton btnUltimoCliente;
    private javax.swing.JComboBox<String> cbxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private java.util.List<Modelo.Cliente> listClientes;
    private javax.swing.JPanel painelAcoes;
    private javax.swing.JPanel painelNavegacaoCliente;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtBairroCliente;
    private javax.swing.JTextField txtCidadeCliente;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtCpfCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumeroCasaCliente;
    private javax.swing.JTextField txtRuaCliente;
    private javax.swing.JTextField txtTelefoneCliente;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
