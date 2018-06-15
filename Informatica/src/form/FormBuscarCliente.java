package form;

import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

public class FormBuscarCliente extends javax.swing.JFrame {

    private static Cliente clien = null;
    public static int seletor;
    DefaultTableModel modeloCliente  = null;
    
    public static void setCliente(Cliente clien){
        FormBuscarCliente.clien = clien;
    }
    
    public static Cliente getCliente(){
        return clien;
    }
    
    public FormBuscarCliente() {
        initComponents();
        this.modeloCliente = (DefaultTableModel) tbClientes.getModel();
    }
    
    public static boolean janela = false;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbCPF = new javax.swing.JLabel();
        tfCPF = new javax.swing.JFormattedTextField();
        cboBuscarTodos = new javax.swing.JCheckBox();
        btBuscar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btSelecionar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Cliente");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        lbCPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCPF.setText("CPF:");
        lbCPF.setName("lbCPF"); // NOI18N

        try {
            tfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCPF.setName("tfCPF"); // NOI18N

        cboBuscarTodos.setBackground(new java.awt.Color(250, 250, 250));
        cboBuscarTodos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cboBuscarTodos.setText("Buscar Todos");
        cboBuscarTodos.setName("cboBuscarTodos"); // NOI18N
        cboBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBuscarTodosActionPerformed(evt);
            }
        });

        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-search-icon.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setName("btBuscar"); // NOI18N
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Apps-Dialog-Close-icon.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setName("btSair"); // NOI18N
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btSelecionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user-add-icon.png"))); // NOI18N
        btSelecionar.setText("Selecionar");
        btSelecionar.setEnabled(false);
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-file-icon.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Endereço", "E-mail", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tbClientes.getTableHeader().setReorderingAllowed(false);
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbClientesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbClientes);
        if (tbClientes.getColumnModel().getColumnCount() > 0) {
            tbClientes.getColumnModel().getColumn(0).setResizable(false);
            tbClientes.getColumnModel().getColumn(1).setResizable(false);
            tbClientes.getColumnModel().getColumn(2).setResizable(false);
            tbClientes.getColumnModel().getColumn(3).setResizable(false);
            tbClientes.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton1.setText("Histórico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lbCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboBuscarTodos)
                        .addGap(119, 119, 119)
                        .addComponent(btBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btEditar)
                                .addGap(47, 47, 47)
                                .addComponent(btSelecionar)
                                .addGap(33, 33, 33)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSair))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboBuscarTodos)
                        .addComponent(lbCPF))
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar)
                    .addComponent(btSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(626, 391));
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
        janela = false;
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        btEditar.setEnabled(false); 
        limparTabela();
        Cliente cli;
        if(cboBuscarTodos.isSelected()){
            List<Cliente> cl = FormPrincipal.bdCliente.todosClientes();            
            if(cl.size() > 0){               
                for(int i = 0; i < cl.size(); i++){
                    cli = cl.get(i);
                    inserirTabelaCliente(cli);                    
                }
            }else{
                JOptionPane.showMessageDialog(null, "Não existem clientes cadastrados!", "Informação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            String cpf = tfCPF.getText();
            String cpsSemMascara = cpf.replace(".", "").replace("-", "");
            if(FormCliente.validarCPF(cpsSemMascara)){
                if(!cpsSemMascara.trim().equals("")){
                    Cliente cliente = FormPrincipal.bdCliente.buscaCliente(cpf);
                    if(cliente != null){
                        inserirTabelaCliente(cliente);                                                                       
                    }else{
                        JOptionPane.showMessageDialog(null, "Cliente não cadastrado!", "Informação de Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }else{
                tfCPF.setValue("");
                JOptionPane.showMessageDialog(null, "CPF Inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void inserirTabelaCliente(Cliente cli) {
        modeloCliente.addRow(new Object[]{
            cli.getNome(), 
            cli.getCpf(), 
            cli.getEndereco().getRua() + ", " 
                    + cli.getEndereco().getBairro() + " ," + cli.getEndereco().getCidade(), 
            cli.getEmail(), 
            cli.getTelefone()
        });
    }
    
    private void limparTabela() {
        for (int i = tbClientes.getRowCount() - 1; i >= 0; --i){
            modeloCliente.removeRow(i);
        }
    }

    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
        if(janela == true){
            new FormDevolucao().setVisible(true);
            FormDevolucao.setCliente(getCliente());
            btSairActionPerformed(evt); 
        }else{
            new FormAluguel().setVisible(true);
            FormAluguel.setCliente(getCliente());
            btSairActionPerformed(evt);   
        }
    }//GEN-LAST:event_btSelecionarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        FormCliente.seletor = 1;        
        new FormCliente().setVisible(true);
        FormCliente.setCliente(getCliente());
        this.dispose();
    }//GEN-LAST:event_btEditarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon("src\\logo\\user-search-icon 16.png").getImage());
        tfCPF.requestFocus();
        if(seletor == 0){
            cboBuscarTodos.setEnabled(true);
        }else{
            cboBuscarTodos.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void tbClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMousePressed
        String cpf = (String) (modeloCliente.getValueAt(tbClientes.getSelectedRow(), 1));        
        Cliente cliente = FormPrincipal.bdCliente.buscaCliente(cpf);         
        setCliente(cliente);
        if(seletor == 0){
            btEditar.setEnabled(true);
            btSelecionar.setEnabled(false);
        }else{
            btEditar.setEnabled(false);
            btSelecionar.setEnabled(true);
        }
    }//GEN-LAST:event_tbClientesMousePressed

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
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JCheckBox cboBuscarTodos;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JTable tbClientes;
    private javax.swing.JFormattedTextField tfCPF;
    // End of variables declaration//GEN-END:variables
}
