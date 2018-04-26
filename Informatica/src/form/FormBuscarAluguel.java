/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author Luís Gustavo
 */
public class FormBuscarAluguel extends javax.swing.JFrame {

    /**
     * Creates new form FormBuscarAluguel
     */
    public FormBuscarAluguel() {
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
        tpMenu = new javax.swing.JTabbedPane();
        jpAluguelRealizado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAluguelRealizado = new javax.swing.JTable();
        jpAvisoVencimento = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbAvisoVencimento = new javax.swing.JTable();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Aluguel");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tpMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tpMenu.setName("tpMenu"); // NOI18N

        jpAluguelRealizado.setName("jpAluguelRealizado"); // NOI18N

        tbAluguelRealizado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Dia do Aluguel", "Dia do Vencimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAluguelRealizado.setName("tbAluguelRealizado"); // NOI18N
        jScrollPane1.setViewportView(tbAluguelRealizado);
        if (tbAluguelRealizado.getColumnModel().getColumnCount() > 0) {
            tbAluguelRealizado.getColumnModel().getColumn(0).setResizable(false);
            tbAluguelRealizado.getColumnModel().getColumn(1).setResizable(false);
            tbAluguelRealizado.getColumnModel().getColumn(2).setResizable(false);
            tbAluguelRealizado.getColumnModel().getColumn(3).setResizable(false);
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
                "ID", "Cliente", "Dia do Aluguel", "Dia do Vencimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAvisoVencimento.setName("tbAvisoVencimento"); // NOI18N
        jScrollPane2.setViewportView(tbAvisoVencimento);
        if (tbAvisoVencimento.getColumnModel().getColumnCount() > 0) {
            tbAvisoVencimento.getColumnModel().getColumn(0).setResizable(false);
            tbAvisoVencimento.getColumnModel().getColumn(1).setResizable(false);
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

        tpMenu.addTab("Avisos de Vencimento", jpAvisoVencimento);

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setText("Sair");
        btSair.setName("btSair"); // NOI18N

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

        setSize(new java.awt.Dimension(631, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
