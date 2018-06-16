package form;

import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Cliente;

public class FormCliente extends javax.swing.JFrame {
    
    public static Cliente cliente;
    public static int seletor = 0;

    public static Cliente getCliente() {
        return cliente;
    }

    public static void setCliente(Cliente cliente) {
        FormCliente.cliente = cliente;
    }  
    
    public FormCliente() {
        cliente = null;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEstadoCivil = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpDadosPessoais = new javax.swing.JPanel();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        ftfTelefone = new javax.swing.JFormattedTextField();
        lbDataNescimento = new javax.swing.JLabel();
        ftfDataNascimento = new javax.swing.JFormattedTextField();
        cbSexo = new javax.swing.JComboBox<>();
        lbSexo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbSolteiro = new javax.swing.JRadioButton();
        rbCasado = new javax.swing.JRadioButton();
        rbDivorciado = new javax.swing.JRadioButton();
        rbUniaoEstavel = new javax.swing.JRadioButton();
        rbViuvo = new javax.swing.JRadioButton();
        jpEnderecoCompleto = new javax.swing.JPanel();
        lbCEP = new javax.swing.JLabel();
        ftfCEP = new javax.swing.JFormattedTextField();
        lbCidade = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        lbComplemento = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        lbNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        lbRua = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        lbCPF = new javax.swing.JLabel();
        tfCPF = new javax.swing.JFormattedTextField();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jTabbedPane1.setBackground(new java.awt.Color(250, 250, 250));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jpDadosPessoais.setBackground(new java.awt.Color(250, 250, 250));
        jpDadosPessoais.setName("jpDadosPessoais"); // NOI18N

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEmail.setText("Email:");
        lbEmail.setName("lbEmail"); // NOI18N

        tfEmail.setName("tfEmail"); // NOI18N

        lbTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTelefone.setText("Telefone:");
        lbTelefone.setName("lbTelefone"); // NOI18N

        try {
            ftfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfTelefone.setName("ftfTelefone"); // NOI18N

        lbDataNescimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDataNescimento.setText("Data de Nascimento:");
        lbDataNescimento.setName("lbDataNescimento"); // NOI18N

        try {
            ftfDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfDataNascimento.setName("ftfDataNascimento"); // NOI18N
        ftfDataNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ftfDataNascimentoKeyReleased(evt);
            }
        });

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        cbSexo.setName("cbSexo"); // NOI18N

