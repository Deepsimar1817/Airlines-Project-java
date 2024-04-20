/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline_managment;
import java.sql.*;

/**
 *
 * @author dell
 */
public class ConnectionClass {
    Connection con;
    Statement stm;

     ConnectionClass() {
         try
         {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/airline","root","");
                stm = con.createStatement();
         } catch (Exception e)
         {
             e.printStackTrace();
         }
         
    }
     public static void main(String[] args) {
        new ConnectionClass();
    }
    
    
    
}
