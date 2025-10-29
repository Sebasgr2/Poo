public class Conductor {
    
    private int cedula;
    private String nombre;

    public Conductor(int cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "Conductor { cedula: " + cedula + "Nombre: " + nombre + " } ";
    }
}
