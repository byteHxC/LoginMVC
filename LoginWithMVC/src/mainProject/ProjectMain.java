/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainProject;

import controller.ControllerLogin;
import model.EmpleadoDAO;
import view.JFLogin;

/**
 *
 * @author ByteDrive
 */
public class ProjectMain {
    public static void main(String[] args) {
        JFLogin viewL= new JFLogin();
        EmpleadoDAO modeloL = new EmpleadoDAO();
        ControllerLogin controladorL = new ControllerLogin(viewL,modeloL);
        viewL.setVisible(true);
        viewL.setLocationRelativeTo(null);
    }
    
}
