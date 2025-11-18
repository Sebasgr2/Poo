public class  Boton {
    protected int piso;
    protected boolean luzEncendida;
    protected boolean falla;
    protected String tipo;

    public Boton(int piso, String tipo) {
        this.piso = piso;
        this.tipo = tipo;
        this.luzEncendida = false;
        this.falla = false;
    }

    public void presionar() {
        if (falla) {
            System.out.println("[ERROR] Botón del piso " + piso + " (" + tipo + ") no responde");
        } else {
            luzEncendida = true;
            System.out.println("[BEEP] Botón del piso " + piso + " (" + tipo + ") encendido");
        }
    }

    public void apagarLuz() { luzEncendida = false; }
    public void setFalla(boolean valor) { falla = valor; }
    public boolean tieneFalla() { return falla; }
}