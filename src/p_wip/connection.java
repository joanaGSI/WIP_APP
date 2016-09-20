/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_wip;

/**
 *
 * @author joana
 */
import java.sql.*;
import javax.swing.*;


public class connection {
final static String user   = "root";
    final static String pass   = "";
    
    //connection
    final static String driver   = "com.mysql.jdbc.Driver"; 
    final static String url   = "jdbc:mysql://localhost:3306/projetos?zeroDateTimeBehavior=convertToNull";
    
    
    public static Connection connect(){
        try{
            Class.forName(driver); //Carrega o driver especificado
            Connection conn=DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to database!");
            return conn;
             
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    

}