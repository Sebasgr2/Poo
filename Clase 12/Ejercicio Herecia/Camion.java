public class Camion extends Vehiculo {
    private double capacidadDeCarga;

    // Constructor
    public Camion(String marca, String modelo, int anio, double capacidadDeCarga) {
        super(marca, modelo, anio);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== CAMIÓN ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Capacidad de carga: " + capacidadDeCarga + " toneladas");
    }
}