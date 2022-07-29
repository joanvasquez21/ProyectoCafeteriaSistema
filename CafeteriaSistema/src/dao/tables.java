package dao;

import javax.swing.JOptionPane;

public class tables {
public static void main(String[] args){
    try{
      //  String userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200), email varchar(200), mobileNumber varchar(10), address varchar(200), password varchar(200), securityQuestion varchar(200), answer varchar(200), status varchar(20), UNIQUE(email))"; 
        //String adminDetails = "insert into user(name, email, mobileNumber, address, password,securityQuestion,answer, status) values('Admin' , 'admin@gmail.com', '963852741', 'Peru', 'joan21', 'Como se llama tu primera mascota?', 'Cloe', 'true' ) ";
       // String categoryTable = "create table category (id int AUTO_INCREMENT primary key, name varchar(200) )"; 
       // String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price varchar(200))"; 
        //DbOperation.setDataOrDelete(userTable, "User table create Succesfully");
     //   DbOperation.setDataOrDelete(adminDetails, "Admin Details added Succesfully");
      //  DbOperation.setDataOrDelete(categoryTable, "Category table create  Succesfully");
        //DbOperation.setDataOrDelete(productTable, "Producto table create  Succesfully");
         String billTable = "create table bill(id int AUTO_INCREMENT primary key, name varchar(200),mobileNumber varchar(200), email varchar(200), date varchar(50), total varchar(200), createdBy varchar(200))"; 
         DbOperation.setDataOrDelete(billTable, "Bill table create successfully");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
}
} 
