package form;

import java.awt.Color;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Aluguel;
import model.Cliente;

public class FormBuscarAluguel extends javax.swing.JFrame {

   DefaultTableModel modeloAluguel  = null;
   NumberFormat nf;
   List<Aluguel> devolucao = null;
   Cliente clien = null;

    public void setClien(Cliente clien) {
        this.clien = clien;
    }  
    
    public FormBuscarAluguel() {
        initComponents();
        modeloAluguel = (DefaultTableModel) tbAvisoVencimento.getModel();
        nf = new DecimalFormat ("R$ #,##0.00", new DecimalFormatSymbols (new Locale ("pt", "BR")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btSair = new javax.swing.JButton();
        jPanelAluguelAberto = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAvisoVencimento = new javax.swing.JTable();
        jPanelLegenda = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Aluguel");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Apps-Dialog-Close-icon.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setName("btSair"); // NOI18N
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jPanelAluguelAberto.setBackground(new java.awt.Color(250, 250, 250));
        jPanelAluguelAberto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aluguéis em Aberto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jScrollPane2.setBackground(new java.awt.Color(250, 250, 250));

        tbAvisoVencimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "CPF", "Data do Aluguel", "Data do Vencimento", "Valor do Aluguel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAvisoVencimento.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbAvisoVencimento.setName("tbAvisoVencimento"); // NOI18N
        tbAvisoVencimento.setSelectionBackground(new java.awt.Color(51, 102, 255));
        tbAvisoVencimento.getTableHeader().setReorderingAllowed(false);
        tbAvisoVencimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAvisoVencimentoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbAvisoVencimento);
        if (tbAvisoVencimento.getColumnModel().getColumnCount() > 0) {
            tbAvisoVencimento.getColumnModel().getColumn(0).setResizable(false);
            tbAvisoVencimento.getColumnModel().getColumn(0).setPreferredWidth(55);
            tbAvisoVencimento.getColumnModel().getColumn(1).setResizable(false);
            tbAvisoVencimento.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbAvisoVencimento.getColumnModel().getColumn(2).setResizable(false);
            tbAvisoVencimento.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbAvisoVencimento.getColumnModel().getColumn(3).setResizable(false);
            tbAvisoVencimento.getColumnModel().getColumn(3).setPreferredWidth(120);
            tbAvisoVencimento.getColumnModel().getColumn(4).setResizable(false);
            tbAvisoVencimento.getColumnModel().getColumn(4).setPreferredWidth(138);
            tbAvisoVencimento.getColumnModel().getColumn(5).setResizable(false);
            tbAvisoVencimento.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanelAluguelAbertoLayout = new javax.swing.GroupLayout(jPanelAluguelAberto);
        jPanelAluguelAberto.setLayout(jPanelAluguelAbertoLayout);
        jPanelAluguelAbertoLayout.setHorizontalGroup(
            jPanelAluguelAbertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAluguelAbertoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAluguelAbertoLayout.setVerticalGroup(
            jPanelAluguelAbertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAluguelAbertoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelLegenda.setBackground(new java.awt.Color(250, 250, 250));
        jPanelLegenda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Legenda de Aluguéis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(65, 105, 225));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(220, 20, 60));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(250, 250, 250));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Aluguéis no Prazo");

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Aluguéis em Atraso");

        javax.swing.GroupLayout jPanelLegendaLayout = new javax.swing.GroupLayout(jPanelLegenda);
        jPanelLegenda.setLayout(jPanelLegendaLayout);
        jPanelLegendaLayout.setHorizontalGroup(
            jPanelLegendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLegendaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelLegendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLegendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        jPanelLegendaLayout.setVerticalGroup(
            jPanelLegendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLegendaLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanelLegendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(jPanelLegendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)))
        );

        btSelecionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/symbol-check-icon.png"))); // NOI18N
        btSelecionar.setText("Efetuar Devolução");
        btSelecionar.setEnabled(false);
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelAluguelAberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelLegenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(btSelecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSair)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanelAluguelAberto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSair)
                            .addComponent(btSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelLegenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(744, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon("src\\logo\\02-Basket-icon 16.png").getImage());
        List<Aluguel> alugueis = FormPrincipal.bdAluguel.todosAlugueis();        
        for(int i = 0; i < alugueis.size(); i++){
            inserirTabela(alugueis, i, modeloAluguel); 
        } 
    }//GEN-LAST:event_formWindowOpened

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void tbAvisoVencimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAvisoVencimentoMouseClicked
        int linha = tbAvisoVencimento.getSelectedRow();        
        String cpf = (String) tbAvisoVencimento.getModel().getValueAt(linha, 2);
        Cliente cliente = FormPrincipal.bdCliente.buscaCliente(cpf);
        setClien(cliente);
        btSelecionar.setEnabled(true);
        
        if((tbAvisoVencimento.isCellSelected(linha, 0) || tbAvisoVencimento.isCellSelected(linha, 1) ||
            tbAvisoVencimento.isCellSelected(linha, 2) || tbAvisoVencimento.isCellSelected(linha, 3) ||
            tbAvisoVencimento.isCellSelected(linha, 4) || tbAvisoVencimento.isCellSelected(linha, 5) )){
            Date dataAtual = new Date();
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            tbAvisoVencimento.getModel().getValueAt(linha, 4);
            String vencimento = (String) tbAvisoVencimento.getModel().getValueAt(linha, 4);        
            Date v = null;
            try {
                v = formatador.parse(vencimento);
            } catch (ParseException ex) {
                Logger.getLogger(FormBuscarAluguel.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(verificaVencimento(dataAtual, v)){
                colorirTabela(true);
            }else{
                colorirTabela(false);
            }
        }
    }//GEN-LAST:event_tbAvisoVencimentoMouseClicked

    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
        new FormDevolucao().setVisible(true);
        FormDevolucao.setCliente(clien);
        btSairActionPerformed(evt);
    }//GEN-LAST:event_btSelecionarActionPerformed

    private void limparTabela(JTable tabela, DefaultTableModel modelo){
        for(int i = tabela.getRowCount()-1; i >= 0; i--){
            modelo.removeRow(i);
        }
    }
    
    private void inserirTabela(List<Aluguel> alugueis, int i, DefaultTableModel modelo){
        modelo.addRow(new Object[]{
            alugueis.get(i).getNumero(), 
            alugueis.get(i).getCliente().getNome(),
            alugueis.get(i).getCliente().getCpf(),
            formataData(alugueis.get(i).getDataAluguel()), 
            formataData(alugueis.get(i).dataDevolucao()), 
            nf.format(alugueis.get(i).getValorTotal())
        });
    }
    
    private String formataData(Date data){
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        String str = fm.format(data);
        return str;
    }
    
    private boolean verificaVencimento(Date emissao, Date vencimento){
	boolean venceu = false;
        if (emissao.before(vencimento)){
            venceu = true;
	}
	else if (emissao.after(vencimento)){
            venceu = false;
        }
        return venceu;
    }
    
    private void colorirTabela(boolean venceu){
        if(venceu){
            tbAvisoVencimento.setSelectionBackground(new Color(65,105,225));
        }else{
            tbAvisoVencimento.setSelectionBackground(new Color(220,20,60));
        }
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
            java.util.logging.Logger.getLogger(FormBuscarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuscarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuscarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuscarAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuscarAluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelAluguelAberto;
    private javax.swing.JPanel jPanelLegenda;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbAvisoVencimento;
    // End of variables declaration//GEN-END:variables
}
