package form;

import static form.FormEquipamento.equipamento;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Equipamento;
import model.Tablet;

public class FormTablet extends javax.swing.JFrame {

    public static Tablet ta = null;
    
    public FormTablet() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbCapacidade = new javax.swing.JLabel();
        lbTamanhoTela = new javax.swing.JLabel();
        lbMemoria = new javax.swing.JLabel();
        lbSO = new javax.swing.JLabel();
        lbBateria = new javax.swing.JLabel();
        lbProcessador = new javax.swing.JLabel();
        cbCapacidade = new javax.swing.JComboBox<>();
        cbTamanhoTela = new javax.swing.JComboBox<>();
        cbSO = new javax.swing.JComboBox<>();
        jToolBar1 = new javax.swing.JToolBar();
        btCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btLimpar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btAtualizar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btSair = new javax.swing.JButton();
        cbMemoria = new javax.swing.JComboBox<>();
        cbProcessador = new javax.swing.JComboBox<>();
        cbBateria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Tablet");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/ipad-white-icon.png"))); // NOI18N
        jLabel1.setText("J&L INFORMÁTICA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        lbCapacidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCapacidade.setText("Capacidade:");
        lbCapacidade.setName("lbCapacidade"); // NOI18N

        lbTamanhoTela.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTamanhoTela.setText("Tamanho Tela:");
        lbTamanhoTela.setName("lbTamanhoTela"); // NOI18N

        lbMemoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbMemoria.setText("Memória RAM:");
        lbMemoria.setName("lbMemoria"); // NOI18N

        lbSO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbSO.setText("Sistema Operacional:");
        lbSO.setName("lbSO"); // NOI18N

        lbBateria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbBateria.setText("Bateria:");
        lbBateria.setName("lbBateria"); // NOI18N

        lbProcessador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbProcessador.setText("Processador:");
        lbProcessador.setName("lbProcessador"); // NOI18N

        cbCapacidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8 Gb", "16 Gb", "32 Gb", "64 Gb", "128 Gb" }));
        cbCapacidade.setName("cbCapacidade"); // NOI18N

        cbTamanhoTela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8\"", "10\"", "12\"", "18\"", "20\"" }));
        cbTamanhoTela.setName("cbTamanhoTela"); // NOI18N

        cbSO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Android 4.1", "Android 5.0", "Android 6.0", "I.O.S. 6.0" }));
        cbSO.setName("cbSO"); // NOI18N

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

        cbMemoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1GB", "2GB", "4GB", "6GB", "8GB" }));
        cbMemoria.setName("cbMemoria"); // NOI18N

        cbProcessador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quad-Core 1.2 GHz", "Quad-Core 1.3GHZ", " " }));
        cbProcessador.setName("cbProcessador"); // NOI18N

        cbBateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2700 mAh", "2800 mAh", "4000 mAh", "4200 mAh", " ", " ", " " }));
        cbBateria.setName("cbBateria"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbSO)
                        .addGap(97, 97, 97)
                        .addComponent(lbBateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbProcessador)
                        .addGap(102, 102, 102))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbSO, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(cbBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(cbProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCapacidade))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbTamanhoTela, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTamanhoTela))
                                .addGap(100, 100, 100)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbMemoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTamanhoTela)
                    .addComponent(lbMemoria)
                    .addComponent(lbCapacidade))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTamanhoTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSO)
                        .addComponent(lbBateria))
                    .addComponent(lbProcessador))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(626, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        FormEquipamento.eq = null;
        FormEquipamento.equipamento = null;
        ta = null;
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        cbCapacidade.setSelectedIndex(0);
        cbTamanhoTela.setSelectedIndex(0);
        cbMemoria.setSelectedItem(2);
        cbSO.setSelectedIndex(0);
        cbBateria.setSelectedItem(0);
        cbProcessador.setSelectedItem(0);
        cbCapacidade.requestFocus();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja efetuar o cadastro?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(opcao == 0){
            String capacidade = cbCapacidade.getSelectedItem().toString();
            String tamanho = cbTamanhoTela.getSelectedItem().toString();
            String memoria = cbMemoria.getSelectedItem().toString();
            String sistema = cbSO.getSelectedItem().toString();
            String bateria = cbBateria.getSelectedItem().toString();
            String processador = cbProcessador.getSelectedItem().toString();

            Tablet tab = new Tablet(capacidade, tamanho, memoria, sistema, bateria, processador, 
                    equipamento.getCodEquipamento(), equipamento.getModelo(), equipamento.getMarca(),
                    equipamento.getQuantEstoque(), equipamento.getCategoria(), equipamento.getValorDiaria());

            if(tab.validaTablet()){
                FormPrincipal.bdEquipamento.adicionaEquipamento((Equipamento) tab); 
                JOptionPane.showMessageDialog(null, "Tablet Cadastrado!", "", JOptionPane.INFORMATION_MESSAGE);
                FormPrincipal.codEquipamento++;
                opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar Novo Equipamento", "Confirmação", JOptionPane.YES_NO_OPTION);
                if(opcao == 0){
                    this.dispose();
                    new FormEquipamento().setVisible(true);
                }else{
                    this.dispose();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Informação de Preenchimento", JOptionPane.WARNING_MESSAGE);
            } 
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(ta != null){
            btAtualizar.setEnabled(true);
            cbCapacidade.setSelectedItem(ta.getCapacidade());
            cbTamanhoTela.setSelectedItem(ta.getTamanhoTela());
            cbMemoria.setSelectedItem(ta.getMemoriaRam());
            cbSO.setSelectedItem(ta.getSistemaOperacional());
            cbBateria.setSelectedItem(ta.getBateria());
            cbProcessador.setSelectedItem(ta.getProcessador());
        }else{
            btCadastrar.setEnabled(true);
            btLimpar.setEnabled(true);
        }
        this.setIconImage(new ImageIcon("src\\logo\\ipad-white-icon 16.png").getImage());
    }//GEN-LAST:event_formWindowOpened

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja atualizar os dados?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(opcao == 0){
            String capacidade = cbCapacidade.getSelectedItem().toString();
            String tamanho = cbTamanhoTela.getSelectedItem().toString();
            String memoria = cbMemoria.getSelectedItem().toString();
            String sistema = cbSO.getSelectedItem().toString();
            String bateria = cbBateria.getSelectedItem().toString();
            String processador = cbCapacidade.getSelectedItem().toString();
            Tablet tab = new Tablet(capacidade, tamanho, memoria, sistema, bateria, processador, 
                    ta.getCodEquipamento(), ta.getModelo(), ta.getMarca(),
                    ta.getQuantEstoque(), ta.getCategoria(), ta.getValorDiaria());
            FormPrincipal.bdEquipamento.atualizarEquipamento((Equipamento) tab);
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!", "Informações Alteradas", JOptionPane.INFORMATION_MESSAGE);
            FormEquipamento.eq = null;
            FormEquipamento.equipamento = null;
            ta = null;
            this.dispose();
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(FormTablet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTablet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTablet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTablet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTablet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbBateria;
    private javax.swing.JComboBox<String> cbCapacidade;
    private javax.swing.JComboBox<String> cbMemoria;
    private javax.swing.JComboBox<String> cbProcessador;
    private javax.swing.JComboBox<String> cbSO;
    private javax.swing.JComboBox<String> cbTamanhoTela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbBateria;
    private javax.swing.JLabel lbCapacidade;
    private javax.swing.JLabel lbMemoria;
    private javax.swing.JLabel lbProcessador;
    private javax.swing.JLabel lbSO;
    private javax.swing.JLabel lbTamanhoTela;
    // End of variables declaration//GEN-END:variables
}
