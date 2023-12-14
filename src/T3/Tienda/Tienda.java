package T3.Tienda;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private  String nombre;
    private List<Producto> catalogo;
    private List<Cliente> clientes;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.catalogo = new ArrayList<Producto>();
        this.clientes = new ArrayList<Cliente>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<Producto> catalogo) {
        this.catalogo = catalogo;
    }

    public List<Cliente> getClientes() {
        return List.copyOf(clientes);
    }

    @Override
    public String toString() {
        return "Tienda{" + "nombre='" + nombre + '\'' + ", catalogo=" + catalogo + ", clientes=" + clientes + '}';
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    public void aniadirClientes(Cliente cliente1){
        if (!clientes.contains(cliente1)){
            clientes.add(cliente1);
        }
    }
    public void eliminarClientes(Cliente cliente1){
        if (clientes.contains(cliente1)){
            clientes.remove(clientes.indexOf(cliente1));
        }
    }
    public void aniadirProductos(Producto producto1){
        if (!catalogo.contains(producto1)){
            catalogo.add(producto1);
        }
    }
    public void eliminarProductos(Producto producto1){
        if (catalogo.contains(producto1)){
            catalogo.remove(catalogo.indexOf(producto1));
        }
    }

}
