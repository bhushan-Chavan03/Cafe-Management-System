
package cafe.management.system;

import javax.swing.JOptionPane;


public class Home extends javax.swing.JFrame {
    public String email;

    
    public Home() {
        initComponents();
    }
    
    public Home(String userEmail) {
        initComponents();
        email=userEmail;
        if(!email.equals("admin@gmail.com")){
            btnCatogery.setVisible(false);
            btnNewProduct.setVisible(false);
            btnViewEditDeleteProduct.setVisible(false);
            btnVerifyUsers.setVisible(false);
            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnCatogery = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnViewEditDeleteProduct = new javax.swing.JButton();
        btnVerifyUsers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        jButton2.setText("Place Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        jButton3.setText("View Bill & Order Placed Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        jButton4.setText("Change Password");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Security Question.png"))); // NOI18N
        jButton5.setText("Change Security Question");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, -1, 38));

        btnCatogery.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCatogery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnCatogery.setText("Manage Catogery");
        btnCatogery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatogeryActionPerformed(evt);
            }
        });
        getContentPane().add(btnCatogery, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 693, -1, -1));

        btnNewProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnNewProduct.setText("New Product");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 693, -1, -1));

        btnViewEditDeleteProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewEditDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnViewEditDeleteProduct.setText("View Edit& Delete Product");
        btnViewEditDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEditDeleteProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewEditDeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 693, -1, -1));

        btnVerifyUsers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerifyUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verify users.png"))); // NOI18N
        btnVerifyUsers.setText("Verify Users");
        btnVerifyUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerifyUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(1006, 693, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-background-image.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        setVisible(false);
        new PlacceOrder(email).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        new ViewBillsOrderPlacedDetails().setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        new ChangePassword(email).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to close the application?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnCatogeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatogeryActionPerformed
       
        new ManageCatogery().setVisible(true);
    }//GEN-LAST:event_btnCatogeryActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnVerifyUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyUsersActionPerformed
       
        new VerifyUsers().setVisible(true);
    }//GEN-LAST:event_btnVerifyUsersActionPerformed

    private void btnViewEditDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEditDeleteProductActionPerformed
        
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnViewEditDeleteProductActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        new ChangeSecurityQuestion(email).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCatogery;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnVerifyUsers;
    private javax.swing.JButton btnViewEditDeleteProduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
