/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareProject;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Rakibul Islam Rony
 */
public class NewConnection {
    public static Connection getConnection(){
        Connection conn= null;
        try{
            //Class.forName("com.mysql.jdbc.driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/login_register", "root", "");
            //JOptionPane.showMessageDialog(null, "Succesful");
            
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(null, "unSuccesful");
            System.out.println(e);
            
        }
        return conn;
    }
    /*public static void main(String [] args){
        
        NewConnection n = new NewConnection();
        n.getConnection();
        
    }*/
    
}
