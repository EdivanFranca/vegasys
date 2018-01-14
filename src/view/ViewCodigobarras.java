/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileOutputStream;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.BarcodeEAN;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class ViewCodigobarras extends javax.swing.JFrame {

    ArrayList<String> listaCodigos = new ArrayList<>();
    ArrayList<String> listaTipos = new ArrayList<>();

    /**
     * Creates new form ViewCodigobarras
     */
    public ViewCodigobarras() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCodigos = new javax.swing.JTable();
        jbAdicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtfExcluir = new javax.swing.JButton();
        jcbTipoCodigo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jtfCodigoBarras = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerador de código de barras");

        jbgerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Report.png"))); // NOI18N
        jbgerar.setText("Gerar Código");
        jbgerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbgerarActionPerformed(evt);
            }
        });

        jtCodigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de barras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtCodigos);
        if (jtCodigos.getColumnModel().getColumnCount() > 0) {
            jtCodigos.getColumnModel().getColumn(0).setResizable(false);
        }

        jbAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Add.png"))); // NOI18N
        jbAdicionar.setText("Adicionar código");
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });

        jLabel1.setText("Digite aqui o código de barras:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtfExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Remove.png"))); // NOI18N
        jtfExcluir.setText("Excluir código da tabela");
        jtfExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfExcluirActionPerformed(evt);
            }
        });

        jcbTipoCodigo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EAN13", "EAN8", "UPCA", "UPCE" }));

        jLabel2.setText("Padrão de código de barras");

        jtfCodigoBarras.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
        jtfCodigoBarras.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbgerar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfCodigoBarras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbAdicionar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jcbTipoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbTipoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAdicionar)
                    .addComponent(jtfCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbgerar)
                    .addComponent(jButton1)
                    .addComponent(jtfExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbgerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbgerarActionPerformed
//        zerar a lista
        listaCodigos = new ArrayList<>();
        //adicionar os itens a lista
        for (int i = 0; i < jtCodigos.getRowCount(); i++) {
            listaCodigos.add((String) jtCodigos.getValueAt(i, 0));
        }
        //gerar o código
        this.gerarCodigoBarras(listaCodigos);
    }//GEN-LAST:event_jbgerarActionPerformed

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        //Adiciona linhas na tabela
        if (jcbTipoCodigo.getSelectedItem().toString() == "EAN13" && jtfCodigoBarras.getText().length() != 13) {
            JOptionPane.showMessageDialog(this, "Você deve digitar 13 números para este padrão de código de barras");
        } else {
            if (jcbTipoCodigo.getSelectedItem().toString() == "EAN8" && jtfCodigoBarras.getText().length() != 8) {
                JOptionPane.showMessageDialog(this, "Você deve digitar 8 números para este padrão de código de barras");
            } else {
                DefaultTableModel modelo = (DefaultTableModel) jtCodigos.getModel();
                int cont = 0;
                for (int i = 0; i < cont; i++) {
                    modelo.setNumRows(0);
                }

                //pega a quantidade de linhas e joga na variavel
                modelo.addRow(new Object[]{
                    this.jtfCodigoBarras.getText()
                });
            }
        }
    }//GEN-LAST:event_jbAdicionarActionPerformed

    private void jtfExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfExcluirActionPerformed
        // para excluir a linha
        int linhaSelecionada = jtCodigos.getSelectedRow();
        // Verificamos se existe realmente alguma linha selecionada
        if (linhaSelecionada < 0) {
            return;
        } else {
            // Obtem o modelo da JTable
            DefaultTableModel modelo = (DefaultTableModel) jtCodigos.getModel();
            // Remove a linha
            modelo.removeRow(linhaSelecionada);
        }
    }//GEN-LAST:event_jtfExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jtCodigos.getModel();
        // Remove a linha
        modelo.setNumRows(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCodigobarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCodigobarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCodigobarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCodigobarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCodigobarras().setVisible(true);
            }
        });
    }

    public void gerarCodigoBarras(ArrayList<String> pListaCodigos) {

        System.out.println("Barcode Linha de Código ");

// criando um objeto da classe Document
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);

        try {

            //Aqui começamos a utilizar as classes do iText: o documento
            //criado acima será
//direcionado para um arquivo PDF.
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C://Codigo_Barra_Java_Linha_Codigo.pdf"));

//abrindo o documento.
            document.open();

//adicionando um novo paragrafo.
            for (int i = 0; i < pListaCodigos.size(); i++) {
                document.add(new Paragraph("CÓDIGOS DE BARRA"));

                document.add(new Paragraph("    "));

                document.add(new Paragraph("    "));

                //Comecando a configurar o cod de barras
                PdfContentByte cb = writer.getDirectContent();

                BarcodeEAN codeEAN = new BarcodeEAN();

                //O iText suporta os principais tipos de código de barra, como Barcode39,
//  Barcode128 (128, 128_UCC, 128_RAW),  BarcodeEAN (EAN13, EAN8, UPCA, UPCE), EANSUP, etc
                if (jcbTipoCodigo.getSelectedItem().toString() == "EAN13") {
                    codeEAN.setCodeType(codeEAN.EAN13);
                } else if ("EAN8".equals(jcbTipoCodigo.getSelectedItem().toString())) {
                    codeEAN.setCodeType(codeEAN.EAN8);
                } else if ("UPCA".equals(jcbTipoCodigo.getSelectedItem().toString())) {
                    codeEAN.setCodeType(codeEAN.UPCA);
                } else if ("UPCE".equals(jcbTipoCodigo.getSelectedItem().toString())) {
                    codeEAN.setCodeType(codeEAN.UPCE);
                }

                codeEAN.setCode("1234567890123");

                Image imageEAN = codeEAN.createImageWithBarcode(cb, null, null);

                document.add(new Phrase(new Chunk(imageEAN, 0, 0)));
            }
            //abrir o arquivo
            File file = new File("C://Codigo_Barra_Java_Linha_Codigo.pdf");
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception de) {
            de.printStackTrace();

        }
        document.close();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbgerar;
    private javax.swing.JComboBox jcbTipoCodigo;
    private javax.swing.JTable jtCodigos;
    private javax.swing.JFormattedTextField jtfCodigoBarras;
    private javax.swing.JButton jtfExcluir;
    // End of variables declaration//GEN-END:variables
}
