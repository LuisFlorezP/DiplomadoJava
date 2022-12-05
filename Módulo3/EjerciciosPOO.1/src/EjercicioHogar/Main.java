
package EjercicioHogar;

public class Main {
    public static void main(String[] args) {
        hogar miHogar1 = new hogar("Medellín.","Barichara","Amarillo.");
        hogar miHogar2 = new hogar("Barichara.","Amarillo.",1);
        hogar miHogar3 = new hogar(1,2,1,1);
        
        System.out.println("Datos del hogar:\n");
        System.out.println("   Constructor N°1:");
        System.out.println("   - Ciudad: " + miHogar1.getCiudad());
        System.out.println("   - Barrio: " + miHogar1.getBarrio());
        System.out.println("   - Color: " + miHogar1.getColor());
        System.out.println("\n   Constructor N°2:");
        System.out.println("   - Barrio: " + miHogar2.getBarrio());
        System.out.println("   - Color: " + miHogar2.getColor());
        System.out.println("   - Pisos: " + miHogar2.getPisos());
        System.out.println("\n   Constructor N°3:");
        System.out.println("   - Pisos: " + miHogar3.getPisos());
        System.out.println("   - Habitaciones: " + miHogar3.getHabitaciones());
        System.out.println("   - Baños: " + miHogar3.getBanos());
        System.out.println("   - Cocinas: " + miHogar3.getCocinas() + "\n");
    }
}
