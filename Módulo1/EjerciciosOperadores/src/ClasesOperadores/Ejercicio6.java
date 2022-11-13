
package ClasesOperadores;

public class Ejercicio6 {
    public static void main(String[] args) {
        int ladoCuadrado=8, periC=0, areaC=0;
        int baseTriangulo=9, alturaTriangulo=8, ladoUnoTriangulo=8, ladoDosTriangulo=8, periT=0, areaT=0;
        int baseRectangulo=8, alturaRectangulo=6, periR=0, areaR=0;
        
        areaC=ladoCuadrado*4;
        periC=ladoCuadrado*ladoCuadrado;
        areaT=(baseTriangulo*alturaTriangulo)/2;
        periT=ladoUnoTriangulo+ladoDosTriangulo+baseTriangulo;
        areaR=baseRectangulo*alturaRectangulo;
        periR=(2*baseRectangulo)+(2*alturaRectangulo);
        System.out.println("\n - Área cuadrado: "+areaC+".\n - Perímetro cuadrado: "+periC+".");
        System.out.println("\n - Área triángulo: "+areaT+".\n - Perímetro triángulo: "+periT+".");
        System.out.println("\n - Área rectángulo: "+areaR+".\n - Perímetro rectángulo: "+periR+".\n");
    }
}
