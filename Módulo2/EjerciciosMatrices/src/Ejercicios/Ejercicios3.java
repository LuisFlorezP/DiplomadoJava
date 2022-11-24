
package Ejercicios;

public class Ejercicios3 {
    public static void main(String[] args) {
        int num=0;
        int mat[][]=new int[3][4];
        
        for (int i=0;i<3;i++) {
            for (int j=0;j<4;j++) {
                num=(int) Math.round(Math.random()*100);
                mat[i][j]=num;
            }
        }
        
        System.out.print(" - Matríz de 3x4:");
        for (int i=0;i<3;i++) {
            System.out.print("\n     - ");
            for (int j=0;j<4;j++) {
                System.out.print(mat[i][j]+" ");
            }
        }
        System.out.print("\n\n - Números de primer fila: ");
        for (int j=0;j<4;j++) {
            System.out.print(mat[0][j]+" ");
        }
        System.out.print("\n - Número de la segunda columna: ");
        for (int i=0;i<3;i++) {
            System.out.print(mat[i][1]+" ");
        }
        System.out.print("\n - Números de tercera fila: ");
        for (int j=0;j<4;j++) {
            System.out.print(mat[2][j]+" ");
        }
        System.out.println("\n");
    }
}
