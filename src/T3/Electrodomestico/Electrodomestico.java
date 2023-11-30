package T3.Electrodomestico;

public class Electrodomestico {
    private double precioBase = 100;
    private String color = "blanco";
    private Electrodomestico_EficienciaEnergetica consumoEnergetico=Electrodomestico_EficienciaEnergetica.F;
    private double peso = 5;

    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        //this.consumoEnergetico = consumoEnergetico;
        try{
            comprobarConsumoEnergetico(consumoEnergetico);
        }catch (Exception e){
            this.consumoEnergetico=Electrodomestico_EficienciaEnergetica.F;
        }
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }

    private void comprobarConsumoEnergetico(char letra) {
        Electrodomestico_EficienciaEnergetica ef = Electrodomestico_EficienciaEnergetica.F;
        try {
            ef = Electrodomestico_EficienciaEnergetica.valueOf(String.valueOf(letra));
        } catch (IllegalArgumentException e) {
            ef=Electrodomestico_EficienciaEnergetica.F;
        }
        switch (ef) {
            case A, B, C, D, E, F:
                this.consumoEnergetico = Electrodomestico_EficienciaEnergetica.valueOf(String.valueOf(letra));
                break;
            default:
                this.consumoEnergetico = Electrodomestico_EficienciaEnergetica.F;
        }
    }
    private void comprobarColor(String color){
        try {

        }catch (IllegalArgumentException e){

        }

    }

}
