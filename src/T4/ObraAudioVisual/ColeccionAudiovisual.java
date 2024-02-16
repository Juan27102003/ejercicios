package T4.ObraAudioVisual;

import java.util.ArrayList;
import java.util.List;

public class ColeccionAudiovisual {
    protected String descripcion;
    List<ObraAudiovisual> obraAudiovisual=new ArrayList<>();

    public ColeccionAudiovisual(String descripcion) {
        setDescripcion(descripcion);
        this.obraAudiovisual=new ArrayList<ObraAudiovisual>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<ObraAudiovisual> getObraAudiovisual() {
        return List.copyOf(obraAudiovisual);
    }

    public void setDescripcion(String descripcion) {
        if (descripcion.isEmpty()){
            throw new IllegalArgumentException(("La descripcion no puede estar vacia"));
        }
        this.descripcion = descripcion;
    }
    public void aniadirObraAudiovisual(ObraAudiovisual obra){
        if (!obraAudiovisual.contains(obra)){
            obraAudiovisual.add(obra);
        }else throw new IllegalArgumentException("La obra ya esta en la coleccion");
    }
    public void eliminarObraAudiovisual(ObraAudiovisual obra){
        obraAudiovisual.remove(obra);
    }
}
