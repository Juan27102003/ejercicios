package T5.Ficheros;

public class DocumentoTexto implements Almacenable {
    public String contenido;

    public DocumentoTexto(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void guardar(String nombreFichero) {
        System.out.println("Guardando documento en " + nombreFichero);
    }

    @Override
    public void recuperar(String nombreFichero) {
        System.out.println("Cargando documento en " + nombreFichero);
    }
}
