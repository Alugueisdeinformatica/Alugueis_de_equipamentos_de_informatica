package form;

import dao.AluguelDao;
import dao.ClienteDao;
import dao.EquipamentoDao;
import dao.DevolucaoDao;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FormPrincipal extends javax.swing.JFrame implements Runnable{
    
    public static EquipamentoDao bdEquipamento;
    public static ClienteDao bdCliente;
    public static AluguelDao bdAluguel;
    public static DevolucaoDao bdDevolucao;
    public static int nroAluguel = 1;
    public static int codEquipamento = 1;
    
    public FormPrincipal() {
        bdEquipamento = new EquipamentoDao();
        bdCliente = new ClienteDao();
        bdAluguel = new AluguelDao();
        bdDevolucao = new DevolucaoDao();
        initComponents();
        
    }
    
    /*
        João Pedro Guedes Presto / Luís Gustavo da Cunha Cipriani
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
        jPanelRelogio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuCadastro = new javax.swing.JMenu();
        JMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemEquipamento = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JMenuItemSair = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemEquipamentos = new javax.swing.JMenuItem();
        JMenuItemAlugueis = new javax.swing.JMenuItem();
        jMenuAluguel = new javax.swing.JMenu();
        jMenuItemNovo = new javax.swing.JMenuItem();
        jMenuItemEmitir = new javax.swing.JMenuItem();
        jMenuItemEfetuar = new javax.swing.JMenuItem();
        JMenuSuporte = new javax.swing.JMenu();
        JMenuItemAjuda = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        JMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("J&L Informática");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanelCentro.setBackground(new java.awt.Color(250, 250, 250));
        jPanelCentro.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/my-computer-icon.png"))); // NOI18N
        jLabel1.setText("J&L INFORMÁTICA");
        jPanelCentro.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/computer-stuff-1-e1465742115813.png"))); // NOI18N
        jPanelCentro.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanelCentro, java.awt.BorderLayout.CENTER);

        jPanelNorte.setBackground(new java.awt.Color(204, 255, 255));
        jPanelNorte.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelNorte.setLayout(new javax.swing.BoxLayout(jPanelNorte, javax.swing.BoxLayout.LINE_AXIS));

        jToolBar1.setBackground(new java.awt.Color(204, 255, 255));
        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setBorderPainted(false);
        jToolBar1.setOpaque(false);

        btCliente.setBackground(new java.awt.Color(204, 255, 255));
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

        btEquipamento.setBackground(new java.awt.Color(204, 255, 255));
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

        btAluguel.setBackground(new java.awt.Color(204, 255, 255));
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

        btSair.setBackground(new java.awt.Color(204, 255, 255));
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
        jPanelSul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        jPanelSul.setLayout(new java.awt.BorderLayout());

        jPanelRelogio.setBackground(new java.awt.Color(250, 250, 250));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Data:");

        lbData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbData.setForeground(new java.awt.Color(51, 51, 255));
        lbData.setText("18/02/2018");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Hora:");

        lbHora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbHora.setForeground(new java.awt.Color(51, 51, 255));
        lbHora.setText("19:38");

        javax.swing.GroupLayout jPanelRelogioLayout = new javax.swing.GroupLayout(jPanelRelogio);
        jPanelRelogio.setLayout(jPanelRelogioLayout);
        jPanelRelogioLayout.setHorizontalGroup(
            jPanelRelogioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelogioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbData)
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHora)
                .addContainerGap(437, Short.MAX_VALUE))
        );
        jPanelRelogioLayout.setVerticalGroup(
            jPanelRelogioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRelogioLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanelRelogioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(lbData)
                    .addComponent(lbHora))
                .addContainerGap())
        );

        jPanelSul.add(jPanelRelogio, java.awt.BorderLayout.CENTER);

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

        JMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Apps-Dialog-Close-icon 16.png"))); // NOI18N
        JMenuItemSair.setText("Sair");
        JMenuItemSair.setName("JMenuItemSair"); // NOI18N
        JMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemSairActionPerformed(evt);
            }
        });
        JMenuCadastro.add(JMenuItemSair);

        jMenuBar1.add(JMenuCadastro);

        jMenuConsulta.setText("Consulta");
        jMenuConsulta.setName("jMenuConsulta"); // NOI18N

        jMenuItemClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/user-search-icon 16.png"))); // NOI18N
        jMenuItemClientes.setText("Clientes");
        jMenuItemClientes.setName("jMenuItemClientes"); // NOI18N
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemClientes);

        jMenuItemEquipamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/computer-search-icon 16.png"))); // NOI18N
        jMenuItemEquipamentos.setText("Equipamentos");
        jMenuItemEquipamentos.setName("jMenuItemEquipamentos"); // NOI18N
        jMenuItemEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEquipamentosActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemEquipamentos);

        JMenuItemAlugueis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/02-Basket-icon 16.png"))); // NOI18N
        JMenuItemAlugueis.setText("Aluguéis");
        JMenuItemAlugueis.setName("JMenuItemAlugueis"); // NOI18N
        JMenuItemAlugueis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemAlugueisActionPerformed(evt);
            }
        });
        jMenuConsulta.add(JMenuItemAlugueis);

        jMenuBar1.add(jMenuConsulta);

        jMenuAluguel.setText("Aluguel");
        jMenuAluguel.setName("jMenuAluguel"); // NOI18N

        jMenuItemNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/02-Basket-icon 16.png"))); // NOI18N
        jMenuItemNovo.setText("Novo Aluguel");
        jMenuItemNovo.setName("jMenuItemNovo"); // NOI18N
        jMenuItemNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoActionPerformed(evt);
            }
        });
        jMenuAluguel.add(jMenuItemNovo);

        jMenuItemEmitir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/invoice-icon 16.png"))); // NOI18N
        jMenuItemEmitir.setText("Emitir Recibo");
        jMenuItemEmitir.setName("jMenuItemEmitir"); // NOI18N
        jMenuItemEmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmitirActionPerformed(evt);
            }
        });
        jMenuAluguel.add(jMenuItemEmitir);

        jMenuItemEfetuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Shopping-basket-remove-icon 16.png"))); // NOI18N
        jMenuItemEfetuar.setText("Efetuar Devolução");
        jMenuItemEfetuar.setName("jMenuItemEfetuar"); // NOI18N
        jMenuItemEfetuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEfetuarActionPerformed(evt);
            }
        });
        jMenuAluguel.add(jMenuItemEfetuar);

        jMenuBar1.add(jMenuAluguel);

        JMenuSuporte.setText("Suporte");
        JMenuSuporte.setName("JMenuSuporte"); // NOI18N

        JMenuItemAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Button-Help-icon 16.png"))); // NOI18N
        JMenuItemAjuda.setText("Ajuda");
        JMenuItemAjuda.setName("JMenuItemAjuda"); // NOI18N
        JMenuItemAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemAjudaActionPerformed(evt);
            }
        });
        JMenuSuporte.add(JMenuItemAjuda);
        JMenuSuporte.add(jSeparator2);

        JMenuItemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/Info-icon 16.png"))); // NOI18N
        JMenuItemSobre.setText("Sobre");
        JMenuItemSobre.setName("JMenuItemSobre"); // NOI18N
        JMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemSobreActionPerformed(evt);
            }
        });
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(756, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon("src\\logo\\my-computer-icon 16.png").getImage());
        this.setExtendedState(this.MAXIMIZED_BOTH);
        executarDataHora();
    }//GEN-LAST:event_formWindowOpened

    private void JMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JMenuItemSairActionPerformed

    private void JMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemClienteActionPerformed
        FormCliente.seletor = 0;
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
        int decisao = JOptionPane.showConfirmDialog(null, "Deseja finalizar a aplicação?", "Confirmação",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (decisao == 0) this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesActionPerformed
        FormBuscarCliente.seletor = 0;
        new FormBuscarCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    private void jMenuItemNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoActionPerformed
        btAluguelActionPerformed(evt);
    }//GEN-LAST:event_jMenuItemNovoActionPerformed

    private void btAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAluguelActionPerformed
        if(bdCliente.todosClientes().size() > 0 && bdEquipamento.todosEquipamentos().size() > 0){        
            new FormAluguel().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Cadastre um cliente e insira algum equipamento", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btAluguelActionPerformed

    private void JMenuItemAlugueisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemAlugueisActionPerformed
        new FormBuscarAluguel().setVisible(true);
    }//GEN-LAST:event_JMenuItemAlugueisActionPerformed

    private void jMenuItemEfetuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEfetuarActionPerformed
        new FormDevolucao().setVisible(true);
    }//GEN-LAST:event_jMenuItemEfetuarActionPerformed

    private void jMenuItemEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmitirActionPerformed
        new FormRecibo().setVisible(true);
    }//GEN-LAST:event_jMenuItemEmitirActionPerformed

    private void JMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemSobreActionPerformed
        String str = "Trabalho da disciplina de Laboratório de Programação de Interface com o Usuário";
        str += "\nProfessor: Giuliano Prado de Morais Giglio";
        str += "\nAlunos: João Pedro Guedes Presto e Luís Gustavo da Cunha Cipriani";
        str += "\nBacharelado em Sistemas de Informação - 4° Período";
        str += "\nCES-JF Junho de 2018";
        JOptionPane.showMessageDialog(null, str, "Informações", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_JMenuItemSobreActionPerformed

    private void JMenuItemAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemAjudaActionPerformed
        new FormAjuda().setVisible(true);
    }//GEN-LAST:event_JMenuItemAjudaActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            new FormAjuda().setVisible(true);
        }
    }//GEN-LAST:event_formKeyPressed
    
    public void executarDataHora(){
        new Thread(){
            @Override
            public void run(){
                while(true){
                    dataEHora();
                    try{
                        sleep(1000);
                    }catch(InterruptedException ie){
                        ie.printStackTrace();
                    }
                }
            }
        }.start();       
    }
    
    public void dataEHora(){
        Date data;        
        SimpleDateFormat fmd = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fmh = new SimpleDateFormat("HH:mm:ss");
        data = new Date();
        String str = fmd.format(data);
        String hora = fmh.format(data);        
        lbData.setText(str);
        lbHora.setText(hora);
    }   
    
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanelRelogio;
    private javax.swing.JPanel jPanelSul;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbHora;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
