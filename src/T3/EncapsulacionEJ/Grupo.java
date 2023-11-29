package T3.EncapsulacionEJ;

import java.util.Arrays;

public class Grupo {
    private String nombre;
    private int planta;
    private int num_aula;
    private Docente tutor;
    private Estudiante[] alumnado;
    private int numEstudiantes;

    public Grupo(String nombre, int planta, int num_aula) {
        this.nombre = nombre;
        this.planta = planta;
        this.num_aula = num_aula;
        this.alumnado = new Estudiante[38];
        this.tutor = getTutor();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_aula() {
        return num_aula;
    }

    public void setNum_aula(int num_aula) {
        this.num_aula = num_aula;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public Docente getTutor() {
        return tutor;
    }

    public void setTutor(Docente tutor) {
        this.tutor = tutor;
    }

    public Estudiante[] getAlumnado() {
        return alumnado;
    }

    public void setAlumnado(Estudiante[] alumnado) {
        this.alumnado = alumnado;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (numEstudiantes < 38) {
            alumnado[numEstudiantes++] = estudiante;
        } else {
            System.out.println("El grupo ya está completo. No se puede agregar más estudiantes.");
        }
    }

    public int obtenerNumEstudiantes() {
        return numEstudiantes;
    }

    public Estudiante obtenerEstudiantePorNumero(int numero) {
        if (numero >= 1 && numero <= numEstudiantes) {
            return alumnado[numero - 1];
        } else {
            System.out.println("Número de estudiante no válido.");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Grupo{" + "nombre='" + nombre + '\'' + ", planta=" + planta + ", tutor=" + tutor + ", alumnado=" + Arrays.toString(alumnado) + ", num_aula=" + num_aula + '}';
    }
}
