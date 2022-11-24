
package Ejercicios;

public class Ejercicios2 {
    public static void main(String[] args) {
        int n=5, m=3, num=0, mayor=0;
        int mat[][]=new int[n][m];
        
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                num=(int) Math.round(Math.random()*50);
                mat[i][j]=num;
            }
        }        
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (mat[i][j]>mayor) {
                    mayor=mat[i][j];
                }
            }
        }
        
        System.out.print(" - Matríz de 5x3:");
        for (int i=0;i<n;i++) {
            System.out.print("\n     - ");
            for (int j=0;j<m;j++) {
                System.out.print(mat[i][j]+" ");
            }
        }
        System.out.print("\n\n - Número mayor almacenado: "+mayor+".");
        System.out.println("\n");
    }
}
