package form;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.event.HyperlinkEvent;

public class FormAjuda extends javax.swing.JFrame {
    
    public FormAjuda() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeAjuda = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpVisualizar = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajuda");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        treeAjuda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Ajuda");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Cadastro");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Novo Cliente");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Novo Equipamento");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Consulta");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Clientes");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Equipamentos");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Alugueis");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Aluguel");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Novo Aluguel");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Emitir Nota Fiscal");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Efetuar Devolução");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeAjuda.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        treeAjuda.setRootVisible(false);
        treeAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeAjudaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(treeAjuda);

        tpVisualizar.setEditable(false);
        tpVisualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tpVisualizar.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                tpVisualizarHyperlinkUpdate(evt);
            }
        });
        jScrollPane2.setViewportView(tpVisualizar);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        lbLogo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/my-computer-icon 64.png"))); // NOI18N
        lbLogo.setText("J&L INFORMÁTICA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(916, 684));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void treeAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeAjudaMouseClicked
        String menu = null;
        try{
            menu = treeAjuda.getLastSelectedPathComponent().toString();
            tpVisualizar.setContentType("text/html");
        }catch (java.lang.NullPointerException exception){
                        
        }
        
        File arq;        
        if(menu != null){
            arq = new File("src\\HTML\\"+ menu +".html");
            try {
                tpVisualizar.setPage(arq.toURI().toURL());
            } catch (IOException ex) {
                Logger.getLogger(FormAjuda.class.getName()).log(Level.SEVERE, null, ex);
            }      
        }
    }//GEN-LAST:event_treeAjudaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon("src\\logo\\Button-Help-icon 16.png").getImage());
        tpVisualizar.setContentType("text/html");        
        
        File arq = new File("src\\HTML\\index.html");       
        if(arq != null){            
            try {
                tpVisualizar.setPage(arq.toURI().toURL());
            } catch (IOException ex) {
                Logger.getLogger(FormAjuda.class.getName()).log(Level.SEVERE, null, ex);
            }      
        }
    }//GEN-LAST:event_formWindowOpened

    private void tpVisualizarHyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_tpVisualizarHyperlinkUpdate
        if (evt.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            try {
                tpVisualizar.setPage(evt.getURL());
            } catch (IOException e1) {
                e1.printStackTrace();
            }           
        }
    }//GEN-LAST:event_tpVisualizarHyperlinkUpdate

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
            java.util.logging.Logger.getLogger(FormAjuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAjuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAjuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAjuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAjuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JTextPane tpVisualizar;
    private javax.swing.JTree treeAjuda;
    // End of variables declaration//GEN-END:variables
}
