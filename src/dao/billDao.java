
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bill;


public class billDao {
    public static String getId(){
        int id=1;
        try{
            ResultSet rs=DbOperations.getData("select max(id) from bill");
            if(rs.next())
                id=rs.getInt(1);
                id=id+1;
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        return String.valueOf(id);
    }
    
    public static void save(bill Bill){
        String query="insert into bill values('"+Bill.getId()+"','"+Bill.getName()+"','"+Bill.getMobileNumber()+"','"+Bill.getEmail()+"','"+Bill.getDate()+"','"+Bill.getTotal()+"','"+Bill.getCreatedBy()+"');";
        DbOperations.setDataorDelete(query,"Bill Details Added Successfully");
    }
    
    
    public static ArrayList<bill> getAllRecordsByInc(String date){
        ArrayList<bill> arrayList= new ArrayList<>();
        try{
            ResultSet rs=DbOperations.getData("select * from bill where date like '%"+date+"%'");
            while(rs.next()){
            bill bill=new bill();
            bill.setId(rs.getInt("id"));
            bill.setName(rs.getString("name"));
            bill.setMobileNumber(rs.getString("mobileNumber"));
            bill.setEmail(rs.getString("email"));
            bill.setDate(rs.getString("date"));
            bill.setTotal(rs.getString("total"));
            bill.setCreatedBy(rs.getString("createdBy"));
            arrayList.add(bill);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    
    }
    
    
     public static ArrayList<bill> getAllRecordsByDesc(String date){
        ArrayList<bill> arrayList= new ArrayList<>();
        try{
            ResultSet rs=DbOperations.getData("select * from bill where date like '%"+date+"%' order By id DESC");
            while(rs.next()){
            bill bill=new bill();
            bill.setId(rs.getInt("id"));
            bill.setName(rs.getString("name"));
            bill.setMobileNumber(rs.getString("mobileNumber"));
            bill.setEmail(rs.getString("email"));
            bill.setDate(rs.getString("date"));
            bill.setTotal(rs.getString("total"));
            bill.setCreatedBy(rs.getString("createdBy"));
            arrayList.add(bill);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    
    }
}
