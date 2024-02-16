package T4.Herencia;

public class Estudiante extends Persona {
    private int nie;
    private String grupo;

    public Estudiante(String nombre, String apellidos, int nie, String grupo) {
        super(nombre, apellidos);
        this.nie = nie;
        this.grupo = grupo;
    }

    public int getNie() {
        return nie;
    }

    public void setNie(int nie) {
        this.nie = nie;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void estudiar() {
        System.out.println(getNombre() + "estudia en " + grupo);
    }
}
