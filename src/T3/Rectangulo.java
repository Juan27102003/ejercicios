package T3;

public class Rectangulo {
    double base;
    double altura;

    public Rectangulo(double base, double altura) throws Exception {
        if (base<0||altura<0){
            throw new IllegalArgumentException("No se puden introducir valores negativos");
        }
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public Rectangulo(double base) {
        this.base = base;
        this.altura = base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    double calcularArea() {
        return base * altura;
    }

    double calcularPerimetro() {
        return (base + altura) * 2;
    }
}
