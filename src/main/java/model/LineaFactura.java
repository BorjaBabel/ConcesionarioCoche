package model;

public class LineaFactura {
    private Object articulo;
    private int cantidad;

    public LineaFactura(Object articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        if (articulo instanceof CocheImp) {
            return ((CocheImp) articulo).getPrecio() * cantidad;
        } else if (articulo instanceof Pieza) {
            return ((Pieza) articulo).getPrecio() * cantidad;
        }
        return 0;
    }
}
