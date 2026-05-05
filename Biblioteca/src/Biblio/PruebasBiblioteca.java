package Biblio;

public class PruebasBiblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("1", "1");
        Libro libro2 = new Libro("2", "2");
        Libro libro3 = new Libro("3", "3");
        Libro libro4 = new Libro("4", "4");
        libro1.obtenerInformacion();
        libro1.registrarVenta(1000);
        libro2.registrarVenta(939);
        libro1.obtenerInformacion();

        libro1.addSecuela(libro2);
        libro2.addSecuela(libro3);
        libro3.addSecuela(libro4);

        libro1.obtenerTituloPrecuela();
        libro2.obtenerTituloPrecuela();
        libro2.obtenerTituloSecuela();
        libro3.obtenerTituloSecuela();

        System.out.println("PRUEBA SAGAAA");
        libro1.mostrarResumenSaga();
    }
}