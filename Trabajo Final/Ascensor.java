public class Ascensor {
    private int pisoActual;
    private int direccion;
    private boolean[] destinos;
    private Puerta puerta;
    private ModuloNotificacion notificador;
    private SistemaControl sistema;
    private boolean enEmergencia;

    public Ascensor(int pisos, SistemaControl sistema) {
        this.pisoActual = 1;
        this.direccion = Direccion.DETENIDO;
        this.destinos = new boolean[pisos + 1];
        this.puerta = new Puerta(pisoActual);
        this.sistema = sistema;
        this.notificador = sistema.getNotificador();
        this.enEmergencia = false;
    }

    public SistemaControl getSistema() { return sistema; }

    public void agregarDestino(int piso) {
        if (enEmergencia) {
            notificador.alertaFalla("No se puede agregar destino: emergencia activa.");
            return;
        }
        if (piso == pisoActual) {
            notificador.mensaje("El ascensor ya está en el piso " + piso);
            return;
        }
        destinos[piso] = true;
        notificador.mensaje("Destino añadido: piso " + piso);
    }

    public void mover() {
        if (enEmergencia) return;

        if (direccion == Direccion.DETENIDO) {
            for (int i = pisoActual + 1; i < destinos.length; i++) {
                if (destinos[i]) { direccion = Direccion.SUBIENDO; break; }
            }
            if (direccion == Direccion.DETENIDO) {
                for (int i = pisoActual - 1; i > 0; i--) {
                    if (destinos[i]) { direccion = Direccion.BAJANDO; break; }
                }
            }
        }

        if (direccion == Direccion.SUBIENDO) pisoActual++;
        else if (direccion == Direccion.BAJANDO) pisoActual--;

        if (pisoActual < 1) pisoActual = 1;
        if (pisoActual >= destinos.length) pisoActual = destinos.length - 1;

        notificador.mensaje("Ascensor en piso " + pisoActual);

        if (destinos[pisoActual]) {
            destinos[pisoActual] = false;
            direccion = Direccion.DETENIDO;
            abrirPuertas();
        }
    }

    public void abrirPuertas() {
        puerta = new Puerta(pisoActual);
        puerta.abrir();
        notificador.mensaje("Personas bajando en piso " + pisoActual);
    }

    public void cerrarPuertas() { puerta.cerrar(); }

    public void activarEmergencia(String causa) {
        enEmergencia = true;
        notificador.emergencia(causa);
        direccion = Direccion.DETENIDO;
        puerta.abrir();
    }
}