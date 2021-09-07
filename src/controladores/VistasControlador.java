/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import datos.Datos;
import modelos.Usuario;
import vistas.Login;
import vistas.VistaVenta;

/**
 *
 * @author Miguel
 */
public class VistasControlador {
    Login vistaLogin = new Login(this);
    VistaVenta vistaVenta;
    
    
    
    public void iniciar(){
        vistaLogin.setVisible(true);
        
      
    }
    
    public void mostrarVenta(){
        vistaVenta = new VistaVenta(this);
        vistaLogin.setVisible(false);
        vistaVenta.setVisible(true);
    }
}
