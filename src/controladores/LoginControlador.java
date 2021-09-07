/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;
import modelos.Usuario;
import vistas.Login;

/**
 *
 * @author Miguel
 */
public class LoginControlador {
    Usuario usuarios = new Usuario();
    
    Login vistaLogin;

    public LoginControlador(Login vistaLogin) {
        this.vistaLogin = vistaLogin;
    }    
    
    public void iniciarSesion(String usuarioIngresado, String contraseniaIngresada){
        int usuarioId =0;
        boolean esCorrecto = false;
        Usuario u = new Usuario();
        u = u.validarUsuario(usuarioIngresado, contraseniaIngresada);
        if(u == null){ 
            showMessageDialog(null, "Usuario o contraseña incorrectos");
        }else{            
            //usuarioId=u.getId();
            this.vistaLogin.cerrarLogin(usuarioId);
        }
        
        
    }
}
