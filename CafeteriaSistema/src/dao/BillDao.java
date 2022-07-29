package dao;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import model.Bill;
public class BillDao {
    public static String getId(){
        int id = 1;
        try{
            ResultSet rs = DbOperation.getData("select max(id) from bill");
            if(rs.next()){
                id= rs.getInt(1);
                id = id + 1;
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
        
    }
    
    public static void save(Bill bill){
        String  query = "insert into bill values('"+bill.getId()+"','" + bill.getName() + "', '"+ bill.getMobileNumber()+"', '"+ bill.getEmail()+"','"+ bill.getDate()+"','"+ bill.getTotal()+"','"+ bill.getCreatedBy()+"')";
        DbOperation.setDataOrDelete(query, "Bil Details Added Succesfully");
        
    }
    public static ArrayList<Bill> getAllRecordsByInc(String date){
     ArrayList<Bill> arrayList = new ArrayList<>();
     try{
         ResultSet rs = DbOperation.getData("SELECT * FROM bill ORDER BY date ;");
         while(rs.next()){
         Bill bill = new Bill();
         bill.setId(rs.getInt("id"));
         bill.setName(rs.getString("name"));
         bill.setMobileNumber(rs.getString("mobileNumber"));
         bill.setEmail(rs.getString("email"));
         bill.setDate(rs.getString("date"));
         bill.setTotal(rs.getString("total"));
         bill.setCreatedBy(rs.getString("createdBy"));
         arrayList.add(bill);
         }
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, ex);
     }
     return arrayList;
     
    }
    
    public static ArrayList<Bill> getAllRecordsByDesc(String date){
     ArrayList<Bill> arrayList = new ArrayList<>();
     try{
         ResultSet rs = DbOperation.getData("SELECT * FROM bill ORDER BY date DESC;");
         while(rs.next()){
         Bill bill = new Bill();
         bill.setId(rs.getInt("id"));
         bill.setName(rs.getString("name"));
         bill.setMobileNumber(rs.getString("mobileNumber"));
         bill.setEmail(rs.getString("email"));
         bill.setDate(rs.getString("date"));
         bill.setTotal(rs.getString("total"));
         bill.setCreatedBy(rs.getString("createdBy"));
         arrayList.add(bill);
         }
     }catch(Exception ex){
         JOptionPane.showMessageDialog(null, ex);
     }
     return arrayList;
     
    }
    
    
}
