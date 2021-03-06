package form;

import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import model.Computador;
import model.Equipamento;
import model.Impressora;
import model.Monitor;
import model.Notebook;
import model.Projetor;
import model.Tablet;

public class FormEquipamento extends javax.swing.JFrame {
    
    public static Equipamento equipamento = null;   
    public static Equipamento eq = null;
    
    public FormEquipamento() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        lbModelo = new javax.swing.JLabel();
        lbMarca = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        tfModelo = new javax.swing.JTextField();
        tfCodigo = new javax.swing.JTextField();
        lbQuantidade = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JTextField();
        lbValor = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        jToolBar1 = new javax.swing.JToolBar();
        btLimpar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btSair = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btSeguinte = new javax.swing.JButton();
        tfValor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Equipamento");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/my-computer-icon.png"))); // NOI18N
        jLabel7.setText("J&L INFORMÁTICA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCodigo.setText("Código:");
        lbCodigo.setName("lbCodigo"); // NOI18N

        lbModelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbModelo.setText("Modelo:");
        lbModelo.setName("lbModelo"); // NOI18N

        lbMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbMarca.setText("Marca:");
        lbMarca.setName("lbMarca"); // NOI18N

        tfMarca.setName("tfMarca"); // NOI18N

        tfModelo.setName("tfModelo"); // NOI18N

        tfCodigo.setEditable(false);
        tfCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfCodigo.setName("tfCodigo"); // NOI18N
        tfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodigoKeyTyped(evt);
            }
        });

        lbQuantidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbQuantidade.setText("Quantidade:");
        lbQuantidade.setName("lbQuantidade"); // NOI18N

        tfQuantidade.setText("0");
        tfQuantidade.setName("tfQuantidade"); // NOI18N
        tfQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfQuantidadeKeyTyped(evt);
            }
        });

        lbValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbValor.setText("Valor:");
        lbValor.setName("lbValor"); // NOI18N

        lbCategoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCategoria.setText("Categoria:");
        lbCategoria.setName("lbCategoria"); // NOI18N

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desktop", "Impressora", "Monitor", "Notebook", "Projetor", "Tablet" }));
        cbCategoria.setName("cbCategoria"); // NOI18N

        jToolBar1.setBackground(new java.awt.Color(250, 250, 250));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

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
        jToolBar1.add(jSeparator1);

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
        jToolBar1.add(jSeparator2);

        btSeguinte.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSeguinte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Forward-icon.png"))); // NOI18N
        btSeguinte.setText("Seguinte");
        btSeguinte.setFocusable(false);
        btSeguinte.setMaximumSize(new java.awt.Dimension(115, 55));
        btSeguinte.setName("btSeguinte"); // NOI18N
        btSeguinte.setPreferredSize(new java.awt.Dimension(115, 55));
        btSeguinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeguinteActionPerformed(evt);
            }
        });
        jToolBar1.add(btSeguinte);

        tfValor.setName("tfValor"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lbCodigo)
                        .addGap(85, 85, 85)
                        .addComponent(lbModelo)
                        .addGap(87, 87, 87)
                        .addComponent(lbMarca))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbQuantidade)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(lbValor))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(lbCategoria)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMarca)
                    .addComponent(lbModelo)
                    .addComponent(lbCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCategoria)
                    .addComponent(lbValor)
                    .addComponent(lbQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
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

        setSize(new java.awt.Dimension(626, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuantidadeKeyTyped
        String caracteres = "0987654321";
        if(!caracteres.contains(evt.getKeyChar() + "")){
            evt.consume();
        }
    }//GEN-LAST:event_tfQuantidadeKeyTyped

    private void tfCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoKeyTyped
        String caracteres = "0987654321";
        if(!caracteres.contains(evt.getKeyChar() + "")){
            evt.consume();
        }
    }//GEN-LAST:event_tfCodigoKeyTyped

    private void btSeguinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeguinteActionPerformed
        float val = formatarValor(tfValor);
        if(eq != null){
            eq.setModelo( tfModelo.getText() );
            eq.setMarca( tfMarca.getText() );
            eq.setValorDiaria(val);
            eq.setQuantEstoque( Integer.parseInt( tfQuantidade.getText() ) );
            selecionar();
        }else{
            equipamento = new Equipamento();        
            equipamento.setCodEquipamento(FormPrincipal.codEquipamento);
            equipamento.setCategoria( cbCategoria.getSelectedItem().toString() );
            equipamento.setModelo( tfModelo.getText() );
            equipamento.setMarca( tfMarca.getText() );
            equipamento.setValorDiaria(val);
            equipamento.setQuantEstoque( Integer.parseInt( tfQuantidade.getText() ) );

            if(equipamento.validaEquipamento()){
                selecionar();
            }else{
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }        
    }//GEN-LAST:event_btSeguinteActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        equipamento = null;
        eq = null;
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfModelo.setText("");
        tfMarca.setText("");
        tfQuantidade.setText("0");
        tfValor.setText("0");
        cbCategoria.setSelectedIndex(0);
        tfModelo.requestFocus();
    }//GEN-LAST:event_btLimparActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DecimalFormat dFormat = new DecimalFormat("#,###,###.00") ;
        NumberFormatter formatter = new NumberFormatter(dFormat) ;
        formatter.setFormat(dFormat) ;
        formatter.setAllowsInvalid(false) ; 
        tfValor.setFormatterFactory ( new DefaultFormatterFactory ( formatter ) ) ;
        tfValor.setText("0,00");
        
        if(eq != null){
            String valor = Double.toString(eq.getValorDiaria()).replace(".", ",");
            tfCodigo.setText(Integer.toString(eq.getCodEquipamento()));
            tfCodigo.setEnabled(false);
            tfModelo.setText(eq.getModelo());
            tfMarca.setText(eq.getMarca());
            tfQuantidade.setText(Integer.toString(eq.getQuantEstoque()));
            tfValor.setText(valor);
            cbCategoria.setSelectedItem(eq.getCategoria());
            cbCategoria.setEnabled(false);
        }else{
            this.setIconImage(new ImageIcon("src\\logo\\my-computer-icon 16.png").getImage());
            btLimpar.setEnabled(true);
            tfCodigo.setText(String.valueOf(FormPrincipal.codEquipamento));
            tfModelo.requestFocus();
        }
    }//GEN-LAST:event_formWindowOpened

    private void selecionar(){
        Object opcao = cbCategoria.getSelectedItem();
        
        if(opcao.equals("Desktop")){
            FormDesktop.eq = (Computador) eq;
            new FormDesktop().setVisible(true); 
        }else if(opcao.equals("Impressora")){
            FormImpressora.imp = (Impressora) eq;
            new FormImpressora().setVisible(true);
        }else if(opcao.equals("Monitor")){
            FormMonitor.mo = (Monitor) eq;
            new FormMonitor().setVisible(true); 
        }else if(opcao.equals("Notebook")){
            FormNotebook.not = (Notebook) eq;
            new FormNotebook().setVisible(true);
        }else if(opcao.equals("Projetor")){
            FormProjetor.pro = (Projetor) eq;
            new FormProjetor().setVisible(true);
        }else if(opcao.equals("Tablet")){
            FormTablet.ta = (Tablet) eq;
            new FormTablet().setVisible(true);
        }
        this.dispose(); 
    }
    
    private float formatarValor(JFormattedTextField campo){
        String str = campo.getText().replace(".", "");
        String array[];
        array = str.split(",");
        return Float.parseFloat(array[0] + "." + array[1]);
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
            java.util.logging.Logger.getLogger(FormEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEquipamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSeguinte;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JFormattedTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
