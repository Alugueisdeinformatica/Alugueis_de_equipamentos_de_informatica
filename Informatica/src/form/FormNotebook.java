package form;

import static form.FormEquipamento.equipamento;
import java.util.Enumeration;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Equipamento;
import model.Notebook;

public class FormNotebook extends javax.swing.JFrame {

    public static Notebook not = null;
    
    public FormNotebook() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgProcessador = new javax.swing.ButtonGroup();
        bgMemoria = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btLimpar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btAtualizar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btSair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        rbDDR34g = new javax.swing.JRadioButton();
        rbDDR48g = new javax.swing.JRadioButton();
        rbDDR22g = new javax.swing.JRadioButton();
        rbDDR32g = new javax.swing.JRadioButton();
        rbDDR38g = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        rbAmdAthlon = new javax.swing.JRadioButton();
        rbAmdRyzen = new javax.swing.JRadioButton();
        rbInteli3 = new javax.swing.JRadioButton();
        rbInteli5 = new javax.swing.JRadioButton();
        rbInteli7 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDiferenciais = new javax.swing.JTextArea();
        cbPlacaVideo = new javax.swing.JComboBox<>();
        cbSistemaOp = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbDiferenciais = new javax.swing.JLabel();
        lbArmazenamento = new javax.swing.JLabel();
        lbPlacaVideo = new javax.swing.JLabel();
        lbSistemaOp = new javax.swing.JLabel();
        cbArmazenamento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Notebook");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        jToolBar1.setBackground(new java.awt.Color(250, 250, 250));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btCadastrar.setBackground(new java.awt.Color(250, 250, 250));
        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Accept-icon.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setEnabled(false);
        btCadastrar.setFocusable(false);
        btCadastrar.setMaximumSize(new java.awt.Dimension(120, 55));
        btCadastrar.setName("btCadastrar"); // NOI18N
        btCadastrar.setPreferredSize(new java.awt.Dimension(120, 55));
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btCadastrar);
        jToolBar1.add(jSeparator1);

        btLimpar.setBackground(new java.awt.Color(250, 250, 250));
        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh-icon.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setEnabled(false);
        btLimpar.setFocusable(false);
        btLimpar.setMaximumSize(new java.awt.Dimension(115, 55));
        btLimpar.setName("btLimpar"); // NOI18N
        btLimpar.setPreferredSize(new java.awt.Dimension(115, 55));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jToolBar1.add(btLimpar);
        jToolBar1.add(jSeparator2);

        btAtualizar.setBackground(new java.awt.Color(250, 250, 250));
        btAtualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh_arrow_1546.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setEnabled(false);
        btAtualizar.setMaximumSize(new java.awt.Dimension(115, 55));
        btAtualizar.setName("btAtualizar"); // NOI18N
        btAtualizar.setPreferredSize(new java.awt.Dimension(115, 55));
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btAtualizar);
        jToolBar1.add(jSeparator3);

        btSair.setBackground(new java.awt.Color(250, 250, 250));
        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Apps-Dialog-Close-icon.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setFocusable(false);
        btSair.setMaximumSize(new java.awt.Dimension(115, 55));
        btSair.setName("btSair"); // NOI18N
        btSair.setPreferredSize(new java.awt.Dimension(115, 55));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jToolBar1.add(btSair);

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Memória", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        rbDDR34g.setBackground(new java.awt.Color(250, 250, 250));
        bgMemoria.add(rbDDR34g);
        rbDDR34g.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbDDR34g.setSelected(true);
        rbDDR34g.setText("8GB");
        rbDDR34g.setName("rbDDR34g"); // NOI18N

        rbDDR48g.setBackground(new java.awt.Color(250, 250, 250));
        bgMemoria.add(rbDDR48g);
        rbDDR48g.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbDDR48g.setText("6GB");
        rbDDR48g.setName("rbDDR48g"); // NOI18N

        rbDDR22g.setBackground(new java.awt.Color(250, 250, 250));
        bgMemoria.add(rbDDR22g);
        rbDDR22g.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbDDR22g.setText("4GB");
        rbDDR22g.setName("rbDDR22g"); // NOI18N

        rbDDR32g.setBackground(new java.awt.Color(250, 250, 250));
        bgMemoria.add(rbDDR32g);
        rbDDR32g.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbDDR32g.setText("2GB");
        rbDDR32g.setName("rbDDR32g"); // NOI18N

        rbDDR38g.setBackground(new java.awt.Color(250, 250, 250));
        bgMemoria.add(rbDDR38g);
        rbDDR38g.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbDDR38g.setText("1GB");
        rbDDR38g.setName("rbDDR38g"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbDDR38g)
                    .addComponent(rbDDR48g)
                    .addComponent(rbDDR34g)
                    .addComponent(rbDDR32g)
                    .addComponent(rbDDR22g))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbDDR34g)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbDDR48g)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbDDR22g)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbDDR32g)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbDDR38g)
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Processador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        rbAmdAthlon.setBackground(new java.awt.Color(250, 250, 250));
        bgProcessador.add(rbAmdAthlon);
        rbAmdAthlon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbAmdAthlon.setText("AMD Athlon™ X4");
        rbAmdAthlon.setName("rbAmdAthlon"); // NOI18N

        rbAmdRyzen.setBackground(new java.awt.Color(250, 250, 250));
        bgProcessador.add(rbAmdRyzen);
        rbAmdRyzen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbAmdRyzen.setText("AMD Ryzen™ 5");
        rbAmdRyzen.setName("rbAmdRyzen"); // NOI18N

        rbInteli3.setBackground(new java.awt.Color(250, 250, 250));
        bgProcessador.add(rbInteli3);
        rbInteli3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbInteli3.setSelected(true);
        rbInteli3.setText("Intel Core™ i3");
        rbInteli3.setName("rbInteli3"); // NOI18N

        rbInteli5.setBackground(new java.awt.Color(250, 250, 250));
        bgProcessador.add(rbInteli5);
        rbInteli5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbInteli5.setText("Intel Core™ i5");
        rbInteli5.setName("rbInteli5"); // NOI18N

        rbInteli7.setBackground(new java.awt.Color(250, 250, 250));
        bgProcessador.add(rbInteli7);
        rbInteli7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbInteli7.setText("Intel Core™ i7");
        rbInteli7.setName("rbInteli7"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAmdRyzen)
                    .addComponent(rbAmdAthlon)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rbInteli5)
                        .addComponent(rbInteli3)
                        .addComponent(rbInteli7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAmdAthlon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAmdRyzen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbInteli3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbInteli5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbInteli7)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        taDiferenciais.setColumns(20);
        taDiferenciais.setRows(5);
        taDiferenciais.setName("taDiferenciais"); // NOI18N
        jScrollPane1.setViewportView(taDiferenciais);

        cbPlacaVideo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "On-Board", "Asus Geforce Gtx", "Nvidia Gt 210", "Radeon R5 230" }));
        cbPlacaVideo.setName("cbPlacaVideo"); // NOI18N

        cbSistemaOp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mc OS", "Windows 10", "Ubuntu" }));
        cbSistemaOp.setName("cbSistemaOp"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/blue-laptop-icon.png"))); // NOI18N
        jLabel7.setText("J&L INFORMÁTICA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        lbDiferenciais.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDiferenciais.setText("Diferenciais:");
        lbDiferenciais.setName("lbDiferenciais"); // NOI18N

        lbArmazenamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbArmazenamento.setText("Armazenamento HD");
        lbArmazenamento.setName("lbArmazenamento"); // NOI18N

        lbPlacaVideo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPlacaVideo.setText("Placa de Vídeo:");
        lbPlacaVideo.setName("lbPlacaVideo"); // NOI18N

        lbSistemaOp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbSistemaOp.setText("Sistema Operacional:");
        lbSistemaOp.setName("lbSistemaOp"); // NOI18N

        cbArmazenamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "320GB", "500GB", "750GB", "1TB", "2TB" }));
        cbArmazenamento.setName("cbArmazenamento"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDiferenciais)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbSistemaOp)
                                .addComponent(cbSistemaOp, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(74, 74, 74)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbPlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(lbPlacaVideo)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbArmazenamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbArmazenamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSistemaOp)
                    .addComponent(lbPlacaVideo)
                    .addComponent(lbArmazenamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSistemaOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbArmazenamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbDiferenciais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(626, 611));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja efetuar o cadastro?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(opcao == 0){
            String sistemaOperacional = cbSistemaOp.getSelectedItem().toString();
            String placaVideo = cbPlacaVideo.getSelectedItem().toString();
            String capacidadeHD = cbArmazenamento.getSelectedItem().toString();
            String diferenciais = taDiferenciais.getText();
            String processador = capturaProcessador();
            String memoria = capturaMemoria();

            Notebook note = new Notebook(sistemaOperacional, placaVideo, capacidadeHD, processador, memoria, diferenciais,
                    equipamento.getCodEquipamento(), equipamento.getModelo(), equipamento.getMarca(),
                    equipamento.getQuantEstoque(), equipamento.getCategoria(), equipamento.getValorDiaria());

            if(note.validaNotebook()){
                FormPrincipal.bdEquipamento.adicionaEquipamento((Equipamento) note); 
                JOptionPane.showMessageDialog(null, "Notebook Cadastrado!", "Informação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
                FormPrincipal.codEquipamento++;
                opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar Novo Equipamento", "Confirmação", JOptionPane.YES_NO_OPTION);
                if(opcao == 0){
                    this.dispose();
                    new FormEquipamento().setVisible(true);
                }else{
                    this.dispose();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
            } 
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        FormEquipamento.eq = null;
        FormEquipamento.equipamento = null;
        not = null;
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        cbSistemaOp.setSelectedIndex(0);
        cbPlacaVideo.setSelectedIndex(0);
        cbArmazenamento.setSelectedItem(3);
        taDiferenciais.setText("");
        bgProcessador.clearSelection();
        rbInteli3.setSelected(true);
        bgMemoria.clearSelection();
        rbDDR34g.setSelected(true);
        cbSistemaOp.requestFocus();
    }//GEN-LAST:event_btLimparActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(not != null){
            btAtualizar.setEnabled(true);
            cbSistemaOp.setSelectedItem(not.getSistemaOperacional());
            cbPlacaVideo.setSelectedItem(not.getPlacaVideo());
            cbArmazenamento.setSelectedItem(not.getCapacidadeHD());
            taDiferenciais.setText(not.getBateria());
            marcarRadio(bgProcessador, not.getProcessador());
            marcarRadio(bgMemoria, not.getMemoria());
        }else{
            btCadastrar.setEnabled(true);
            btLimpar.setEnabled(true);
        }
        this.setIconImage(new ImageIcon("src\\logo\\blue-laptop-icon 16.png").getImage());
    }//GEN-LAST:event_formWindowOpened

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja atualizar os dados?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(opcao == 0){
            String sistemaOperacional = cbSistemaOp.getSelectedItem().toString();
            String placaVideo = cbPlacaVideo.getSelectedItem().toString();
            String capacidadeHD = cbArmazenamento.getSelectedItem().toString();
            String diferenciais = taDiferenciais.getText();
            String processador = capturaProcessador();
            String memoria = capturaMemoria();  
            Notebook note = new Notebook(sistemaOperacional, placaVideo, capacidadeHD, processador, memoria, diferenciais,
                    not.getCodEquipamento(), not.getModelo(), not.getMarca(),
                    not.getQuantEstoque(), not.getCategoria(), not.getValorDiaria());
            FormPrincipal.bdEquipamento.atualizarEquipamento((Equipamento) note);
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!", "Informações Alteradas", JOptionPane.INFORMATION_MESSAGE);
            FormEquipamento.eq = null;
            FormEquipamento.equipamento = null;
            not = null;
            this.dispose();
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private String capturaMemoria() {
        JRadioButton radio;
        String memoria = null;
        Enumeration jr = bgMemoria.getElements();
        while ( jr.hasMoreElements() ){
            radio = (JRadioButton) jr.nextElement();
            if (radio.isSelected())
                memoria = radio.getText();
        }
        return memoria;
    }

    private String capturaProcessador() {
        JRadioButton radio;
        String processador = null;
        Enumeration jr = bgProcessador.getElements();
        while ( jr.hasMoreElements() ){
            radio = (JRadioButton) jr.nextElement();
            if (radio.isSelected())
                processador = radio.getText();
        }
        return processador;
    }

    private void marcarRadio(ButtonGroup grupo, String str){
        JRadioButton radio; 
        Enumeration jr = grupo.getElements(); 
        while ( jr.hasMoreElements() ) 
        { 
            radio = (JRadioButton) jr.nextElement(); 
            if (radio.getText().equals(str)) 
                radio.setSelected(true); 
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
            java.util.logging.Logger.getLogger(FormNotebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNotebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNotebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNotebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNotebook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgMemoria;
    private javax.swing.ButtonGroup bgProcessador;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbArmazenamento;
    private javax.swing.JComboBox<String> cbPlacaVideo;
    private javax.swing.JComboBox<String> cbSistemaOp;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbArmazenamento;
    private javax.swing.JLabel lbDiferenciais;
    private javax.swing.JLabel lbPlacaVideo;
    private javax.swing.JLabel lbSistemaOp;
    private javax.swing.JRadioButton rbAmdAthlon;
    private javax.swing.JRadioButton rbAmdRyzen;
    private javax.swing.JRadioButton rbDDR22g;
    private javax.swing.JRadioButton rbDDR32g;
    private javax.swing.JRadioButton rbDDR34g;
    private javax.swing.JRadioButton rbDDR38g;
    private javax.swing.JRadioButton rbDDR48g;
    private javax.swing.JRadioButton rbInteli3;
    private javax.swing.JRadioButton rbInteli5;
    private javax.swing.JRadioButton rbInteli7;
    private javax.swing.JTextArea taDiferenciais;
    // End of variables declaration//GEN-END:variables
}
