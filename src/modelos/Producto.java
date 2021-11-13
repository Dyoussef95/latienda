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
public class Producto {
    private int id;
    private int codigo;
    private String descripcion;
    private double costo;
    private double margenGanancia;
    private double netoGravado;
    private double iva;
    private double precioVenta;
    private int rubroId;
    private int marcaId;
    private Datos datos = Datos.getDatos();

    public Producto() {
    }

    public Producto(int id, int codigo, String descripcion, double costo, double margenGanancia, int rubroId, int marcaId) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costo = costo;
        this.margenGanancia = margenGanancia;
        this.rubroId = rubroId;
        this.marcaId = marcaId;
        this.calcularNetoGravado();
        this.calcularIva();
        this.calcularPrecioVenta();
    }

    public Producto(int codigo, String descripcion, double costo, double margenGanancia, int rubroId, int marcaId) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costo = costo;
        this.margenGanancia = margenGanancia;
        this.rubroId = rubroId;
        this.marcaId = marcaId;
        this.calcularNetoGravado();
        this.calcularIva();
        this.calcularPrecioVenta();
    }
    
    public Producto buscarPorCodigo(int codigo){
        Producto producto = null;
        for(Producto p: datos.getProductos()){
            if(p.getCodigo()==codigo){
                producto = p;
            }
        }
        return producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    public double getNetoGravado() {
        return netoGravado;
    }

    public void setNetoGravado(double netoGravado) {
        this.netoGravado = netoGravado;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getRubroId() {
        return rubroId;
    }

    public void setRubroId(int rubroId) {
        this.rubroId = rubroId;
    }

    public int getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(int marcaId) {
        this.marcaId = marcaId;
    }
    
    private void calcularNetoGravado(){
        this.netoGravado = this.costo + this.costo*this.margenGanancia;
    }
    
    public void calcularNetoGravado(double costo, double margenGanancia){
        this.netoGravado = costo + costo*margenGanancia;
    }
    
    private void calcularIva(){
        this.iva = this.netoGravado * 0.21;
    }
    
    public void calcularIva(double netoGravado){
        this.iva = netoGravado * 0.21;
    }
    
    private void calcularPrecioVenta(){
        this.precioVenta = this.netoGravado + this.iva;
    }
    
    public void calcularPrecioVenta(double netoGravado, double iva){
        this.precioVenta = netoGravado + iva;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", codigo=" + codigo + ", descripcion=" + descripcion + ", costo=" + costo + ", margenGanancia=" + margenGanancia + ", netoGravado=" + netoGravado + ", iva=" + iva + ", precioVenta=" + precioVenta + ", rubroId=" + rubroId + ", marcaId=" + marcaId + '}';
    }

    
    
}
