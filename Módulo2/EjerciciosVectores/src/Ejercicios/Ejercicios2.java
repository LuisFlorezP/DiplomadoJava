
package Ejercicios;

public class Ejercicios2 {
    public static void main(String[] args) {
        double gA[]=new double[10], gB[]=new double[10], nota=0, p1=0, p2=0, pT=0, mP=0;
        char mejor;
        
        for (int i=0;i<gA.length;i++) {
            nota=Math.random()*50;
            nota=Math.round(nota);
            nota/=10;
            gA[i]=nota;
            nota=Math.random()*50;
            nota=Math.round(nota);
            nota/=10;
            gB[i]=nota;
        }
        for (double i:gA) {
            p1+=i;
        }
        for (double i:gB) {
            p2+=i;
        }
        p1=Math.round(p1);
        p1/=10;
        p2=Math.round(p2);
        p2/=10;
        pT=(p1+p2)/2*10;
        pT=Math.round(pT);
        pT/=10;
        if (p1>p2) {
            mejor='A';
            mP=p1;
        }
        else if (p1<p2) {
            mejor='B';
            mP=p2;
        }
        else {
            mejor='N';
        }
        System.out.println("\nResultados:");
        System.out.println(" - Promedio grupo A: "+p1+".");
        System.out.println(" - Promedio grupo B: "+p2+".");
        System.out.println(" - Promedio general: "+pT+".");
        System.out.println(" - Mejor grupo con promedio ("+mP+"): "+mejor+".\n");
    }           
}
