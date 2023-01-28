
package cafe.management.system;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import common.OpenPDF;
import dao.CategoryDao;
import dao.ProductDao;
import dao.billDao;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Category;
import model.Product;
import model.bill;



public class PlacceOrder extends javax.swing.JFrame {
    public int billId=1;
    public int grandTotal=0;
    public int productPrice;
    public int productTotal=0;
    public String emailPattern="^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern="^[0-9]*$";
    public String userEmail;
    

    
    public PlacceOrder() {
        initComponents();
    }
    
    public PlacceOrder(String email) {
        initComponents();
        txtProName.setEditable(false);
        txtProPrice.setEditable(false);
        txtProTotal.setEditable(false);
        btnAddToCart.setEnabled(false);
        btnGenerateBillPrint.setEnabled(false);
        JFormattedTextField tf=((JSpinner.DefaultEditor)jSpinner1.getEditor()).getTextField();
        tf.setEditable(false);
        userEmail=email;
    }
    
    public void productNameByCategory(String category){
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list= ProductDao.getAllRecordsByCategory(category);
        Iterator<Product> itr=list.iterator();
        while(itr.hasNext()){
            Product productObj =itr.next();
            dtm.addRow(new Object[]{productObj.getName()});
        
        }
        
    }
    
    public void filterProductByname(String name,String category){
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Product> list= ProductDao.filterProductByname(name,category);
        Iterator<Product> itr=list.iterator();
        while(itr.hasNext()){
            Product productObj =itr.next();
            dtm.addRow(new Object[]{productObj.getName()});
        
        }
        
    }
    
    public void clearProductFields(){
        txtProName.setText("");
        txtProPrice.setText("");
        jSpinner1.setValue(1);
        txtProTotal.setText("");
        btnAddToCart.setEnabled(false);
        
    }
    
