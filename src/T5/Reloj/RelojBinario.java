package T5.Reloj;

public class RelojBinario extends Reloj {
    public RelojBinario(int horas, int minutos, int segundos) throws IllegalArgumentException {
        super(horas, minutos, segundos);
    }

    public RelojBinario() {
    }

    public RelojBinario(int horas) throws IllegalArgumentException {
        super(horas);
    }

    public RelojBinario(int horas, int minutos) throws IllegalArgumentException {
        super(horas, minutos);
    }

    @Override
    public String toString() {
        String horasBinario = Integer.toBinaryString(getHoras());
        String minutosBinario = Integer.toBinaryString(getMinutos());
        String segundosBinario = Integer.toBinaryString(getSegundos());
        return "0".repeat(6 - horasBinario.length()) + horasBinario + ":"+"0".repeat(6-minutosBinario.length()) + minutosBinario +":"+"0".repeat(segundosBinario.length()) +segundosBinario;
    }
}
