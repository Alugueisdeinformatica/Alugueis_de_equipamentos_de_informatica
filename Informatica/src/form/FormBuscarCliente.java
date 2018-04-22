/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author Luís Gustavo
 */
public class FormBuscarCliente extends javax.swing.JFrame {

    private static Cliente clien = null;
    
    public static void setCliente(Cliente clien){
        FormBuscarCliente.clien = clien;
    }
    
    public static Cliente getCliente(){
        return clien;
    }
    
    public FormBuscarCliente() {
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
        lbCPF = new javax.swing.JLabel();
        tfCPF = new javax.swing.JFormattedTextField();
        lbBuscarTodos = new javax.swing.JLabel();
        cboBuscarTodos = new javax.swing.JCheckBox();
        btBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taBusca = new javax.swing.JTextArea();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Cliente");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbCPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCPF.setText("CPF:");
        lbCPF.setName("lbCPF"); // NOI18N

        try {
            tfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCPF.setName("tfCPF"); // NOI18N

        lbBuscarTodos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbBuscarTodos.setText("Buscar Todos");
        lbBuscarTodos.setName("lbBuscarTodos"); // NOI18N

        cboBuscarTodos.setName("cboBuscarTodos"); // NOI18N
        cboBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBuscarTodosActionPerformed(evt);
            }
        });

        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setName("btBuscar"); // NOI18N
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        taBusca.setEditable(false);
        taBusca.setColumns(20);
        taBusca.setLineWrap(true);
        taBusca.setRows(5);
        taBusca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        taBusca.setName("taBusca"); // NOI18N
        jScrollPane1.setViewportView(taBusca);

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setText("Sair");
        btSair.setName("btSair"); // NOI18N
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
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSair)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbCPF)
                            .addGap(173, 173, 173)
                            .addComponent(lbBuscarTodos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cboBuscarTodos)
                            .addGap(88, 88, 88)
                            .addComponent(btBuscar))
                        .addComponent(jScrollPane1)
                        .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCPF)
                            .addComponent(lbBuscarTodos)
                            .addComponent(cboBuscarTodos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btSair)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(614, 361));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBuscarTodosActionPerformed
        if(cboBuscarTodos.isSelected()){
            tfCPF.setEnabled(false);
        }else{
            tfCPF.setEnabled(true);
        }
    }//GEN-LAST:event_cboBuscarTodosActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        clien = FormPrincipal.bdCliente.buscaCliente(tfCPF.getText());
        if(clien != null){
            FormAluguel.setCliente(clien);
            new FormAluguel().setVisible(true);
        }
        clien = null;
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        if(cboBuscarTodos.isSelected()){
            List<Cliente> cl = FormPrincipal.bdCliente.todosClientes();
            if(cl.size() > 0){
                String recebe = "";
                for(int i = 0; i < cl.size(); i++){
                    recebe = recebe + cl.get(i).toString() + "\n\n";
                }
                taBusca.setText(recebe);
            }else{
                JOptionPane.showMessageDialog(null, "Não existem clientes cadastrados!", "Informação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            String cpsSemMascara = tfCPF.getText().replace(".", "").replace("-", "");
            if(!cpsSemMascara.trim().equals("")){
                Cliente cliente = FormPrincipal.bdCliente.buscaCliente(tfCPF.getText());
                if(cliente != null){
                    taBusca.setText(cliente.toString());
                }else{
                    JOptionPane.showMessageDialog(null, "Cliente não cadastrado!", "Informação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Informe o CPF!", "Campo não Preenchido", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(clien != null){
            cboBuscarTodos.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FormBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuscarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btSair;
    private javax.swing.JCheckBox cboBuscarTodos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBuscarTodos;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JTextArea taBusca;
    private javax.swing.JFormattedTextField tfCPF;
    // End of variables declaration//GEN-END:variables
}
