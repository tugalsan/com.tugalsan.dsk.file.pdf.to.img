/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tugalsan.dsk.file.pdf.to.img;

import com.tugalsan.api.cast.client.TGS_CastUtils;
import java.nio.file.Path;

/**
 *
 * @author me
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        taConsole = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        tb = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblImgOutput = new javax.swing.JLabel();
        tfPdfInput = new javax.swing.JTextField();
        btnPdfInputRecord = new javax.swing.JButton();
        lblPdfInput = new javax.swing.JLabel();
        tfImgOutput = new javax.swing.JTextField();
        btnImgWork = new javax.swing.JButton();
        lblImgDPI = new javax.swing.JLabel();
        pdfPageNr = new javax.swing.JLabel();
        tfDPI = new javax.swing.JTextField();
        tfPageNr = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setName("mainFrame"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        taConsole.setEditable(false);
        taConsole.setColumns(20);
        taConsole.setRows(5);
        jScrollPane1.setViewportView(taConsole);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 970, 300));
        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));
        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImgOutput.setText("imgOutput");
        jPanel1.add(lblImgOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        tfPdfInput.setEditable(false);
        jPanel1.add(tfPdfInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 760, -1));

        btnPdfInputRecord.setText("Seç");
        btnPdfInputRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfInputRecordActionPerformed(evt);
            }
        });
        jPanel1.add(btnPdfInputRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 100, -1));

        lblPdfInput.setText("pdfInput");
        jPanel1.add(lblPdfInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        tfImgOutput.setEditable(false);
        jPanel1.add(tfImgOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 760, -1));

        btnImgWork.setText("Dönüştür");
        btnImgWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgWorkActionPerformed(evt);
            }
        });
        jPanel1.add(btnImgWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 100, -1));

        lblImgDPI.setText("imgDPI");
        jPanel1.add(lblImgDPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 20));

        pdfPageNr.setText("pdfPageNr");
        jPanel1.add(pdfPageNr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 20));

        tfDPI.setText("300");
        jPanel1.add(tfDPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        tfPageNr.setText("1");
        jPanel1.add(tfPageNr, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        tb.addTab("Common", jPanel1);

        getContentPane().add(tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 970, 300));

        setSize(new java.awt.Dimension(1014, 660));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPdfInputRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfInputRecordActionPerformed
        MainRecordFile.pdfInput();
    }//GEN-LAST:event_btnPdfInputRecordActionPerformed

    private void btnImgWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgWorkActionPerformed
        MainWork.work(false,
                Path.of(tfPdfInput.getText()),
                Path.of(tfImgOutput.getText()),
                TGS_CastUtils.toInteger(tfPageNr.getText()),
                TGS_CastUtils.toInteger(tfDPI.getText())
        );
    }//GEN-LAST:event_btnImgWorkActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImgWork;
    private javax.swing.JButton btnPdfInputRecord;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblImgDPI;
    private javax.swing.JLabel lblImgOutput;
    private javax.swing.JLabel lblPdfInput;
    private javax.swing.JLabel pdfPageNr;
    public javax.swing.JTextArea taConsole;
    public javax.swing.JTabbedPane tb;
    private javax.swing.JTextField tfDPI;
    public javax.swing.JTextField tfImgOutput;
    private javax.swing.JTextField tfPageNr;
    public javax.swing.JTextField tfPdfInput;
    // End of variables declaration//GEN-END:variables
}
