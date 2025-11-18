public class BotonCabina extends Boton {
    private Ascensor ascensor;

    public BotonCabina(int piso, Ascensor ascensor) {
        super(piso, "CABINA");
        this.ascensor = ascensor;
    }

    public void presionar() {
        super.presionar();
        if (!falla) {
            System.out.println("Destino seleccionado: piso " + piso);
            ascensor.agregarDestino(piso);
        } else {
            ascensor.getSistema().getNotificador().alertaFalla("Falla en botón de cabina hacia piso " + piso);
        }
    }
}