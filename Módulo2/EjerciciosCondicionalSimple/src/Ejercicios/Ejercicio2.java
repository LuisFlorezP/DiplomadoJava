
package Ejercicios;

public class Ejercicio2 {
   public static void main(String[] args) {
        double n1=Math.round(Math.random()*10), n2=Math.round(Math.random()*10), resul=0;

        System.out.println(" - Número 1: "+n1);
        System.out.println(" - Número 2: "+n2);
        if (n1>n2) {
            resul=Math.pow(n1,n2);
        }
        else {
            resul=Math.pow(n2,n1);
        }
        System.out.println("Resultado: "+resul+"\n");
   }
}
