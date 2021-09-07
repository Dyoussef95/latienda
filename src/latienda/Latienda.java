/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latienda;

import controladores.VistasControlador;
import datos.Datos;
import vistas.Login;

/**
 *
 * @author Miguel
 */
public class Latienda {

    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Datos.crearDatos();
        
        
        VistasControlador controlador = new VistasControlador();
        controlador.iniciar();
        
   
        
    }
    
   
    
}
