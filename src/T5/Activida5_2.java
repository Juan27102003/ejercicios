package T5;

public class Activida5_2 {
    public static void main(String[] args) {
        a();
        b();
        c();
        d();
        e();
        f();
        g();
        h();
        i();
    }

    private static void a(){
        String cadena="This is Java!";
        System.out.println("Longitud:"+cadena.length());
    }
    private static void b(){
        String cadena="Java";
        for (int i=0;i<cadena.length();i++){
            System.out.println(cadena.charAt(i));
        }
    }

    private static void c(){
        String cadena="Java desde 0";
        for (int i=cadena.length()-1;i>=0;i--){
            System.out.print(cadena.charAt(i));
        }
        System.out.println();
    }

    private static void d(){
        String cadena="James Gosling Created Java";
        System.out.println(cadena.replace(" ",""));
    }

    private static void e(){
        String cadena="Java Java Java";
        int contVoc=0;
        int contCons=0;
        for (int i=0;i<cadena.length();i++){
            if (cadena.charAt(i)=='a' || cadena.charAt(i)=='e'|| cadena.charAt(i)=='i'|| cadena.charAt(i)=='o'|| cadena.charAt(i)=='u'){
                contVoc++;
            }else if (cadena.charAt(i)!=' '){
                contCons++;
            }
        }
        System.out.println("Tiene "+contVoc+" vocales y "+contCons+" consonantes");
    }

    private static void f(){
      String cadena="ProgramacionEntornos";
      String cadena1=cadena.substring(0,12);
      String cadena2=cadena.substring(12);
        System.out.println(cadena1);
        System.out.println(cadena2);
    }

    private static void g(){
    String cadena="java";
    cadena=cadena.toUpperCase();
        System.out.println(cadena);
    cadena=cadena.toLowerCase();
    }
    private static void h(){
        String cadena="Java";
        System.out.println(cadena.equals("JavaScript"));
    }

    private static void i(){
        String cadena="Jeve jeve jeve";
        System.out.println(cadena.replace('e','a'));
    }
}
