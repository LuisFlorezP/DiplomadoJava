
package Ejercicios;

public class Ejercicios1 {
    public static void main(String[] args) {
        String palabra="Programación";
        int valor=palabra.length()-1;
        
        System.out.print(" - Resultado: ");
        while (valor>=0) {
            System.out.print(palabra.charAt(valor));
            valor--;
        }
        System.out.println(".\n");
    }
}
