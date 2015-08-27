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
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_mvc","root","#%mysql/1");
            
                    
        }catch(SQLException sqle){
            System.out.println("Error: getConnection()->SQLException");
        }catch(Exception e){
            System.out.println("Error: getConnection()->Exception");
        }
        return cn;
    }
}
