
package Ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        double nota=Math.random()*10;
        
        System.out.println(" - Nota: "+nota);
        if (nota<=6) {
            System.out.println(" - El estudiante perdió la materia.\n");
        }
        else {
            System.out.println(" - ElL estudiante ganó la materia.\n");
        }
    }
}
