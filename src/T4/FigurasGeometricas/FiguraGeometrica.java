package T4.FigurasGeometricas;

public abstract class FiguraGeometrica {
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPerimetro();
    public abstract double getArea();
    public abstract String getTipoPrincipal();

    @Override
    public String toString() {
        return "Figura";
    }
}
