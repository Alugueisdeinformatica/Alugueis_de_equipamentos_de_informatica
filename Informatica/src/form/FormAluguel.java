/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Aluguel;
import model.Cliente;
import model.Equipamento;

/**
 *
 * @author Luís Gustavo
 */
public class FormAluguel extends javax.swing.JFrame {

    private static Cliente cli = null;
    
    public static void setCliente(Cliente cli){
        FormAluguel.cli = cli;
    }
    
    public static Cliente getCliente(){
        return cli;
    }
    
    private static Aluguel al = null;
    
    public static void setAluguel(Aluguel al){
        FormAluguel.al = al;
    }
    
    public static Aluguel getAluguel(){
        return al;
    }
    
    DefaultTableModel modelo  = null;
    
    public int cont = 0;
    
    public FormAluguel() {
        initComponents();
        modelo = (DefaultTableModel) tbInfo.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btInserirCliente = new javax.swing.JButton();
        tfAdicionarCliente = new javax.swing.JTextField();
        btInserirEquipamento = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInfo = new javax.swing.JTable();
        btRemover = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        lbDias = new javax.swing.JLabel();
        tfDias = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Aluguel");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btInserirCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btInserirCliente.setText("Inserir Cliente");
        btInserirCliente.setName("btInserirCliente"); // NOI18N
        btInserirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirClienteActionPerformed(evt);
            }
        });

        tfAdicionarCliente.setEditable(false);
        tfAdicionarCliente.setName("tfAdicionarCliente"); // NOI18N

        btInserirEquipamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btInserirEquipamento.setText("Inserir Equipamento");
        btInserirEquipamento.setName("btInserirEquipamento"); // NOI18N
        btInserirEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirEquipamentoActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setMaximumSize(new java.awt.Dimension(85, 23));
        btLimpar.setName("btLimpar"); // NOI18N
        btLimpar.setPreferredSize(new java.awt.Dimension(85, 23));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setText("Sair");
        btSair.setMaximumSize(new java.awt.Dimension(85, 23));
        btSair.setName("btSair"); // NOI18N
        btSair.setPreferredSize(new java.awt.Dimension(85, 23));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btAdicionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btAdicionar.setText("Adicionar");
        btAdicionar.setName("btAdicionar"); // NOI18N
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Categoria", "Modelo", "Marca", "Valor", "Selecionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbInfo.setName("tbInfo"); // NOI18N
        jScrollPane1.setViewportView(tbInfo);
        if (tbInfo.getColumnModel().getColumnCount() > 0) {
            tbInfo.getColumnModel().getColumn(0).setResizable(false);
            tbInfo.getColumnModel().getColumn(1).setResizable(false);
            tbInfo.getColumnModel().getColumn(2).setResizable(false);
            tbInfo.getColumnModel().getColumn(3).setResizable(false);
            tbInfo.getColumnModel().getColumn(4).setResizable(false);
            tbInfo.getColumnModel().getColumn(5).setResizable(false);
        }

        btRemover.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btRemover.setText("Remover");
        btRemover.setEnabled(false);
        btRemover.setName("btRemover"); // NOI18N
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        lbTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTotal.setText("Total:");
        lbTotal.setName("lbTotal"); // NOI18N

        tfTotal.setEditable(false);
        tfTotal.setText("0");
        tfTotal.setName("tfTotal"); // NOI18N

        lbDias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDias.setText("Dias:");
        lbDias.setName("lbDias"); // NOI18N

        tfDias.setText("0");
        tfDias.setName("tfDias"); // NOI18N
        tfDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDiasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDiasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btInserirEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btInserirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68)
                        .addComponent(tfAdicionarCliente))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btRemover)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbDias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserirCliente)
                    .addComponent(tfAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btInserirEquipamento)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotal)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDias)
                    .addComponent(tfDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionar)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover))
                .addGap(53, 53, 53))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(533, 491));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        cli = null;
        al = null;
        FormSelecionarEquipamentos.setAluguel(null);
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btInserirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirClienteActionPerformed
        Cliente cliente = new Cliente();
        FormBuscarCliente.setCliente(cliente);
        new FormBuscarCliente().setVisible(true);
        this.setVisible(false);
        //this.setVisible(false);
    }//GEN-LAST:event_btInserirClienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(cli != null){
            tfAdicionarCliente.setText(cli.getNome());
            btInserirCliente.setEnabled(false);
        }
        if(al != null){
            for(int i = 0; i < al.todosEquipamentos().size(); i++){
                inserirTabela(al.todosEquipamentos(), i);
                btRemover.setEnabled(true);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btInserirEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirEquipamentoActionPerformed
        FormAluguel.setAluguel(al);
        new FormSelecionarEquipamentos().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btInserirEquipamentoActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        if((cli != null) && (al != null)){
            if(Integer.parseInt(tfDias.getText()) > 0){
                int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar o aluguel?", "", JOptionPane.YES_NO_OPTION);
                if(opcao == 0){
                    al.setCliente(cli);
                    al.setIdAluguel(Integer.toString(cont));
                    Calendar c = Calendar.getInstance();
                    Date data = c.getTime();
                    al.setDataAtual(data);
                    al.setDias(tfDias.getText());
                    FormPrincipal.bdAluguel.adicionaAluguel(al);
                    JOptionPane.showMessageDialog(null, "Aluguel Adicionado!", "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
                    tfDias.setEnabled(false);
                    btAdicionar.setEnabled(false);
                    btInserirEquipamento.setEnabled(false);
                    tbInfo.setEnabled(false);
                }   
            }else{
                JOptionPane.showMessageDialog(null, "Preencha a quantidade de dias!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }                     
        }else{
            JOptionPane.showMessageDialog(null, "Adicione cliente e equipamento primeiro!", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfAdicionarCliente.setText("");
        btInserirCliente.setEnabled(true);
        tfDias.setText("0");
        tfTotal.setText("0");
        btRemover.setEnabled(false);
        btAdicionar.setEnabled(true);
        btInserirEquipamento.setEnabled(true);
        tfDias.setEnabled(true);
        tbInfo.setEnabled(true);
        limparTabela();
        cli = null;
        al = null;
        FormSelecionarEquipamentos.setAluguel(null);
    }//GEN-LAST:event_btLimparActionPerformed

    private void tfDiasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDiasKeyReleased
        if(al != null){
            al.total(tfDias.getText());
            tfTotal.setText(Double.toString(al.getValorTotal()));
        }
    }//GEN-LAST:event_tfDiasKeyReleased

    private void tfDiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDiasKeyTyped
        String caracteres= "0987654321";
        if(!caracteres.contains(evt.getKeyChar() + "")){
            evt.consume();
        }
    }//GEN-LAST:event_tfDiasKeyTyped

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        if(al != null){            
            if(verificaSelecionado()){
                for(int i = 0; i < modelo.getRowCount(); i++){
                    boolean selec = (boolean) modelo.getValueAt(i, 5);
                    if(selec){
                        int cod = (int) modelo.getValueAt(i, 0);
                        al.removerEquipamento(cod);
                        modelo.removeRow(i);
                        i--;
                        al.total(tfDias.getText());
                        tfTotal.setText(Double.toString(al.getValorTotal()));
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Selecione um equipamento para remover!", "Atenção", JOptionPane.ERROR_MESSAGE);
            }            
            if(modelo.getRowCount() == 0){
                btRemover.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void limparTabela(){
        for(int i = tbInfo.getRowCount()-1; i >= 0; i--){
            modelo.removeRow(i);
        }
    }
    
    private void inserirTabela(List<Equipamento> equipamentos, int i){
        modelo.addRow(new Object[]{equipamentos.get(i).getCodEquipamento(), equipamentos.get(i).getCategoria(), 
        equipamentos.get(i).getModelo(), equipamentos.get(i).getMarca(), equipamentos.get(i).getValorDiaria(),
        false});
    }
    
    private Equipamento getEquipamento(){
        return null;
    }
    
    private boolean verificaSelecionado(){
        boolean recebe = false;
        for(int i = 0; i < modelo.getRowCount(); i++){
            boolean selec = (boolean) modelo.getValueAt(i, 5);
            if(selec){
                recebe = true;
            }
        }
        return recebe;
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
            java.util.logging.Logger.getLogger(FormAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btInserirCliente;
    private javax.swing.JButton btInserirEquipamento;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDias;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tbInfo;
    private javax.swing.JTextField tfAdicionarCliente;
    private javax.swing.JTextField tfDias;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
