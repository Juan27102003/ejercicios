package T5.Herencia;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "Garcia");
        p1.entrar();
        p1.salir();

        Estudiante e1 = new Estudiante("Mario", "Muñoz", 124365466, "1º DAM");
        e1.entrar();
        e1.salir();

        DocenteFP d1 = new DocenteFP("Pepe", "Perez");

        Docente d = d1;
        Persona p2 = d1;

        Persona p3 = new Docente("Maria", "Perez");

        Docente d2 = (Docente) p3;
        Docente d3 = d1;

        Persona p4 = new Persona("Antonio", "Recio");

        System.out.println(e1 instanceof Persona);
        System.out.println(e1 instanceof Estudiante);
        System.out.println(p4 instanceof DocenteFP);
        System.out.println(p4 instanceof Estudiante);
        if (p4 instanceof Estudiante){
            Estudiante e2 = (Estudiante) p4;
            e2.estudiar();
        }
    }
}
