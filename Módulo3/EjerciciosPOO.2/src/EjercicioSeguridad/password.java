
package EjercicioSeguridad;

public class password {
    private int longitud;
    private String password;
    
    public password() {
        this.longitud = 10;
    }
    
    public password(int longitud) {
        this.longitud = longitud;
    }
    
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public int getLongitud() {
        return (longitud);
    }
    
    public String getPassword() {
        return (password);
    }
    
    public void generar() {
        int variable;
        char valor;
        
        password = "";
        for (int i = 0; i < longitud; i++) {
            variable = (int) Math.round(Math.random() * 3);
            if (variable == 1) {
                valor = (char) Math.round(Math.random() * (122 - 91) + 91);
                password += valor;
            }
            else if (variable == 2) {
                valor = (char) Math.round(Math.random() * (90 - 65) + 65);
                password += valor; 
            }
            else if (variable == 3) {
                valor = (char) Math.round(Math.random() * (57 - 48) + 48);
                password += valor;
            }
        }
    }
    
    public String validar() {
        int cn1=0, cn2=0, cn3=0;
        
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 91 && password.charAt(i) <= 122) {
                cn1++;
            }
            else if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                cn2++;
            }
            else if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                cn3++;
            }
        }
        
        if (cn1 >= 1 && cn2 >= 2 && cn3 >= 5) {
            return ("Segura.\n");
        }
        else {
            return ("No Segura.\n");
        }
    }
}
