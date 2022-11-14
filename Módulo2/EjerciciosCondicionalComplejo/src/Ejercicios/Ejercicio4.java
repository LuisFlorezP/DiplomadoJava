
package Ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
        double pp=10, pc=Math.round(Math.random()*10), por=0;
        
        por=(pc*100)/pp;
        if (por>0&&por<50) {
            System.out.println(" - Fuera de nivel ("+por+").\n");
        }
        else if (por>=50&&por<75) {
            System.out.println(" - Nivel regular ("+por+").\n");
        }
        else if (por>75&&por<90) {
            System.out.println(" - Nivel medio ("+por+").\n");
        }
        else {
            System.out.println(" - Nivel máximo ("+por+").\n");
        }
    }
}
