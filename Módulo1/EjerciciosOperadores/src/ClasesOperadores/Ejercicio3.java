
package ClasesOperadores;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numeroUno=8, numeroDos=2, auxiliar=0;
        
        auxiliar=numeroDos;
        numeroDos=numeroUno;
        numeroUno=auxiliar;
        System.out.println("\n - Número uno: "+numeroUno+".");
        System.out.println(" - Número dos: "+numeroDos+".\n");
    }
}
