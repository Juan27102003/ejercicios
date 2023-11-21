package T3;

import java.util.Random;

public class Persona2 {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private int peso;
    private double altura;

    public Persona2() {
        this.dni = calcularDNI();
    }

    public Persona2(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = calcularDNI();
    }

    public Persona2(String nombre, int edad, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.dni = calcularDNI();
    }

    public String calcularDNI() {
        String dni = "";
        Random r = new Random();
        int num = r.nextInt(89999999) + 10000000;
        int letra = num % 23;
        dni = dni + num;
        switch (letra) {
            case 0:
                dni += "T";
                break;
            case 1:
                dni += "R";
                break;
            case 2:
                dni += "W";
                break;
            case 3:
                dni += "A";
                break;
            case 4:
                dni += "G";
                break;
            case 5:
                dni += "M";
                break;
            case 6:
                dni += "Y";
                break;
            case 7:
                dni += "F";
                break;
            case 8:
                dni += "P";
                break;
            case 9:
                dni += "D";
                break;
            case 10:
                dni += "X";
                break;
            case 11:
                dni += "B";
                break;
            case 12:
                dni += "N";
                break;
            case 13:
                dni += "J";
                break;
            case 14:
                dni += "Z";
                break;
            case 15:
                dni += "S";
                break;
            case 16:
                dni += "Q";
                break;
            case 17:
                dni += "V";
                break;
            case 18:
                dni += "H";
                break;
            case 19:
                dni += "L";
                break;
            case 20:
                dni += "C";
                break;
            case 21:
                dni += "K";
                break;
            case 22:
                dni += "E";
                break;
            default:
                System.out.println("Error: Resto fuera del rango permitido.");
        }
        return dni;
    }

    public int calcularIMC() {
        double IMC = peso / Math.pow(altura, 2);
        if (IMC < 20) {
            System.out.println("Esta flaco");
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            System.out.println("Esta en su peso ideal");
            return 0;
        } else System.out.println("Esta gordo");
        return 1;
    }

    public boolean mayorEdad() {
        return edad > 18;
    }

    private char comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            sexo = 'H';
        }
        return sexo;

    }

    @Override
    public String toString() {
        return "Persona2{" + "nombre='" + nombre + ", edad=" + edad + ", dni='" + dni + ", sexo='" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
