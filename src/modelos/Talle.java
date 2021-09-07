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
public class Talle {
    private int id;
    private String descripcion;
    private int tipoTalleId;
    private Datos datos = Datos.getDatos();

    public Talle(int id, String descripcion, int tipoTalleId) {
        this.id = id;
        this.descripcion = descripcion;
        this.tipoTalleId = tipoTalleId;
    }

    public Talle(String descripcion, int tipoTalleId) {
        this.descripcion = descripcion;
        this.tipoTalleId = tipoTalleId;
    }

    public Talle() {
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

    public int getTipoTalleId() {
        return tipoTalleId;
    }

    public void setTipoTalleId(int tipoTalleId) {
        this.tipoTalleId = tipoTalleId;
    }

    @Override
    public String toString() {
        return "Talle{" + "id=" + id + ", descripcion=" + descripcion + ", tipoTalleId=" + tipoTalleId + '}';
    }

    public Talle buscarPorId(int idTalle){
        Talle talle = null;
        for(Talle t: datos.getTalles()){
            if(t.getId()==idTalle){
                talle = t;
            }
        }
        return talle;
    }
    

   
    
    
}
