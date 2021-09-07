/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import modelos.Cliente;
import modelos.Color;
import modelos.CondicionTributaria;
import modelos.Producto;
import modelos.Stock;
import modelos.Talle;
import modelos.Usuario;
import vistas.ComboBoxItem;
import vistas.VistaVenta;

/**
 *
 * @author Miguel
 */
public class VentaControlador {
    VistaVenta vistaVenta;

    public VentaControlador(VistaVenta vistaVenta) {
        this.vistaVenta = vistaVenta;
        establecerVista();
        
    }
    
     public void establecerVista(){
        Usuario usuario = new Usuario(this.vistaVenta.getIdUsuario());
        this.vistaVenta.establecerUsuario(usuario.getUsuario()); 
    }
    
    public void buscarCliente(String cuit){
        Cliente cliente = new Cliente();
        CondicionTributaria cd = new CondicionTributaria();
        cliente = cliente.buscarPorCuit(Long.parseLong(cuit));        
        if(cliente == null){
            showMessageDialog(null, "Cliente no encontrado");
        }else{
            cd = cd.buscarPorId(cliente.getCondicionTributariaId());
            this.vistaVenta.establecerCliente(cliente.getNombre(), cliente.getDomicilio(), cd.getDescripcion());
        }
        
    }
    
    public void buscarProducto(String codigo){
        Producto producto = new Producto();        
        producto = producto.buscarPorCodigo(Integer.parseInt(codigo));
        
        Stock stock = new Stock();
        
        ArrayList<Stock> stocks = new ArrayList<>();
        Color c;
        ArrayList<ComboBoxItem> colores = new ArrayList<>();
        ArrayList<String> coloresNombres = new ArrayList<>();
        Talle t;
        ArrayList<ComboBoxItem> talles = new ArrayList<>();
        ArrayList<String> tallesNombres = new ArrayList<>();   
        
        if(producto == null){
            showMessageDialog(null, "Producto no encontrado");
        }else{
            
            stocks = stock.buscarPorProductoId(producto.getId());
            for(Stock st: stocks){
                c = new Color();
                t = new Talle();
                c = c.buscarPorId(st.getIdColor());
                ComboBoxItem color = new ComboBoxItem(c.getId(),c.getDescripcion());
                if(!coloresNombres.contains(color.getLabel())){
                    coloresNombres.add(color.getLabel());
                    colores.add(color);
                }                
                t = t.buscarPorId(st.getIdTalle());
                ComboBoxItem talle = new ComboBoxItem(t.getId(),t.getDescripcion());
                if(!tallesNombres.contains(talle.getLabel())){
                    tallesNombres.add(talle.getLabel());
                    talles.add(talle);
                }
                                
            }            
           
            this.vistaVenta.establecerProducto(producto.getDescripcion(), colores, talles);
        }
        
    }
    
    public void comprobarStock(String codigo,ComboBoxItem color, ComboBoxItem talle){
        Producto producto = new Producto();        
        producto = producto.buscarPorCodigo(Integer.parseInt(codigo));
        Stock stock = new Stock();
        stock = stock.buscarPorColorIdTalleIdProductoId(color.getValue(), talle.getValue(), producto.getId());
        this.vistaVenta.mostrarStock(String.valueOf(stock.getCantidad()));
    }
    
    public void agregarLineaDeVenta(String cantidad,String codigo,ComboBoxItem color, ComboBoxItem talle){
        Producto producto = new Producto();        
        producto = producto.buscarPorCodigo(Integer.parseInt(codigo));
        float subTotal = (float) (producto.getCosto() * Integer.parseInt(cantidad));
        Stock stock = new Stock();
        stock = stock.buscarPorColorIdTalleIdProductoId(color.getValue(), talle.getValue(), producto.getId());
        
        this.vistaVenta.agregarLinea(producto.getCodigo(), producto.getDescripcion(), color, talle, Integer.parseInt(cantidad), (float) producto.getCosto(),subTotal );
    }
    
    public void realizarVenta(DefaultTableModel modelo) {
        Stock stock = new Stock();
        Color color = new Color();
        Producto producto = new Producto(); 
        for (int i = 0; i < modelo.getRowCount(); i++) {
        //System.out.println("Codigo: "+Integer.parseInt(modelo.getValueAt(i, 0).toString()));
        producto = producto.buscarPorCodigo(Integer.parseInt(modelo.getValueAt(i, 0).toString()));
       // color = color.buscarPorId(modelo.get)
        //stock = stock.buscarPorColorIdTalleIdProductoId(modelo.getValueAt(i, 1), i, i)
        
        }
    }
    
    
}
