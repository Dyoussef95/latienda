/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import datos.Datos;

/**
 *
 * @author Lorena
 */
public class Color {
    
    private int id;
    private String descripcion;
    private Datos datos = Datos.getDatos();

    public Color() {
    }

    public Color(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Color(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Color{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }
    
    public Color buscarPorId(int idColor){
        Color color = null;
        for(Color c: datos.getColores()){
            if(c.getId()==idColor){
                color = c;
            }
        }
        return color;
    }
    
    
}
