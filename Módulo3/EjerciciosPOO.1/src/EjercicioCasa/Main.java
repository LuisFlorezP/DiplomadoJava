
package EjercicioCasa;

public class Main {
    public static void main(String[] args) {
        casa miCasa = new casa();
        
        System.out.println("Datos de la casa:");
        System.out.println("   - Ciudad: " + miCasa.getCiudad());
        System.out.println("   - Barrio: " + miCasa.getBarrio());
        System.out.println("   - Color: " + miCasa.getColor());
        System.out.println("   - Pisos: " + miCasa.getPisos());
        System.out.println("   - Habitaciones: " + miCasa.getHabitaciones());
        System.out.println("   - Baños: " + miCasa.getBanos());
        System.out.println("   - Cocinas: " + miCasa.getCocinas() + "\n");
    }
}
