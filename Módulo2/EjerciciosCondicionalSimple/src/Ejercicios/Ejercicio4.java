
package Ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
        int n1=2, n2=1;
        
        if (n1%n2==0) {
            System.out.println(" - El número "+n1+" es múltiplo del número "+n2+".");
        }
        else {
            System.out.println(" - El número "+n1+" no es múltiplo del número "+n2+".");
        }
        if (n2%n1==0) {
            System.out.println(" - El número "+n2+" es múltiplo del número "+n1+".\n");
        }
        else {
            System.out.println(" - El número "+n2+" no es múltiplo del número "+n1+".\n");
        }
    }
}
