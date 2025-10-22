public class EmpresaTransporte {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "Corolla", 2022, 4);
        Auto auto2 = new Auto("Honda", "Civic", 2023);
        Camion camion1 = new Camion("Volvo", "FH16", 2020, 18.5);

        auto1.mostrarInformacion();
        System.out.println();
        auto2.mostrarInformacion();
        System.out.println();
        camion1.mostrarInformacion();
    }
}