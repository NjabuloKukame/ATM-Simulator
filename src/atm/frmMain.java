/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import db.DatabaseConnection;

/**
 *
 * @author Tikkun
 */
public class frmMain extends javax.swing.JFrame {

    private String username;
    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
    }
    
    public frmMain(String username){
        this.username = username;
        initComponents();
        lblWelcome.setText("Welcome " + username);
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
        btnWithdraw = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        btnChangePin = new javax.swing.JButton();
        btnTransferFunds = new javax.swing.JButton();
        btnBalanceInquiry = new javax.swing.JButton();
        btnStatement = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnWithdraw.setBackground(new java.awt.Color(153, 153, 255));
        btnWithdraw.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnWithdraw.setForeground(new java.awt.Color(0, 0, 0));
        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });
        jPanel1.add(btnWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 130, -1));

        btnDeposit.setBackground(new java.awt.Color(153, 153, 255));
        btnDeposit.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnDeposit.setForeground(new java.awt.Color(0, 0, 0));
        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 150, -1));

        lblWelcome.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 260, 30));

        lblClose.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        lblClose.setForeground(new java.awt.Color(0, 0, 0));
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jPanel1.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, -1, -1));

        btnChangePin.setBackground(new java.awt.Color(153, 153, 255));
        btnChangePin.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnChangePin.setForeground(new java.awt.Color(0, 0, 0));
        btnChangePin.setText("Change Pin");
        btnChangePin.setActionCommand("Change PIN");
        btnChangePin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePinActionPerformed(evt);
            }
        });
        jPanel1.add(btnChangePin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 130, -1));

        btnTransferFunds.setBackground(new java.awt.Color(153, 153, 255));
        btnTransferFunds.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnTransferFunds.setForeground(new java.awt.Color(0, 0, 0));
        btnTransferFunds.setText("Transfer Funds");
        btnTransferFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferFundsActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransferFunds, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, -1, -1));

        btnBalanceInquiry.setBackground(new java.awt.Color(153, 153, 255));
        btnBalanceInquiry.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnBalanceInquiry.setForeground(new java.awt.Color(0, 0, 0));
        btnBalanceInquiry.setText("Balance Inquiry");
        btnBalanceInquiry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceInquiryActionPerformed(evt);
            }
        });
        jPanel1.add(btnBalanceInquiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, 150, -1));

        btnStatement.setBackground(new java.awt.Color(153, 153, 255));
        btnStatement.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnStatement.setForeground(new java.awt.Color(0, 0, 0));
        btnStatement.setText("Statement");
        btnStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatementActionPerformed(evt);
            }
        });
        jPanel1.add(btnStatement, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/skin3.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 980));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        // TODO add your handling code here:
        frmDeposit frmDeposit = new frmDeposit(username);
        frmDeposit.show();
        this.dispose();
    }//GEN-LAST:event_btnDepositActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm If You Want To Exit", "ATM Machine", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        // TODO add your handling code here:
        frmWithdraw frmWithdraw = new frmWithdraw(username);
        frmWithdraw.show();
        this.dispose();
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnChangePinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePinActionPerformed
        // TODO add your handling code here:
        frmChangePin frmChangePin = new frmChangePin(username);
        frmChangePin.show();
        this.dispose();
    }//GEN-LAST:event_btnChangePinActionPerformed

    private void btnTransferFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferFundsActionPerformed
        // TODO add your handling code here:
        frmTransferFunds frmTransferFunds = new frmTransferFunds(username);
        frmTransferFunds.show();
        this.dispose();
    }//GEN-LAST:event_btnTransferFundsActionPerformed

    private void btnBalanceInquiryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceInquiryActionPerformed
        // TODO add your handling code here:
        frmBalanceInquiry frmBalanceInquiry = new frmBalanceInquiry(username);
        frmBalanceInquiry.show();
        this.dispose();
    }//GEN-LAST:event_btnBalanceInquiryActionPerformed

    private void btnStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatementActionPerformed
        // TODO add your handling code here:
        frmStatement frmStatement = new frmStatement(username);
        frmStatement.show();
        this.dispose();
    }//GEN-LAST:event_btnStatementActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalanceInquiry;
    private javax.swing.JButton btnChangePin;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnStatement;
    private javax.swing.JButton btnTransferFunds;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
