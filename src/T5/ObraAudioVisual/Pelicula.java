package T5.ObraAudioVisual;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends ObraAudiovisual{
    protected final int anioEstreno;
    protected final String director;
    protected final List<Persona> actoresPrincipales;
    protected final String generos;

    public Pelicula(String titulo, int duracion, int anioEstreno, String director, List<Persona> actoresPrincipales, String generos) {
        super(titulo, duracion);
        this.anioEstreno = anioEstreno;
        this.director = director;
        this.actoresPrincipales =actoresPrincipales;
        this.generos = generos;
    }
    public String convertirDuracion(){
        int horas = 0;
        int minutos=duracion/60;
        if (minutos>59){
            horas=minutos/60;
            minutos=duracion%60;
        }
        return String.format("%02d:%02d",horas,minutos);
    }
    @Override
    public String toString() {
        return "Titulo="+titulo+" ,duracion="+convertirDuracion()+" ,año de estreno="+anioEstreno+" ,director="+director+" ,actores principales="+actoresPrincipales+" ,generos="+generos;
    }

}
