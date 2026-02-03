package Biblio;

public class PruebasBiblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Juan de la Palmilla", "Jeffrey Epstein");
        Libro libro2 = new Libro("Victor", "Los secretos de YT");
        Libro libro3 = new Libro("Hugo", "Mein Kampf");

        libro1.addSecuela(libro2);
        libro2.addSecuela(libro3);
        libro1.obtenerTituloPrecuela();
        libro2.obtenerTituloPrecuela();
        libro2.obtenerTituloSecuela();
        libro3.obtenerTituloSecuela();
    }
}