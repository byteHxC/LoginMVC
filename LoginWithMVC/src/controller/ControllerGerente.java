/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.*;
import javax.swing.JOptionPane;
import model.*;
import view.JFGerente;

/**
 *
 * @author ByteDrive
 */
public class ControllerGerente implements ActionListener {
    JFGerente vistaGerente = new JFGerente();
    EmpleadoDAO modeloGerente = new EmpleadoDAO();
    Empleado empleado = new Empleado();
    
    String dni,password,privilegio;
    public ControllerGerente(JFGerente vistaGerente,EmpleadoDAO modeloGerente){
        this.vistaGerente = vistaGerente;
        this.modeloGerente = modeloGerente;
        this.vistaGerente.btnGetData.addActionListener(this);
    }

    
    public void inicializaGerente(String dni,String password,String privilegio){
        this.dni = dni;
        this.password = password;
        this.privilegio = privilegio;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       empleado = modeloGerente.verifyUser(dni, password, privilegio);
       String str = "DATOS DE USUARIO GERENTE \nNombre completo: " + empleado.getNombres() + " "+empleado.getApellidos() +
        "\nPrivilegio: " + empleado.getPrivilegio();
       JOptionPane.showMessageDialog(vistaGerente,str);
    }
   
}
