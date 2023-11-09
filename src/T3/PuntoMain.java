package T3;

public class PuntoMain {
    public static void main(String[] args) {
        Punto p=new Punto();
        p.x=1;
        p.y=2;
        System.out.println(p);
        p.moverA(3,4);
        System.out.println(p);
    }
}
