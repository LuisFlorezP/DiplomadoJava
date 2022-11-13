
package Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero=(int) Math.round(Math.random()*100);
         
        System.out.println(" - Número: "+numero);
        if (numero>50) {
            System.out.println(" - Número mayor a 50.\n");
        }
        else {
            System.out.println(" - Número menor a 50.\n");
        }
    }
}
