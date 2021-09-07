/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Lorena
 */
public class Empleado {
    private int id;
    private int legajo;
    private String nombre;

    public Empleado() {
    }

    public Empleado(int legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public Empleado(int id, int legajo, String nombre) {
        this.id = id;
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", legajo=" + legajo + ", nombre=" + nombre + '}';
    }
    
    
}
