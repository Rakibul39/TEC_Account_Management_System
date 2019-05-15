/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftwareProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Rakibul Islam Rony
 */
public class InfoView {
    private int id,due;
    private String ss, name, batch, dp;
    
    public InfoView(int id, String name, String dp, String ss, String batch, int due){
        this.id = id;
        this.due = due;
        this.batch = batch;
        this.dp = dp;
        this.name = name;
        this.ss = ss;
        
    }
    public int getId(){
        return id;
    }
    public int getDue(){
        return due;
    }
    public String getName(){
        return name;
    }
    public String getSs(){
        return ss;
    }
    public String getDp(){
        return dp;
    }
    public String getBatch(){
        return batch;
    }
   /* Connection conn= null;
        try{
            //Class.forName("com.mysql.jdbc.driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ams", "root", "");
            //JOptionPane.showMessageDialog(null, "Succesful");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "unSuccesful");
            //System.out.println(e);
            
        }
        
        PreparedStatement st;
        String query = "INSERT INTO `student information`(`roll`, `Name`, `Department`, `Batch`, `Session`, `Due`) VALUES (?,?,?,?,?,?)";
        
        try{
            st = conn.prepareStatement(query);
            
            st.setInt(1, id);
            st.setString(2, name);
            st.setString(3, dp);
            st.setString(4, batch);
            st.setString(5, ss);
            st.setInt(6, due);
            if(st.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Information Added");
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }*/
}
