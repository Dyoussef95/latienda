/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import datos.Datos;
import modelos.Producto;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class ProductoTest {
    
    @BeforeClass
    public static void setUpClass() {
        Datos.crearDatos();
    }
    
    @Test
    public void calcularNetoGravadoDeUnProducto(){
       
        //Configuracion        
        Producto producto = new Producto();
        
        //Ejecucion
        producto.calcularNetoGravado(700, 0.20);
        
        //Comprobacion
        Assert.assertEquals(840, producto.getNetoGravado(), 0);
    }
    
    @Test
    public void calcularIvaDeUnProducto(){
       
        //Configuracion        
        Producto producto = new Producto();
        
        //Ejecucion
        producto.calcularIva(840);
        
        //Comprobacion
        Assert.assertEquals(176.4, producto.getIva(), 0);
    }
    
    @Test
    public void calcularPrecioDeVentaDeUnProducto(){
       
        //Configuracion        
        Producto producto = new Producto();
        
        //Ejecucion
        producto.calcularPrecioVenta(840, 176.4);
        
        //Comprobacion
        Assert.assertEquals(1016.4, producto.getPrecioVenta(), 0);
    }
    
}
