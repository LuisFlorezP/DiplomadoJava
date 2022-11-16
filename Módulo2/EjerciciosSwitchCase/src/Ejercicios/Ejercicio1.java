
package Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        int motor=4;
        
        switch (motor) {
            case 0:
                System.out.println(" - No hay estipulado un valor definido para el tipo.\n");
                break;
            case 1: 
                System.out.println(" - Agua.\n");
                break;
            case 2:
                System.out.println(" - Gasolina.\n");
                break;
            case 3:
                System.out.println(" - Hormigón.\n");
                break;
            default:
                System.out.println(" - No existe un valor válido.\n");
                break;
        }
    }
}
