package form;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
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

public class FormDevolucao extends javax.swing.JFrame {
    
    private static Cliente cliente = null;
    private static Aluguel aluguel;
    List<Aluguel> al = null;
    DefaultTableModel modeloAluguel = null;
    DefaultTableModel modeloEquipamentos = null;

    public static Cliente getCliente() {
        return cliente;
    }

    public static void setCliente(Cliente cliente) {
        FormDevolucao.cliente = cliente;
    }  
    
    public FormDevolucao() {        
        initComponents();
        modeloAluguel = (DefaultTableModel) tbAluguel.getModel();
        modeloEquipamentos = (DefaultTableModel) tbEquipamentos.getModel();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btInserir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbUF = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        PanelCliente = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAluguel = new javax.swing.JTable();
        btEfetuarDevolucao = new javax.swing.JButton();
        PanelOpcoes = new javax.swing.JPanel();
        PanelCliente1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbEquipamentos = new javax.swing.JTable();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Devolução de Equipamentos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        PanelDadosCliente.setBackground(new java.awt.Color(250, 250, 250));
        PanelDadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Endereço:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Bairro:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Cidade:");

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

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNome.setForeground(new java.awt.Color(51, 51, 255));
        lbNome.setText("  ");

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(51, 51, 255));
        lbEmail.setText("  ");

        lbCpf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCpf.setForeground(new java.awt.Color(51, 51, 255));
        lbCpf.setText("  ");

        lbBairro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbBairro.setForeground(new java.awt.Color(51, 51, 255));
        lbBairro.setText("  ");

        lbCidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCidade.setForeground(new java.awt.Color(51, 51, 255));
        lbCidade.setText("  ");

        lbTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTelefone.setForeground(new java.awt.Color(51, 51, 255));
        lbTelefone.setText("  ");

        lbUF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbUF.setForeground(new java.awt.Color(51, 51, 255));
        lbUF.setText("  ");

        lbEndereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEndereco.setForeground(new java.awt.Color(51, 51, 255));
        lbEndereco.setText("  ");

