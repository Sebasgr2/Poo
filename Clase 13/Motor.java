
public class Motor {
    
    private String serial;
    private String fabricante;

    public Motor(String serial, String fabricante){
        this.serial = serial;
        this.fabricante = fabricante;
    }
    
    @Override
    public String toString(){
        return "Motor { serial: "  + serial + "Fabricante: " + fabricante + " } ";
    }
}
