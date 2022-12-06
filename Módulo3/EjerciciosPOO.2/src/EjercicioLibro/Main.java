
package EjercicioLibro;

public class Main {
    public static void main(String[] args) {
        libro libroUno = new libro();
        libro libroDos = new libro();
        
        libroUno.setTitulo("La Odisea");
        libroUno.setAutor("Homero");
        libroUno.setPaginas(557);
        libroDos.setTitulo("El Principito");
        libroDos.setAutor("Antoine de Saint-Exupéry");
        libroDos.setPaginas(111);
        
        System.out.println("Información libros:");
        libroUno.mostrarLibro();
        libroDos.mostrarLibro();
        System.out.print("   - Libro con mayor páginas: ");
        libroUno.compararLibros(libroUno, libroDos);
    }
}
