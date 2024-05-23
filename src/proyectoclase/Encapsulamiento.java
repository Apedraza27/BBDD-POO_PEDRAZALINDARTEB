/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoclase;

/**
 *
 * @author camper
 */
public class Encapsulamiento {
    //Variables 
    private final String nombre;
    private final double precio;
    private int cantDispo;
    
    //Constructor 
    public Encapsulamiento(String nombre, double precio, int cantDispo){
        this.nombre = nombre;
        this.precio = precio;
        this.cantDispo = cantDispo;
    }
    //Metodo que repone inventario del producto 
    public void reponer(int cantidad) {
        if(cantidad > 0 && cantidad <= cantDispo){
            cantDispo -= cantidad;
            System.out.println("Venta de" + cantidad + "unidades de " + nombre + "al inventario");
        } else {
            System.out.println("La cantidad a reponer debe ser mayor que cero.");
        }
    }
    
    //Metodo para obtener informacion 
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public double obtenerPrecio(){
        return precio;
    }
    public int obtenerCantiDispo(){
        return cantDispo;
    }
    
 public static void main(String[] args) {
        // Crear una instancia de la clase Encapsulamiento
        Encapsulamiento producto = new Encapsulamiento("Producto A", 10.99, 100);
        
        // Llamar al método para obtener información del producto
        System.out.println("Nombre del producto: " + producto.obtenerNombre());
        System.out.println("Precio del producto: $" + producto.obtenerPrecio());
        System.out.println("Cantidad disponible: " + producto.obtenerCantiDispo());
        
        // Ejemplo de reponer inventario
        producto.reponer(20);
        System.out.println("Cantidad disponible después de reponer: " + producto.obtenerCantiDispo());
        }    }

