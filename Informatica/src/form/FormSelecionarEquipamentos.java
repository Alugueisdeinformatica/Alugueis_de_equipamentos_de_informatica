/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Equipamento;
import model.Aluguel;
import model.Computador;
import model.Impressora;
import model.Monitor;
import model.Notebook;
import model.Projetor;
import model.Tablet;
/**
 *
 * @author Luís Gustavo
 */
public class FormSelecionarEquipamentos extends javax.swing.JFrame {

    private static Aluguel alu = null;
    
    public static void setAluguel(Aluguel alu){
        FormSelecionarEquipamentos.alu = alu;
    }
    
    public static Aluguel getAluguel(){
        return alu;
    }
    
    public FormSelecionarEquipamentos() {
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
        lbCategoria = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInserir = new javax.swing.JTable();
        btBuscar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecionar Equipamentos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lbCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCategoria.setText("Categoria:");
        lbCategoria.setName("lbCategoria"); // NOI18N

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desktop", "Impressora", "Monitor", "Notebook", "Projetor", "Tablet" }));
        cbCategoria.setName("cbCategoria"); // NOI18N

        tbInserir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Modelo", "Marca", "Quantidade", "Valor", "Selecionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Boolean.class
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
        tbInserir.setName("tbInserir"); // NOI18N
        tbInserir.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbInserir);
        if (tbInserir.getColumnModel().getColumnCount() > 0) {
            tbInserir.getColumnModel().getColumn(0).setResizable(false);
            tbInserir.getColumnModel().getColumn(1).setResizable(false);
            tbInserir.getColumnModel().getColumn(2).setResizable(false);
            tbInserir.getColumnModel().getColumn(3).setResizable(false);
            tbInserir.getColumnModel().getColumn(4).setResizable(false);
            tbInserir.getColumnModel().getColumn(5).setResizable(false);
        }

        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setName("btBuscar"); // NOI18N
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btInserir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btInserir.setText("Inserir");
        btInserir.setName("btInserir"); // NOI18N
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btInserir)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(88, 88, 88)
                                    .addComponent(btBuscar))
                                .addComponent(lbCategoria)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btInserir)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(525, 476));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        List<Equipamento> equipamentos = FormPrincipal.bdEquipamento.todosEquipamentos();
        if(equipamentos.size() > 0){
            DefaultTableModel modelo = (DefaultTableModel) tbInserir.getModel();
            for (int i = 0; i < equipamentos.size(); i++){
                int escolhe = cbCategoria.getSelectedIndex();
                switch(escolhe){
                    case 0:
                        if(equipamentos.get(i) instanceof Computador){
                            modelo.addRow(new Object[]{equipamentos.get(i).getCodEquipamento(), equipamentos.get(i).getModelo(), equipamentos.get(i).getMarca(),
                            equipamentos.get(i).getQuantEstoque(),equipamentos.get(i).getValorDiaria(), false});
                        };
                        break;
                    case 1:
                        if(equipamentos.get(i) instanceof Impressora){
                            modelo.addRow(new Object[]{equipamentos.get(i).getCodEquipamento(), equipamentos.get(i).getModelo(), equipamentos.get(i).getMarca(),
                            equipamentos.get(i).getQuantEstoque(),equipamentos.get(i).getValorDiaria(), false});
                        };
                        break;
                    case 2:
                        if(equipamentos.get(i) instanceof Monitor){
                            modelo.addRow(new Object[]{equipamentos.get(i).getCodEquipamento(), equipamentos.get(i).getModelo(), equipamentos.get(i).getMarca(),
                            equipamentos.get(i).getQuantEstoque(),equipamentos.get(i).getValorDiaria(), false});
                        };
                        break;
                    case 3:
                        if(equipamentos.get(i) instanceof Notebook){
                            modelo.addRow(new Object[]{equipamentos.get(i).getCodEquipamento(), equipamentos.get(i).getModelo(), equipamentos.get(i).getMarca(),
                            equipamentos.get(i).getQuantEstoque(),equipamentos.get(i).getValorDiaria(), false});
                        };
                        break;
                    case 4:
                        if(equipamentos.get(i) instanceof Projetor){
                            modelo.addRow(new Object[]{equipamentos.get(i).getCodEquipamento(), equipamentos.get(i).getModelo(), equipamentos.get(i).getMarca(),
                            equipamentos.get(i).getQuantEstoque(),equipamentos.get(i).getValorDiaria(), false});
                        };
                        break;
                    case 5:
                        if(equipamentos.get(i) instanceof Tablet){
                            modelo.addRow(new Object[]{equipamentos.get(i).getCodEquipamento(), equipamentos.get(i).getModelo(), equipamentos.get(i).getMarca(),
                            equipamentos.get(i).getQuantEstoque(),equipamentos.get(i).getValorDiaria(), false});
                        };
                        break;
                }
            }
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        if(alu == null){
           if(tbInserir.getRowCount() > 0){
            alu = new Aluguel();
            for (int i = 0; i < tbInserir.getRowCount(); i++)
            {
                boolean selec = (boolean) tbInserir.getValueAt(i, 5);
                if(selec){
                    Object str = tbInserir.getValueAt(i, 0);
                    Equipamento equipamento = FormPrincipal.bdEquipamento.buscaEquipamento((int) str);
                    if(equipamento != null){
                        alu.adicionaEquipamento(equipamento);
                    }
                }
            }
            FormAluguel.setAluguel(alu);
            }
        }else{
            if(tbInserir.getRowCount() > 0){
            for (int i = 0; i < tbInserir.getRowCount(); i++)
            {
                boolean selec = (boolean) tbInserir.getValueAt(i, 5);
                if(selec){
                    Object str = tbInserir.getValueAt(i, 0);
                    Equipamento equipamento = FormPrincipal.bdEquipamento.buscaEquipamento((int) str);
                    if(equipamento != null){
                        alu.adicionaEquipamento(equipamento);
                    }
                }
            }
            FormAluguel.setAluguel(alu);
            }
        }
        new FormAluguel().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btInserirActionPerformed

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
            java.util.logging.Logger.getLogger(FormSelecionarEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSelecionarEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSelecionarEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSelecionarEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSelecionarEquipamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btInserir;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JTable tbInserir;
    // End of variables declaration//GEN-END:variables
}