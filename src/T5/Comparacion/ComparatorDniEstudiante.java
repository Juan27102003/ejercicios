package T5.Comparacion;

import java.util.Comparator;

public class ComparatorDniEstudiante implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        return o1.getNie()-o2.getNie();
    }
}
