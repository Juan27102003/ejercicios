package T3.Tienda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cesta {
    private Date fecha;
    private List<Producto> producto;
    private boolean pagado;
    private double importe;

    public Cesta(Date fecha) {
        this.fecha = fecha;
        this.producto = new ArrayList<Producto>();
        this.importe = importe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    public void calcularImporte(){
        double importe1=0;
        for (Producto p:producto){
            importe1+=p.getPrecio();
        }
        this.importe=importe1;
    }
    public void aniadirProductos(Producto producto1){
        if (!producto.contains(producto1)){
            producto.add(producto1);
            calcularImporte();
        }
    }
    public void eliminarClientes(Producto producto1){
        if (producto.contains(producto1)){
            producto.remove(producto.indexOf(producto1));

        }
    }

    @Override
    public String toString() {
        return "Cesta{" +
                "fecha='" + fecha + '\'' +
                ", producto=" + producto +
                ", pagado=" + pagado +
                ", importe=" + importe +
                '}';
    }
}
