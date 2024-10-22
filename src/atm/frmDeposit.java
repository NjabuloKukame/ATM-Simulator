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
public class frmDeposit extends javax.swing.JFrame {

    private String username;

    /**
     * Creates new form frmDeposit
     */
    public frmDeposit() {
        initComponents();
    }

    public frmDeposit(String username) {
        this.username = username;
        initComponents();
        lblBalance.setText("Current Balance: R" + getCurrentBalance());
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
        lblClose = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDeposit50 = new javax.swing.JButton();
        btnDeposit100 = new javax.swing.JButton();
        btnDeposit1000 = new javax.swing.JButton();
        btnDeposit200 = new javax.swing.JButton();
        btnDeposit500 = new javax.swing.JButton();
        btnDeposit10000 = new javax.swing.JButton();
        btnDeposit5000 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        lblClose.setForeground(new java.awt.Color(0, 0, 0));
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jPanel1.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, -1));

        lblBalance.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        lblBalance.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 200, 30));

        btnBack.setBackground(new java.awt.Color(153, 153, 255));
        btnBack.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 120, -1));

        btnDeposit50.setBackground(new java.awt.Color(153, 153, 255));
        btnDeposit50.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnDeposit50.setForeground(new java.awt.Color(0, 0, 0));
        btnDeposit50.setText("R50");
        btnDeposit50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeposit50ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeposit50, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 120, -1));

        btnDeposit100.setBackground(new java.awt.Color(153, 153, 255));
        btnDeposit100.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnDeposit100.setForeground(new java.awt.Color(0, 0, 0));
        btnDeposit100.setText("R100");
        btnDeposit100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeposit100ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeposit100, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 120, -1));

        btnDeposit1000.setBackground(new java.awt.Color(153, 153, 255));
        btnDeposit1000.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnDeposit1000.setForeground(new java.awt.Color(0, 0, 0));
        btnDeposit1000.setText("R1000");
        btnDeposit1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeposit1000ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeposit1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 120, -1));

        btnDeposit200.setBackground(new java.awt.Color(153, 153, 255));
        btnDeposit200.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnDeposit200.setForeground(new java.awt.Color(0, 0, 0));
        btnDeposit200.setText("R200");
        btnDeposit200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeposit200ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeposit200, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 120, -1));

        btnDeposit500.setBackground(new java.awt.Color(153, 153, 255));
        btnDeposit500.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnDeposit500.setForeground(new java.awt.Color(0, 0, 0));
        btnDeposit500.setText("R500");
        btnDeposit500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeposit500ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeposit500, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 120, -1));

        btnDeposit10000.setBackground(new java.awt.Color(153, 153, 255));
        btnDeposit10000.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnDeposit10000.setForeground(new java.awt.Color(0, 0, 0));
        btnDeposit10000.setText("R10 000");
        btnDeposit10000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeposit10000ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeposit10000, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 120, -1));

        btnDeposit5000.setBackground(new java.awt.Color(153, 153, 255));
        btnDeposit5000.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        btnDeposit5000.setForeground(new java.awt.Color(0, 0, 0));
        btnDeposit5000.setText("R5 000");
        btnDeposit5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeposit5000ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeposit5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 120, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Deposit");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/skin3.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm If You Want To Exit", "ATM Machine", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        frmMain frmMain = new frmMain(username);
        frmMain.show();
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeposit50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeposit50ActionPerformed
        // TODO add your handling code here:
        depositAmount(50);
    }//GEN-LAST:event_btnDeposit50ActionPerformed

    private void btnDeposit100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeposit100ActionPerformed
        // TODO add your handling code here:
        depositAmount(100);
    }//GEN-LAST:event_btnDeposit100ActionPerformed

    private void btnDeposit1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeposit1000ActionPerformed
        // TODO add your handling code here:
        depositAmount(1000);
    }//GEN-LAST:event_btnDeposit1000ActionPerformed

    private void btnDeposit200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeposit200ActionPerformed
        // TODO add your handling code here:
        depositAmount(200);
    }//GEN-LAST:event_btnDeposit200ActionPerformed

    private void btnDeposit500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeposit500ActionPerformed
        // TODO add your handling code here:
        depositAmount(500);
    }//GEN-LAST:event_btnDeposit500ActionPerformed

    private void btnDeposit10000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeposit10000ActionPerformed
        // TODO add your handling code here:
        depositAmount(10000);
    }//GEN-LAST:event_btnDeposit10000ActionPerformed

    private void btnDeposit5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeposit5000ActionPerformed
        // TODO add your handling code here:
        depositAmount(5000);
    }//GEN-LAST:event_btnDeposit5000ActionPerformed

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

    private void depositAmount(double amount) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "UPDATE users SET balance = balance + ? WHERE username = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, amount);
            pstmt.setString(2, username);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                lblBalance.setText("Current Balance: R" + getCurrentBalance());
                JOptionPane.showMessageDialog(this, "Successfully deposited R" + amount, "Deposit Successful", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Deposit failed. Please try again.", "Deposit Failed", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(frmDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDeposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeposit100;
    private javax.swing.JButton btnDeposit1000;
    private javax.swing.JButton btnDeposit10000;
    private javax.swing.JButton btnDeposit200;
    private javax.swing.JButton btnDeposit50;
    private javax.swing.JButton btnDeposit500;
    private javax.swing.JButton btnDeposit5000;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblClose;
    // End of variables declaration//GEN-END:variables
}
