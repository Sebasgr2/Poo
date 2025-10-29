public class Vehiculo {
    
    private String placa;
    private Motor motor;

    public Vehiculo(String placa, Motor motor){
        this.placa = placa;
        this.motor = motor;
    }

    public void asignarConductor(Conductor conductor){
        System.out.println("El conductor:" + conductor + "Fue asignad@");
    }

    @Override
    public String toString(){
        return "Vehiculo { Placa: " + placa + "Motor: " + motor + " } ";
    }
}
