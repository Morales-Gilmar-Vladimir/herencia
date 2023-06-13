public class Futbolista extends Persona{
    private String equipo;
   private String posicion;
   private int num_Camiseta;
   private String representante;
   private int horas_Entr;

    public Futbolista(int CI, String nombre, String apellido, String direccion, String telefono,String signo,int Edad,String equipo, String posicion, int num_Camisetav,String representante,int horas_Entr) {
        super(CI, nombre, apellido, direccion, telefono,signo,Edad);
        this.equipo=equipo;
        this.posicion=posicion;
        this.num_Camiseta=num_Camisetav;
        this.representante=representante;
        this.horas_Entr=horas_Entr;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNum_Camiseta() {
        return num_Camiseta;
    }

    public void setNum_Camiseta(int num_Camiseta) {
        this.num_Camiseta = num_Camiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public int getHoras_Entr() {
        return horas_Entr;
    }

    public void setHoras_Entr(int horas_Entr) {
        this.horas_Entr = horas_Entr;
    }

    public void correr(){
        System.out.println("Este es un método correr");
    }
}
