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
public class Cliente {
    private int id;
    private long cuit;
    private String nombre;
    private String domicilio;
    private int condicionTributariaId;
    private Datos datos = Datos.getDatos();

    public Cliente(int id, long cuit, String nombre, String domicilio, int condicionTributariaId) {
        this.id = id;
        this.cuit = cuit;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.condicionTributariaId = condicionTributariaId;
    }

    public Cliente(long cuit, String nombre, String domicilio, int condicionTributariaId) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.condicionTributariaId = condicionTributariaId;
    }

    public Cliente(int idCliente){
        Cliente cliente = datos.getCliente(idCliente);
        if(cliente != null){
            this.id = cliente.getId();
            this.cuit = cliente.getCuit();
            this.nombre = cliente.getNombre();
            this.domicilio = cliente.getDomicilio();
            this.condicionTributariaId = cliente.getCondicionTributariaId();
        }
    }
    
    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getCondicionTributariaId() {
        return condicionTributariaId;
    }

    public void setCondicionTributariaId(int condicionTributariaId) {
        this.condicionTributariaId = condicionTributariaId;
    }
    
    public Cliente buscarPorCuit(long cuit){
        Cliente cliente = null;
        for(Cliente c: datos.getClientes()){
            if(c.getCuit()==cuit){
                cliente = c;
            }
        }
        return cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", cuit=" + cuit + ", nombre=" + nombre + ", domicilio=" + domicilio + ", condicionTributariaId=" + condicionTributariaId + '}';
    }

    
    
    
    
}
