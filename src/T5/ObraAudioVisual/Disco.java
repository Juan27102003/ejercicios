package T5.ObraAudioVisual;

public class Disco extends ObraAudiovisual{
    protected String artistaPrincipal;
    protected int numeroPistas;
    protected int anioPublicacion;

    public Disco(String titulo, int duracion, String artistaPrincipal, int numeroPistas, int anioPublicacion) {
        super(titulo, duracion);
        this.artistaPrincipal = artistaPrincipal;
        this.numeroPistas = numeroPistas;
        this.anioPublicacion = anioPublicacion;
    }
}
