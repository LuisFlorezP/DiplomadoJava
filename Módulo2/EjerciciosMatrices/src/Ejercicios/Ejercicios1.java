
package Ejercicios;

public class Ejercicios1 {
    public static void main(String[] args) {
        int n=(int) Math.round(Math.random()*10), m=(int) Math.round(Math.random()*10), a=0, b=0, c=0;
        int m1[][]=new int[n][m], m2[][]=new int[n][m], m3[][]=new int[n][m];
        
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                a=(int) Math.floor(Math.random()*100);
                if (a%2==0) {
                    m1[i][j]=a;
                }
                else {
                    a++;
                    m1[i][j]=a;
                }
            }
        }
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                b=(int) Math.floor(Math.random()*100); 
                if (b%2==1) {
                    m2[i][j]=b;
                }
                else {
                    b++;
                    m2[i][j]=b;
                }
            }
        }
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                m3[i][j]=m1[i][j]+m2[i][j];
            }
        }
        
        System.out.print(" - Matríz números pares:");
        for (int i=0;i<n;i++) {
            System.out.print("\n     - ");
            for (int j=0;j<m;j++) {
                System.out.print(m1[i][j]+" ");
            }
            
        }
        System.out.print("\n\n - Matríz números impares:");
        for (int i=0;i<n;i++) {
            System.out.print("\n     - ");
            for (int j=0;j<m;j++) {
                System.out.print(m2[i][j]+" ");
            }
        }
        System.out.print("\n\n - Matríz suma de números pares e impares:");
        for (int i=0;i<n;i++) {
            System.out.print("\n     - ");
            for (int j=0;j<m;j++) {
                System.out.print(m3[i][j]+" ");
            }
        }
        System.out.println("\n");
    }
}
