/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import datos.Datos;
import modelos.Cliente;
import modelos.Venta;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class VentaTest {
    
    @BeforeClass
    public static void setUpClass() {
        Datos.crearDatos();
    }
    
    @Test
    public void determinarSiElClientePuedeSerAnonimoEnUnaVenta(){
       
        //Configuracion        
        Venta venta = new Venta();
        boolean esAnonimo;
        
        //Ejecucion
        esAnonimo = venta.puedeSerAnonimo(11000);
        
        //Comprobacion
        Assert.assertFalse(esAnonimo);
       
    }
    
    @Test
    public void determinarTipoDeComprobanteEnUnaVenta(){
       
        //Configuracion        
        Venta venta = new Venta();
        Cliente cliente1 = new Cliente(0,20384907807L,"Gabriel Camaño","San Miguel de Tucuman",0);
        String tipoComprobante;
        
        //Ejecucion
        tipoComprobante = venta.determinarTipoComprobante(cliente1.getCondicionTributariaId());
        
        //Comprobacion
        Assert.assertEquals("A", tipoComprobante);
       
    }
}
