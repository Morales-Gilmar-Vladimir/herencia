public class Persona {
    private int CI;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Telefono;
    private String Signo;
private int Edad;

    public Persona(int CI, String nombre, String apellido, String direccion, String telefono, String signo, int edad) {
        this.CI = CI;
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        Telefono = telefono;
        Signo = signo;
        Edad = edad;
    }
//SETTERS Y GETTERS


    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getSigno() {
        return Signo;
    }

    public void setSigno(String signo) {
        Signo = signo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    //
    public void caminar(){
        System.out.println("Este es un metodo de caminar");
    }
    public void trabajar(){
        System.out.println("Este es un metodo de Trabajar");
    }
}
