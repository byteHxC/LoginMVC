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
public class ControllerDB {
    
    public ControllerDB(){
    }
    
    public static Empleado verifyUser(String dni,String password,String privilegio){
        Empleado empleado=null;
        Connection accesoDB=ConnectionMySQL.getConnection();
        try{
            PreparedStatement pps=accesoDB.prepareStatement("SELECT *FROM empleados WHERE dni=? and password=? and privilegio=?");
            pps.setString(1, dni);
            pps.setString(2, password);
            pps.setString(3, privilegio);
        ResultSet rs=pps.executeQuery();
        if(rs.next()){
            empleado=new Empleado();
            empleado.setDni(rs.getString(1));
            empleado.setPassword(rs.getString(2));
            empleado.setApellidos(rs.getString(3));
            empleado.setNombres(rs.getString(4));
            empleado.setPrivilegio(rs.getString(5));
            return empleado;
        }
        }catch(SQLException sqle){
            System.out.println("Error: verifyUser()->SQLException"+sqle.getMessage());
        }
        
        
        return empleado;
    }
}
