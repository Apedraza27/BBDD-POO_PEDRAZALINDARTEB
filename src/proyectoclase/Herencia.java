/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoclase;

/**
 *
 * @author camper
 */

// Clase que implementa ciertas propiedades y métodos que se pasarán a la clase hija.
class ClasePadre {
    public String propiedadP = "Propiedad de la clase padre.";

    public void metodoP() {
        System.out.println("Método de la clase padre");
    }
}

// Clase que obtendrá las propiedades y métodos de la clase padre.
class ClaseHija extends ClasePadre {
    public String propiedadH = "Propiedad de la clase hija.";

    public void metodoH() {
        System.out.println("Método de la clase hija"); 
    }
}

public class Herencia {
    public static void main(String[] args) {
        ClaseHija objetoHijo = new ClaseHija();

        // Esto imprime "Soy una propiedad de la clase padre."
        System.out.println(objetoHijo.propiedadP); 

        // Esto imprime "Soy un método de la clase padre."
        objetoHijo.metodoP();
    }
}
