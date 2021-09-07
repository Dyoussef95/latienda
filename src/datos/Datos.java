/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import modelos.Cliente;
import modelos.Color;
import modelos.CondicionTributaria;
import modelos.Empleado;
import modelos.LineaVenta;
import modelos.Marca;
import modelos.Producto;
import modelos.Rubro;
import modelos.Stock;
import modelos.Talle;
import modelos.TipoTalle;
import modelos.Usuario;
import modelos.Venta;

/**
 *
 * @author Miguel
 */
public class Datos {
    private ArrayList<Usuario> usuarios = new ArrayList<>();    
    private ArrayList<Color> colores = new ArrayList<>();
    private ArrayList<TipoTalle> tipoTalles = new ArrayList<>();
    private ArrayList<Talle> talles = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<CondicionTributaria> condicionTributarias = new ArrayList<>();
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private ArrayList<Marca> marcas = new ArrayList<>();
    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<Rubro> rubros = new ArrayList<>();
    private ArrayList<Stock> stocks = new ArrayList<>();
    private ArrayList<LineaVenta> lineaVentas = new ArrayList<>();
    private ArrayList<Venta> ventas = new ArrayList<>();
    private static Datos datos;
    
    
    private Datos() {
        this.generarMarcas();
        this.generarColores();
        this.generarCondicionTributarias();
        this.generarRubro();
        this.generarTipoTalles();
        this.generarTalles();
        this.generarClientes();
        this.generarEmpleado();
        this.generarProductos();
        this.generarStock();
        this.generarUsuarios();
    }
    
    public static void crearDatos(){
        if(Datos.datos == null){
            Datos.datos = new Datos();
            System.out.println("Datos creados");
        }else{
            System.out.println("No se pueden crear datos, porque ya fueron creados");
        }
        
    }
    
    public static Datos getDatos(){
        return Datos.datos;
    }
    
    private void generarColores(){
        Color color2 = new Color(1,"BLANCO");
        colores.add(color2);
        Color color1 = new Color(0,"NEGRO");
        colores.add(color1);
        
        Color color3 = new Color(2,"AZUL");
        colores.add(color3);
    }
    
    public ArrayList<Color> getColores() {
        return colores;
    }
    
    public void guardarColor(Color color){
        color.setId(this.colores.get(this.colores.size()-1).getId()+1);
        this.colores.add(color);
    }
    
    private void generarTipoTalles(){
        TipoTalle tipoTalle1 = new TipoTalle(0,"EUROPEO");
        tipoTalles.add(tipoTalle1);
        TipoTalle tipoTalle2 = new TipoTalle(1,"USA");
        tipoTalles.add(tipoTalle2);
        TipoTalle tipoTalle3 = new TipoTalle(2,"INTERNACIONAL");
    }
    
    private void generarTalles(){
        Talle talle1 = new Talle(0,"39",0);
        talles.add(talle1);
        Talle talle2 = new Talle(1,"40",0);
        talles.add(talle2);
        Talle talle3 = new Talle(2,"6",1);
        talles.add(talle3);
        Talle talle4 = new Talle(3,"7",1);
        talles.add(talle4);
        Talle talle5 = new Talle(4,"M",2);
        talles.add(talle5);
        Talle talle6 = new Talle(5,"L",2);
        talles.add(talle6);        
    }
    
    public ArrayList<Talle> getTalles() {
        return talles;
    }
    
