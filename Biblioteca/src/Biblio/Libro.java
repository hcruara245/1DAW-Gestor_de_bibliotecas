package Biblio;

public class Libro {
    private String autor;
    private String titulo;
    private int ejemplaresVendidos;
    private Libro precuela;
    private Libro secuela;

    public Libro(String autor, String titulo) {
        if (autor != null && titulo != null) {
            this.autor = autor;
            this.titulo = titulo;
        } else {
            this.autor = "";
            this.titulo = "";
        }
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getEjemplaresVendidos() {
        return ejemplaresVendidos;
    }
    public Libro getPrecuela() {
        return precuela;
    }
    public Libro getSecuela() {
        return secuela;
    }
    void obtenerTituloPrecuela (Libro libro) {
        if (libro == null) {
            System.out.println("Esta obra no posee ninguna precuela.");
        } else {
            System.out.println("El título de la precuela de " + libro.titulo + "es: " + libro);
        }
    }
}
