
package Ejercicios;

public class Ejercicios3 {
    public static void main(String[] args) {
        int numero=8128, total=0;
        double valor=0;
        
        for (int i=1;i<numero;i++) {
            valor=numero%i;
            if (valor==0) {
                total+=i;
            }
        }
        if (numero==total) {
            System.out.println(" - El número "+numero+" SI es un número perfecto.\n");
        }
        else {
            System.out.println(" - El número "+numero+" NO es un número perfecto.\n");
        }
    }
}
