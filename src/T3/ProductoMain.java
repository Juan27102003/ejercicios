package T3;

public class ProductoMain {
    public static void main(String[] args) throws Exception {
        Producto p=new Producto("Raton",12);
        Producto p1=new Producto("Teclado",15);

        //Producto.iva=0.50;
        Producto.setIva(0.50);

        System.out.println(p);
        System.out.println(p1);
        System.out.println(p.calcularPrecioNeto());
        System.out.println(p1.calcularPrecioNeto());

    }
}
