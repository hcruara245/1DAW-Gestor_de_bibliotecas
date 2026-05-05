package Biblio;

import java.util.Arrays;

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
        System.out.println();
        libro2.obtenerTituloPrecuela();
        System.out.println();
        libro2.obtenerTituloSecuela();
        System.out.println();
        libro3.obtenerTituloSecuela();
        System.out.println();

<<<<<<< HEAD
        System.out.println("PRUEBA SAGAAA");
        libro1.mostrarResumenSaga();
=======
        Libro libro6 = new Libro("Dross", "Luna de Plutón");
        libro2.anadirSiguienteEnSaga(libro6);
        libro2.obtenerTituloSecuela();
        libro6.obtenerTituloSecuela();
        Libro[] siguientesLibrosLibro2 = libro2.mostrarLibrosSiguientes();

        System.out.println(Arrays.toString(siguientesLibrosLibro2));

>>>>>>> 6bf3f4870b06ae16d91be5fdd83b3006b150530b
    }
}