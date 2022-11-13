
package ClaseMath;

public class Ejercicio4 {
    public static void main(String[] args) {
        double n1=(Math.round(Math.random()*500))/10, n2=(Math.round(Math.random()*500))/10;
                
        System.out.println("\n - Número 1: "+n1+".");
        System.out.println("\n - Número 2: "+n2+".");
        System.out.println("\n - Número mayor de ambos números: "+Math.max(n1,n2)+".\n");
    }
}
