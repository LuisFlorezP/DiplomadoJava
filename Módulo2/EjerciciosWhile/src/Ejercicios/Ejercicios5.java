
package Ejercicios;

public class Ejercicios5 {
    public static void main(String[] args) {
        String mensaje="";
        int numero=4, valor=1;
        
        mensaje="TABLA DE MULTIPLICAR DEL NÚMERO "+numero+".\n";
        while (valor<=10) {
            mensaje+=" - "+numero+" x "+valor+" = "+(numero*valor)+".\n";
            valor++;
        }
        System.out.println(mensaje);
    }
}
