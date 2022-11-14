
package Ejercicios;

public class Ejercicio3 {
    public static void main(String[] args) {
        double n1=Math.round(Math.random()*10), n2=Math.round(Math.random()*10), n3=Math.round(Math.random()*10), mayor=0;
        
        System.out.println(" - Números: "+n1+", "+n2+", "+n3);
        mayor=(n1>n2)?n1:(n2>n3)?n2:n3;
        System.out.println(" - Número mayor: "+mayor+".\n");
    }
}