        lbSexo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbSexo.setText("Sexo:");
        lbSexo.setName("lbSexo"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Estado Civil:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        rbSolteiro.setBackground(new java.awt.Color(250, 250, 250));
        bgEstadoCivil.add(rbSolteiro);
        rbSolteiro.setSelected(true);
        rbSolteiro.setText("Solteiro");
        rbSolteiro.setName("rbSolteiro"); // NOI18N

        rbCasado.setBackground(new java.awt.Color(250, 250, 250));
        bgEstadoCivil.add(rbCasado);
        rbCasado.setText("Casado");
        rbCasado.setName("rbCasado"); // NOI18N

        rbDivorciado.setBackground(new java.awt.Color(250, 250, 250));
        bgEstadoCivil.add(rbDivorciado);
        rbDivorciado.setText("Divorciado");
        rbDivorciado.setName("rbDivorciado"); // NOI18N

        rbUniaoEstavel.setBackground(new java.awt.Color(250, 250, 250));
        bgEstadoCivil.add(rbUniaoEstavel);
        rbUniaoEstavel.setText("União Estável");
        rbUniaoEstavel.setName("rbUniaoEstavel"); // NOI18N

        rbViuvo.setBackground(new java.awt.Color(250, 250, 250));
        bgEstadoCivil.add(rbViuvo);
        rbViuvo.setText("Viúvo");
        rbViuvo.setName("rbViuvo"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbSolteiro)
                .addGap(18, 18, 18)
                .addComponent(rbCasado)
                .addGap(18, 18, 18)
                .addComponent(rbDivorciado)
                .addGap(18, 18, 18)
                .addComponent(rbUniaoEstavel)
                .addGap(18, 18, 18)
                .addComponent(rbViuvo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSolteiro)
                    .addComponent(rbCasado)
                    .addComponent(rbDivorciado)
                    .addComponent(rbUniaoEstavel)
                    .addComponent(rbViuvo))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpDadosPessoaisLayout = new javax.swing.GroupLayout(jpDadosPessoais);
        jpDadosPessoais.setLayout(jpDadosPessoaisLayout);
        jpDadosPessoaisLayout.setHorizontalGroup(
            jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEmail)
                            .addComponent(lbTelefone)
                            .addComponent(ftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSexo)
                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDataNescimento)
                            .addComponent(ftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jpDadosPessoaisLayout.setVerticalGroup(
            jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(lbDataNescimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(lbEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jpDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(lbTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(lbSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados Pessoais", jpDadosPessoais);

        jpEnderecoCompleto.setBackground(new java.awt.Color(250, 250, 250));
        jpEnderecoCompleto.setName("jpEnderecoCompleto"); // NOI18N

        lbCEP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCEP.setText("CEP:");
        lbCEP.setName("lbCEP"); // NOI18N

        try {
            ftfCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCEP.setName("ftfCEP"); // NOI18N

        lbCidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCidade.setText("Cidade:");
        lbCidade.setName("lbCidade"); // NOI18N

        tfCidade.setName("tfCidade"); // NOI18N

        lbEstado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEstado.setText("Estado:");
        lbEstado.setName("lbEstado"); // NOI18N

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbEstado.setName("cbEstado"); // NOI18N

        lbComplemento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbComplemento.setText("Complemento:");
        lbComplemento.setName("lbComplemento"); // NOI18N

        tfComplemento.setName("tfComplemento"); // NOI18N

        lbNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNumero.setText("Número:");
        lbNumero.setName("lbNumero"); // NOI18N

        tfNumero.setText("0");
        tfNumero.setName("tfNumero"); // NOI18N
        tfNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumeroKeyTyped(evt);
            }
        });

        lbBairro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbBairro.setText("Bairro:");
        lbBairro.setName("lbBairro"); // NOI18N

        tfBairro.setName("tfBairro"); // NOI18N

        lbRua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbRua.setText("Endereço:");
        lbRua.setName("lbRua"); // NOI18N

        tfEndereco.setName("tfEndereco"); // NOI18N

        javax.swing.GroupLayout jpEnderecoCompletoLayout = new javax.swing.GroupLayout(jpEnderecoCompleto);
        jpEnderecoCompleto.setLayout(jpEnderecoCompletoLayout);
        jpEnderecoCompletoLayout.setHorizontalGroup(
            jpEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnderecoCompletoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jpEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEnderecoCompletoLayout.createSequentialGroup()
                        .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(ftfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEnderecoCompletoLayout.createSequentialGroup()
                        .addComponent(lbCidade)
                        .addGap(169, 169, 169)
                        .addComponent(lbEstado))
                    .addGroup(jpEnderecoCompletoLayout.createSequentialGroup()
                        .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEnderecoCompletoLayout.createSequentialGroup()
                        .addComponent(lbRua)
                        .addGap(155, 155, 155)
                        .addComponent(lbNumero)
                        .addGap(53, 53, 53)
                        .addComponent(lbComplemento))
                    .addGroup(jpEnderecoCompletoLayout.createSequentialGroup()
                        .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEnderecoCompletoLayout.createSequentialGroup()
                        .addComponent(lbBairro)
                        .addGap(173, 173, 173)
                        .addComponent(lbCEP)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jpEnderecoCompletoLayout.setVerticalGroup(
            jpEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnderecoCompletoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNumero)
                        .addComponent(lbRua))
                    .addComponent(lbComplemento))
                .addGap(12, 12, 12)
                .addGroup(jpEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpEnderecoCompletoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jpEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(jpEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbBairro)
                    .addGroup(jpEnderecoCompletoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbCEP)))
                .addGap(3, 3, 3)
                .addGroup(jpEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpEnderecoCompletoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(ftfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jpEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCidade)
                    .addGroup(jpEnderecoCompletoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbEstado)))
                .addGap(5, 5, 5)
                .addGroup(jpEnderecoCompletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpEnderecoCompletoLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Endereço Completo", jpEnderecoCompleto);

        lbCPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCPF.setText("CPF:");
        lbCPF.setName("lbCPF"); // NOI18N

        try {
            tfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCPF.setName("tfCPF"); // NOI18N

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNome.setText("Nome:");
        lbNome.setName("lbNome"); // NOI18N

        tfNome.setName("tfNome"); // NOI18N
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeKeyTyped(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        btCadastrar.setBackground(new java.awt.Color(250, 250, 250));
        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-add-icon.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setMaximumSize(new java.awt.Dimension(117, 57));
        btCadastrar.setName(""); // NOI18N
        btCadastrar.setPreferredSize(new java.awt.Dimension(117, 57));
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btAtualizar.setBackground(new java.awt.Color(250, 250, 250));
        btAtualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-settings-icon.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setEnabled(false);
        btAtualizar.setName(""); // NOI18N
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(250, 250, 250));
        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh-icon.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setMaximumSize(new java.awt.Dimension(125, 57));
        btLimpar.setName(""); // NOI18N
        btLimpar.setPreferredSize(new java.awt.Dimension(125, 57));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setBackground(new java.awt.Color(250, 250, 250));
        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Apps-Dialog-Close-icon.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setMaximumSize(new java.awt.Dimension(117, 57));
        btSair.setName(""); // NOI18N
        btSair.setPreferredSize(new java.awt.Dimension(117, 57));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCPF)
                            .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCPF)
                    .addComponent(lbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(626, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyTyped
        String caracteres = "0987654321";
        if(caracteres.contains(evt.getKeyChar() + "")){
            evt.consume();
        }
    }//GEN-LAST:event_tfNomeKeyTyped

    private void tfNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroKeyTyped
        String caracteres = "0987654321";
        if(!caracteres.contains(evt.getKeyChar() + "")){
            evt.consume();
        }
    }//GEN-LAST:event_tfNumeroKeyTyped

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cliente = new Cliente();
        
        receberDadosCliente(cliente);
        validarData(cliente);
        
        String data = ftfDataNascimento.getText().replace("/", "");
        if(!validarCPF(tfCPF.getText().replace(".", "").replace("-", ""))){
            tfCPF.setValue("");
            JOptionPane.showMessageDialog(null, "CPF Inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
        }else{
            Cliente clienteBuscar = FormPrincipal.bdCliente.buscaCliente(tfCPF.getText());
            if(clienteBuscar != null){
                JOptionPane.showMessageDialog(null, "Já existe este CPF cadastrado!", "Informação de Cliente", JOptionPane.ERROR_MESSAGE);
                tfCPF.setValue("");
                tfCPF.requestFocus();
            }else{
                if(cliente.validaCliente() && validarData(cliente) && validarCPF(tfCPF.getText().replace(".", "").replace("-", ""))){
                    int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar o cliente?", "Atenção", JOptionPane.YES_NO_OPTION);
                    if(opcao == 0){
                        FormPrincipal.bdCliente.adicionaCliente(cliente);
                        JOptionPane.showMessageDialog(null, "Cliente Cadastrado!", "Informação de Cadastro", JOptionPane.INFORMATION_MESSAGE);            
                        btLimparActionPerformed(evt);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Informação de Preenchimento", JOptionPane.WARNING_MESSAGE);
                    btCadastrar.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void receberDadosCliente(Cliente cliente){
        cliente.setCpf(tfCPF.getText());
        cliente.setNome(tfNome.getText());
        cliente.setEmail(tfEmail.getText());        
        cliente.setTelefone(ftfTelefone.getText());
        cliente.setSexo(cbSexo.getSelectedItem().toString());
        radioEstadoCivil(cliente);
        cliente.getEndereco().setCep(ftfCEP.getText());
        cliente.getEndereco().setCidade(tfCidade.getText());
        cliente.getEndereco().setEstado(cbEstado.getSelectedItem().toString());
        cliente.getEndereco().setRua(tfEndereco.getText());
        cliente.getEndereco().setNumero(Integer.parseInt(tfNumero.getText()));
        cliente.getEndereco().setBairro(tfBairro.getText());
        cliente.getEndereco().setComplemento(tfComplemento.getText());
    }

    private boolean validarData(Cliente cliente) {
        String txt = ftfDataNascimento.getText();
        String dataNula = ftfDataNascimento.getText().replace("/", "");
        if (!dataNula.trim().equals("")) {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date data = null;
            try {
                data = df.parse(txt);
                cliente.setDataNascimento(data);
                return true;
            }catch (ParseException ex) {
                Logger.getLogger(FormCliente.class.getName()).log(Level.SEVERE, null, ex);                
            }
        }
        return false;
    }

    private void radioEstadoCivil(Cliente cliente) {
        JRadioButton radio;
        Enumeration jr = bgEstadoCivil.getElements();
        while ( jr.hasMoreElements() )
        {
            radio = (JRadioButton) jr.nextElement();
            if (radio.isSelected())
            {
                cliente.setEstadoCivil(radio.getText());
            }
        }
    }

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfCPF.setValue("");
        tfNome.setText("");
        tfEmail.setText("");
        ftfDataNascimento.setValue("");
        ftfTelefone.setValue("");
        cbSexo.setSelectedIndex(0);
        bgEstadoCivil.clearSelection();
        rbSolteiro.setSelected(true);
        ftfCEP.setValue("");
        tfCidade.setText("");
        cbEstado.setSelectedIndex(0);
        tfEndereco.setText("");
        tfNumero.setText("0");
        tfBairro.setText("");
        tfComplemento.setText("");
        tfCPF.setEnabled(true);
        tfCPF.requestFocus();
        btAtualizar.setEnabled(false);
    }//GEN-LAST:event_btLimparActionPerformed

    private void ftfDataNascimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfDataNascimentoKeyReleased
        if(ftfDataNascimento.getText().trim().length() == 10){
            String txt = ftfDataNascimento.getText();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat form = new SimpleDateFormat("yyyy");
            try {
                format.setLenient(false);
                Date data = format.parse(txt);                
                idadeNaoValida(form, data);               
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Data inválida", "Aviso", JOptionPane.WARNING_MESSAGE);
                ftfDataNascimento.setText("");
            }
        }      
    }//GEN-LAST:event_ftfDataNascimentoKeyReleased

    private void idadeNaoValida(SimpleDateFormat form, Date data) throws HeadlessException, NumberFormatException {
        Calendar hoje = Calendar.getInstance();
        int dataAtual = hoje.get(Calendar.YEAR);
        int dataNasc = Integer.parseInt(form.format(data));
        int diferenca = dataAtual - dataNasc;
        if(diferenca < 18 || diferenca > 100){
            JOptionPane.showMessageDialog(null, "Idade Invalida ou Ainda nao completou 18 anos!!");
            ftfDataNascimento.setText("");
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon("src\\logo\\user-add-icon 16.png").getImage());
        if(seletor == 0){
            btCadastrar.setEnabled(true);
        }else{
            btCadastrar.setEnabled(false);
        }
        if(cliente != null){
            btAtualizar.setEnabled(true);
            btLimpar.setEnabled(false);
            tfCPF.setText(cliente.getCpf());
            tfCPF.setEditable(false);
            tfCPF.setEnabled(false);
            tfNome.setText(cliente.getNome());
            tfEmail.setText(cliente.getEmail());
            
            SimpleDateFormat f = new SimpleDateFormat("ddMMyyyy");
            String data = f.format( cliente.getDataNascimento());
            ftfDataNascimento.setText(data);
            
            ftfTelefone.setText(cliente.getTelefone());
            cbSexo.setSelectedItem(cliente.getSexo());
            
            JRadioButton radio;
            String status = cliente.getEstadoCivil();
            Enumeration jr = bgEstadoCivil.getElements();
            while( jr.hasMoreElements() ){
                radio = (JRadioButton) jr.nextElement();
                if(radio.getText().equals(status))
                    radio.setSelected(true);
            }
            
            tfEndereco.setText(cliente.getEndereco().getRua());
            tfNumero.setText(String.valueOf(cliente.getEndereco().getNumero()));
            tfComplemento.setText(cliente.getEndereco().getComplemento());
            tfBairro.setText(cliente.getEndereco().getBairro());
            ftfCEP.setText(cliente.getEndereco().getCep());
            tfCidade.setText(cliente.getEndereco().getCidade());
            cbEstado.setSelectedItem(cliente.getEndereco().getEstado());
        }else{
            tfCPF.setEditable(true);
            tfCPF.setEnabled(true);
            btAtualizar.setEnabled(false);
            btLimpar.setEnabled(true);            
        }
    }//GEN-LAST:event_formWindowOpened

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        btCadastrar.setEnabled(false);
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja editar os dados?", "Alteração de Cadastro", JOptionPane.YES_NO_OPTION);
        if(opcao == 0){
            receberDadosCliente(cliente);
            validarData(cliente);
            if(cliente.validaCliente() && validarData(cliente)){
                FormPrincipal.bdCliente.atualizarCliente(cliente);
                JOptionPane.showMessageDialog(null, "Cliente Atualizado com Sucesso!", "Atualização de Cliente", JOptionPane.INFORMATION_MESSAGE);
                btSairActionPerformed(evt);
            }else{
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Informação de Preenchimento", JOptionPane.WARNING_MESSAGE);            
            } 
        }             
    }//GEN-LAST:event_btAtualizarActionPerformed

    public static boolean validarCPF(String CPF) {
    if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
        CPF.equals("22222222222") || CPF.equals("33333333333") ||
        CPF.equals("44444444444") || CPF.equals("55555555555") ||
        CPF.equals("66666666666") || CPF.equals("77777777777") ||
        CPF.equals("88888888888") || CPF.equals("99999999999") ||
       (CPF.length() != 11))
       return(false);
    char dig10, dig11;
    int sm, i, r, num, peso;
    try {
      sm = 0;
      peso = 10;
      for (i=0; i<9; i++) {       
        num = (int)(CPF.charAt(i) - 48); 
        sm = sm + (num * peso);
        peso = peso - 1;
      }
      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
         dig10 = '0';
      else dig10 = (char)(r + 48);
      sm = 0;
      peso = 11;
      for(i=0; i<10; i++) {
        num = (int)(CPF.charAt(i) - 48);
        sm = sm + (num * peso);
        peso = peso - 1;
      }
      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
         dig11 = '0';
      else dig11 = (char)(r + 48);
      if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
         return(true);
      else return(false);
    } catch (InputMismatchException erro) {
        return(false);
    }
  }
    
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEstadoCivil;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JFormattedTextField ftfCEP;
    private javax.swing.JFormattedTextField ftfDataNascimento;
    private javax.swing.JFormattedTextField ftfTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpDadosPessoais;
    private javax.swing.JPanel jpEnderecoCompleto;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCEP;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbDataNescimento;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JRadioButton rbCasado;
    private javax.swing.JRadioButton rbDivorciado;
    private javax.swing.JRadioButton rbSolteiro;
    private javax.swing.JRadioButton rbUniaoEstavel;
    private javax.swing.JRadioButton rbViuvo;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JFormattedTextField tfCPF;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    // End of variables declaration//GEN-END:variables
}
