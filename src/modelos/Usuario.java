/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import datos.Datos;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Usuario {
    private int id;
    private String usuario;
    private String contraseña;
    private Datos datos = Datos.getDatos();
    private int rol;

    public Usuario(int id, String usuario, String contraseña, int rol) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public Usuario() {
        
    }
    
    public Usuario(int idUsuario){
        Usuario usuario = datos.getUsuario(idUsuario);
        if(usuario != null){
            this.id = datos.getUsuario(idUsuario).id;
            this.usuario = datos.getUsuario(idUsuario).usuario;
            this.contraseña = datos.getUsuario(idUsuario).contraseña;
            this.rol = datos.getUsuario(idUsuario).rol;   
        }        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
    public ArrayList<Usuario> getUsuarios(){
        return datos.getUsuarios();
    }
    
    public Usuario validarUsuario(String usuarioIngresado, String contraseñaIngresada){
        Usuario usuario = null;
        for(Usuario u : datos.getUsuarios()){
            
            if(u.getUsuario().equals(usuarioIngresado)){
                
                if(u.getContraseña().equals(contraseñaIngresada)){
                    
                    usuario = u;
                }
            }
        }
        return usuario;
    }
    
    
}
