public class ModuloNotificacion {
    public void mensaje(String texto) {
        System.out.println("[INFO] " + texto);
    }

    public void alertaFalla(String texto) {
        System.out.println("[ALERTA] " + texto);
    }

    public void emergencia(String texto) {
        System.out.println("\n EMERGENCIA ");
        System.out.println("[EMERGENCIA] " + texto);
        System.out.println(" Ascensor detenido. Puertas abriéndose...");
    }
}
