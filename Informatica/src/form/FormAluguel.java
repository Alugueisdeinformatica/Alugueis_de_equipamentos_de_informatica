package form;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Aluguel;
import model.Cliente;
import model.Computador;
import model.Equipamento;
import model.Impressora;
import model.Item;
import model.Monitor;
import model.Notebook;
import model.Projetor;
import model.Tablet;

/**
 *
 * @author JohnPeter
 */
public class FormAluguel extends javax.swing.JFrame {
    
    private static Cliente cliente = null;
    private static Aluguel aluguel;
    Equipamento equipamento;
    DefaultTableModel modeloEstoque  = null;
    DefaultTableModel modeloPedido = null;
    double soma = 0;
    int codItem = 0;

    public static Cliente getCliente() {
        return cliente;
    }

    public static void setCliente(Cliente cliente) {
        FormAluguel.cliente = cliente;
    }    
    
    public FormAluguel() {        
        initComponents();
        aluguel = new Aluguel();
        modeloEstoque = (DefaultTableModel) tbInserir.getModel();
        modeloPedido = (DefaultTableModel) tbPedido.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelDadosCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfUf = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        tfCpf = new javax.swing.JTextField();
        PanelEstoque = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInserir = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        btBuscar = new javax.swing.JButton();
        btSelecionar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        PanelCliente = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPedido = new javax.swing.JTable();
        btRemoverItem = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tfDias = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        tfDataDevolucao = new javax.swing.JLabel();
        PanelOpcoes = new javax.swing.JPanel();
        btFecharPedido = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Aluguel");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        PanelDadosCliente.setBackground(new java.awt.Color(250, 250, 250));
        PanelDadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Endereço:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Nº:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Bairro:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Cidade:");

        tfNome.setEditable(false);

        tfEmail.setEditable(false);

        tfEndereco.setEditable(false);

        tfNumero.setEditable(false);

        tfBairro.setEditable(false);

        tfCidade.setEditable(false);

        btInserir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-add-icon.png"))); // NOI18N
        btInserir.setText("Inserir");
        btInserir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btInserir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Telefone:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("UF:");

        tfUf.setEditable(false);

        tfTelefone.setEditable(false);

        tfCpf.setEditable(false);

        javax.swing.GroupLayout PanelDadosClienteLayout = new javax.swing.GroupLayout(PanelDadosCliente);
        PanelDadosCliente.setLayout(PanelDadosClienteLayout);
        PanelDadosClienteLayout.setHorizontalGroup(
            PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDadosClienteLayout.createSequentialGroup()
                        .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDadosClienteLayout.createSequentialGroup()
                                .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))
                    .addGroup(PanelDadosClienteLayout.createSequentialGroup()
                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(tfCidade)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDadosClienteLayout.createSequentialGroup()
                        .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(tfUf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(PanelDadosClienteLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelDadosClienteLayout.setVerticalGroup(
            PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosClienteLayout.createSequentialGroup()
                .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelDadosClienteLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDadosClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addGap(4, 4, 4)
                        .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PanelEstoque.setBackground(new java.awt.Color(250, 250, 250));
        PanelEstoque.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Equipamento em Estoque", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tbInserir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Modelo", "Valor Unitário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbInserir.getTableHeader().setReorderingAllowed(false);
        tbInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbInserirMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbInserir);
        if (tbInserir.getColumnModel().getColumnCount() > 0) {
            tbInserir.getColumnModel().getColumn(0).setResizable(false);
            tbInserir.getColumnModel().getColumn(1).setResizable(false);
            tbInserir.getColumnModel().getColumn(2).setResizable(false);
            tbInserir.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Categoria:");

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desktop", "Impressora", "Monitor", "Notebook", "Projetor", "Tablet" }));
        cbCategoria.setEnabled(false);

        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer-search-icon.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setEnabled(false);
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btSelecionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/symbol-check-icon.png"))); // NOI18N
        btSelecionar.setText("Selecionar");
        btSelecionar.setEnabled(false);
        btSelecionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSelecionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });

        taDescricao.setEditable(false);
        taDescricao.setColumns(20);
        taDescricao.setRows(5);
        jScrollPane3.setViewportView(taDescricao);

        javax.swing.GroupLayout PanelEstoqueLayout = new javax.swing.GroupLayout(PanelEstoque);
        PanelEstoque.setLayout(PanelEstoqueLayout);
        PanelEstoqueLayout.setHorizontalGroup(
            PanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEstoqueLayout.createSequentialGroup()
                .addGroup(PanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEstoqueLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btSelecionar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PanelEstoqueLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btBuscar)))
                .addContainerGap())
        );
        PanelEstoqueLayout.setVerticalGroup(
            PanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEstoqueLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEstoqueLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSelecionar))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addContainerGap())
        );

        PanelCliente.setBackground(new java.awt.Color(250, 250, 250));
        PanelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedido do Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tbPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Categoria", "Modelo", "Quantidade", "Sub-Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPedido.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbPedido);
        if (tbPedido.getColumnModel().getColumnCount() > 0) {
            tbPedido.getColumnModel().getColumn(0).setResizable(false);
            tbPedido.getColumnModel().getColumn(1).setResizable(false);
            tbPedido.getColumnModel().getColumn(2).setResizable(false);
            tbPedido.getColumnModel().getColumn(3).setResizable(false);
            tbPedido.getColumnModel().getColumn(4).setResizable(false);
        }

        btRemoverItem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btRemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Shopping-basket-remove-icon.png"))); // NOI18N
        btRemoverItem.setText("Remover Item");
        btRemoverItem.setEnabled(false);
        btRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverItemActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Dias:");

        tfDias.setText("0");
        tfDias.setEnabled(false);
        tfDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDiasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDiasKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Valor Total:");

        tfTotal.setEditable(false);
        tfTotal.setText("0");

        tfDataDevolucao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfDataDevolucao.setName("tfDataDevolucao"); // NOI18N

        javax.swing.GroupLayout PanelClienteLayout = new javax.swing.GroupLayout(PanelCliente);
        PanelCliente.setLayout(PanelClienteLayout);
        PanelClienteLayout.setHorizontalGroup(
            PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClienteLayout.createSequentialGroup()
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelClienteLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(tfDias, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btRemoverItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDataDevolucao))))
                .addContainerGap())
        );
        PanelClienteLayout.setVerticalGroup(
            PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRemoverItem)
                    .addGroup(PanelClienteLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDataDevolucao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelOpcoes.setBackground(new java.awt.Color(250, 250, 250));

        btFecharPedido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btFecharPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/shopping-basket-full-icon.png"))); // NOI18N
        btFecharPedido.setText("Fechar Pedido");
        btFecharPedido.setEnabled(false);
        btFecharPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharPedidoActionPerformed(evt);
            }
        });
        PanelOpcoes.add(btFecharPedido);

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Magic-eraser-tool-icon.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        PanelOpcoes.add(btLimpar);

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Apps-Dialog-Close-icon.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        PanelOpcoes.add(btSair);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PanelEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(PanelDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PanelOpcoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(926, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        //cliente = new Cliente();
        //FormBuscarCliente.setCliente(cliente);
        new FormBuscarCliente().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btInserirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(cliente != null){
            tfNome.setText(cliente.getNome());
            tfCpf.setText(cliente.getCpf());
            tfEmail.setText(cliente.getEmail());
            tfEndereco.setText(cliente.getEndereco().getRua());
            tfBairro.setText(cliente.getEndereco().getBairro());
            tfCidade.setText(cliente.getEndereco().getCidade());
            tfNumero.setText(String.valueOf(cliente.getEndereco().getNumero()));
            tfTelefone.setText(cliente.getTelefone());
            tfUf.setText(cliente.getEndereco().getEstado());
            cbCategoria.setEnabled(true);
            btInserir.setEnabled(false);
            btBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        List<Equipamento> equipamentos = FormPrincipal.bdEquipamento.todosEquipamentos();
        if(equipamentos.size() > 0){
            for (int i = 0; i < equipamentos.size(); i++){
                int escolhe = cbCategoria.getSelectedIndex();
                switch(escolhe){
                    case 0:
                        if(equipamentos.get(i) instanceof Computador){
                            inserirTabelaEstoque(equipamentos, i);
                        };
                        break;
                    case 1:
                        if(equipamentos.get(i) instanceof Impressora){
                            inserirTabelaEstoque(equipamentos, i);
                        };
                        break;
                    case 2:
                        if(equipamentos.get(i) instanceof Monitor){
                            inserirTabelaEstoque(equipamentos, i);
                        };
                        break;
                    case 3:
                        if(equipamentos.get(i) instanceof Notebook){
                            inserirTabelaEstoque(equipamentos, i);
                        };
                        break;
                    case 4:
                        if(equipamentos.get(i) instanceof Projetor){
                            inserirTabelaEstoque(equipamentos, i);
                        };
                        break;
                    case 5:
                        if(equipamentos.get(i) instanceof Tablet){
                            inserirTabelaEstoque(equipamentos, i);
                        };
                        break;
                }
            }
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
        tfDias.setText("0");
        tfTotal.setText("0");
        Object codigo = modeloEstoque.getValueAt(tbInserir.getSelectedRow(), 0);
                equipamento = FormPrincipal.bdEquipamento.buscaEquipamento((int) codigo);         
                if(equipamento.getQuantEstoque() <= 0){
                    JOptionPane.showMessageDialog(null, "Não existe estoque suficiente!", "Atenção", JOptionPane.ERROR_MESSAGE);
                }else{
                    try{
                        int valor;
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                    "Informe a quantidade que Deseja alugar\nDisponivel: " + equipamento.getQuantEstoque(),
                                    "Informe o Valor",
                                    JOptionPane.INFORMATION_MESSAGE)); 
                        if(valor <= equipamento.getQuantEstoque()){
                            if(valor <= 0){
                                JOptionPane.showMessageDialog(null, "Valor Inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
                            }else{
                                Item item = new Item();
                                item.setEquipamento(equipamento);
                                item.setValorItem(equipamento.getValorDiaria());
                                item.setQuantidade(valor);                                
                                item.setCodItem(++codItem);
                                item.calcularValorItem();
                                soma = soma + item.getValorItem();
                                inserirTabelaPedido(item, equipamento);
                                equipamento.setQuantEstoque(equipamento.getQuantEstoque() - valor);
                                aluguel.adicionaItem(item);
                                tfDias.setEnabled(true);
                                btRemoverItem.setEnabled(true);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Não existe estoque suficiente!", "Atenção", JOptionPane.WARNING_MESSAGE);
                        }                
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Informe um valor!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }                
    }//GEN-LAST:event_btSelecionarActionPerformed

    /*private void adicionaEquipamentoPedido() throws NumberFormatException {
        modeloPedido.addRow(new Object[]{
            codItem,
            equipamento.getCodEquipamento(),
            equipamento.getCategoria(),
            equipamento.getModelo(),
            valor,
            valor * equipamento.getValorDiaria()
        });
        atualizaTotal();
        codItem++;
        int qt = equipamento.getQuantEstoque() - valor;
        equipamento.setQuantEstoque(qt);
        btRemoverItem.setEnabled(true);
        tfDias.setEnabled(true);
    }*/

    private void tbInserirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbInserirMousePressed
        int codigo = (int) (modeloEstoque.getValueAt(tbInserir.getSelectedRow(), 0));
        equipamento = FormPrincipal.bdEquipamento.buscaEquipamento(codigo);        
        taDescricao.setText(equipamento.toString());
        btSelecionar.setEnabled(true);
    }//GEN-LAST:event_tbInserirMousePressed

    private void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverItemActionPerformed
        try{
            int linha = tbPedido.getSelectedRow();
            int codigo = (Integer) tbPedido.getModel().getValueAt(linha, 0);
            int quantidade = (Integer) tbPedido.getModel().getValueAt(linha, 3);
            double subTotal = (Double) tbPedido.getModel().getValueAt(linha, 4);            
            soma = soma - subTotal;
            equipamento.setQuantEstoque(equipamento.getQuantEstoque() + quantidade);
            tfTotal.setText(Double.toString(soma));
            aluguel.removerItem(codigo);
            modeloPedido.removeRow(linha);
            if(tbPedido.getRowCount() < 1){
                tfDias.setEnabled(false);
                tfDias.setText("0");
                tfDataDevolucao.setText("");
                btRemoverItem.setEnabled(false);
                btFecharPedido.setEnabled(false);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Selecione um equipamento para remover!", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverItemActionPerformed

    /*private void novoAluguel(ActionEvent evt) throws HeadlessException {
        int novoAluguel = JOptionPane.showConfirmDialog(null, "Deseja Fazer um Novo Aluguel?", "Novo Aluguel", JOptionPane.YES_NO_OPTION);
        if(novoAluguel == 0){
            btLimparActionPerformed(evt);
        }else{
            btSairActionPerformed(evt);
        }
    }*/

    /*private void cadastrarItemdoAluguel() {
        int itemCod;
        int quant;
        Item item;
        for(int i = tbPedido.getRowCount()-1; i >= 0; i--){
            itemCod = (int) modeloPedido.getValueAt(i, 1);
            quant = (int) modeloPedido.getValueAt(i, 4);
            equipamento = FormPrincipal.bdEquipamento.buscaEquipamento(itemCod);
            item = new Item();
            item.setCodItem((int) modeloPedido.getValueAt(i, 0));
            item.setEquipamento(equipamento);
            item.setQuantidade(quant);
            aluguel.adicionaItem(item);
        }
    }*/

    private void btFecharPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharPedidoActionPerformed
        if(aluguel.todosItens().size() > 0){
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja fechar o pedido?", "Fechamento de pedido", JOptionPane.YES_NO_OPTION);
            if(opcao == 0){
                FormPrincipal.bdAluguel.adicionaAluguel(aluguel);
                JOptionPane.showMessageDialog(null, "Pedido fechado com sucesso!", "Informaçao de Pedido", JOptionPane.INFORMATION_MESSAGE);
                limparFormulario();
            }      
        }else{
            JOptionPane.showMessageDialog(null, "Adicione pelo menos um item!", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }             
    }//GEN-LAST:event_btFecharPedidoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        cliente = null;
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void tfDiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDiasKeyTyped
        String caracteres= "0987654321";
        if(!caracteres.contains(evt.getKeyChar() + "")){
            evt.consume();
        }
    }//GEN-LAST:event_tfDiasKeyTyped

    private void tfDiasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDiasKeyReleased
        try{
            aluguel.setDias(Integer.parseInt(tfDias.getText()));
            tfTotal.setText(Float.toString(aluguel.calcularValorTotal()));
            if(Integer.parseInt(tfDias.getText()) > 0){
                btFecharPedido.setEnabled(true);
                tfDataDevolucao.setText("Data de Devolução: " + formataData(aluguel.dataDevolucao()));
            }else{
                btFecharPedido.setEnabled(false);
                tfDataDevolucao.setText("");
            }
        }catch(NumberFormatException e){
            tfDias.setText("0");
            btFecharPedido.setEnabled(false);
        }
    }//GEN-LAST:event_tfDiasKeyReleased

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparFormulario();
    }//GEN-LAST:event_btLimparActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja finalizar a aplicação?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(opcao == 0){
            cliente = null;
            this.dispose();        
        }else
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    /*private void atualizaTotal() throws NumberFormatException {
        double valorTotal = 0;
        if(tbPedido.getRowCount() > 0){
            for(int i = tbPedido.getRowCount()-1; i >= 0; i--){
                valorTotal +=   (double)  modeloPedido.getValueAt(i, 5);
            }
            valorTotal *= Integer.parseInt(tfDias.getText());
        }
        aluguel.setValorTotal(valorTotal);
        tfTotal.setText(String.valueOf(valorTotal));
    }*/
    
    private void inserirTabelaEstoque(List<Equipamento> equipamentos, int i){
        modeloEstoque.addRow(new Object[]{
            equipamentos.get(i).getCodEquipamento(), 
            equipamentos.get(i).getMarca(), 
            equipamentos.get(i).getModelo(), 
            equipamentos.get(i).getValorDiaria()
        });
    }
    
    private void inserirTabelaPedido(Item item, Equipamento equipamento){
        modeloPedido.addRow(new Object[]{
            item.getCodItem(),
            equipamento.getCategoria(),
            equipamento.getModelo(),
            item.getQuantidade(),
            item.getValorItem()
        });
    }
    
    private void limparTabelaInserir(){
        for(int i = tbInserir.getRowCount()-1; i >= 0; i--){
            modeloEstoque.removeRow(i);
        }
    }
    
    private void limparTabelaPedido(){
        for(int i = tbPedido.getRowCount()-1; i >= 0; i--){
            modeloPedido.removeRow(i);
        }
    }
    
    private void limparFormulario(){
        tfNome.setText("");
        tfCpf.setText("");
        tfEmail.setText("");
        tfTelefone.setText("");
        tfEndereco.setText("");
        tfNumero.setText("");
        tfBairro.setText("");
        tfCidade.setText("");
        tfUf.setText("");
        btInserir.setEnabled(true);
        cbCategoria.setSelectedIndex(0);
        limparTabelaInserir();
        limparTabelaPedido();
        taDescricao.setText("");
        tfDias.setText("0");
        tfDias.setEnabled(false);
        tfDataDevolucao.setText("");
        tfTotal.setText("0");
        cbCategoria.setEnabled(false);
        btBuscar.setEnabled(false);
        btSelecionar.setEnabled(false);
        btRemoverItem.setEnabled(false);
        btFecharPedido.setEnabled(false);
        aluguel = new Aluguel();
    }
    
    private String formataData(Date data){
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        String str = fm.format(data);
        return str;
    }
    
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
            java.util.logging.Logger.getLogger(FormAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCliente;
    private javax.swing.JPanel PanelDadosCliente;
    private javax.swing.JPanel PanelEstoque;
    private javax.swing.JPanel PanelOpcoes;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btFecharPedido;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRemoverItem;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTable tbInserir;
    private javax.swing.JTable tbPedido;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JLabel tfDataDevolucao;
    private javax.swing.JTextField tfDias;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfTotal;
    private javax.swing.JTextField tfUf;
    // End of variables declaration//GEN-END:variables
}
