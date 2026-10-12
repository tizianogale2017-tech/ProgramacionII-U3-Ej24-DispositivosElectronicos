package Ejercicio24_dispositivosElectronicos;

public class Dispositivo {
    private String marca;
    private String modelo;
    private double precioBase;

    public Dispositivo(String marca, String modelo, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public void mostrarInformacion() {
        System.out.println(marca + " " + modelo + " - precio base: " + precioBase);
    }
}
