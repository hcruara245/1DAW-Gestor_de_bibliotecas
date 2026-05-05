package Biblio;

import java.util.Arrays;

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
        Libro[] saga = obtenerSaga();
        int ventasTotales = 0;
        int j = 0;
        int posLibro = -1;
        for (int i = 0; i < saga.length; i++) {
            ventasTotales += saga[i].ejemplaresVendidos;
        }
        do {
            j++;
            posLibro++;
        } while (!saga[posLibro].getTitulo().equalsIgnoreCase(this.titulo));
        System.out.println("El libro " + this.titulo + " es el libro numero " + j + " de una saga que tiene " + saga.length + " libros. Esta saga ha vendido un total de " + ventasTotales + " ejemplares.");
    }

    public Libro[] obtenerSaga(){
        Libro[] librosSaga = new Libro[0];
        Libro primerLibro = this;
        Libro ultimoLibro = this;
        
        while (primerLibro.getPrecuela() != null){
            primerLibro = primerLibro.getPrecuela();
        }

        librosSaga = Arrays.copyOf(librosSaga, librosSaga.length + 1);
        librosSaga[0] = primerLibro;
        ultimoLibro = primerLibro.getSecuela();

        while (ultimoLibro.getSecuela() != null){
            librosSaga = Arrays.copyOf(librosSaga, librosSaga.length + 1);
            librosSaga[librosSaga.length - 1] = ultimoLibro;
            ultimoLibro = ultimoLibro.getSecuela();
        }

        librosSaga = Arrays.copyOf(librosSaga, librosSaga.length + 1);
        librosSaga[librosSaga.length - 1] = ultimoLibro;


        return librosSaga;
    }

    public void obtenerInformacion(){
        System.out.println("El libro " + this.titulo + " es de " + this.autor + " y ha vendido un total de: " + this.ejemplaresVendidos + " ejemplares");
    }
}