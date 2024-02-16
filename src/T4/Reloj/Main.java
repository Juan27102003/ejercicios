package T4.Reloj;

public class Main {
    public static void main(String[] args) {
        RelojCalendario r1=new RelojCalendario(23,59,59,32,2,31);
        r1.incrementaSegundos(12);
        System.out.println(r1);
    }
}
