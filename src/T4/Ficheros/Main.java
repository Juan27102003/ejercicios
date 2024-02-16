package T4.Ficheros;

import java.util.ArrayList;
import java.util.List;

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

        List<Rotable> lista =new ArrayList<>();

        lista.add(i);
        //lista.add(d);

        listar(lista);
        System.out.println(i.describir());

    }
    public static void listar(List<Rotable> lista){
        for (Rotable l:lista){
            l.rotarSentidoAgujas();
            l.rotar360Grados();
            System.out.println(Rotable.radianesAGrados(Math.PI/2));
        }
        /*
        for (int i=0;i<lista.size();i++){
            Object l=lista.get(i);
            if (lista.get(i) instanceof Rotable){
                Rotable l=(Rotable) lista.get(i);
                l.rotarSentidoAgujas();
            }
        }*/
    }
}
