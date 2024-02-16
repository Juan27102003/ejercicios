package T5;

public class Actividad5_5 {
    public static void main(String[] args) {
        StringBuffer cadena = new StringBuffer("Hola mundo");
        //A
        cadena.append("!!!");
        System.out.println(cadena);
        //B
        cadena.deleteCharAt(cadena.length() - 1);
        System.out.println(cadena);
        //C
        cadena.setCharAt(0, 'h');
        System.out.println(cadena);
        //D
        cadena.insert(10, '-');
        System.out.println(cadena);
        //E
        cadena.delete(4, 11);
        System.out.println(cadena);
        //F
        cadena.reverse();
        System.out.println(cadena);
        //G
        StringBuffer cadena2 = new StringBuffer();
        System.out.println(cadena2.capacity());
        cadena2.append("Hola me llamo Juan Garcia Martinez!");
        System.out.println(cadena2.capacity());
    }
}
