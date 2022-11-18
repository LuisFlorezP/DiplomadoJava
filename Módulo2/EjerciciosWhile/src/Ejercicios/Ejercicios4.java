
package Ejercicios;

public class Ejercicios4 {
    public static void main(String[] args) {
        String mensaje="";
        int numero=11, valor=0;
        
        mensaje=" - Resultado: ";
        while (valor<25) {
            if (valor<24) {
                mensaje+=numero+", ";
            }
            else {
                mensaje+=numero;
            }
            numero+=11;
            valor++;
        }
        System.out.println(mensaje+".\n");
    }
}
