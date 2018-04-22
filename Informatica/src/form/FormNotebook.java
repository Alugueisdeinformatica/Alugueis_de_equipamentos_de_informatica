/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import static form.FormEquipamento.equipamento;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Equipamento;
import model.Notebook;

/**
 *
 * @author John Peter
 */
public class FormNotebook extends javax.swing.JFrame {

    /**
     * Creates new form FormNotebook
     */
    public FormNotebook() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgProcessador = new javax.swing.ButtonGroup();
        bgMemoria = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btCancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
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
        taBateria = new javax.swing.JTextArea();
        tfCapacidade = new javax.swing.JTextField();
        cbPlacaVideo = new javax.swing.JComboBox<>();
        cbSistemaOp = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbBateria = new javax.swing.JLabel();
        lbCapacidade = new javax.swing.JLabel();
        lbPlacaVideo = new javax.swing.JLabel();
        lbSistemaOp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        jToolBar1.setBackground(new java.awt.Color(250, 250, 250));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btCadastrar.setBackground(new java.awt.Color(250, 250, 250));
        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Accept-icon.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setName("btCadastrar"); // NOI18N
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btCadastrar);
        jToolBar1.add(jSeparator1);

        btCancelar.setBackground(new java.awt.Color(250, 250, 250));
        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh-icon.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setFocusable(false);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCancelar.setName("btCancelar"); // NOI18N
        btCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(btCancelar);
        jToolBar1.add(jSeparator2);

        btSair.setBackground(new java.awt.Color(250, 250, 250));
        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Apps-Dialog-Close-icon.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setName("btSair"); // NOI18N
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jToolBar1.add(btSair);

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Memória", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        rbDDR34g.setBackground(new java.awt.Color(250, 250, 250));
        bgMemoria.add(rbDDR34g);
        rbDDR34g.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbDDR34g.setSelected(true);
        rbDDR34g.setText("DDR 3 4Gb");
        rbDDR34g.setName("rbDDR34g"); // NOI18N

        rbDDR48g.setBackground(new java.awt.Color(250, 250, 250));
        bgMemoria.add(rbDDR48g);
        rbDDR48g.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbDDR48g.setText("DDR 4 8Gb");
        rbDDR48g.setName("rbDDR48g"); // NOI18N

        rbDDR22g.setBackground(new java.awt.Color(250, 250, 250));
        bgMemoria.add(rbDDR22g);
        rbDDR22g.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbDDR22g.setText("DDR 2 2Gb");
        rbDDR22g.setName("rbDDR22g"); // NOI18N

        rbDDR32g.setBackground(new java.awt.Color(250, 250, 250));
        bgMemoria.add(rbDDR32g);
        rbDDR32g.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbDDR32g.setText("DDR 3 2Gb");
        rbDDR32g.setName("rbDDR32g"); // NOI18N

        rbDDR38g.setBackground(new java.awt.Color(250, 250, 250));
        bgMemoria.add(rbDDR38g);
        rbDDR38g.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbDDR38g.setText("DDR 3 8GB");
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
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Processador", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

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

        taBateria.setColumns(20);
        taBateria.setRows(5);
        taBateria.setName("taBateria"); // NOI18N
        jScrollPane1.setViewportView(taBateria);

        tfCapacidade.setName("tfCapacidade"); // NOI18N

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
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        lbBateria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbBateria.setText("Bateria:");
        lbBateria.setName("lbBateria"); // NOI18N

        lbCapacidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCapacidade.setText("Capacidade HD:");
        lbCapacidade.setName("lbCapacidade"); // NOI18N

        lbPlacaVideo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPlacaVideo.setText("Placa de Vídeo:");
        lbPlacaVideo.setName("lbPlacaVideo"); // NOI18N

        lbSistemaOp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbSistemaOp.setText("Sistema Operacional:");
        lbSistemaOp.setName("lbSistemaOp"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBateria)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbSistemaOp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbSistemaOp, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPlacaVideo)
                            .addComponent(cbPlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCapacidade)
                            .addComponent(tfCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSistemaOp)
                    .addComponent(lbPlacaVideo)
                    .addComponent(lbCapacidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSistemaOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbBateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(536, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        String sistemaOperacional = cbSistemaOp.getSelectedItem().toString();
        String placaVideo = cbPlacaVideo.getSelectedItem().toString();
        String capacidadeHD = tfCapacidade.getText();
        String bateria = taBateria.getText();
        String processador = capturaProcessador();
        String memoria = capturaMemoria();
        
        Notebook note = new Notebook(sistemaOperacional, placaVideo, capacidadeHD, processador, memoria, bateria,
                equipamento.getCodEquipamento(), equipamento.getModelo(), equipamento.getMarca(),
                equipamento.getQuantEstoque(), equipamento.getCategoria(), equipamento.getValorDiaria());
        
        if(note.validaNotebook()){
            FormPrincipal.bdEquipamento.adicionaEquipamento((Equipamento) note); 
            JOptionPane.showMessageDialog(null, "Notebook Cadastrado!", "", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Informação de Preenchimento", JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        cbSistemaOp.setSelectedIndex(0);
        cbPlacaVideo.setSelectedIndex(0);
        tfCapacidade.setText("");
        taBateria.setText("");
        bgProcessador.clearSelection();
        rbInteli3.setSelected(true);
        bgMemoria.clearSelection();
        rbDDR34g.setSelected(true);
        cbSistemaOp.requestFocus();
    }//GEN-LAST:event_btCancelarActionPerformed

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
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSair;
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
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbBateria;
    private javax.swing.JLabel lbCapacidade;
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
    private javax.swing.JTextArea taBateria;
    private javax.swing.JTextField tfCapacidade;
    // End of variables declaration//GEN-END:variables
}
