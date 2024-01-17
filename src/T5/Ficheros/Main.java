package T5.Ficheros;

public class Main {
    public static void main(String[] args) {
        Imagen i=new Imagen(200,200);
        DocumentoTexto d=new DocumentoTexto("Hola");
        i.guardar("documento.txt");
        i.recuperar("documento.txt");

        d.guardar("documento.txt");
        d.recuperar("documento.txt");

        i.rotarSentidoAgujas();
        i.rotarSentidoContrarioAgujas();
    }
}
