package T5.FigurasGeometricas;

import java.lang.instrument.ClassDefinition;

public class TrianguloRectangulo extends Triangulo{


    public TrianguloRectangulo(String nombre, double base, double altura) {
        super(nombre, base, altura);
    }
    public double calcularHipotenusa(){
        return Math.sqrt(base*base+altura*altura);
    }
    @Override
    public double getPerimetro() {
        return calcularHipotenusa()+base+altura;
    }
}
