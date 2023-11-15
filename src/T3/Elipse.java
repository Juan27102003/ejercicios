package T3;

public class Elipse {
    double altura;
    double longitud;

    public Elipse(double altura, double longitud) throws Exception {
        if (altura < 0 || longitud < 0) {
            throw new IllegalArgumentException("No se pueden introducir valores negativos");
        }
        this.altura = altura;
        this.longitud = longitud;
    }

    public Elipse(double altura) throws Exception {
        this(altura,altura);
    }
    public Elipse() throws Exception {
        this(2,3);
    }

    public double calcularArea(double altura, double longitud) {
        return Math.PI * altura * longitud;
    }

    public double calcularPerimetro(double altura, double longitud) {
        return Math.PI * (altura + longitud);
    }

    @Override
    public String toString() {
        return "Elipse{" + "altura=" + altura + ", longitud=" + longitud + '}';
    }
}
