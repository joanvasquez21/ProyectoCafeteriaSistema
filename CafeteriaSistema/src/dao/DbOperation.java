package dao;

import com.mysql.cj.protocol.Resultset;
import javax.swing.JOptionPane;
import java.sql.*;

public class DbOperation {
public static void setDataOrDelete(String Query, String msg){
    try{
        Connection con =  ConnectionProvider.getCon();
        Statement st = con.createStatement();
        st.executeUpdate(Query);
        if(!msg.equals("")){
            JOptionPane.showMessageDialog(null, msg);
        }
        
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
    }
}
public static  ResultSet getData(String query){
    try{
     Connection con = ConnectionProvider.getCon();
     Statement  st = con.createStatement();
     Resultset  rs = (Resultset) st.executeQuery(query);
     return (ResultSet) rs;
    
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
        return null;
    }
}


}
