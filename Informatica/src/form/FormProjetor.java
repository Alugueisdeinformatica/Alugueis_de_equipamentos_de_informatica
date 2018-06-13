package form;

import static form.FormEquipamento.equipamento;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Equipamento;
import model.Projetor;

public class FormProjetor extends javax.swing.JFrame {

    public static Projetor pro = null;
    
    public FormProjetor() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        lbLuminosidade = new javax.swing.JLabel();
        lbResolucao = new javax.swing.JLabel();
        lbLampada = new javax.swing.JLabel();
        lbLente = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btLimpar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btAtualizar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btSair = new javax.swing.JButton();
        cbLuminosidade = new javax.swing.JComboBox<>();
        cbResolucao = new javax.swing.JComboBox<>();
        cbLampada = new javax.swing.JComboBox<>();
        cbLente = new javax.swing.JComboBox<>();
        cbTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Projetor");
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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/62843-film-projector-icon.png"))); // NOI18N
        jLabel1.setText("J&L INFORMÁTICA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        lbTipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTipo.setText("Tipo:");
        lbTipo.setName("lbTipo"); // NOI18N

        lbLuminosidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbLuminosidade.setText("Luminosidade:");
        lbLuminosidade.setName("lbLuminosidade"); // NOI18N

        lbResolucao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbResolucao.setText("Resolução Máxima:");
        lbResolucao.setName("lbResolucao"); // NOI18N

        lbLampada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbLampada.setText("Lâmpada:");
        lbLampada.setName("lbLampada"); // NOI18N

        lbLente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbLente.setText("Lente:");
        lbLente.setName("lbLente"); // NOI18N

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

        cbLuminosidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2700 ANSI Lumens", "3600 ANSI lumens" }));
        cbLuminosidade.setName("cbLuminosidade"); // NOI18N

        cbResolucao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VGA", "SVGA", "XGA", "WXGA", "WXGA+", "SXGA", "SXGA+" }));
        cbResolucao.setName("cbResolucao"); // NOI18N

        cbLampada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo 200W" }));
        cbLampada.setName("cbLampada"); // NOI18N

        cbLente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Foco Manual / Zoom Digital" }));
        cbLente.setName("cbLente"); // NOI18N

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LCD Portátil", "Teto e Mesa", " " }));
        cbTipo.setName("cbTipo"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(cbLampada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(lbTipo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(lbLampada)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cbLuminosidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbLuminosidade, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(70, 70, 70)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbResolucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbResolucao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(24, 24, 24))
                                .addComponent(cbLente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lbLente)
                                .addGap(69, 69, 69)))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipo)
                    .addComponent(lbLuminosidade)
                    .addComponent(lbResolucao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLuminosidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbResolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLampada)
                    .addComponent(lbLente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLampada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbLente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(627, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        FormEquipamento.eq = null;
        FormEquipamento.equipamento = null;
        pro = null;
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        cbTipo.setSelectedItem(0);
        cbLuminosidade.setSelectedItem(0);
        cbResolucao.setSelectedItem(0);
        cbLampada.setSelectedItem(0);
        cbLente.setSelectedItem(0);
        cbTipo.requestFocus();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja efetuar o cadastro?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(opcao == 0){
            String tipo = cbTipo.getSelectedItem().toString();
            String luminosidade = cbLuminosidade.getSelectedItem().toString();
            String resolucao = cbResolucao.getSelectedItem().toString();
            String lampada = cbLampada.getSelectedItem().toString();
            String lente = cbLente.getSelectedItem().toString();

            Projetor proj = new Projetor(tipo, luminosidade, resolucao, lampada, lente, 
                    equipamento.getCodEquipamento(), equipamento.getModelo(), equipamento.getMarca(),
                    equipamento.getQuantEstoque(), equipamento.getCategoria(), equipamento.getValorDiaria());

            if(proj.validaProjetor()){
                FormPrincipal.bdEquipamento.adicionaEquipamento((Equipamento) proj); 
                JOptionPane.showMessageDialog(null, "Projetor Cadastrado!", "", JOptionPane.INFORMATION_MESSAGE);
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
        if(pro != null){
            btAtualizar.setEnabled(true);
            cbTipo.setSelectedItem(pro.getTipo());
            cbLuminosidade.setSelectedItem(pro.getLuminosidade());
            cbResolucao.setSelectedItem(pro.getResolucaoOptica());
            cbLampada.setSelectedItem(pro.getLampada());
            cbLente.setSelectedItem(pro.getLente());
        }else{
            btCadastrar.setEnabled(true);
            btLimpar.setEnabled(true);
        }
        this.setIconImage(new ImageIcon("src\\logo\\film-projector-icon 16.png").getImage());
    }//GEN-LAST:event_formWindowOpened

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja atualizar os dados?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(opcao == 0){
            String tipo = cbTipo.getSelectedItem().toString();
            String luminosidade = cbLuminosidade.getSelectedItem().toString();
            String resolucao = cbResolucao.getSelectedItem().toString();
            String lampada = cbLampada.getSelectedItem().toString();
            String lente = cbLente.getSelectedItem().toString();
            Projetor proj = new Projetor(tipo, luminosidade, resolucao, lampada, lente, 
                    pro.getCodEquipamento(), pro.getModelo(), pro.getMarca(),
                    pro.getQuantEstoque(), pro.getCategoria(), pro.getValorDiaria());
            FormPrincipal.bdEquipamento.atualizarEquipamento((Equipamento) proj);
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!", "Informações Alteradas", JOptionPane.INFORMATION_MESSAGE);
            FormEquipamento.eq = null;
            FormEquipamento.equipamento = null;
            pro = null;
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
            java.util.logging.Logger.getLogger(FormProjetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProjetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProjetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProjetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProjetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbLampada;
    private javax.swing.JComboBox<String> cbLente;
    private javax.swing.JComboBox<String> cbLuminosidade;
    private javax.swing.JComboBox<String> cbResolucao;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbLampada;
    private javax.swing.JLabel lbLente;
    private javax.swing.JLabel lbLuminosidade;
    private javax.swing.JLabel lbResolucao;
    private javax.swing.JLabel lbTipo;
    // End of variables declaration//GEN-END:variables
}
