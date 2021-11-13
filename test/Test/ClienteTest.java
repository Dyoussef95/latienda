/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


import datos.Datos;
import modelos.Cliente;
import org.junit.Test;
import org.junit.*;

/**
 *
 * @author Miguel
 */
public class ClienteTest {
    
    @BeforeClass
    public static void setUpClass() {
        Datos.crearDatos();
    }
    
    @Test
    public void buscarClientePorCuit(){
       
        //Configuracion        
        Cliente cliente = new Cliente();
        
        //Ejecucion
        cliente = cliente.buscarPorCuit(11111111111L);
        
        //Comprobacion
        Assert.assertEquals(2, cliente.getId());
       
    }
    
    
}
