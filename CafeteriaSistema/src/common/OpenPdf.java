package common;

import java.awt.Desktop;
import java.io.File;
import javax.swing.JOptionPane;

public class OpenPdf {
    public static void openById(String id){
        
          Desktop desktop = Desktop.getDesktop();
        try {
            if((new File("C:\\Users\\Joan\\Downloads\\"+id+".pdf")).exists()){
                 desktop.open(new File("C:\\Users\\Joan\\Downloads\\"+id+".pdf"));
//                Process p = Runtime
//                        .getRuntime()
//                        .exec("rund1132 url.dll,FileProtocolHandler C:\\Users\\Joan\\Downloads\\"+id+".pdf");
                        
            }else{
                JOptionPane.showMessageDialog(null, "File is not Exists");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
