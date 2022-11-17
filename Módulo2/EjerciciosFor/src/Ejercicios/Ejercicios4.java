
package Ejercicios;

public class Ejercicios4 {
    public static void main(String[] args) {
        String divisores="", sn="";
        int ciclo=0, numero=4, perfecto=0; 
        double raiz=0, aleatorio=0, factorial=1;
        
        for (int i=0;i<=numero;i++) {
            ciclo+=i;
        }
        
        raiz=Math.sqrt(ciclo);
        
        aleatorio=Math.round(Math.random()*ciclo);
        
        for (int i=1,valor=0;i<=ciclo;i++) {
            valor=ciclo%i;
            if (i<ciclo) {
                if (valor==0) {
                divisores+=i+", ";
                }
            }
            else {
                divisores+=i;
            }
        }
        
        for (int i=1;i<=ciclo;i++) {
            factorial*=i;
        }
        
        for (int i=1,valor=0;i<ciclo;i++) {
            valor=ciclo%i;
            if (valor==0) {
                perfecto+=i;
            }
        }
        if (ciclo==perfecto) {
            sn=" - El número "+ciclo+" SI es un número perfecto.\n";
        }
        else {
            sn=" - El número "+ciclo+" NO es un número perfecto.\n";
        }
        
        System.out.println("Información del número "+numero+":");
        System.out.println(" - Sumatoria de iteraciones: "+ciclo+".");
        System.out.println(" - Raíz cuadrada: "+raiz+".");
        System.out.println(" - Aleatorio de 1 a "+ciclo+": "+aleatorio+".");
        System.out.println(" - Divisores: "+divisores+".");
        System.out.println(" - Factorial: "+factorial+".");
        System.out.println(sn);
    }
}
