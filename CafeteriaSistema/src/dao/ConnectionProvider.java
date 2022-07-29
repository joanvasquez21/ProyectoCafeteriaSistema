package dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionProvider {
    public static Connection getCon() throws SQLException, ClassNotFoundException {

           Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?allowPublicKeyRetrieval=true&useSSL=false", "root", "12345");  //para la conexion
            return con;
        }
       
        
}
