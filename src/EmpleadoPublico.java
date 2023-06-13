public class EmpleadoPublico extends Persona{
    private String puesto;
    private String cargo;

    public EmpleadoPublico(int CI, String nombre, String apellido, String direccion, String telefono,String signo,int Edad, String puesto, String cargo) {
        super(CI, nombre, apellido, direccion, telefono,signo,Edad);
        this.puesto=puesto;
        this.cargo=cargo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void tramitar(){
        System.out.println("Este es un método tramitar");
    }
}
