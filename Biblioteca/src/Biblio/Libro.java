package Biblio;

public class Libro {
    private int ejemplaresVendidos;

    public void registrarVenta(int ventas){
        if (ventas > 0){
            this.ejemplaresVendidos += ventas;
        }
        else {
            System.out.println("No se pueden registrar 0 ventas o ventas negativas");
        }
    }


}
