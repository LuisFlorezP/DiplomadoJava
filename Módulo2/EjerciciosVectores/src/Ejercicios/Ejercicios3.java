
package Ejercicios;

public class Ejercicios3 {
    public static void main(String[] args) {
        String palabra="Hola";
        int valor=1;
        char carac[]=new char[palabra.length()];
        
        for (int i=0;i<palabra.length();i++) {
            carac[i]=palabra.charAt(i);
        }
        System.out.print(" - La palabra \""+palabra+"\" tiene "+palabra.length()+" caracteres: ");
        for (char i:carac) {
            System.out.print(valor+"("+i+") ");
            valor++;
        }
        System.out.println("\n");
    }           
}
