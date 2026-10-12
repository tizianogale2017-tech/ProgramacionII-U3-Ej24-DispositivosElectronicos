package Ejercicio24_dispositivosElectronicos;

public class Laptop extends Dispositivo {
    private String procesador;
    private int memoriaRamGB;

    public Laptop(String marca, String modelo, double precioBase, String procesador, int memoriaRamGB) {
        super(marca, modelo, precioBase);
        this.procesador = procesador;
        this.memoriaRamGB = memoriaRamGB;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("  Laptop: procesador " + procesador + ", " + memoriaRamGB + " GB de RAM");
    }
}
