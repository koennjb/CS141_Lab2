/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author 955338810
 */
public class loanGUI extends javax.swing.JFrame {

    /**
     * Creates new form loanGUI
     */
    public loanGUI() {
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

        principalJLabel = new javax.swing.JLabel();
        principalJTextField = new javax.swing.JTextField();
        rateJLabel = new javax.swing.JLabel();
        rateJTextField = new javax.swing.JTextField();
        yearsJLabel = new javax.swing.JLabel();
        yearsJTextField = new javax.swing.JTextField();
        calculateJButton = new javax.swing.JButton();
        paymentJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loan Calculator");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(4, 2));

        principalJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        principalJLabel.setText("Enter the loan amount:");
        getContentPane().add(principalJLabel);

        principalJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        principalJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalJTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(principalJTextField);

        rateJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rateJLabel.setText("Enter interest rate as percent:");
        getContentPane().add(rateJLabel);

        rateJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rateJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateJTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(rateJTextField);

        yearsJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearsJLabel.setText("Enter years of loan:");
        getContentPane().add(yearsJLabel);

        yearsJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yearsJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsJTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(yearsJTextField);

        calculateJButton.setBackground(new java.awt.Color(255, 255, 204));
        calculateJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calculateJButton.setMnemonic('C');
        calculateJButton.setText("Calculate Payment");
        calculateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(calculateJButton);

        paymentJTextField.setEditable(false);
        paymentJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        paymentJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentJTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(paymentJTextField);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void principalJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_principalJTextFieldActionPerformed

    private void rateJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateJTextFieldActionPerformed

    private void yearsJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearsJTextFieldActionPerformed

    private void paymentJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentJTextFieldActionPerformed

    private void calculateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateJButtonActionPerformed
        // Calculate the loan payment
    }//GEN-LAST:event_calculateJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(loanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loanGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateJButton;
    private javax.swing.JTextField paymentJTextField;
    private javax.swing.JLabel principalJLabel;
    private javax.swing.JTextField principalJTextField;
    private javax.swing.JLabel rateJLabel;
    private javax.swing.JTextField rateJTextField;
    private javax.swing.JLabel yearsJLabel;
    private javax.swing.JTextField yearsJTextField;
    // End of variables declaration//GEN-END:variables
}
