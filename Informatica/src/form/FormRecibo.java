package form;

import com.itextpdf.text.BaseColor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Aluguel;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Item;

public class FormRecibo extends javax.swing.JFrame {

    List<Aluguel> alugueis = null;
    Aluguel aluguel = null;
    DefaultTableModel modeloAlugueis  = null;
    
    public FormRecibo() {
        initComponents();
        modeloAlugueis = (DefaultTableModel) tbAlugueis.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbNumero = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btTXT = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btPDF = new javax.swing.JButton();
        tfCPF = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAlugueis = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Emissão de Recibo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        lbNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNumero.setText("CPF:");
        lbNumero.setName("lbNumero"); // NOI18N

        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Document-search-icon.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setName("btBuscar"); // NOI18N
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        btTXT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/txt-icon.png"))); // NOI18N
        btTXT.setText("Gerar TXT");
        btTXT.setEnabled(false);
        btTXT.setName("btTXT"); // NOI18N
        btTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTXTActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh-icon.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setName("btLimpar"); // NOI18N
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
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

        btPDF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pdf-icon.png"))); // NOI18N
        btPDF.setText("Gerar PDF");
        btPDF.setEnabled(false);
        btPDF.setName("btPDF"); // NOI18N
        btPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPDFActionPerformed(evt);
            }
        });

        try {
            tfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCPF.setName("tfCPF"); // NOI18N

        tbAlugueis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aluguel", "Nome", "E-mail", "Telefone", "Data Aluguel", "Data Devolução", "Horário Aluguel", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAlugueis.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbAlugueis.setName("tbAlugueis"); // NOI18N
        tbAlugueis.getTableHeader().setReorderingAllowed(false);
        tbAlugueis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAlugueisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAlugueis);
        if (tbAlugueis.getColumnModel().getColumnCount() > 0) {
            tbAlugueis.getColumnModel().getColumn(0).setResizable(false);
            tbAlugueis.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbAlugueis.getColumnModel().getColumn(1).setResizable(false);
            tbAlugueis.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbAlugueis.getColumnModel().getColumn(2).setResizable(false);
            tbAlugueis.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbAlugueis.getColumnModel().getColumn(3).setResizable(false);
            tbAlugueis.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbAlugueis.getColumnModel().getColumn(4).setResizable(false);
            tbAlugueis.getColumnModel().getColumn(4).setPreferredWidth(100);
            tbAlugueis.getColumnModel().getColumn(5).setResizable(false);
            tbAlugueis.getColumnModel().getColumn(5).setPreferredWidth(100);
            tbAlugueis.getColumnModel().getColumn(6).setResizable(false);
            tbAlugueis.getColumnModel().getColumn(6).setPreferredWidth(100);
            tbAlugueis.getColumnModel().getColumn(7).setResizable(false);
            tbAlugueis.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNumero)
                            .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btBuscar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btTXT)
                                .addGap(87, 87, 87)
                                .addComponent(btPDF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLimpar)
                                .addGap(98, 98, 98)
                                .addComponent(btSair))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTXT)
                    .addComponent(btPDF)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addGap(403, 403, 403)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(894, 435));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        btTXT.setEnabled(false);
        btPDF.setEnabled(false);
        limparTabela();
        String cpsSemMascara = tfCPF.getText().replace(".", "").replace("-", "");
        if(FormCliente.validarCPF(cpsSemMascara)){
                if(!cpsSemMascara.trim().equals("")){
                    alugueis = FormPrincipal.bdAluguel.buscaAluguel(tfCPF.getText());
                    if(alugueis.size() > 0){
                        for(int i = 0; i < alugueis.size(); i++){
                            inserirTabela(alugueis, i);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Cliente não cadastrado!", "Atenção", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }else{
                tfCPF.setValue("");
                JOptionPane.showMessageDialog(null, "CPF Inválido!", "Atenção", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfCPF.setValue("");
        limparTabela();
        btTXT.setEnabled(false);
        btPDF.setEnabled(false);
        tfCPF.requestFocus();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTXTActionPerformed
        String nro = Integer.toString(aluguel.getNumero());        
        String usuario = System.getProperty("user.name");        
        
        File diretorio = new File("C:\\Users\\"+ usuario +"\\Desktop\\Recibos TXT");
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }        
        
        File arq = new File("C:\\Users\\" + usuario + "\\Desktop\\Recibos TXT\\Recibo_" + nro + ".txt");
        if(!arq.exists()){
            try {
                arq.createNewFile();
                FileWriter fw = new FileWriter(arq);
                BufferedWriter bw = new BufferedWriter(fw);
                String str[] = aluguel.toString().split("\n");
                for(String linha : str){
                    bw.write(linha + "\n");
                    bw.newLine();
                }
                bw.newLine();
                bw.newLine();
                bw.write("____________________________________");
                bw.newLine();
                bw.write("Assinatura do Cliente\n");
                bw.newLine();
                bw.close();
                fw.close();
                JOptionPane.showMessageDialog(null, "Recibo gerado com sucesso!", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(FormRecibo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Recibo n° "+nro+" já foi gerado!\nConsulte a pasta Recibos TXT.",
                    "Informação de Recibo", JOptionPane.INFORMATION_MESSAGE);         
        }
    }//GEN-LAST:event_btTXTActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setIconImage(new ImageIcon("src\\logo\\invoice-icon 16.png").getImage());
        tfCPF.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void btPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPDFActionPerformed
        String nro = Integer.toString(aluguel.getNumero());        
        String usuario = System.getProperty("user.name"); 
        
        File diretorio = new File("C:\\Users\\"+ usuario +"\\Desktop\\Recibos PDF");
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        } 
        
        File arq = new File("C:\\Users\\" + usuario + "\\Desktop\\Recibos PDF\\Recibo_" + nro + ".pdf");

        if(!arq.exists()){
            try {
                Document document = new Document();
                Image figura = Image.getInstance("src\\logo\\logo.png");
                figura.setAlignment(Image.MIDDLE);
                arq.createNewFile();
                PdfWriter.getInstance(document, new FileOutputStream(arq));
                document.open();
                PdfPTable table = new PdfPTable(6);
                PdfPCell tab = new PdfPCell(figura);
                tab.setHorizontalAlignment(Element.ALIGN_CENTER);
                tab.setColspan(4);
                table.addCell(tab);
                SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
                com.itextpdf.text.Font fonte = FontFactory.getFont("Times Roman", 9, BaseColor.BLACK);
                tab = new PdfPCell(new Paragraph("Recibo de Aluguel\nDevolução: " + fm.format(aluguel.dataDevolucao())+ "\nContrato: " + aluguel.numero, fonte));
                tab.setColspan(2);
                table.addCell(tab);
                tab = new PdfPCell(new Paragraph("Dados do Cliente\n" + aluguel.getCliente().toString() + "\n", fonte));
                tab.setColspan(4);
                table.addCell(tab);
                tab = new PdfPCell(new Paragraph(aluguel.infoAluguel(), fonte));
                tab.setColspan(2);
                table.addCell(tab);
                String str = "";
                for(Item i : aluguel.todosItens()){                    
                    tab = new PdfPCell(new Paragraph("Quantidade alugada: " + i.getQuantidade()
                            +"\n"+i.getEquipamento().toString_(), fonte));
                    tab.setColspan(3);
                    table.addCell(tab);
                    tab = new PdfPCell(new Paragraph(i.getEquipamento().toString(), fonte));
                    tab.setColspan(3);
                    table.addCell(tab);
                }
                Paragraph p = new Paragraph("\n\n_________________________________________\n    Assinatura do Cliente\n", fonte);
                tab = new PdfPCell(p);
                tab.setHorizontalAlignment(Element.ALIGN_CENTER);
                tab.setColspan(6);
                table.addCell(tab);
                document.add(table);
                document.close();
                JOptionPane.showMessageDialog(null, "Recibo gerado com sucesso!", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException | DocumentException ex) {
                Logger.getLogger(FormRecibo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Recibo nº "+nro+" já foi gerado!\nConsulte a pasta Recibos PDF.",
                    "Informação de Recibo", JOptionPane.INFORMATION_MESSAGE);         
        }
    }//GEN-LAST:event_btPDFActionPerformed

    private void tbAlugueisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAlugueisMouseClicked
        int linha = tbAlugueis.getSelectedRow();
        if((tbAlugueis.isCellSelected(linha, 0) || tbAlugueis.isCellSelected(linha, 1) ||
           tbAlugueis.isCellSelected(linha, 2) || tbAlugueis.isCellSelected(linha, 3) ||
           tbAlugueis.isCellSelected(linha, 4) || tbAlugueis.isCellSelected(linha, 5)) ||
           tbAlugueis.isCellSelected(linha, 6) || tbAlugueis.isCellSelected(linha, 7))
        {
            setAluguel();
            btTXT.setEnabled(true);
            btPDF.setEnabled(true);
            Date dataAtual = new Date(); 
            verificaVencimento(aluguel.dataDevolucao(), dataAtual);
        }else{
            btTXT.setEnabled(false);
            btPDF.setEnabled(false);
        }
    }//GEN-LAST:event_tbAlugueisMouseClicked

    private void inserirTabela(List<Aluguel> aluguel, int i){
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fmh = new SimpleDateFormat("HH:mm:ss");
        DecimalFormat df = new DecimalFormat("0.00");
        String dataAluguel = fm.format(aluguel.get(i).getDataAluguel());
        String dataDevolucao = fm.format(aluguel.get(i).dataDevolucao());
        String horario = fmh.format(aluguel.get(i).getDataAluguel());
        String valor = "R$ " + df.format(aluguel.get(i).getValorTotal());
        modeloAlugueis.addRow(new Object[]{
            aluguel.get(i).getNumero(), 
            aluguel.get(i).getCliente().getNome(), 
            aluguel.get(i).getCliente().getEmail(), 
            aluguel.get(i).getCliente().getTelefone(),
            dataAluguel,
            dataDevolucao,
            horario,
            valor
        });
    }
    
    private void limparTabela(){
        for(int i = tbAlugueis.getRowCount()-1; i >= 0; i--){
            modeloAlugueis.removeRow(i);
        }
    }
    
    private void setAluguel(){
        int linha = tbAlugueis.getSelectedRow();
        int id = (int) tbAlugueis.getModel().getValueAt(linha, 0);
        aluguel = FormPrincipal.bdAluguel.buscaAluguel(id);
    }
    
    private void verificaVencimento(Date emissao, Date vencimento){
	if (emissao.before(vencimento)){
            tbAlugueis.setSelectionBackground(new Color(220,20,60));
	}
	else if (emissao.after(vencimento)){
            tbAlugueis.setSelectionBackground(new Color(65,105,225));
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
            java.util.logging.Logger.getLogger(FormRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRecibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRecibo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPDF;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btTXT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JTable tbAlugueis;
    private javax.swing.JFormattedTextField tfCPF;
    // End of variables declaration//GEN-END:variables
}
