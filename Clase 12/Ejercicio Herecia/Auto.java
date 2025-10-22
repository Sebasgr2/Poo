public class Auto extends Vehiculo {
    private int numeroDePuertas;

    public Auto(String marca, String modelo, int anio, int numeroDePuertas) {
        super(marca, modelo, anio);
        this.numeroDePuertas = numeroDePuertas;
    }


    public Auto(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.numeroDePuertas = 4; 
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== AUTO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}