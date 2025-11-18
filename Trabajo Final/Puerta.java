public class Puerta {
    private boolean abierta;
    private boolean obstaculo;
    private int piso;

    public Puerta(int piso) {
        this.piso = piso;
        this.abierta = false;
        this.obstaculo = false;
    }

    public void abrir() {
        abierta = true;
        System.out.println("[PUERTA] Abierta en piso " + piso);
    }

    public void cerrar() {
        if (obstaculo) {
            System.out.println("[PUERTA] No se puede cerrar (obstáculo detectado en piso " + piso + ")");
        } else {
            abierta = false;
            System.out.println("[PUERTA] Cerrada en piso " + piso);
        }
    }

    public void detectarObstaculo(boolean valor) {
        obstaculo = valor;
        if (valor) System.out.println("[SENSOR] Obstáculo en puerta del piso " + piso);
    }
}