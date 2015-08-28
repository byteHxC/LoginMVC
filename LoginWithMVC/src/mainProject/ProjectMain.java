/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainProject;

import controller.ControllerLogin;

/**
 *
 * @author ByteDrive
 */
public class ProjectMain {
     static ControllerLogin  controlador;
    
    public static void main(String[] args) {
        controlador= new ControllerLogin();
    }
    public static void  init(){
       controlador = new ControllerLogin();
    }
}
