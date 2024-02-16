package T4.ObraAudioVisual;

public class ObraAudiovisual {
    protected String titulo;
    protected int duracion;

    public ObraAudiovisual(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "ObraAudiovisual{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
