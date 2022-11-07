/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.management;

import java.sql.*;

public class DBconnect {
    public static Connection connectDB(){
        Connection con = null;
      try{
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost/shopmanagement", "root", "");
          return con;
      }catch (Exception ex){
        System.out.println("There are error");
        return null;
      }
        
    }
    
}
