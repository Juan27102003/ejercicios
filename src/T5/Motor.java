package T5;

public class Motor {
    private String tipo;
    private int potencia;
    private int cilindrada;

    public Motor(String tipo, int potencia, int cilindrada) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
