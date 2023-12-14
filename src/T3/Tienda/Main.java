package T3.Tienda;

import java.util.Date;

public class Main {
    static Tienda tienda;

    public static void main(String[] args) throws Exception {
        inicializarTienda();
        Cliente c1=new Cliente("66666666J","Pepe");
        Producto producto1=new Producto(123,"Alfombrilla",12);

    }

    public static void inicializarTienda() throws Exception {
        tienda = new Tienda("Amazon");
        aniadirClientesTienda();
        aniadirProductosTienda();
    }

    public static void aniadirClientesTienda() {
        for (int i = 0; i < 5; i++) {
            Cliente c = new Cliente("12345678Z" + i, "Nombre " + i);
            tienda.aniadirClientes(c);
        }
    }

    public static void aniadirProductosTienda() throws Exception {
        for (int i = 0; i < 10; i++) {
            Producto p = new Producto();
            p.setCodigo(i);
            p.setNombre("Producto" + i);
            p.setPrecio(30 + i);
        }

    }
}
