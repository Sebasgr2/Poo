public class SistemaControl {
    private Ascensor ascensor;
    private BotonPiso[] subir;
    private BotonPiso[] bajar;
    private ModuloNotificacion notificador;
    private int pisos;

    public SistemaControl(int pisos) {
        this.pisos = pisos;
        this.notificador = new ModuloNotificacion();
        this.ascensor = new Ascensor(pisos, this);
        this.subir = new BotonPiso[pisos];
        this.bajar = new BotonPiso[pisos];
        for (int i = 0; i < pisos; i++) {
            if (i < pisos - 1) subir[i] = new BotonPiso(i + 1, "SUBIR", this);
            if (i > 0) bajar[i] = new BotonPiso(i + 1, "BAJAR", this);
        }
    }

    public ModuloNotificacion getNotificador() { return notificador; }

    public void solicitudDesdePiso(int piso, int dir) {
        notificador.mensaje("Solicitud desde piso " + piso + " dir=" + (dir == 1 ? "SUBIR" : "BAJAR"));
        ascensor.agregarDestino(piso);
    }

    public void ejecutar(int pasos) {
        for (int i = 0; i < pasos; i++) {
            ascensor.mover();
            try { Thread.sleep(400); } catch (Exception e) {}
        }
    }

    public static void main(String[] args) throws java.io.IOException {
        SistemaControl sistema = new SistemaControl(10);
        sistema.getNotificador().mensaje("Sistema iniciado (10 pisos)");

        // Simulación
        System.out.println("\n-- 3 personas entran en el piso 1 --");
        sistema.subir[0].presionar();

        // Personas eligen sus destinos dentro del ascensor
        BotonCabina persona1 = new BotonCabina(4, sistema.ascensor); // baja en piso 4
        BotonCabina persona2 = new BotonCabina(7, sistema.ascensor); // baja en piso 7
        BotonCabina persona3 = new BotonCabina(9, sistema.ascensor); // baja en piso 9

        persona1.presionar();
        persona2.presionar();
        persona3.presionar();

        System.out.println("\n-- Ascensor iniciando movimiento --");
        sistema.ejecutar(15);

        // Simular emergencia entre pisos
        System.out.println("\n  Emergencia simulada: corte de energía mientras sube al piso 8");
        sistema.ascensor.activarEmergencia("Corte de energía detectado en piso 8");

        sistema.getNotificador().mensaje("\nSimulación finalizada");
    }
}