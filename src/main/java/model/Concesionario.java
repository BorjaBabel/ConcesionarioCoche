package model;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private List<IVehiculo> stockCoches = new ArrayList<>();
    private List<Pieza> stockPiezas = new ArrayList<>();
    private List<Factura> facturas = new ArrayList<>();

    public void comprarVehiculo(IVehiculo coche) {
        stockCoches.add(coche);
    }

    public void venderVehiculo(IVehiculo coche) {
        stockCoches.remove(coche);
    }

    public void añadirPieza(Pieza pieza) {
        stockPiezas.add(pieza);
    }

    public void eliminarPieza(Pieza pieza) {
        stockPiezas.remove(pieza);
    }

    public void crearFactura(Factura factura) {
        facturas.add(factura);
    }
}