    public void validateField(){
        String customerName=txtCustemorName.getText();
        String customerMobileNumber=txtCustomerMobileNumber.getText();
        String customerEmail=txtCustomerEmail.getText();
        if (!customerEmail.equals("") && customerMobileNumber.matches(mobileNumberPattern) && customerMobileNumber.length()==10 && customerEmail.matches(emailPattern) && grandTotal>0){
            btnGenerateBillPrint.setEnabled(true);
            
        
        
        }
        
        else{
            btnGenerateBillPrint.setEnabled(false);
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCustemorName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCustomerMobileNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCustomerEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtProName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtProPrice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtProTotal = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnAddToCart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        lblGrandTotal = new javax.swing.JLabel();
        btnGenerateBillPrint = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        jLabel1.setText("Place Order");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1409, 17, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bill ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("__");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer Details:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtCustemorName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCustemorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustemorNameActionPerformed(evt);
            }
        });
        txtCustemorName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustemorNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtCustemorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 222, 250, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mobile Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        txtCustomerMobileNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCustomerMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerMobileNumberKeyReleased(evt);
            }
        });
        getContentPane().add(txtCustomerMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 357, 250, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        txtCustomerEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCustomerEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtCustomerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 250, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Category");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 151, 250, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Search");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 278, 250, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 357, 250, 343));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, -1, -1));

        txtProName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtProName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtProName, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 151, 250, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Price");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 100, -1, -1));

        txtProPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtProPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtProPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1113, 151, 250, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Quantity");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 230, -1, -1));

        txtProTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtProTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtProTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 280, 250, -1));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 398, -1, -1));

        btnAddToCart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add to cart.png"))); // NOI18N
        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1222, 398, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity", "Total"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 580, 260));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Grand Total:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 730, -1, -1));

        lblGrandTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGrandTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblGrandTotal.setText("000");
        getContentPane().add(lblGrandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 730, -1, -1));

        btnGenerateBillPrint.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerateBillPrint.setText("Generate Bill & Print");
        btnGenerateBillPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateBillPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerateBillPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 730, -1, -1));

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 277, 246, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full-page-background.PNG"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        setVisible(false);
        new Home(userEmail).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    private void txtCustemorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustemorNameActionPerformed
        
    }//GEN-LAST:event_txtCustemorNameActionPerformed

    private void txtProNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProNameActionPerformed
        
    }//GEN-LAST:event_txtProNameActionPerformed

    private void txtProPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProPriceActionPerformed
       
    }//GEN-LAST:event_txtProPriceActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        
        String name=txtSearch.getText();
        String category=(String) jComboBox1.getSelectedItem();
        filterProductByname(name, category);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int index=jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String productName=model.getValueAt(index, 0).toString();
        Product product=ProductDao.getProductByname(productName);
        txtProName.setText(product.getName());
        txtProPrice.setText(product.getPrice());
        jSpinner1.setValue(1);
        txtProTotal.setText(product.getPrice());
        productPrice=Integer.parseInt(product.getPrice());
        productTotal=Integer.parseInt(product.getPrice());
        btnAddToCart.setEnabled(true);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        
        int quantity=(Integer) jSpinner1.getValue();
        if(quantity<=1){
            jSpinner1.setValue(1);
            quantity=1;
        }
        productTotal=productPrice *quantity;
        txtProTotal.setText(String.valueOf(productTotal));
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
        String category=(String )jComboBox1.getSelectedItem();
        productNameByCategory(category);//6.5.47
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        
        String name =txtProName.getText();
        String price=txtProPrice.getText();
        String quantity=String.valueOf(jSpinner1.getValue());
        DefaultTableModel dtm=(DefaultTableModel) jTable2.getModel();
        dtm.addRow(new Object[]{name,price,quantity,productTotal});
        grandTotal=grandTotal+productTotal;
        lblGrandTotal.setText(String.valueOf(grandTotal));
        
        clearProductFields();
        validateField();
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void txtCustemorNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustemorNameKeyReleased
        
        validateField();
    }//GEN-LAST:event_txtCustemorNameKeyReleased

    private void txtCustomerMobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerMobileNumberKeyReleased
       
        validateField();
    }//GEN-LAST:event_txtCustomerMobileNumberKeyReleased

    private void txtCustomerEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerEmailKeyReleased
        
        validateField();
    }//GEN-LAST:event_txtCustomerEmailKeyReleased

    private void btnGenerateBillPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateBillPrintActionPerformed
       
        String customerName=txtCustemorName.getText();
        String customerMobileNumber=txtCustomerMobileNumber.getText();
        String customerEmail=txtCustomerEmail.getText();
        SimpleDateFormat dFormat= new SimpleDateFormat("dd-MM-YYYY");
        Date date= new Date();
        String todaydate=dFormat.format(date);
        String total=String.valueOf(grandTotal);
        String createdBy=userEmail;
        bill bill= new bill();
        bill.setId(billId);
        bill.setName(customerName);
        bill.setMobileNumber(customerMobileNumber);
        bill.setEmail(customerEmail);
        bill.setDate(todaydate);
        bill.setTotal(total);
        bill.setCreatedBy(createdBy);
        billDao.save(bill);
        
        String path="C:/Bills/";
        com.itextpdf.text.Document doc= new com.itextpdf.text.Document();
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(path+""+billId+".pdf"));
            doc.open();
            Paragraph cafeName=new Paragraph("                                                              Cafe Management System\n");
            doc.add(cafeName);
            Paragraph starline =new Paragraph("****************************************************************************************");
            doc.add(starline);
            Paragraph paragraph3 =new Paragraph("\tBill ID:"+billId+"\nCustomer Name:  "+customerName+"  Total Paid:"+grandTotal);
            doc.add(paragraph3);
            doc.add(starline);
            PdfPTable tbl=new PdfPTable(4);
            tbl.addCell("Name");
            tbl.addCell("Price");
            tbl.addCell("Quantity");
            tbl.addCell("Total");
            
            for(int i=0;i<jTable2.getRowCount();i++){
                String n=jTable2.getValueAt(i, 0).toString();
                String d=jTable2.getValueAt(i, 1).toString();
                String r=jTable2.getValueAt(i, 2).toString();
                String q=jTable2.getValueAt(i, 3).toString();
                tbl.addCell(n);
                tbl.addCell(d);
                tbl.addCell(r);
                tbl.addCell(q);
                
            }
            doc.add(tbl);
            doc.add(starline);
            Paragraph thanksMsg= new Paragraph("Thank you,Please visit Again");
            doc.add(thanksMsg);
            OpenPDF.openById(String.valueOf(billId));
            
            
        }
        
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
        doc.close();
        setVisible(false);
        new PlacceOrder(createdBy).setVisible(true);
    }//GEN-LAST:event_btnGenerateBillPrintActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
         billId=Integer.parseInt(billDao.getId());
        jLabel3.setText(billDao.getId());
        ArrayList<Category> list=CategoryDao.getAllRecords();
        Iterator<Category> itr=list.iterator();
        while(itr.hasNext()){
            Category categoryObj=itr.next();
            jComboBox1.addItem(categoryObj.getName());
        }
        String category=(String) jComboBox1.getSelectedItem();
        productNameByCategory(category);
    }//GEN-LAST:event_formComponentShown

    private void txtProTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProTotalActionPerformed
       
    }//GEN-LAST:event_txtProTotalActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        int index=jTable2.getSelectedRow();
        int a=JOptionPane.showConfirmDialog(null, "Do you want to remove this product","Select",JOptionPane.YES_NO_CANCEL_OPTION);
        if(a==0){
            TableModel model=jTable2.getModel();
            String total=model.getValueAt(index,3).toString();
            grandTotal=grandTotal-Integer.parseInt(total);
            lblGrandTotal.setText(String.valueOf(grandTotal));
            ((DefaultTableModel) jTable2.getModel()).removeRow(index);
        }
    }//GEN-LAST:event_jTable2MouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlacceOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGenerateBillPrint;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblGrandTotal;
    private javax.swing.JTextField txtCustemorName;
    private javax.swing.JTextField txtCustomerEmail;
    private javax.swing.JTextField txtCustomerMobileNumber;
    private javax.swing.JTextField txtProName;
    private javax.swing.JTextField txtProPrice;
    private javax.swing.JTextField txtProTotal;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
