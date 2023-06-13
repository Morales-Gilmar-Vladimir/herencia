import java.lang.reflect.Array;
import java.util.ArrayList;

public class menu {
    public static void main(String[] args) {
        ArrayList <Estudiante> integrantes =new ArrayList<Estudiante>();


        Persona miPersona = new Persona(1752613776,
                "Gilmar",
                "Morales",
                "Villaflora",
                "0979344249",
                "Acuario",20);

        System.out.println(miPersona.getCI());


        Estudiante Gilmar=new Estudiante(1752613776,
                "Gilmar",
                "Morales",
                "Villaflora",
                "0979344249",
                "Acuario",
                20,
                20211315,
                "gilmarmamasmams.epn",
                "Tercero",
                "TSDS");

        integrantes.add(Gilmar);

        Doctor Ana = new Doctor(05041741165,
                "Ana",
                "Carranco","Guapulo","097258587741","Leo", 33,"Doctora",
                17755,"14:00-16:00","Andrade Marin");

        System.out.println(Ana.getNombre()+" es "+ Ana.getEspecialidad());
        System.out.println("Tiene "+ Ana.getEdad()+ " años");
        System.out.println("Es de signo "+ Ana.getSigno());
        Ana.examinar();

        EmpleadoPublico Pablo=new EmpleadoPublico(1755414863,"Pablo", "Alborada", "Conocoto",
                "097855488","Acuario",25, "Contador","Tramitador");

        System.out.println("\n");
        System.out.println(Pablo.getNombre()+" es Empelado Público");
        System.out.println("Su teléfono es "+ Pablo.getTelefono());
        Pablo.tramitar();

        Futbolista Maritza =new Futbolista(1755968984, "Maritza", "Solorzano","Cotocollao",
                "0978844556","Capricornio", 22,"Aucas","Delantero",29,"carlos Paez", 5);

        System.out.println("\n");
        System.out.println(Maritza.getNombre()+" es Futbolista");
        System.out.println("Entrena "+Maritza.getHoras_Entr()+" horas diarias");
        Maritza.correr();

        Estudiante Melanie = new Estudiante(0,"Melanie","0","0","0","0",0,0,"0","0","0");
        Melanie.setNombre("\nMelanie");
        Melanie.setSemestre("Tercer");
        System.out.println(Melanie.getNombre()+" es Estudiante");
        System.out.println("Esta en "+Melanie.getSemestre()+" semestre");
        Melanie.memorizar();
        /*
        for (Estudiante integrante : integrantes ){
            System.out.print(integrante.getNombre()+ " "+ integrante.getApellido());
            System.out.println("\n");
            integrante.leer();
*/
        }
    }

