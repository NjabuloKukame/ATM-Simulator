/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import db.DatabaseConnection;

/**
 *
 * @author Tikkun
 */
public class frmTransferFunds extends javax.swing.JFrame {

    private String username;
    /**
     * Creates new form frmTransferFunds
     */
    public frmTransferFunds() {
        initComponents();
    }
    
    public frmTransferFunds(String username) {
        this.username = username;
        initComponents();
        updateBalanceLabel();
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
        jLabel3 = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRecipient = new javax.swing.JTextField();
        txtReference = new javax.swing.JTextField();
        btnTransfer50 = new javax.swing.JButton();
        btnTransfer100 = new javax.swing.JButton();
        btnTransfer1000 = new javax.swing.JButton();
        btnTransfer200 = new javax.swing.JButton();
        btnTransfer500 = new javax.swing.JButton();
        btnTransfer5000 = new javax.swing.JButton();
        btnTransfer10000 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, -1));

        lblBalance.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        lblBalance.setForeground(new java.awt.Color(0, 0, 0));
        lblBalance.setText("Current Balance: R");
        jPanel1.add(lblBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Recipient");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        btnBack.setBackground(new java.awt.Color(153, 153, 255));
        btnBack.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 120, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Transfer Funds");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Reference");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        txtRecipient.setBackground(new java.awt.Color(102, 102, 102));
        txtRecipient.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        txtRecipient.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtRecipient, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 270, -1));

        txtReference.setBackground(new java.awt.Color(102, 102, 102));
        txtReference.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        txtReference.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtReference, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 270, -1));

        btnTransfer50.setBackground(new java.awt.Color(153, 153, 255));
        btnTransfer50.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnTransfer50.setForeground(new java.awt.Color(0, 0, 0));
        btnTransfer50.setText("R50");
        btnTransfer50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfer50ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransfer50, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 120, -1));

        btnTransfer100.setBackground(new java.awt.Color(153, 153, 255));
        btnTransfer100.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnTransfer100.setForeground(new java.awt.Color(0, 0, 0));
        btnTransfer100.setText("R100");
        btnTransfer100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfer100ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransfer100, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 120, -1));

        btnTransfer1000.setBackground(new java.awt.Color(153, 153, 255));
        btnTransfer1000.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnTransfer1000.setForeground(new java.awt.Color(0, 0, 0));
        btnTransfer1000.setText("R1 000");
        btnTransfer1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfer1000ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransfer1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 120, -1));

        btnTransfer200.setBackground(new java.awt.Color(153, 153, 255));
        btnTransfer200.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnTransfer200.setForeground(new java.awt.Color(0, 0, 0));
        btnTransfer200.setText("R200");
        btnTransfer200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfer200ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransfer200, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 120, -1));

        btnTransfer500.setBackground(new java.awt.Color(153, 153, 255));
        btnTransfer500.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnTransfer500.setForeground(new java.awt.Color(0, 0, 0));
        btnTransfer500.setText("R500");
        btnTransfer500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfer500ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransfer500, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 120, -1));

        btnTransfer5000.setBackground(new java.awt.Color(153, 153, 255));
        btnTransfer5000.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnTransfer5000.setForeground(new java.awt.Color(0, 0, 0));
        btnTransfer5000.setText("R5 000");
        btnTransfer5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfer5000ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransfer5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 120, -1));

        btnTransfer10000.setBackground(new java.awt.Color(153, 153, 255));
        btnTransfer10000.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnTransfer10000.setForeground(new java.awt.Color(0, 0, 0));
        btnTransfer10000.setText("R10 000");
        btnTransfer10000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransfer10000ActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransfer10000, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/skin3.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 918, 754));

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm If You Want To Exit", "ATM Machine", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        frmMain frmMain = new frmMain(username);
        frmMain.show();
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnTransfer50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfer50ActionPerformed
        // TODO add your handling code here:
        transferAmount(50);
    }//GEN-LAST:event_btnTransfer50ActionPerformed

    private void btnTransfer100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfer100ActionPerformed
        // TODO add your handling code here:
        transferAmount(100);
    }//GEN-LAST:event_btnTransfer100ActionPerformed

    private void btnTransfer1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfer1000ActionPerformed
        // TODO add your handling code here:
        transferAmount(1000);
    }//GEN-LAST:event_btnTransfer1000ActionPerformed

    private void btnTransfer200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfer200ActionPerformed
        // TODO add your handling code here:
        transferAmount(200);
    }//GEN-LAST:event_btnTransfer200ActionPerformed

    private void btnTransfer500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfer500ActionPerformed
        // TODO add your handling code here:
        transferAmount(500);
    }//GEN-LAST:event_btnTransfer500ActionPerformed

    private void btnTransfer5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfer5000ActionPerformed
        // TODO add your handling code here:
        transferAmount(5000);
    }//GEN-LAST:event_btnTransfer5000ActionPerformed

    private void btnTransfer10000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransfer10000ActionPerformed
        // TODO add your handling code here:
        transferAmount(10000);
    }//GEN-LAST:event_btnTransfer10000ActionPerformed

    private double getCurrentBalance() {
        double balance = 0.0;
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT balance FROM users WHERE username = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                balance = rs.getDouble("balance");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return balance;
    }
    
    private void updateBalanceLabel() {
        double balance = getCurrentBalance();
        lblBalance.setText("Current Balance: R" + balance);
    }
    
    private void transferAmount(double amount) {
        double currentBalance = getCurrentBalance();

        if(txtRecipient.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Recipient Field Is Empty", "Transfer Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(txtReference.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Reference Field Is Empty", "Transfer Failed", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        if (currentBalance >= amount) {
            try (Connection conn = DatabaseConnection.getConnection()) {
                String sql = "UPDATE users SET balance = balance - ? WHERE username = ? AND balance >= ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setDouble(1, amount);
                pstmt.setString(2, username); // Use the stored username
                pstmt.setDouble(3, amount); // Check if sufficient balance

                int rowsUpdated = pstmt.executeUpdate();
                if (rowsUpdated > 0) {
                    updateBalanceLabel(); // Update balance label after successful withdrawal
                    JOptionPane.showMessageDialog(this, "Successfully Transferred R" + amount + "\nRecipient: " + txtRecipient.getText() + "\nReference: " + txtReference.getText(), "Transfer Successful", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Insufficient balance. Please try a lower amount.", "Transfer Failed", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Insufficient balance. Please try a lower amount.", "Transfer Failed", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void clearText(){
        txtRecipient.setText("");
        txtReference.setText("");
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
            java.util.logging.Logger.getLogger(frmTransferFunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTransferFunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTransferFunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTransferFunds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTransferFunds().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnTransfer100;
    private javax.swing.JButton btnTransfer1000;
    private javax.swing.JButton btnTransfer10000;
    private javax.swing.JButton btnTransfer200;
    private javax.swing.JButton btnTransfer50;
    private javax.swing.JButton btnTransfer500;
    private javax.swing.JButton btnTransfer5000;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JTextField txtRecipient;
    private javax.swing.JTextField txtReference;
    // End of variables declaration//GEN-END:variables
}
