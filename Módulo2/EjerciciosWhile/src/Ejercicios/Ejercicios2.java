
package Ejercicios;

public class Ejercicios2 {
    public static void main(String[] args) {
        String palabra="samas", resultado="";
        int valor=palabra.length()-1;
        
        while (valor>=0) {
            resultado+=palabra.charAt(valor);
            valor--;
        }
        if (palabra.equals(resultado)) {
            System.out.println(" - La palabra "+palabra+" SI es palíndroma.\n");
        }
        else {
            System.out.println(" - La palabra "+palabra+" NO es palíndroma.\n");
        }
    }
}
