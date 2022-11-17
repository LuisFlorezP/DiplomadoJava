
package Ejercicios;

public class Ejercicios2 {
    public static void main(String[] args) {
        String resul="";
        int numero=62;
        double valor=0;
        
        resul=" - Divisores del número "+numero+": ";
        for (int i=1;i<=numero;i++) {
            valor=numero%i;
            if (i<numero) {
                if (valor==0) {
                resul+=i+", ";
                }
            }
            else {
                resul+=i+".";
            }
        }
        System.out.println(resul+"\n");
    }
}
