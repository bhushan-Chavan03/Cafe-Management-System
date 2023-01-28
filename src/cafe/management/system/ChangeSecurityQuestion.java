
package cafe.management.system;

import dao.UserDao;
import model.User;


public class ChangeSecurityQuestion extends javax.swing.JFrame {
    public String userEmail;

    
    public ChangeSecurityQuestion() {
        initComponents();
    }
    
      public ChangeSecurityQuestion(String email) {
        initComponents();
        userEmail= email;
        txtOldSecurityQuestion.setEditable(false);
       // btnUpdate.setEnabled(false);
    }
      
      public void validateField(){
          String password=txtPassword.getText();
          String securityQuestion= txtNewSecurityQuestion.getText();
          String answer=txtNewAnswer.getText();
          
          if(!password.equals("") && !securityQuestion.equals("")  && !answer.equals("")){
              btnUpdate.setEnabled(true);
          }
          else
              btnUpdate.setEnabled(false);
      }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtOldSecurityQuestion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNewSecurityQuestion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNewAnswer = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnUpdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 134));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Security Question.png"))); // NOI18N
        jLabel1.setText("Change Security Question");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 23, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Old Security Question");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        txtOldSecurityQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOldSecurityQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOldSecurityQuestionActionPerformed(evt);
            }
        });
        txtOldSecurityQuestion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOldSecurityQuestionKeyReleased(evt);
            }
        });
        getContentPane().add(txtOldSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 104, 324, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("New Security Question");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 162, -1, -1));

        txtNewSecurityQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNewSecurityQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewSecurityQuestionActionPerformed(evt);
            }
        });
        txtNewSecurityQuestion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewSecurityQuestionKeyReleased(evt);
            }
        });
        getContentPane().add(txtNewSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 158, 324, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Answer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 211, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 257, -1, -1));

        txtNewAnswer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNewAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewAnswerKeyReleased(evt);
            }
        });
        getContentPane().add(txtNewAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 207, 324, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 253, 324, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 323, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 323, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/small-page-background.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNewSecurityQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewSecurityQuestionActionPerformed
        
    }//GEN-LAST:event_txtNewSecurityQuestionActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
       
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        User user=UserDao.getSecurityQuestion(userEmail);
        txtOldSecurityQuestion.setText(user.getSecurityQuestion());
        
    }//GEN-LAST:event_formComponentShown

    private void txtOldSecurityQuestionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOldSecurityQuestionKeyReleased
      
    }//GEN-LAST:event_txtOldSecurityQuestionKeyReleased

    private void txtNewSecurityQuestionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewSecurityQuestionKeyReleased
        
        validate();
    }//GEN-LAST:event_txtNewSecurityQuestionKeyReleased

    private void txtNewAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewAnswerKeyReleased
        // TODO add your handling code here:
        validate();
    }//GEN-LAST:event_txtNewAnswerKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        
        validate();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       
         String password=txtPassword.getText();
          String securityQuestion= txtNewSecurityQuestion.getText();
          String answer=txtNewAnswer.getText();
         
          UserDao.changeSecurityQuestion(userEmail, password, securityQuestion, answer);
          setVisible(false);
          
          new ChangeSecurityQuestion(userEmail).setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
          setVisible(false);
          new ChangeSecurityQuestion(userEmail).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtOldSecurityQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOldSecurityQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOldSecurityQuestionActionPerformed

        public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(ChangeSecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeSecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeSecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeSecurityQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeSecurityQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtNewAnswer;
    private javax.swing.JTextField txtNewSecurityQuestion;
    private javax.swing.JTextField txtOldSecurityQuestion;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}