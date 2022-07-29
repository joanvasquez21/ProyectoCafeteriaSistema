package dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;
public class CategoryDap {

    public static void save(Category category) {
        String query = "insert into category(name) values('" + category.getName() + "')";
        DbOperation.setDataOrDelete(query, "Category added succesully");
    }

    public static ArrayList<Category> getAllRecords() {
        ArrayList<Category> arrayList = new ArrayList<>();
        try {
            ResultSet  rs = DbOperation.getData("select * from category");
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;

    }
    
    public static void delete(String id){
        String query = "delete from category where id='" + id +"'";
        DbOperation.setDataOrDelete(query, "Category delete succesfully");
    }
    
}