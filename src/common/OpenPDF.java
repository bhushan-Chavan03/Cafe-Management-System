package common;

import java.awt.Desktop;
import javax.swing.JOptionPane;
import java.io.File;


public class OpenPDF{
    public static void openById(String id){
        try{
             Desktop desktop = Desktop.getDesktop();
            File file=new File("C:/Bills/"+id+".pdf");
            if(file.exists()){
            Process p=Runtime
                    .getRuntime()
                    .exec("rundll32 url.dll,FileProtocolHandler C:/Bills/'"+id+"'.pdf");
        }
            
         else
               JOptionPane.showMessageDialog(null, "File dosen't exist");
               
                desktop.open(file);
        
        }
        
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }
    
    
    public static void main(String []args){
        openById("20");
    }
    
    
}