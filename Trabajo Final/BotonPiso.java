public class BotonPiso extends Boton {
    private String direccion;
    private SistemaControl sistema;

    public BotonPiso(int piso, String direccion, SistemaControl sistema) {
        super(piso, "PISO");
        this.direccion = direccion;
        this.sistema = sistema;
    }

    public void presionar() {
        super.presionar();
        if (!falla) {
            System.out.println("Solicitud desde piso " + piso + " para " + direccion);
            int dir = direccion.equals("SUBIR") ? Direccion.SUBIENDO : Direccion.BAJANDO;
            sistema.solicitudDesdePiso(piso, dir);
        } else {
            sistema.getNotificador().alertaFalla("Falla en botón del piso " + piso + " (" + direccion + ")");
        }
    }
}