
package Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        double edad=Math.round(Math.random()*100);
        
        if (edad>0&&edad<=5) {
            System.out.println(" - Infante: "+edad+".\n");
        }
        else if (edad>5&&edad<=10) {
            System.out.println(" - Niño: "+edad+".\n");
        }
        else if (edad>10&&edad<=15) {
            System.out.println(" - Pre adolescente: "+edad+".\n");
        }
        else if (edad>15&&edad<=18) {
            System.out.println(" - Adolescente: "+edad+".\n");
        }
        else if (edad>18&&edad<=25) {
            System.out.println(" - Pre adulto: "+edad+".\n");
        }
        else if (edad>25&&edad<=40) {
            System.out.println(" - Adulto: "+edad+".\n");
        }
        else if (edad>40&&edad<=55) {
            System.out.println(" - Pre anciano: "+edad+".\n");
        }
        else {
            System.out.println(" - Anciano: "+edad+".\n");
        }
    }
}
