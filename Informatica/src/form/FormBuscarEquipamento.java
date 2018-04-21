/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.util.List;
import javax.swing.JOptionPane;
import model.Equipamento;

/**
 *
 * @author John Peter
 */
public class FormBuscarEquipamento extends javax.swing.JFrame {

    private static Equipamento equi = null;
    
    public static void setEquipamento(Equipamento equi){
        FormBuscarEquipamento.equi = equi;
    }
    
    public static Equipamento getEquipamento(){
        return equi;
    }
    
    public FormBuscarEquipamento() {
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

        btBuscar = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taConsulta = new javax.swing.JTextArea();
        tfCodigo = new javax.swing.JTextField();
        cboBuscarTodos = new javax.swing.JCheckBox();
        lbBuscarTodos = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Equipamento");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
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

        lbCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCodigo.setText("Codigo:");
        lbCodigo.setName("lbCodigo"); // NOI18N

        taConsulta.setEditable(false);
        taConsulta.setColumns(20);
        taConsulta.setLineWrap(true);
        taConsulta.setRows(5);
        taConsulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setViewportView(taConsulta);

        cboBuscarTodos.setName("cboBuscarTodos"); // NOI18N
        cboBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBuscarTodosActionPerformed(evt);
            }
        });

        lbBuscarTodos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbBuscarTodos.setText("Buscar Todos");
        lbBuscarTodos.setName("lbBuscarTodos"); // NOI18N

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setText("Sair");
        btSair.setName("btSair"); // NOI18N
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbCodigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                                        .addComponent(lbBuscarTodos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(cboBuscarTodos)
                                .addGap(67, 67, 67)
                                .addComponent(btBuscar)))))
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbCodigo)
                            .addComponent(lbBuscarTodos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboBuscarTodos)
                    .addComponent(btBuscar))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btSair)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(678, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        if(cboBuscarTodos.isSelected()){
            List<Equipamento> eq = FormPrincipal.bdEquipamento.todosEquipamentos();
            if(eq.size() > 0){
                String recebe = "";
                for(int i = 0; i < eq.size(); i++){
                    recebe = recebe + eq.get(i).toString() + "\n\n";
                }
                taConsulta.setText(recebe);
            }else{
                JOptionPane.showMessageDialog(null, "Não existem equipamentos cadastrados!", "Informação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            if(!tfCodigo.getText().trim().equals("")){
                Equipamento equipamento = FormPrincipal.bdEquipamento.buscaEquipamento(Integer.parseInt(tfCodigo.getText()));
                if(equipamento != null){
                    taConsulta.setText(equipamento.toString());
                }else{
                    JOptionPane.showMessageDialog(null, "Equipamento não cadastrado!", "Informação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Informe o Código!", "Campo não Preenchido", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void cboBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBuscarTodosActionPerformed
        if(cboBuscarTodos.isSelected()){
            tfCodigo.setEnabled(false);
        }else{
            tfCodigo.setEnabled(true);
        }
    }//GEN-LAST:event_cboBuscarTodosActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        equi = FormPrincipal.bdEquipamento.buscaEquipamento(Integer.parseInt(tfCodigo.getText()));
        if(equi != null){
            FormAluguel.setEquipamento(equi);
            new FormAluguel().setVisible(true);
        }
        equi = null;
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(equi != null){
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
            java.util.logging.Logger.getLogger(FormBuscarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuscarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuscarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuscarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuscarEquipamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btSair;
    private javax.swing.JCheckBox cboBuscarTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBuscarTodos;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JTextArea taConsulta;
    private javax.swing.JTextField tfCodigo;
    // End of variables declaration//GEN-END:variables
}
