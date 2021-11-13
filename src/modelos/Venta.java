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
public class Venta {
    private int id;
    private String fecha;
    private int lineas[];
    private float importe;
    private Datos datos = Datos.getDatos();
    
    public Venta(){
        
    }

    public Venta(int id, String fecha, int[] lineas, float importe) {
        this.id = id;
        this.fecha = fecha;
        this.lineas = lineas;
        this.importe = importe;
    }
    
    public Venta(String fecha, int[] lineas, float importe) {
        this.fecha = fecha;
        this.lineas = lineas;
        this.importe = importe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int[] getLineas() {
        return lineas;
    }

    public void setLineas(int[] lineas) {
        this.lineas = lineas;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", fecha=" + fecha + ", lineas=" + lineas + ", importe=" + importe + '}';
    }
    
    public double montoTotal(float subTotales[]){
        double total = 2.5;
        
        return total;
    }
    
    public boolean puedeSerAnonimo(double montoTotal){
        boolean bandera=true;
        if(montoTotal>10000){
            bandera=false;
        }
        return bandera;
    }
    
    public String determinarTipoComprobante(int cd){
        String tipoComp="B";
        if(cd==0 || cd==1){
            tipoComp = "A";
        }
        return tipoComp;
    }
    
    public void guardarVenta(Venta venta){
        if(datos.getVentas().isEmpty()){
           venta.setId(0);
        }else{
           venta.setId(datos.getVentas().get(datos.getVentas().size()-1).getId()+1);
        }
        datos.getVentas().add(venta);
    }
    
}
