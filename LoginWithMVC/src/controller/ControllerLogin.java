package controller;

import java.awt.event.*;
import javax.swing.*;
import model.*;
import view.JFLogin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ByteDrive
 */
public class ControllerLogin implements ActionListener {
    JFLogin vistaLogin = new JFLogin();
    EmpleadoDAO modeloLogin = new EmpleadoDAO();
    Empleado empleado = new Empleado();
    
    public ControllerLogin(JFLogin vistaLogin,EmpleadoDAO modeloLogin){
        this.vistaLogin=vistaLogin;
        this.modeloLogin=modeloLogin;
        this.vistaLogin.btnIngresar.addActionListener(this);
    }
    
    public void inicialziarLogin(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String dni = (vistaLogin.txtDni.getText().length()>0) ? vistaLogin.txtDni.getText() : null;
        String password = String.valueOf((vistaLogin.txtPassword.getPassword().length>0 ) ? vistaLogin.txtPassword.getText() : null);
        String privilegio=String.valueOf(vistaLogin.cboxPrivilegio.getSelectedItem());
        empleado=modeloLogin.verifyUser(dni, password, privilegio);
        
        if(empleado!=null){
            JOptionPane.showMessageDialog(vistaLogin,"Datos correctos");

        }else{
            JOptionPane.showMessageDialog(vistaLogin,"Empleado con datos ingresados no encontrado");
        }
        
    }

}
