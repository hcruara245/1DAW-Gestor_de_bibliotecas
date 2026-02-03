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
    void obtenerTituloPrecuela () {
        if (this.precuela == null) {
            System.out.println("El titulo de la precuela de " + this.titulo + " es: <NINGUNO>");
        } else {
            System.out.println("El título de la precuela de " + this.titulo + " es: " + this.precuela.titulo);
        }
    }
    void obtenerTituloSecuela () {
        if (this.secuela == null) {
            System.out.println("El titulo de la secuela de " + this.titulo + " es: <NINGUNO>");
        } else {
            System.out.println("El titulo de la secuela de " + this.titulo + " es: " + this.secuela.titulo);
        }
    }
    public void registrarVenta(int ventas){
        if (ventas > 0){
            this.ejemplaresVendidos += ventas;
        }
        else {
            System.out.println("No se pueden registrar 0 ventas o ventas negativas");
        }
    }

    public void addSecuela(Libro secuela){
        if (secuela != null){
            this.secuela = secuela;
            secuela.precuela = this;
        }
        else {
            System.out.println("La secuela no es correcta");
        }
    }
    void mostrarResumenSaga () {
        
    }
}
