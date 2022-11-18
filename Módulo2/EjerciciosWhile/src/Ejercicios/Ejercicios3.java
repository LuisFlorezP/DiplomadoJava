
package Ejercicios;

public class Ejercicios3 {
    public static void main(String[] args) {
        String texto="Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas"+
        "risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat."+
        "Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie"+
        "euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea"+
        "non proin aliquet scelerisque nam maecenas elit cum.";
        int valor=0, total=0, letra=0;
        
        while (valor<texto.length()-1) {
            letra=texto.charAt(valor);
            if (texto.charAt(letra)=='A'||texto.charAt(letra)=='E'||texto.charAt(letra)=='I'||texto.charAt(letra)=='O'||texto.charAt(letra)=='U'||texto.charAt(letra)=='a'||texto.charAt(letra)=='e'||texto.charAt(letra)=='i'||texto.charAt(letra)=='o'||texto.charAt(letra)=='u') {
                total++;
            }
            valor++;
        }
        System.out.println(" - Cantidad de vocales en el texto: "+total+".\n");
    }
}
