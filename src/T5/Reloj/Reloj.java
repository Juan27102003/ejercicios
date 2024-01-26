package T5.Reloj;

public class Reloj {
    protected int horas;
    protected int minutos;
    protected int segundos;

    public Reloj(int horas, int minutos, int segundos) throws IllegalArgumentException{
      setHoras(horas);
      setMinutos(minutos);
      setSegundos(segundos);
    }

    public Reloj() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Reloj(int horas) throws IllegalArgumentException{
        setHoras(horas);
        this.minutos = 0;
        this.segundos=0;
    }
    public Reloj(int horas, int minutos) throws IllegalArgumentException{
        setHoras(horas);
        setMinutos(minutos);
        this.segundos=0;
    }

    private void setHoras(int horas) throws IllegalArgumentException{
        if (horas>=0&&horas<24){
        this.horas = horas;
        }else throw new IllegalArgumentException("Las horas no son válidas");
    }

    public void setMinutos(int minutos) throws IllegalArgumentException{
        if (horas>=0&&horas<24){
            this.minutos = minutos;
        }else throw new IllegalArgumentException("Los minutos no son válidos");
    }

    public void setSegundos(int segundos) throws IllegalArgumentException{
        if (horas>=0&&horas<24){
            this.segundos = segundos;
        }else throw new IllegalArgumentException("Los segundos no son válidos");
    }


    public int getHoras() {
        return horas;
    }


    public int getMinutos() {
        return minutos;
    }


    public int getSegundos() {
        return segundos;
    }


    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public void incrementaSegundos(int segundos2) {
        segundos += segundos2;
        if (segundos > 59) {
            minutos+=segundos/60;
            segundos = segundos%60;
            if (minutos > 59) {
                horas+=minutos/60;
                minutos=minutos%60;
                if (horas > 23) {
                    horas = horas%24;
                }
            }
        }
    }
    public void incrementaSegundos() {
        incrementaSegundos(1);
}
}
