public class Estudiante extends Persona {
    private int codigo;
    private String correo;
    private String semestre;
    private String carrera;



    public Estudiante(int CI, String nombre, String apellido, String direccion, String telefono,String signo,int Edad, int codigo, String correo, String semestre, String carrera) {
       // Va a almacenar todos los atributos de la clase Persona en este caso de la Herencia
        super(CI, nombre, apellido, direccion, telefono, signo,Edad);

        //Atributos propios de la clase Estudiante siempre van a estar fuera del super
        this.codigo=codigo;
        this.correo=correo;
        this.semestre=semestre;
        this.carrera=carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void  estudiar(){
        System.out.println("Este es el método estudiar");
    }
    public void  memorizar(){
        System.out.println("Este es el método memorizar");
    }
    public void  leer(){
        System.out.println("Este es el método leer");
    }
}