    private void generarClientes(){
        Cliente cliente1 = new Cliente(0,20384907807L,"Gabriel Camaño","San Miguel de Tucuman",0);
        clientes.add(cliente1);
        Cliente cliente2 = new Cliente(1,21160104928l,"Teresa","Yerba Buena",4);
        clientes.add(cliente2);
        Cliente cliente3 = new Cliente(2,11111111111L,"Consumidor Final","",4);
        clientes.add(cliente3);
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public Cliente getCliente(int idCliente){
        Cliente cliente = null;
        for(Cliente c: clientes){
            if(c.getId()==idCliente){
                cliente = c;
            }
        }
        
        return cliente;   
    }
    
    
    
    private void generarCondicionTributarias(){
        CondicionTributaria condicionTributaria1 = new CondicionTributaria(0,"Responsable Inscripto");
        condicionTributarias.add(condicionTributaria1);
        CondicionTributaria condicionTributaria2 = new CondicionTributaria(1,"Monotributo");
        condicionTributarias.add(condicionTributaria2);
        CondicionTributaria condicionTributaria3 = new CondicionTributaria(2,"Exento");
        condicionTributarias.add(condicionTributaria3);
        CondicionTributaria condicionTributaria4 = new CondicionTributaria(3,"No Responsable");
        condicionTributarias.add(condicionTributaria4);
        CondicionTributaria condicionTributaria5 = new CondicionTributaria(4,"Consumidor Final");
        condicionTributarias.add(condicionTributaria5);
    }
    
    public ArrayList<CondicionTributaria> getCondicionTributarias() {
        return condicionTributarias;
    }
    
    private void generarEmpleado(){
        Empleado empleado1 = new Empleado(0,123456,"David Youssef");
        empleados.add(empleado1);
        Empleado empleado2 = new Empleado(0,654321,"Walter Nieva Cabello");
    }
    
    private void generarMarcas(){
        Marca marca1 = new Marca(0,"Puma");
        marcas.add(marca1);
        Marca marca2 = new Marca(1,"Adidas");
        marcas.add(marca2);
    }
    
    private void generarProductos(){
        Producto producto1 = new Producto(0,1111,"Camisa Puma mangas cortas",600,1.2,0,0);
        productos.add(producto1);
        Producto producto2 = new Producto(1,2222,"Camisa Adidas mangas largas",650,1.2,0,1);
        productos.add(producto2);
        Producto producto3 = new Producto(2,3333,"Zapatillas Puma facheritas",3500,0.8,1,0);
        productos.add(producto3);
       
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }
     
    
    private void generarRubro(){
        Rubro rubro1 = new Rubro(0,"Camisas");
        rubros.add(rubro1);
        Rubro rubro2 = new Rubro(1,"Zapatillas");
        rubros.add(rubro2);
    }
    
    private void generarStock(){
        Stock stock1 = new Stock(0,15,0,0,0);
        stocks.add(stock1);
        Stock stock2 = new Stock(1,15,0,1,0);
        stocks.add(stock2);
        Stock stock3 = new Stock(2,15,0,2,0);
        stocks.add(stock3);
        Stock stock4 = new Stock(3,15,0,0,1);
        stocks.add(stock4);
        Stock stock5 = new Stock(4,15,0,1,1);
        stocks.add(stock5);
        Stock stock6 = new Stock(5,15,0,2,1);
        stocks.add(stock6);
        Stock stock7 = new Stock(6,15,1,0,0);
        stocks.add(stock7);
        Stock stock8 = new Stock(7,15,2,0,0);
        stocks.add(stock8);
    }
    
    public ArrayList<Stock> getStocks() {
        return stocks;
    }

    private void generarUsuarios(){
        Usuario usuario1 = new Usuario(0,"youssef","123456",1);
        Usuario usuario2 = new Usuario(1,"nieva","123456",2);
        this.usuarios.add(usuario1);
        this.usuarios.add(usuario2);
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public Usuario getUsuario(int idUsuario){
        Usuario usuario = null;
        for(Usuario u: usuarios){
            if(u.getId()==idUsuario){
                usuario = u;
            }
        }
        
        return usuario;   
    }
    
    public void guardarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void borrarUsuario(int id){
        
    }
    
    public void modificarUsuario(int id){
        
    }

   

    public ArrayList<Venta> getVentas() {
        return ventas;
    }   
    
    public void guardarVenta(Venta venta){
        ventas.add(venta);
    }
    
     public ArrayList<LineaVenta> getLineaVentas() {
        return lineaVentas;
    }
    
    public void guardarLineaVenta(LineaVenta lineaVenta){
        lineaVentas.add(lineaVenta);
    }
}
