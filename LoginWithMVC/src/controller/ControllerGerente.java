/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.*;
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
    
    public ControllerGerente(){
        System.out.println("hola hijo de perra, baby");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
}
