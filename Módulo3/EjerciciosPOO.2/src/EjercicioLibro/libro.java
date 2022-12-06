
package EjercicioLibro;

public class libro {
    private String autor;
    private String titulo;
    private int paginas;
    
    public libro() {}
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getAutor() {
        return (autor);
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return (titulo);
    }
    
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public int getPaginas() {
        return (paginas);
    }
    
    public void mostrarLibro() {
        System.out.println("   - El libro " + titulo + ", del autor " + autor + ", tiene " + paginas + " páginas.");
    }
    
    public void compararLibros(libro libro1, libro libro2) {
        if (libro1.getPaginas() > libro2.getPaginas()) {
            System.out.println(libro1.getTitulo() + ".\n");
        }
        else {
            System.out.println(libro2.getTitulo() + ".\n");
        }
    }
}
