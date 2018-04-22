/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
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
    
    private static Equipamento eq = null;
    
    public static void setEquipamento(Equipamento eq){
        FormAluguel.eq = eq;
    }
    
    public static Equipamento getEquipamento(){
        return eq;
    }
    
    public int cont = 0;
    
    public FormAluguel() {
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

        jPanel1 = new javax.swing.JPanel();
        btInserirCliente = new javax.swing.JButton();
        tfAdicionarCliente = new javax.swing.JTextField();
        btInserirEquipamento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taInfo = new javax.swing.JTextArea();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();

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

        taInfo.setEditable(false);
        taInfo.setColumns(20);
        taInfo.setLineWrap(true);
        taInfo.setRows(5);
        taInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Equipamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        taInfo.setName("taInfo"); // NOI18N
        jScrollPane1.setViewportView(taInfo);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btAdicionar)
                        .addGap(79, 79, 79)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btInserirEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btInserirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68)
                        .addComponent(tfAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
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
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionar)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(533, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        cli = null;
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btInserirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirClienteActionPerformed
        Cliente cliente = new Cliente();
        FormBuscarCliente.setCliente(cliente);
        new FormBuscarCliente().setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_btInserirClienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(cli != null){
            tfAdicionarCliente.setText(cli.getNome());
            btInserirCliente.setEnabled(false);
        }
        if(eq != null){
            taInfo.setText(eq.toString());
        }
    }//GEN-LAST:event_formWindowOpened

    private void btInserirEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirEquipamentoActionPerformed
        Equipamento equipamento = new Equipamento();
        FormBuscarEquipamento.setEquipamento(equipamento);
        new FormBuscarEquipamento().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btInserirEquipamentoActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        Aluguel aluguel = new Aluguel();
        if((cli != null) && (eq != null)){
            aluguel.setCliente(cli);
            aluguel.adicionaEquipamento(eq);
            aluguel.setIdAluguel(Integer.toString(cont));
            Calendar c = Calendar.getInstance();
            Date data = c.getTime();
            DateFormat formataData = DateFormat.getDateInstance();
            aluguel.setDataAtual(formataData);
            aluguel.setQtAluguel("");
            aluguel.setValorTotal("");
            FormPrincipal.bdAluguel.adicionaAluguel(aluguel);
            JOptionPane.showMessageDialog(null, "Aluguel Adicionado!", "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Adicione cliente e equipamento primeiro!", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfAdicionarCliente.setText("");
        taInfo.setText("");
        btInserirCliente.setEnabled(true);
        cli = null;
        eq = null;
    }//GEN-LAST:event_btLimparActionPerformed

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
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taInfo;
    private javax.swing.JTextField tfAdicionarCliente;
    // End of variables declaration//GEN-END:variables
}
