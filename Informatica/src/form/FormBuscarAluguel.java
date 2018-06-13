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

public class FormBuscarAluguel extends javax.swing.JFrame {

   DefaultTableModel modelo1  = null;
   DefaultTableModel modelo2  = null;
   NumberFormat nf;
   List<Aluguel> devolucao = null;
    
    public FormBuscarAluguel() {
        initComponents();
        modelo1 = (DefaultTableModel) tbAluguelRealizado.getModel();
        modelo2 = (DefaultTableModel) tbAvisoVencimento.getModel();
        nf = new DecimalFormat ("R$ #,##0.00", new DecimalFormatSymbols (new Locale ("pt", "BR")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tpMenu = new javax.swing.JTabbedPane();
        jpAluguelRealizado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAluguelRealizado = new javax.swing.JTable();
        jpAvisoVencimento = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAvisoVencimento = new javax.swing.JTable();
        btSair = new javax.swing.JButton();

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

        tpMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tpMenu.setName("tpMenu"); // NOI18N

        jpAluguelRealizado.setName("jpAluguelRealizado"); // NOI18N

        tbAluguelRealizado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Data do Aluguel", "Data do Vencimento", "Valor do Aluguel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
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
        tbAluguelRealizado.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbAluguelRealizado.setName("tbAluguelRealizado"); // NOI18N
        tbAluguelRealizado.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbAluguelRealizado);
        if (tbAluguelRealizado.getColumnModel().getColumnCount() > 0) {
            tbAluguelRealizado.getColumnModel().getColumn(0).setResizable(false);
            tbAluguelRealizado.getColumnModel().getColumn(0).setPreferredWidth(65);
            tbAluguelRealizado.getColumnModel().getColumn(1).setResizable(false);
            tbAluguelRealizado.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbAluguelRealizado.getColumnModel().getColumn(2).setResizable(false);
            tbAluguelRealizado.getColumnModel().getColumn(2).setPreferredWidth(120);
            tbAluguelRealizado.getColumnModel().getColumn(3).setResizable(false);
            tbAluguelRealizado.getColumnModel().getColumn(3).setPreferredWidth(140);
            tbAluguelRealizado.getColumnModel().getColumn(4).setResizable(false);
            tbAluguelRealizado.getColumnModel().getColumn(4).setPreferredWidth(110);
        }

        javax.swing.GroupLayout jpAluguelRealizadoLayout = new javax.swing.GroupLayout(jpAluguelRealizado);
        jpAluguelRealizado.setLayout(jpAluguelRealizadoLayout);
        jpAluguelRealizadoLayout.setHorizontalGroup(
            jpAluguelRealizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAluguelRealizadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpAluguelRealizadoLayout.setVerticalGroup(
            jpAluguelRealizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAluguelRealizadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpMenu.addTab("Aluguéis Realizados", jpAluguelRealizado);

        jpAvisoVencimento.setName("jpAvisoVencimento"); // NOI18N

        tbAvisoVencimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Data do Aluguel", "Data do Vencimento", "Valor do Aluguel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
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
        tbAvisoVencimento.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbAvisoVencimento.setName("tbAvisoVencimento"); // NOI18N
        tbAvisoVencimento.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbAvisoVencimento.getTableHeader().setReorderingAllowed(false);
        tbAvisoVencimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAvisoVencimentoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbAvisoVencimento);
        if (tbAvisoVencimento.getColumnModel().getColumnCount() > 0) {
            tbAvisoVencimento.getColumnModel().getColumn(0).setResizable(false);
            tbAvisoVencimento.getColumnModel().getColumn(0).setPreferredWidth(65);
            tbAvisoVencimento.getColumnModel().getColumn(1).setResizable(false);
            tbAvisoVencimento.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbAvisoVencimento.getColumnModel().getColumn(2).setResizable(false);
            tbAvisoVencimento.getColumnModel().getColumn(2).setPreferredWidth(120);
            tbAvisoVencimento.getColumnModel().getColumn(3).setResizable(false);
            tbAvisoVencimento.getColumnModel().getColumn(3).setPreferredWidth(140);
            tbAvisoVencimento.getColumnModel().getColumn(4).setResizable(false);
            tbAvisoVencimento.getColumnModel().getColumn(4).setPreferredWidth(110);
        }

        javax.swing.GroupLayout jpAvisoVencimentoLayout = new javax.swing.GroupLayout(jpAvisoVencimento);
        jpAvisoVencimento.setLayout(jpAvisoVencimentoLayout);
        jpAvisoVencimentoLayout.setHorizontalGroup(
            jpAvisoVencimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAvisoVencimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpAvisoVencimentoLayout.setVerticalGroup(
            jpAvisoVencimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAvisoVencimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpMenu.addTab("Alugueis em Aberto", jpAvisoVencimento);

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Apps-Dialog-Close-icon.png"))); // NOI18N
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tpMenu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSair)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(tpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(631, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon("src\\logo\\02-Basket-icon 16.png").getImage());
        List<Aluguel> alugueis = FormPrincipal.bdAluguel.todosAlugueis();
        devolucao = FormPrincipal.bdAluguel.todosAlugueis();
        
        for(int i = 0; i < devolucao.size(); i++){
            inserirTabela(devolucao, i, modelo2); 
        }       
                
        /*for(int j = 0; j < alugueis.size(); j++){
            inserirTabela(alugueis, j, modelo2);                          
        }      */
    }//GEN-LAST:event_formWindowOpened

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void tbAvisoVencimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAvisoVencimentoMouseClicked
        int linha = tbAvisoVencimento.getSelectedRow();
        if((tbAvisoVencimento.isCellSelected(linha, 0) || tbAvisoVencimento.isCellSelected(linha, 1) ||
           tbAvisoVencimento.isCellSelected(linha, 2) || tbAvisoVencimento.isCellSelected(linha, 3) ||
           tbAvisoVencimento.isCellSelected(linha, 4)))
        {
            Date dataAtual = new Date(); 
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            tbAvisoVencimento.getModel().getValueAt(linha, 3);
            String vencimento = (String) tbAvisoVencimento.getModel().getValueAt(linha, 3);
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

    private void limparTabela(JTable tabela, DefaultTableModel modelo){
        for(int i = tabela.getRowCount()-1; i >= 0; i--){
            modelo.removeRow(i);
        }
    }
    
    private void inserirTabela(List<Aluguel> alugueis, int i, DefaultTableModel modelo){
        modelo.addRow(new Object[]{
            alugueis.get(i).getNumero(), 
            alugueis.get(i).getCliente().getNome(),
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpAluguelRealizado;
    private javax.swing.JPanel jpAvisoVencimento;
    private javax.swing.JTable tbAluguelRealizado;
    private javax.swing.JTable tbAvisoVencimento;
    private javax.swing.JTabbedPane tpMenu;
    // End of variables declaration//GEN-END:variables
}
