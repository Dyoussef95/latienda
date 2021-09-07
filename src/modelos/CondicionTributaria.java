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
public class CondicionTributaria {
    private int id;
    private String descripcion;
    private Datos datos = Datos.getDatos();

    public CondicionTributaria() {
    }

    public CondicionTributaria(String descripcion) {
        this.descripcion = descripcion;
    }

    public CondicionTributaria(int id, String descripcion) {
        this.id = id;
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
        return "CondicionTributaria{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }
    
     public CondicionTributaria buscarPorId(int id){
        CondicionTributaria cond = null;
        for(CondicionTributaria cd: datos.getCondicionTributarias()){
            if(cd.getId()==id){
                cond = cd;
            }
        }
        return cond;
    }
    
}
