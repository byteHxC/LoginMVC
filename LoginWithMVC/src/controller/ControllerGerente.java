/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.*;
import javax.swing.JOptionPane;
import mainProject.ProjectMain;
import model.*;
import view.JFGerente;

/**
 *
 * @author ByteDrive
 */
public class ControllerGerente  {
    JFGerente vistaGerente;
    Empleado empleado ;
    
    String dni,password,privilegio;
    public ControllerGerente(){
        this.vistaGerente = new JFGerente();
        this.empleado = new Empleado();
       
        
        //Eventos
        this.vistaGerente.btnGetData.addActionListener((ActionEvent e)->{
                empleado = ControllerDB.verifyUser(dni, password, privilegio);
                String str = "DATOS DE USUARIO GERENTE \nNombre completo: " + empleado.getNombres() + " "+empleado.getApellidos() +
                "\nPrivilegio: " + empleado.getPrivilegio();
                JOptionPane.showMessageDialog(vistaGerente,str);
        });
        
        this.vistaGerente.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ProjectMain.init();
                vistaGerente.dispose();
            }
        });
        
        
    }

    
    public void inicializaGerente(String dni,String password,String privilegio){
        this.dni = dni;
        this.password = password;
        this.privilegio = privilegio;
    }
    
   
}
