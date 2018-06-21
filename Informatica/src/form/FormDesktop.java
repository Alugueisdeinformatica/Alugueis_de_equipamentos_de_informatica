package form;

import static form.FormEquipamento.equipamento;
import java.util.Enumeration;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Computador;
import model.Equipamento;

public class FormDesktop extends javax.swing.JFrame {

    public static Computador eq = null;
    
    public FormDesktop() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSO = new javax.swing.ButtonGroup();
        bgPlaca = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        lbArmHD = new javax.swing.JLabel();
        lbMemoria = new javax.swing.JLabel();
        lbProcessador = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbWind = new javax.swing.JRadioButton();
        rbUbuntu = new javax.swing.JRadioButton();
        rbMcOS = new javax.swing.JRadioButton();
        cbProcessador = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rbOnBoard = new javax.swing.JRadioButton();
        rbAsus = new javax.swing.JRadioButton();
        rbNvidia = new javax.swing.JRadioButton();
        rbRadeon = new javax.swing.JRadioButton();
        jToolBar1 = new javax.swing.JToolBar();
        btCadastrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btLimpar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btAtualizar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btSair = new javax.swing.JButton();
        cbArmazenamento = new javax.swing.JComboBox<>();
        cbMemoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Desktop");
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));

        lbArmHD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbArmHD.setText("Armazenamento HD:");
        lbArmHD.setName("lbArmHD"); // NOI18N

        lbMemoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbMemoria.setText("Memória:");
        lbMemoria.setName("lbMemoria"); // NOI18N

        lbProcessador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbProcessador.setText("Processador:");
        lbProcessador.setName("lbProcessador"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sistema Operacional", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        rbWind.setBackground(new java.awt.Color(250, 250, 250));
        bgSO.add(rbWind);
        rbWind.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbWind.setSelected(true);
        rbWind.setText("Windows 10");
        rbWind.setName("rbWind"); // NOI18N

        rbUbuntu.setBackground(new java.awt.Color(250, 250, 250));
        bgSO.add(rbUbuntu);
        rbUbuntu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbUbuntu.setText("Ubuntu");
        rbUbuntu.setName("rbUbuntu"); // NOI18N

        rbMcOS.setBackground(new java.awt.Color(250, 250, 250));
        bgSO.add(rbMcOS);
        rbMcOS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbMcOS.setText("Mc OS");
        rbMcOS.setName("rbMcOS"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbUbuntu)
                    .addComponent(rbWind)
                    .addComponent(rbMcOS))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbMcOS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbWind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbUbuntu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbProcessador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AMD Athlon™ X4", "AMD Ryzen™ 5", "Intel Core™ i3", "Intel Core™ i5", "Intel Core™ i7" }));
        cbProcessador.setName("cbProcessador"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setPreferredSize(new java.awt.Dimension(520, 100));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/my-computer-icon.png"))); // NOI18N
        jLabel3.setText("J&L INFORMÁTICA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Placa de Vídeo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        rbOnBoard.setBackground(new java.awt.Color(250, 250, 250));
        bgPlaca.add(rbOnBoard);
        rbOnBoard.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbOnBoard.setSelected(true);
        rbOnBoard.setText("On-Board");
        rbOnBoard.setName("rbOnBoard"); // NOI18N

        rbAsus.setBackground(new java.awt.Color(250, 250, 250));
        bgPlaca.add(rbAsus);
        rbAsus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbAsus.setText("Asus Geforce Gtx");
        rbAsus.setName("rbAsus"); // NOI18N

        rbNvidia.setBackground(new java.awt.Color(250, 250, 250));
        bgPlaca.add(rbNvidia);
        rbNvidia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbNvidia.setText("Nvidia Gt 210");
        rbNvidia.setName("rbNvidia"); // NOI18N

        rbRadeon.setBackground(new java.awt.Color(250, 250, 250));
        bgPlaca.add(rbRadeon);
        rbRadeon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbRadeon.setText("Radeon R5 230");
        rbRadeon.setName("rbRadeon"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbRadeon)
                    .addComponent(rbNvidia)
                    .addComponent(rbAsus)
                    .addComponent(rbOnBoard))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(rbOnBoard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAsus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbNvidia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbRadeon)
                .addContainerGap())
        );

        jToolBar1.setBackground(new java.awt.Color(250, 250, 250));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(480, 57));

        btCadastrar.setBackground(new java.awt.Color(250, 250, 250));
        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Accept-icon.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setEnabled(false);
        btCadastrar.setName("btCadastrar"); // NOI18N
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btCadastrar);
        jToolBar1.add(jSeparator2);

        btLimpar.setBackground(new java.awt.Color(250, 250, 250));
        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh-icon.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setEnabled(false);
        btLimpar.setMaximumSize(new java.awt.Dimension(115, 55));
        btLimpar.setName("btLimpar"); // NOI18N
        btLimpar.setPreferredSize(new java.awt.Dimension(115, 55));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jToolBar1.add(btLimpar);
        jToolBar1.add(jSeparator1);

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
        btSair.setMaximumSize(new java.awt.Dimension(115, 55));
        btSair.setName("btSair"); // NOI18N
        btSair.setPreferredSize(new java.awt.Dimension(115, 55));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jToolBar1.add(btSair);

        cbArmazenamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "320GB", "500GB", "750GB", "1TB", "2TB" }));
        cbArmazenamento.setName("cbArmazenamento"); // NOI18N

        cbMemoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1GB", "2GB", "4GB", "6GB", "8GB" }));
        cbMemoria.setName("cbMemoria"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbArmHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbArmazenamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbMemoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lbProcessador))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbArmHD)
                    .addComponent(lbMemoria)
                    .addComponent(lbProcessador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbArmazenamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(628, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja efetuar o cadastro?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(opcao == 0){
            String capacidadeHD = cbArmazenamento.getSelectedItem().toString();
            String memoria = cbMemoria.getSelectedItem().toString();
            String processador = cbProcessador.getSelectedItem().toString();        
            String sistemaOp = capturarSO();        
            String placaVideo = captuarPlaca();   

            Computador comp = new Computador(sistemaOp, placaVideo, capacidadeHD, processador, memoria, 
                    equipamento.getCodEquipamento(), equipamento.getModelo(), equipamento.getMarca(),
                    equipamento.getQuantEstoque(), equipamento.getCategoria(), equipamento.getValorDiaria()); 

            if(comp.validaComputador()){
                FormPrincipal.bdEquipamento.adicionaEquipamento((Equipamento) comp); 
                JOptionPane.showMessageDialog(null, "Desktop Cadastrado!", "Informação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
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

    private String captuarPlaca() {
        JRadioButton radio;
        String placaVideo = null;
        Enumeration jr = bgPlaca.getElements();
        while ( jr.hasMoreElements() ){
            radio = (JRadioButton) jr.nextElement();
            if (radio.isSelected())
                placaVideo = radio.getText();
        }
        return placaVideo;
    }

    private String capturarSO() {
        JRadioButton radio;
        String sistemaOp = null;
        Enumeration jr = bgSO.getElements();
        while ( jr.hasMoreElements() ){
            radio = (JRadioButton) jr.nextElement();
            if (radio.isSelected())
                sistemaOp = radio.getText();
        }
        return sistemaOp;
    }
    
    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        FormEquipamento.eq = null;
        FormEquipamento.equipamento = null;
        eq = null;
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        cbArmazenamento.setSelectedItem(3);
        cbMemoria.setSelectedItem(2);
        cbProcessador.setSelectedIndex(0);
        bgSO.clearSelection();
        rbWind.setSelected(true);
        bgPlaca.clearSelection();
        rbOnBoard.setSelected(true);
        cbArmazenamento.requestFocus();
    }//GEN-LAST:event_btLimparActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(eq != null){
            btAtualizar.setEnabled(true);
            cbArmazenamento.setSelectedItem(eq.getCapacidadeHD());
            cbMemoria.setSelectedItem(eq.getMemoria());
            cbProcessador.setSelectedItem(eq.getProcessador());
            marcarRadio(bgSO, eq.getSistemaOperacional());
            marcarRadio(bgPlaca, eq.getPlacaVideo());
        }else{
            btCadastrar.setEnabled(true);
            btLimpar.setEnabled(true);
        }
        this.setIconImage(new ImageIcon("src\\logo\\my-computer-icon 16.png").getImage());
    }//GEN-LAST:event_formWindowOpened

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja atualizar os dados?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(opcao == 0){
            String capacidadeHD = cbArmazenamento.getSelectedItem().toString();
            String memoria = cbMemoria.getSelectedItem().toString();
            String processador = cbProcessador.getSelectedItem().toString();        
            String sistemaOp = capturarSO();        
            String placaVideo = captuarPlaca();   
            Computador comp = new Computador(sistemaOp, placaVideo, capacidadeHD, processador, memoria, 
                    eq.getCodEquipamento(), eq.getModelo(), eq.getMarca(),
                    eq.getQuantEstoque(), eq.getCategoria(), eq.getValorDiaria());
            FormPrincipal.bdEquipamento.atualizarEquipamento((Equipamento) comp);
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!", "Informações Alteradas", JOptionPane.INFORMATION_MESSAGE);
            FormEquipamento.eq = null;
            FormEquipamento.equipamento = null;
            eq = null;
            this.dispose();
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void capturarRadioSO(Computador comp) {
        //Radio Button SO
        JRadioButton radio;
        String sistemaOp = null;
        Enumeration jr = bgSO.getElements();
        while ( jr.hasMoreElements() ){
            radio = (JRadioButton) jr.nextElement();
            if (radio.isSelected())
                sistemaOp = radio.getText();
        }
        comp.setSistemaOperacional(sistemaOp);
    }

    private void capturarRadioPlaca(Computador comp) {
        //Fim
        JRadioButton radio;
        String placa = null;
        Enumeration jr = bgPlaca.getElements();
        while ( jr.hasMoreElements() ){
            radio = (JRadioButton) jr.nextElement();
            if (radio.isSelected())
                placa = radio.getText();
        }
        comp.setPlacaVideo(placa);
        //FIM PLACA
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
            java.util.logging.Logger.getLogger(FormDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDesktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPlaca;
    private javax.swing.ButtonGroup bgSO;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbArmazenamento;
    private javax.swing.JComboBox<String> cbMemoria;
    private javax.swing.JComboBox<String> cbProcessador;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbArmHD;
    private javax.swing.JLabel lbMemoria;
    private javax.swing.JLabel lbProcessador;
    private javax.swing.JRadioButton rbAsus;
    private javax.swing.JRadioButton rbMcOS;
    private javax.swing.JRadioButton rbNvidia;
    private javax.swing.JRadioButton rbOnBoard;
    private javax.swing.JRadioButton rbRadeon;
    private javax.swing.JRadioButton rbUbuntu;
    private javax.swing.JRadioButton rbWind;
    // End of variables declaration//GEN-END:variables
}
