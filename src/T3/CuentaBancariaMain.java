package T3;

public class CuentaBancariaMain {
    public static void main(String[] args) throws Exception {
        CuentaBancaria3 c=new CuentaBancaria3("Chuck Norris","12335428",1000);
        System.out.println(c);
        System.out.println("Retirar 2000 euros");
        c.retirarDinero(2000);
        System.out.println(c);
    }
}
