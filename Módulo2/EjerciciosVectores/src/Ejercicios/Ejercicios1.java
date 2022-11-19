
package Ejercicios;

public class Ejercicios1 {
    public static void main(String[] args) {
        int mayor=0, menor=0;
        float peso[]=new float[5], promedio=0;
        
        peso[0]=33.20F;
        peso[1]=19.46F;
        peso[2]=54.2F;
        peso[3]=25.330F;
        peso[4]=67.09F;
        promedio=(peso[0]+peso[1]+peso[2]+peso[3]+peso[4])/5;
        for (int i=0;i<5;i++) {
            if (peso[i]>promedio) {
                mayor++;
            }
            else {
                menor++;
            }
        }
        System.out.println(" - Promedio de las 5 personas: "+promedio+".");
        System.out.println(" - Cantidad de personas con peso MAYOR al promedio: "+mayor+".");
        System.out.println(" - Cantidad de personas con peso MENOR al promedio: "+menor+".\n");
    }           
}
