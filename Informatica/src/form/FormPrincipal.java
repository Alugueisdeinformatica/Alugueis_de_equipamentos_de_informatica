/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import dao.AluguelDao;
import dao.ClienteDao;
import dao.EquipamentoDao;
import javax.swing.JOptionPane;

/**
 *
 * @author John Peter
 */
public class FormPrincipal extends javax.swing.JFrame {
    
    public static EquipamentoDao bdEquipamento;
    public static ClienteDao bdCliente;
    public static AluguelDao bdAluguel;
    public static int codAluguel;

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        bdEquipamento = new EquipamentoDao();
        bdCliente = new ClienteDao();
        bdAluguel = new AluguelDao();
        codAluguel = 10000;
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
        jPanelCentro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelNorte = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btCliente = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btEquipamento = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btAluguel = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btSair = new javax.swing.JButton();
        jPanelSul = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuCadastro = new javax.swing.JMenu();
        JMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemEquipamento = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JMenuItemSair = new javax.swing.JMenuItem();
        jMenuAluguel = new javax.swing.JMenu();
        jMenuItemNovo = new javax.swing.JMenuItem();
        jMenuItemEmitir = new javax.swing.JMenuItem();
        jMenuItemEfetuar = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemEquipamentos = new javax.swing.JMenuItem();
        JMenuItemAlugueis = new javax.swing.JMenuItem();
        JMenuSuporte = new javax.swing.JMenu();
        JMenuItemAjuda = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        JMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equipamentos de Informática");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanelCentro.setBackground(new java.awt.Color(250, 250, 250));
        jPanelCentro.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/my-computer-icon.png"))); // NOI18N
        jLabel1.setText("J&L INFORMÁTICA");
        jPanelCentro.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/computer-stuff-1-e1465742115813.png"))); // NOI18N
        jPanelCentro.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanelCentro, java.awt.BorderLayout.CENTER);

        jPanelNorte.setBackground(new java.awt.Color(250, 250, 250));
        jPanelNorte.setLayout(new javax.swing.BoxLayout(jPanelNorte, javax.swing.BoxLayout.LINE_AXIS));

        jToolBar1.setBackground(new java.awt.Color(204, 255, 255));
        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/user-add-icon.png"))); // NOI18N
        btCliente.setText("Novo Cliente");
        btCliente.setFocusable(false);
        btCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente.setName("btCliente"); // NOI18N
        btCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(btCliente);
        jToolBar1.add(jSeparator4);

        btEquipamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/my-computer-icon.png"))); // NOI18N
        btEquipamento.setText("Novo Equipamento");
        btEquipamento.setFocusable(false);
        btEquipamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEquipamento.setName("btEquipamento"); // NOI18N
        btEquipamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEquipamentoActionPerformed(evt);
            }
        });
        jToolBar1.add(btEquipamento);
        jToolBar1.add(jSeparator3);

        btAluguel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btAluguel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/02-Basket-icon.png"))); // NOI18N
        btAluguel.setText("Novo Aluguel");
        btAluguel.setFocusable(false);
        btAluguel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAluguel.setName("btAluguel"); // NOI18N
        btAluguel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAluguelActionPerformed(evt);
            }
        });
        jToolBar1.add(btAluguel);
        jToolBar1.add(jSeparator5);

        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/symbol-delete-icon.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setName("btSair"); // NOI18N
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jToolBar1.add(btSair);

        jPanelNorte.add(jToolBar1);

        jPanel1.add(jPanelNorte, java.awt.BorderLayout.PAGE_START);

        jPanelSul.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout jPanelSulLayout = new javax.swing.GroupLayout(jPanelSul);
        jPanelSul.setLayout(jPanelSulLayout);
        jPanelSulLayout.setHorizontalGroup(
            jPanelSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );
        jPanelSulLayout.setVerticalGroup(
            jPanelSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelSul, java.awt.BorderLayout.PAGE_END);

        JMenuCadastro.setText("Cadastro");
        JMenuCadastro.setName("JMenuCadastro"); // NOI18N

        JMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/user-add-icon 16.png"))); // NOI18N
        JMenuItemCliente.setText("Novo Cliente");
        JMenuItemCliente.setName("JMenuItemCliente"); // NOI18N
        JMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemClienteActionPerformed(evt);
            }
        });
        JMenuCadastro.add(JMenuItemCliente);

        jMenuItemEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/my-computer-icon 16.png"))); // NOI18N
        jMenuItemEquipamento.setText("Novo Equipamento");
        jMenuItemEquipamento.setName("jMenuItemEquipamento"); // NOI18N
        jMenuItemEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEquipamentoActionPerformed(evt);
            }
        });
        JMenuCadastro.add(jMenuItemEquipamento);
        JMenuCadastro.add(jSeparator1);

        JMenuItemSair.setText("Sair");
        JMenuItemSair.setName("JMenuItemSair"); // NOI18N
        JMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemSairActionPerformed(evt);
            }
        });
        JMenuCadastro.add(JMenuItemSair);

        jMenuBar1.add(JMenuCadastro);

        jMenuAluguel.setText("Aluguel");
        jMenuAluguel.setName("jMenuAluguel"); // NOI18N

        jMenuItemNovo.setText("Novo Aluguel");
        jMenuItemNovo.setName("jMenuItemNovo"); // NOI18N
        jMenuItemNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoActionPerformed(evt);
            }
        });
        jMenuAluguel.add(jMenuItemNovo);

        jMenuItemEmitir.setText("Emitir Contrato");
        jMenuItemEmitir.setName("jMenuItemEmitir"); // NOI18N
        jMenuAluguel.add(jMenuItemEmitir);

        jMenuItemEfetuar.setText("Efetuar Devolução");
        jMenuItemEfetuar.setName("jMenuItemEfetuar"); // NOI18N
        jMenuAluguel.add(jMenuItemEfetuar);

        jMenuBar1.add(jMenuAluguel);

        jMenuConsulta.setText("Consulta");
        jMenuConsulta.setName("jMenuConsulta"); // NOI18N

        jMenuItemClientes.setText("Clientes");
        jMenuItemClientes.setName("jMenuItemClientes"); // NOI18N
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemClientes);

        jMenuItemEquipamentos.setText("Equipamentos");
        jMenuItemEquipamentos.setName("jMenuItemEquipamentos"); // NOI18N
        jMenuItemEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEquipamentosActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemEquipamentos);

        JMenuItemAlugueis.setText("Aluguéis");
        JMenuItemAlugueis.setName("JMenuItemAlugueis"); // NOI18N
        JMenuItemAlugueis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemAlugueisActionPerformed(evt);
            }
        });
        jMenuConsulta.add(JMenuItemAlugueis);

        jMenuBar1.add(jMenuConsulta);

        JMenuSuporte.setText("Suporte");
        JMenuSuporte.setName("JMenuSuporte"); // NOI18N

        JMenuItemAjuda.setText("Ajuda");
        JMenuItemAjuda.setName("JMenuItemAjuda"); // NOI18N
        JMenuSuporte.add(JMenuItemAjuda);
        JMenuSuporte.add(jSeparator2);

        JMenuItemSobre.setText("Sobre");
        JMenuItemSobre.setName("JMenuItemSobre"); // NOI18N
        JMenuSuporte.add(JMenuItemSobre);

        jMenuBar1.add(JMenuSuporte);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(772, 669));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void JMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JMenuItemSairActionPerformed

    private void JMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemClienteActionPerformed
        new FormCliente().setVisible(true);
    }//GEN-LAST:event_JMenuItemClienteActionPerformed

    private void jMenuItemEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEquipamentoActionPerformed
        new FormEquipamento().setVisible(true);
    }//GEN-LAST:event_jMenuItemEquipamentoActionPerformed

    private void jMenuItemEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEquipamentosActionPerformed
        new FormBuscarEquipamento().setVisible(true);
    }//GEN-LAST:event_jMenuItemEquipamentosActionPerformed

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
        JMenuItemClienteActionPerformed(evt);
    }//GEN-LAST:event_btClienteActionPerformed

    private void btEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEquipamentoActionPerformed
        jMenuItemEquipamentoActionPerformed(evt);
    }//GEN-LAST:event_btEquipamentoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        Object[] options = {"Sim", "Não"};
        int decisao = JOptionPane.showOptionDialog(null, "Deseja finalizar a aplicação?", "ATENÇÃO",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (decisao == JOptionPane.YES_OPTION) this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesActionPerformed
        new FormBuscarCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    private void jMenuItemNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoActionPerformed
        new FormAluguel().setVisible(true);
    }//GEN-LAST:event_jMenuItemNovoActionPerformed

    private void btAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAluguelActionPerformed
        new FormAluguel().setVisible(true);
    }//GEN-LAST:event_btAluguelActionPerformed

    private void JMenuItemAlugueisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemAlugueisActionPerformed
        new FormBuscarAluguel().setVisible(true);
    }//GEN-LAST:event_JMenuItemAlugueisActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuCadastro;
    private javax.swing.JMenuItem JMenuItemAjuda;
    private javax.swing.JMenuItem JMenuItemAlugueis;
    private javax.swing.JMenuItem JMenuItemCliente;
    private javax.swing.JMenuItem JMenuItemSair;
    private javax.swing.JMenuItem JMenuItemSobre;
    private javax.swing.JMenu JMenuSuporte;
    private javax.swing.JButton btAluguel;
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btEquipamento;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenuAluguel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConsulta;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemEfetuar;
    private javax.swing.JMenuItem jMenuItemEmitir;
    private javax.swing.JMenuItem jMenuItemEquipamento;
    private javax.swing.JMenuItem jMenuItemEquipamentos;
    private javax.swing.JMenuItem jMenuItemNovo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCentro;
    private javax.swing.JPanel jPanelNorte;
    private javax.swing.JPanel jPanelSul;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
