
package EjercicioCiudad;

public class Main {
    public static void main(String[] args) {
        ciudad valor = new ciudad();
        valor.setNombre("Medellín.");
        valor.setPais("Colombia.");
        valor.setPoblacion("Media.");
        valor.setPresidente("Petro.");
        
        System.out.println("Datos de la ciudad:");
        System.out.println("   - Nombre: " + valor.getNombre());
        System.out.println("   - País: " + valor.getPais());
        System.out.println("   - Población: " + valor.getPoblacion());
        System.out.println("   - Presidente: " + valor.getPresidente() + "\n");
    }
}
