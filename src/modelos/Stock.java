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
 * @author Lorena
 */
public class Stock {
    private int id;
    private int cantidad;
    private int idProducto;
    private int idColor;
    private int idTalle;
    private Datos datos = Datos.getDatos();

    public Stock(int id, int cantidad, int idProducto, int idColor, int idTalle) {
        this.id = id;
        this.cantidad = cantidad;
        this.idProducto = idProducto;
        this.idColor = idColor;
        this.idTalle = idTalle;
    }

    public Stock(int cantidad, int idProducto, int idColor, int idTalle) {
        this.cantidad = cantidad;
        this.idProducto = idProducto;
        this.idColor = idColor;
        this.idTalle = idTalle;
    }

    public Stock() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public int getIdTalle() {
        return idTalle;
    }

    public void setIdTalle(int idTalle) {
        this.idTalle = idTalle;
    }

    @Override
    public String toString() {
        return "Stock{" + "id=" + id + ", cantidad=" + cantidad + ", idProducto=" + idProducto + ", idColor=" + idColor + ", idTalle=" + idTalle + '}';
    }
    
    public ArrayList<Stock> buscarPorProductoId(int idProducto){
        ArrayList<Stock> stocks = new ArrayList<>();
        for(Stock st: datos.getStocks()){
            if(st.getIdProducto()==idProducto){
                stocks.add(st);
            }
        }
        return stocks;
    }
    
    public Stock buscarPorColorIdTalleIdProductoId(int idColor,int idTalle,int idProducto){
        Stock stock = null;
        for(Stock st: datos.getStocks()){
            if(st.getIdProducto()==idProducto && st.getIdColor()==idColor && st.getIdTalle()==idTalle){
                stock = st;
            }
        }
        return stock;
    }
}
