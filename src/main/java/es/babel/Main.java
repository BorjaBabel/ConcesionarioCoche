package es.babel;

import model.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CocheImp coche1 = new CocheImp("Toyota Corolla", 20000);
        CocheImp coche2 = new CocheImp("Ford Focus", 18000);

        coche1.arrancar();
        coche1.girar();
        coche1.recorrerCalle();

        Pieza pieza1 = new Pieza("Filtro de aire", 50);
        Pieza pieza2 = new Pieza("Aceite motor 5L", 25);

        Concesionario concesionario = new Concesionario();
        concesionario.comprarVehiculo(coche1);
        concesionario.comprarVehiculo(coche2);
        concesionario.añadirPieza(pieza1);
        concesionario.añadirPieza(pieza2);

        Factura factura = new Factura();
        factura.añadirLinea(new LineaFactura(coche1, 1));
        factura.añadirLinea(new LineaFactura(pieza1, 2));
        factura.añadirLinea(new LineaFactura(pieza2, 3));

        System.out.println("Total de la factura: " + factura.calcularTotal());

        concesionario.venderVehiculo(coche1);
        concesionario.eliminarPieza(pieza1);
        concesionario.eliminarPieza(pieza2);

        Factura facturaServicio = new Factura();
        facturaServicio.añadirLinea(new LineaFactura(pieza1, 1));
        System.out.println("Total de la factura de servicio: " + facturaServicio.calcularTotal());
    }
}