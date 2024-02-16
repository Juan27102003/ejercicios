package T4.Figuras;

public class FiguraGeometrica {
    protected String nombre;
    protected double lado;

    public FiguraGeometrica(String nombre, double lado) {
        this.nombre = nombre;
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado;
    }

    public double calcularPerimetro() {
        return lado;
    }
}
