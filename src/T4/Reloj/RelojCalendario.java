package T4.Reloj;

public class RelojCalendario extends Reloj{
    protected int dia;
    protected int mes;
    protected int anyo;
    protected int diaEnMes[];

    public RelojCalendario(int horas, int minutos, int segundos, int anyo, int mes, int dia) throws IllegalArgumentException {
        super(horas, minutos, segundos);
        setAnyo(anyo);
        setMes(mes);
        setDia(dia);
    }

    public void setDia(int dia) throws IllegalArgumentException{
        if(mes==1&&dia>0&&dia<32){
            this.dia=dia;
        }else if(mes==2){
            if (anyo%4==0 && anyo%100==0 ||anyo%400==0){
                if (dia>0&&dia<30){
                    this.dia=dia;
                }else throw new IllegalArgumentException("Fecha no válida");
            }else if (anyo%4!=0 && anyo%100!=0 ||anyo%400!=0){
                if (dia>0&&dia<29){
                    this.dia=dia;
                }else throw new IllegalArgumentException("Fecha no válida");
            }
        }else if(mes==3&&dia>0&&dia<32){
            this.dia=dia;
        }else if(mes==4&&dia>0&&dia<31){
            this.dia=dia;
        }else if(mes==5&&dia>0&&dia<32){
            this.dia=dia;
        }else if(mes==6&&dia>0&&dia<31){
            this.dia=dia;
        }else if(mes==7&&dia>0&&dia<32){
            this.dia=dia;
        }else if(mes==8&&dia>0&&dia<32){
            this.dia=dia;
        }else if(mes==9&&dia>0&&dia<31){
            this.dia=dia;
        }else if(mes==10&&dia>0&&dia<32){
            this.dia=dia;
        }else if(mes==11&&dia>0&&dia<31){
            this.dia=dia;
        }else if(mes==12&&dia>0&&dia<32){
            this.dia=dia;
        }else throw new IllegalArgumentException("Fecha no válida");
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "RelojCalendario{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", anyo=" + anyo +
                ", horas=" + horas +
                ", minutos=" + minutos +
                ", segundos=" + segundos +
                '}';
    }

    @Override
    public void incrementaSegundos(int segundos2) {
        int segundos=getSegundos()+segundos2;
        int minutos=getMinutos()+segundos/60;
        int horas=getHoras()+minutos/60;
        int incrementoDias=horas/24;
        super.incrementaSegundos(segundos2);
         dia+=incrementoDias;
    }
}
