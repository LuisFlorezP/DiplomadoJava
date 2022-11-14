
package Ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        double numero=Math.round(Math.random()*10000);
        
        System.out.println(" - Número aleatorio: "+numero);
        if (numero>0&&numero<=9) {
            System.out.println(" - El número tiene 1 cifra.\n");
        }
        else if (numero>9&&numero<=99) {
            System.out.println(" - El número tiene 2 cifras.\n");
        }
        else if (numero>99&&numero<=999) {
            System.out.println(" - El número tiene 3 cifras.\n");
        }
        else if (numero>999&&numero<=9999) {
            System.out.println(" - El número tiene 4 cifras.\n");
        }
        else {
            System.out.println(" - El número excede el límite de 4 cifras.\n");
        }
    }
}
