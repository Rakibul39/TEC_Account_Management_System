package SoftwareProject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Rakibul Islam Rony
 */
public class MysqlConnection {

    private static final String Passward = "";
    private static final String Name = "root";
    private static final String Conn_String = "jdbc:mysql://localhost:3306/";
    
    public static void main(String [] args) {
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection(Conn_String, Name, Passward);
            JOptionPane.showMessageDialog(null, "Data base connection successfully ");
            System.out.println("Connected");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "not connected");
            System.err.println(e);
        }
        //return conn;
    }
    
}
