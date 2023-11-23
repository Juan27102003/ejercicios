package T3;

public class Producto {
    private String descripcion;
    private double precio;
    private static double iva = 0.21;

    public Producto(String descripcion, double precio) throws Exception {
        if (!descripcion.isBlank()) {
            this.descripcion = descripcion;
        } else throw new Exception("La descripcion no puede estar vacia");
        if (precio > 0) {
            this.precio = precio;
        } else throw new Exception("El precio no puede ser 0 ni negativo");
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Descripcion:" + this.descripcion + " ,precio:" + this.precio;
    }

    public double calcularPrecioNeto() {
        return this.precio * (1 + iva);
    }

    public static double getIva() {
        return iva;
    }

    public static void setIva(double iva) {
        Producto.iva = iva;
    }
}
