
package Ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        String operador="Modulo";
        int n1=10, n2=2;
        double resul=0;
        
        switch(operador) {
            case "Suma":
                resul=n1+n2;
                break;
            case "Resta":
                resul=n1-n2;
                break;
            case "Multiplicacion":
                resul=n1*n2;
                break;
            case "Division":
                resul=n1/n2;
                break;
            case "Modulo":
                resul=n1%n2;
                break;
        }
        System.out.println(" - Resultado de la "+operador+": "+resul+".\n");
    }
}
