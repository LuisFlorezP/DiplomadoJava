
package Ejercicios;

public class Ejercicios1 {
    public static void main(String[] args) {
        double numero=15, total=1; 
        
        for (int i=1;i<=numero;i++) {
            total*=i;
        }
        System.out.println(" - El factorial del número "+numero+" es: "+total+".\n");
    }
}
