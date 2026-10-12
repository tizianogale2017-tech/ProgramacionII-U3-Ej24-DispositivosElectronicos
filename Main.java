package Ejercicio24_dispositivosElectronicos;

public class Main {
    public static void main(String[] args) {
        Dispositivo[] catalogo = {
            new Smartphone("Samsung", "Galaxy S24", 900000.0, 50, 256),
            new Laptop("Lenovo", "ThinkPad E14", 1200000.0, "Intel Core i7", 16)
        };

        System.out.println("=== Fichas técnicas ===");
        for (Dispositivo d : catalogo) {
            d.mostrarInformacion();
        }
    }
}
