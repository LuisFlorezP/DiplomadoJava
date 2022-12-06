
package EjercicioAgenda;

public class agenda{
    private contacto agenda[] = new contacto[10];
    
    public agenda() {}
    
    public boolean registrarContacto(contacto nuevo) {
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == null) {
                agenda[i] = nuevo;
                return (true);
            }
        }
        return (true);
    }
    
    public void listarContactos() {
        for (int i = 0; i < agenda.length && agenda[i] != null; i++) {
            System.out.println(" - " + agenda[i].getNombre() + ".");
        }
    }
    
    public boolean buscarContacto(String nombre) {
        for (int i = 0; i < agenda.length && agenda[i] != null; i++) {
            if (nombre == agenda[i].getNombre()) {
                System.out.println(" - Número de " + nombre + ": " + agenda[i].getNumero() + ".");
                return (true);
            }
        }
        System.out.println(" - Número de " + nombre + ": No se encontró este nombre en la agenda.");
        return (true);
    }
    
    public String disponibles() {
        int cont=0;
                
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == null) {
                System.out.print(i + " ");
                cont++;
            }
        }
        return ("(" + cont + ")");
    }
}
