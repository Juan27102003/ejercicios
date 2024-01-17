package T5.Ficheros;

public class Imagen extends Almacenable {
    public int altura;
    public int anchura;

    public Imagen(int altura, int anchura) {
        this.altura = altura;
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    @Override
    public void guardar(String nombreFichero) {
        System.out.println("Guardando imagen en " + nombreFichero);
    }

    @Override
    public void recuperar(String nombreFichero) {
        System.out.println("Cargando imagen desde " + nombreFichero);
    }
}
