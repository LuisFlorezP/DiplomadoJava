
package EjercicioSeguridad;

public class Main {
    public static void main(String[] args) {
        password nueva1 = new password();
        password nueva2 = new password(23);
        
        nueva1.generar();
        nueva2.generar();
        
        System.out.print("Primera contraseña: ");
        System.out.println(nueva1.getPassword());
        System.out.print("Contraseña: " + nueva1.validar());
        
        System.out.print("Segunda contraseña: ");
        System.out.println(nueva2.getPassword());
        System.out.print("Contraseña: " + nueva2.validar() + "\n");
    }
}
