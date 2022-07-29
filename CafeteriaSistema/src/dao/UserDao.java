package dao;

import javax.swing.JOptionPane;
import model.Usuario;
import java.sql.*;
import java.util.ArrayList;
public class UserDao {
        public static void save(Usuario  user){
    String query = "insert into user(name, email,mobileNumber, address, password, securityQuestion, answer, status)  values('"+user.getNombre()+"' , '" +user.getEmail()+"', '"+user.getNumeroMobil()+"','"+ user.getDireccion()+"', '"+user.getContraseña()+"','"+ user.getPreguntaSeguridad()+"','" +user.getRespuesta()+"', 'false')";
    DbOperation.setDataOrDelete(query, "Registrado correctamente");
            
        }
        public static Usuario login(String email, String password){
            Usuario user =null;
            try{
                ResultSet rs = DbOperation.getData("select * from user where email='" +email+ "' and password='"+password + "' ");
                while(rs.next()){
                    user = new Usuario();
                    user.setEstado(rs.getString("status"));
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            } 
            return user;
        }
        
        public static Usuario getSecurityQuestion(String email){
            Usuario user = null;
            try{
                ResultSet rs = DbOperation.getData("Select * from user where email = '" + email + "' ");
                while(rs.next()){
                    user = new Usuario();
                    user.setPreguntaSeguridad(rs.getString("securityQuestion"));
                    user.setRespuesta(rs.getString("answer"));
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            return user;
        }
       public static void update(String email, String newPassword){
           String query = "update user set password = '" + newPassword +"' where email ='" + email+ "'  ";
           DbOperation.setDataOrDelete(query, "password change successfully");
       } 
       public static ArrayList<Usuario> getAllRecords(String email){
            ArrayList<Usuario> arrayList = new ArrayList<>();
            
            try{
               ResultSet rs = DbOperation.getData("select * from user where email like '%"+email+"%'");
               while(rs.next()){
                   Usuario user = new Usuario();
                   user.setId(rs.getInt("id"));
                   user.setNombre(rs.getString("name"));
                   user.setEmail(rs.getString("email"));
                   user.setNumeroMobil(rs.getString("mobileNumber"));
                   user.setDireccion(rs.getString("address"));
                   user.setPreguntaSeguridad(rs.getString("securityQuestion"));
                   user.setEstado(rs.getString("status"));
                   arrayList.add(user);
               }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            return arrayList;
       }
       public static void changeStatus(String email,String status){
           String query = "update user set status= '"+status+"' where email = '"+email+"'";
           DbOperation.setDataOrDelete(query, "Satus change successfully");
       }
       public static void changePassword(String email, String oldPassword, String newPassword){
           try{
              
               ResultSet rs = DbOperation.getData("select * from user where email = '"+email+"' and password = '"+ oldPassword+"'");
               if(rs.next()){
                   update(email, newPassword);
                   
               }else{
                   
                   JOptionPane.showMessageDialog(null, "Old password is wrong");
               }
               
           }catch(Exception ex){
               JOptionPane.showMessageDialog(null, ex);
           }
       }
       
       public static void changeSecurityQuestion(String email, String password, String securityQuestion, String answer){
           try{
               ResultSet rs = DbOperation.getData("select * from user where email = '" + email+"' and password = '" +password+ "'");
               if(rs.next()){
                   update(email, securityQuestion,answer );
               }else{
                   JOptionPane.showMessageDialog(null, "Password is wrong");
               }
               
           }catch(Exception ex){
               JOptionPane.showMessageDialog(null, ex);
           }
       }
       public static void update(String email, String securityQuestion, String answer){
           String query = "update user set securityQuestion='"+ securityQuestion+"' , answer ='"+answer+"' where email='" +email+ "'";
           DbOperation.setDataOrDelete(query, "Security Question Change Succesfully");
       }

}
