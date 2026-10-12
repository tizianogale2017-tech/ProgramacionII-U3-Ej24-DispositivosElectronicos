package Ejercicio24_dispositivosElectronicos;

public class Smartphone extends Dispositivo {
    private int megapixelesCamara;
    private int almacenamientoGB;

    public Smartphone(String marca, String modelo, double precioBase, int megapixelesCamara, int almacenamientoGB) {
        super(marca, modelo, precioBase);
        this.megapixelesCamara = megapixelesCamara;
        this.almacenamientoGB = almacenamientoGB;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("  Smartphone: cámara de " + megapixelesCamara + " MP, " + almacenamientoGB + " GB de almacenamiento");
    }
}
