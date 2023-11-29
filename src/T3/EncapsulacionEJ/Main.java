package T3.EncapsulacionEJ;

public class Main {
    public static void main(String[] args) {
        Estudiante e1=new Estudiante("Juan","Garcia",34);
        Estudiante e2=new Estudiante("Jose","Jimenez",2);
        Docente d1=new Docente("Pepe","Perez","Mates","45904");
        Grupo g1=new Grupo("1 ASIR",12,2);
        Carta c1=new Carta(PALO.OROS,"4");
        g1.agregarEstudiante(e1);
        g1.agregarEstudiante(e2);
        g1.setTutor(d1);
        System.out.println(g1);
        System.out.println();
        c1.dibujarCarta();
    }
}
