package T3;


public class Main {
    public static void main(String[] args) {
       /* Rectangulo r = new Rectangulo(6, 4);
        System.out.println("El rectangulo tiene de base " + r.base + " y de altura " + r.altura);
        Persona p=new Persona("Pepe","Perez","26564789J");
        System.out.println(p);
        System.out.println("El area es " + r.calcularArea());
        System.out.println("El perimetro es " + r.calcularPerimetro());
        CalculadoraAreas cal=new CalculadoraAreas();
        cal.imprimirArea(10);
        cal.imprimirArea(10,5);
        cal.imprimirArea(8,12,5);
        */
        Contacto c = new Contacto();
        c.nombre = "Juan Garcia";
        c.telefono = "980765432";
        System.out.println(c);
    }
}
