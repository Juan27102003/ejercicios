package T3.EncapsulacionEJ;

public class Carta {
    private PALO paloCarta;
    private String numCarta;

    public Carta(PALO paloCarta, String numCarta) {
        this.paloCarta = paloCarta;
        this.numCarta = numCarta;
    }

    public PALO getPaloCarta() {
        return paloCarta;
    }

    public void setPaloCarta(PALO paloCarta) {
        this.paloCarta = paloCarta;
    }

    public String getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(String numCarta) {
        this.numCarta = numCarta;
    }

    private String obtenerNumeroCarta() {

        String numeroCarta;
        switch (this.numCarta) {
            case "1":
                numeroCarta = "AS";
                break;
            case "10":
                numeroCarta = "SOTA";
                break;
            case "11":
                numeroCarta = "CABALLO";
                break;
            case "12":
                numeroCarta = "REY";
                break;
            default:
                numeroCarta = String.valueOf(numCarta);
        }

        return numeroCarta;

    }

    public void dibujarCarta() {

        for (int i = 0; i < 2; i++) {
            pintarFila('+', '-', "", 14, 'D');

            if (i == 0) {
                pintarFila('|', ' ', numCarta, 14, 'D');
                pintarFila('|', ' ', String.valueOf(paloCarta), 14, 'D');

                for (int j = 0; j < 4; j++) {
                    pintarFila('|', ' ', "", 14, 'D');
                }

                pintarFila('|', ' ', numCarta, 14, 'I');
            }
        }

    }

    public void pintarFila(char delimitador, char relleno, String contenido, int tamano, char direccion) {

        while (contenido.length() < (tamano - 4)) {
            if (direccion == 'D')
                contenido = contenido + String.valueOf(relleno);
            else
                contenido = String.valueOf(relleno) + contenido;
        }
        contenido = String.valueOf(delimitador) + String.valueOf(relleno) + contenido + String.valueOf(relleno) + String.valueOf(delimitador);

        System.out.println(contenido);

    }
}