        javax.swing.GroupLayout PanelDadosClienteLayout = new javax.swing.GroupLayout(PanelDadosCliente);
        PanelDadosCliente.setLayout(PanelDadosClienteLayout);
        PanelDadosClienteLayout.setHorizontalGroup(
            PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDadosClienteLayout.createSequentialGroup()
                        .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(PanelDadosClienteLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelDadosClienteLayout.setVerticalGroup(
            PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDadosClienteLayout.createSequentialGroup()
                        .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbNome)
                                .addComponent(jLabel3)
                                .addComponent(lbEmail)
                                .addComponent(jLabel9)
                                .addComponent(lbTelefone))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbCpf))
                        .addGap(10, 10, 10)
                        .addGroup(PanelDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(lbBairro)
                            .addComponent(lbCidade)
                            .addComponent(lbUF)
                            .addComponent(lbEndereco))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelCliente.setBackground(new java.awt.Color(250, 250, 250));
        PanelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aluguéis do Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tbAluguel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Valor Total", "Data do Aluguel", "Data da Devolução"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        tbAluguel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbAluguel.setName("tbAluguel"); // NOI18N
        tbAluguel.getTableHeader().setReorderingAllowed(false);
        tbAluguel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbAluguelMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbAluguel);
        if (tbAluguel.getColumnModel().getColumnCount() > 0) {
            tbAluguel.getColumnModel().getColumn(0).setResizable(false);
            tbAluguel.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbAluguel.getColumnModel().getColumn(1).setResizable(false);
            tbAluguel.getColumnModel().getColumn(1).setPreferredWidth(88);
            tbAluguel.getColumnModel().getColumn(2).setResizable(false);
            tbAluguel.getColumnModel().getColumn(2).setPreferredWidth(120);
            tbAluguel.getColumnModel().getColumn(3).setResizable(false);
            tbAluguel.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        btEfetuarDevolucao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEfetuarDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Shopping-basket-remove-icon.png"))); // NOI18N
        btEfetuarDevolucao.setText("Efetuar Devolução");
        btEfetuarDevolucao.setEnabled(false);
        btEfetuarDevolucao.setName("btEfetuarDevolucao"); // NOI18N
        btEfetuarDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEfetuarDevolucaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelClienteLayout = new javax.swing.GroupLayout(PanelCliente);
        PanelCliente.setLayout(PanelClienteLayout);
        PanelClienteLayout.setHorizontalGroup(
            PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClienteLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelClienteLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(btEfetuarDevolucao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelClienteLayout.setVerticalGroup(
            PanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEfetuarDevolucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelOpcoes.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout PanelOpcoesLayout = new javax.swing.GroupLayout(PanelOpcoes);
        PanelOpcoes.setLayout(PanelOpcoesLayout);
        PanelOpcoesLayout.setHorizontalGroup(
            PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelOpcoesLayout.setVerticalGroup(
            PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        PanelCliente1.setBackground(new java.awt.Color(250, 250, 250));
        PanelCliente1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Equipamentos Alugados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tbEquipamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Modelo", "Marca", "Categoria", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        tbEquipamentos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbEquipamentos.setName("tbEquipamentos"); // NOI18N
        tbEquipamentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbEquipamentos);
        if (tbEquipamentos.getColumnModel().getColumnCount() > 0) {
            tbEquipamentos.getColumnModel().getColumn(0).setResizable(false);
            tbEquipamentos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbEquipamentos.getColumnModel().getColumn(1).setResizable(false);
            tbEquipamentos.getColumnModel().getColumn(1).setPreferredWidth(60);
            tbEquipamentos.getColumnModel().getColumn(2).setResizable(false);
            tbEquipamentos.getColumnModel().getColumn(2).setPreferredWidth(63);
            tbEquipamentos.getColumnModel().getColumn(3).setResizable(false);
            tbEquipamentos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbEquipamentos.getColumnModel().getColumn(4).setResizable(false);
            tbEquipamentos.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        javax.swing.GroupLayout PanelCliente1Layout = new javax.swing.GroupLayout(PanelCliente1);
        PanelCliente1.setLayout(PanelCliente1Layout);
        PanelCliente1Layout.setHorizontalGroup(
            PanelCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        PanelCliente1Layout.setVerticalGroup(
            PanelCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh-icon.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Apps-Dialog-Close-icon.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setMaximumSize(new java.awt.Dimension(123, 57));
        btSair.setPreferredSize(new java.awt.Dimension(123, 57));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(PanelCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLimpar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(PanelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
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

        setSize(new java.awt.Dimension(831, 531));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        FormBuscarCliente.seletor = 1;
        FormBuscarCliente.janela = true;
        new FormBuscarCliente().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btInserirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon("src\\logo\\Shopping-basket-remove-icon 16.png").getImage());
        if(cliente != null){
            btInserir.setEnabled(false);
            String end = cliente.getEndereco().getRua() + ", " + String.valueOf(cliente.getEndereco().getNumero()) + ", " +
                    cliente.getEndereco().getComplemento();
            lbNome.setText(cliente.getNome());            
            lbCpf.setText(cliente.getCpf());
            lbEmail.setText(cliente.getEmail());
            lbEndereco.setText(end);
            lbBairro.setText(cliente.getEndereco().getBairro());
            lbCidade.setText(cliente.getEndereco().getCidade());
            lbTelefone.setText(cliente.getTelefone());
            lbUF.setText(cliente.getEndereco().getEstado());
            al = FormPrincipal.bdAluguel.buscaAluguel(cliente.getCpf());
            for(Aluguel a : al){
                inserirTabelaAluguel(a);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btEfetuarDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEfetuarDevolucaoActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja efetuar a devolução?", "Confirmação!", JOptionPane.YES_NO_OPTION);
        if(opcao == 0){
            btEfetuarDevolucao.setEnabled(false);
            aluguel = FormPrincipal.bdAluguel.buscaAluguel(getId());
            FormPrincipal.bdDevolucao.adicionaAluguel(aluguel);
            devolveEstoque(aluguel);
            FormPrincipal.bdAluguel.removerAluguel(getId());
            int linha = tbAluguel.getSelectedRow(); 
            modeloAluguel.removeRow(linha);
            limparTabelaEquipamentos();
            JOptionPane.showMessageDialog(null, "Devolução efetuada com sucesso!", "Devolução de Equipamentos", JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_btEfetuarDevolucaoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        cliente = null;
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        lbNome.setText("");            
        lbCpf.setText("");
        lbEmail.setText("");
        lbEndereco.setText("");
        lbBairro.setText("");
        lbCidade.setText("");
        lbTelefone.setText("");
        lbUF.setText("");
        btInserir.setEnabled(true);
        limparTabelaAluguel();
        limparTabelaEquipamentos();
        btEfetuarDevolucao.setEnabled(false);
    }//GEN-LAST:event_btLimparActionPerformed

    private void tbAluguelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAluguelMousePressed
        if(cliente != null){
            for(int i = 0; i < al.size(); i++){
                if(getId() == al.get(i).getNumero()){
                    limparTabelaEquipamentos();
                    inserirTabelaEquipamentos(al.get(i).todosItens());
                }
            }
            btEfetuarDevolucao.setEnabled(true);
        }
    }//GEN-LAST:event_tbAluguelMousePressed

    private void inserirTabelaAluguel(Aluguel al){
        DecimalFormat df = new DecimalFormat("0.00");
        String v = df.format(al.getValorTotal());
        modeloAluguel.addRow(new Object[]{al.getNumero(), ("R$ " + v), 
        formataData(al.getDataAluguel()), formataData(al.dataDevolucao())});
    }
    
    private void inserirTabelaEquipamentos(List<Item> it){
        for(Item i : it){
            modeloEquipamentos.addRow(new Object[]{i.getEquipamento().getCodEquipamento(),
            i.getEquipamento().getModelo(), i.getEquipamento().getMarca(),
            i.getEquipamento().getCategoria(), i.getQuantidade()});
        }        
    }
    
    private int getId(){
        int linha = tbAluguel.getSelectedRow();
        int id;        
        id = ((Integer) tbAluguel.getModel().getValueAt(linha, 0));        
        return id;
    }
    
    private void limparTabelaAluguel(){
        for(int i = tbAluguel.getRowCount()-1; i >= 0; i--){
            modeloAluguel.removeRow(i);
        }
    }
    
     private void limparTabelaEquipamentos(){
        for(int i = tbEquipamentos.getRowCount()-1; i >= 0; i--){
            modeloEquipamentos.removeRow(i);
        }
    }
     
     private void devolveEstoque(Aluguel aluguel){
         List<Equipamento> eq = new ArrayList<Equipamento>();
         for(Item i : aluguel.todosItens()){
             int qt = i.getQuantidade();
             if(i.getEquipamento() instanceof Computador){
                 Computador computador = (Computador) i.getEquipamento();
                 computador.setQuantEstoque(computador.getQuantEstoque() + qt);
                 eq.add(computador);
             }
             if(i.getEquipamento() instanceof Impressora){
                 Impressora impressora = (Impressora) i.getEquipamento();
                 impressora.setQuantEstoque(impressora.getQuantEstoque() + qt);
                 eq.add(impressora);
             }
             if(i.getEquipamento() instanceof Monitor){
                 Monitor monitor = (Monitor) i.getEquipamento();
                 monitor.setQuantEstoque(monitor.getQuantEstoque() + qt);
                 eq.add(monitor);
             }
             if(i.getEquipamento() instanceof Notebook){
                 Notebook notebook = (Notebook) i.getEquipamento();
                 notebook.setQuantEstoque(notebook.getQuantEstoque() + qt);
                 eq.add(notebook);
             }
             if(i.getEquipamento() instanceof Projetor){
                 Projetor projetor =(Projetor) i.getEquipamento();
                 projetor.setQuantEstoque(projetor.getQuantEstoque() + qt);
                 eq.add(projetor);
             }
             if(i.getEquipamento() instanceof Tablet){
                 Tablet tablet =(Tablet) i.getEquipamento();
                 tablet.setQuantEstoque(tablet.getQuantEstoque() + qt);
                 eq.add(tablet);
             }
         }
         FormPrincipal.bdEquipamento.setLista(eq);
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
            java.util.logging.Logger.getLogger(FormDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDevolucao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCliente;
    private javax.swing.JPanel PanelCliente1;
    private javax.swing.JPanel PanelDadosCliente;
    private javax.swing.JPanel PanelOpcoes;
    private javax.swing.JButton btEfetuarDevolucao;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbUF;
    private javax.swing.JTable tbAluguel;
    private javax.swing.JTable tbEquipamentos;
    // End of variables declaration//GEN-END:variables
}
