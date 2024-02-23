package T5.Comparacion;

import java.util.Comparator;

public class ComparatorApellidosPersona implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        int resultado = o1.getApellidos().compareTo(o2.getApellidos());
        if (resultado != 0) {
            return resultado;
        } else {
            resultado=o1.getNombre().compareTo(o2.getNombre());
            if (resultado==0){
                return o1.getDni().compareTo(o2.getDni());
            }
            return resultado;
        }
    }
}
