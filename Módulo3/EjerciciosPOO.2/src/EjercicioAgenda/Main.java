
package EjercicioAgenda;

public class Main {
    public static void main(String[] args) {
        contacto nuevo1 = new contacto();
        contacto nuevo2 = new contacto();
        contacto nuevo3 = new contacto();
        agenda valor = new agenda();
        
        nuevo1.setNombre("Luis");
        nuevo1.setNumero("3004041082");
        nuevo2.setNombre("Laura");
        nuevo2.setNumero("3214675124");
        nuevo3.setNombre("Margarita");
        nuevo3.setNumero("3194398265");
        
        valor.registrarContacto(nuevo1);
        valor.registrarContacto(nuevo2);
        valor.registrarContacto(nuevo3);
        
        System.out.println("Contactos:");
        valor.listarContactos();
        System.out.println("\nBúsqueda de número:");
        valor.buscarContacto("Laura");
        System.out.print("\nPosiciones disponibles: ");
        System.out.println(valor.disponibles() + ".\n");
    }
}
