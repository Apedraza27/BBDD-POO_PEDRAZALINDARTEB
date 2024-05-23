/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoclase;

/**
 *
 * @author camper
 */
public class Sobrecarga {
    
    
    
    public static void printName(String name){
        System.out.println(String.format("Hola %s", name));
    }
    
    public static void printName(String name, int edad){
        System.out.println(String.format("Hola %s tu edad es %d", name,edad));
    }
    public static void main(String[] args) {
    printName("David");
    printName("David",20);
    }
    
}
