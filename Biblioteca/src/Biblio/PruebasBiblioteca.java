package Biblio;

public class PruebasBiblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Juan de la Palmilla", "El que mete las manos");
        Libro libro2 = new Libro("Victor", "Los secretos de YT");
        Libro libro3 = new Libro("Hugo", "Yo FUI amigo del alcalde de Tocina.");
        Libro libro4 = new Libro("Carlos Iglesia", "La isla del pequeño Jaime: El Santo");
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