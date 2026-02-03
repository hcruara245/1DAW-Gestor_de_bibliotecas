package Biblio;

public class PruebasBiblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Juan de la Palmilla", "Jeffrey Epstein");
        Libro libro2 = new Libro("Victor", "Los secretos de YT");
        Libro libro3 = new Libro("Hugo", "Mein Kampf");

        libro1.addSecuela(libro2);
        libro1.obtenerInformacion();
        libro1.registrarVenta(1000);
        libro1.obtenerInformacion();
    }
}