/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import datos.Datos;

/**
 *
 * @author Miguel
 */
public class LineaVenta {
    private int id;
    private int idProducto;
    private int cantidad;
    private float subTotal;
    private Datos datos = Datos.getDatos();

    public LineaVenta(int id, int idProducto, int cantidad, float subTotal) {
        this.id = id;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }
    
    public LineaVenta(int idProducto, int cantidad, float subTotal) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "LineaVenta{" + "id=" + id + ", idProducto=" + idProducto + ", cantidad=" + cantidad + ", subTotal=" + subTotal + '}';
    }

    public void guardarLineaVenta(LineaVenta linea){
        if(datos.getLineaVentas().isEmpty()){
           linea.setId(0);
        }else{
           linea.setId(datos.getLineaVentas().get(datos.getLineaVentas().size()-1).getId()+1);
        }
        datos.getLineaVentas().add(linea);
    }
    
    
    
}
