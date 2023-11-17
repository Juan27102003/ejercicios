package T3;

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Edad:");
        int edad = sc.nextInt();
        System.out.println("Sexo:");
        char sexo = sc.next().charAt(0);
        System.out.println("Peso:");
        int peso = sc.nextInt();
        System.out.println("Altura:");
        double altura = sc.nextDouble();


        Persona2 p = new Persona2(nombre, edad, sexo, peso, altura);
        System.out.println(p);
        System.out.println(p.calcularIMC());
        System.out.println("¿Es mayor de edad? " + p.mayorEdad());

        Persona2 p1 = new Persona2(nombre, edad, sexo);
        System.out.println(p1);
        System.out.println(p1.calcularIMC());
        System.out.println("¿Es mayor de edad? " + p1.mayorEdad());

        Persona2 p2 = new Persona2();
        p2.setEdad(26);
        p2.setAltura(1.87);
        p2.setNombre("Luis");
        p2.setPeso(80);
        p2.setSexo('J');
        System.out.println(p2);
        System.out.println(p2.calcularIMC());
        System.out.println("¿Es mayor de edad? " + p2.mayorEdad());
    }
}
