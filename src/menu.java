public class menu {
    public static void main(String[] args) {
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

        Doctor Ana = new Doctor(05041741165,
                "Ana",
                "Carranco","Guapulo","097258587741","Leo", 33,"Doctora",
                17755,"14:00-16:00","Andrade Marin");

        System.out.println(Ana.getNombre()+" es "+ Ana.getEspecialidad());
        System.out.println("Tiene "+ Ana.getEdad()+ " años");
        System.out.println("Es de signo "+ Ana.getSigno());
        Ana.examinar();



    }
}
