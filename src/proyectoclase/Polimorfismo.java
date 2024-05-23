/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoclase;

/**
 *
 * @author camper
 */

class Vehiculo {
    public void desplazarse() {
        System.out.println("El vehiculo se esta desplazando");
    }
}

//Instancia de vehiculo 
class Carro extends Vehiculo {
    @Override 
    public void desplazarse(){
        System.out.println("El carro se esta conduciendo por la carretera");
    }
}

//Instancia de moto 
class Moto extends Vehiculo {
    @Override
    public void desplazarse(){
        System.out.println("La moto se esta desplazando por la carretera hacia acapulco");
    }
}

//Clase principal 
public class Polimorfismo {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Carro ();
        Vehiculo vehiculo2 = new Moto ();
        
        vehiculo1.desplazarse();//Llamar method 
        vehiculo2.desplazarse();
    }
}
