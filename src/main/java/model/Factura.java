package model;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<LineaFactura> lineas = new ArrayList<>();

    public void añadirLinea(LineaFactura linea) {
        lineas.add(linea);
    }

    public void eliminarLinea(LineaFactura linea) {
        lineas.remove(linea);
    }

    public double calcularTotal() {
        return lineas.stream().mapToDouble(LineaFactura::calcularSubtotal).sum();
    }
}
