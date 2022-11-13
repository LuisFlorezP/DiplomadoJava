
package ClaseMath;

public class Ejercicio3 {
    public static void main(String[] args) {
        double n1=(int) (Math.random()*10), n2=(int) (Math.random()*10), n3=(int) (Math.random()*10), n4=(int) (Math.random()*10), n5=(int) (Math.random()*10), promedio=0;
        
        promedio=(n1+n2+n3+n4+n5)/5;
        System.out.println("\n - Promedio notas aleatorias: "+promedio+".\n");
    }
}
