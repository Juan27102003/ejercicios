package T3.CuentaBancaria;

public class CuentaBancaria3 {
    private String titular;
    private String numeroCuenta;
    private double saldo;
    public CuentaBancaria3(String titular,
                           String numeroCuenta,
                           double saldoInicial)
            throws Exception {
// Evitar parámetros vacíos
        if (titular.length() == 0) {
            throw new Exception(
                    "El titular no puede estar vacío"
            );
        }
        if (numeroCuenta.length() == 0) {
            throw new Exception(
                    "El número de cuenta no puede " +
                            "estar vacío"
            );
        }
// Evitar saldos iniciales negativos
        if (saldoInicial < 0) {
            throw new Exception(
                    "El saldo inicial no puede ser negativo"
            );
        }
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }
    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    void ingresarDinero(double cantidad) throws Exception {
        if (cantidad >= 0) {
            saldo += cantidad;
        } else {
            throw new Exception(
                    "No se puede ingresar una " +
                            "cantidad negativa"
            );
        }
    }
    void retirarDinero(double cantidad) throws Exception {
        if (cantidad > saldo) {
            throw new Exception(
                    "No se puede retirar más dinero que" +
                            " el saldo disponible"
            );
        }
        saldo -= cantidad;
    }
    public String toString() {
        return "Cuenta " + numeroCuenta +
                " de " + titular + " con " +
                saldo + " euros";
    }
}
