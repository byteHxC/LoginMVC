/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

/**
 *
 * @author ByteDrive
 */
public class ConnectionMySQL {
    
    
    public ConnectionMySQL(){}
    
    public static Connection getConnection(){
        Connection cn=null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/SystemWithMySQLx","root","#%xampp/1");
            System.out.println("Connection successful");
                    
        }catch(SQLException sqle){
            System.out.println("Error: getConnection()->SQLException"+sqle.getMessage());
        }catch(Exception e){
            System.out.println("Error: getConnection()->Exception"+e.getMessage());
        }
        return cn;
    }
}
