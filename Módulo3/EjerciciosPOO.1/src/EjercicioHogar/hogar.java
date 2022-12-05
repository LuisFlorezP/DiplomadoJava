
package EjercicioHogar;

public class hogar {
    private String ciudad;
    private String barrio;
    private String color;
    private int pisos;
    private int habitaciones;
    private int banos;
    private int cocinas;
    
    public hogar(String ciudad, String barrio, String color) {
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.color = color;
    }
    
    public hogar(String barrio, String color, int pisos) {
        this.barrio = barrio;
        this.color = color;
        this.pisos = pisos;
    }
    
    public hogar(int pisos, int habitaciones, int banos, int cocinas) {
        this.pisos = pisos;
        this.habitaciones = habitaciones;
        this.banos = banos;
        this.cocinas = cocinas;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String getCiudad() {
        return (ciudad);
    }
    
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
    public String getBarrio() {
        return (barrio);
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return (color);
    }
    
    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
    public int getPisos() {
        return (pisos);
    }
    
    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    public int getHabitaciones() {
        return (habitaciones);
    }
    
    public void setBanos(int banos) {
        this.banos = banos;
    }
    
    public int getBanos() {
        return (banos);
    }
    
    public void setCocinas(int cocinas) {
        this.cocinas = cocinas;
    }
    
    public int getCocinas() {
        return (cocinas);
    }
}
