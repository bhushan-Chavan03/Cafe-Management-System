
package dao;
import javax.swing.JOptionPane;



public class tables {
    public static void main(String []args){
        try{
        String userTable="Create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber Varchar(200),address Varchar(200),password Varchar(200),securityQuestion Varchar(200),answer Varchar(200),status Varchar(20),UNIQUE(email);)";
         String adminDetails="insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) Values('Admin','admin@gmail.com','1234567890','India','Admin@123','What primary school did you attend?','ABC','true')";
        String categoryTable="create table category(id int AUTO_INCREMENT primary  key,name Varchar(200)); ";
         String billTable="create table bill(id int  primary  key,name Varchar(200),mobileNumber Varchar(200),email Varchar(200),date Varchar(50),total Varchar(200),createdBy Varchar(200)) ";
        String productTable="create table product(id int AUTO_INCREMENT primary key,name Varchar(200),category Varchar(200), price Varchar(200));";
        
       // DbOperations.setDataorDelete(userTable,"User Table Created Successfully");
        //DbOperations.setDataorDelete(adminDetails,"Admin Table added Successfully");
         //DbOperations.setDataorDelete(categoryTable,"Category table created successfully");
         //DbOperations.setDataorDelete(productTable,"Product table created successfully");
         DbOperations.setDataorDelete(billTable,"Bill table created successfully");
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null ,e);
        }
    }
    
}
