package T5.Figuras;

public class TrianguloEquilatero extends FiguraGeometrica{

    public TrianguloEquilatero(String nombre, double lado) {
        super(nombre, lado);
    }

    @Override
    public double calcularArea(){
        return lado*Math.sqrt((lado*lado)-(lado/2)*(lado/2))/2;
    }
    @Override
    public double calcularPerimetro(){
        return 3*lado;
    }
}
