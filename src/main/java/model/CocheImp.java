package model;

public class CocheImp implements IVehiculo {
    private String modelo;
    private double precio;

    public CocheImp(String modelo, double precio) {
        this.modelo = modelo;
        this.precio = precio;
    }

    public void arrancar() {
        System.out.println("El coche " + modelo + " está arrancando.");
    }

    public void girar() {
        System.out.println("El coche " + modelo + " está girando.");
    }

    public void recorrerCalle() {
        System.out.println("El coche " + modelo + " está recorriendo la calle.");
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
}
