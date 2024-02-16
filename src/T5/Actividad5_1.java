package T5;

import java.util.Scanner;

public class Actividad5_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cadena;
        String cadenaAux;
        int contA=0;
        int contE=0;
        int contI=0;
        int contO=0;
        int contU=0;
        do {
            cadena= sc.nextLine();
            if (!cadena.equalsIgnoreCase("FIN")){
                //A
                System.out.println(cadena.toLowerCase());
                //B
                for (int i=cadena.length()-1;i>=0;i--){
                    System.out.print(cadena.charAt(i));
                }
                System.out.println();
                //C
                for (int i=0;i<cadena.length();i++){
                    if (i%2==0){
                        System.out.print(Character.toLowerCase(cadena.charAt(i)));
                    }else System.out.print(Character.toUpperCase(cadena.charAt(i)));
                }
                //D
                    cadenaAux=cadena.replace("a","@");
                    cadenaAux=cadenaAux.replace("A","@");
                System.out.println(cadenaAux);
                //E
                for (int i=0;i<cadena.length();i++){
                    if (cadena.charAt(i)=='a'||cadena.charAt(i)=='A') contA++;
                    if (cadena.charAt(i)=='e'||cadena.charAt(i)=='E') contE++;
                    if (cadena.charAt(i)=='i'||cadena.charAt(i)=='I') contI++;
                    if (cadena.charAt(i)=='o'||cadena.charAt(i)=='O') contO++;
                    if (cadena.charAt(i)=='u'||cadena.charAt(i)=='U') contU++;
                }
                System.out.println("A:"+contA);
                System.out.println("E:"+contE);
                System.out.println("I:"+contI);
                System.out.println("O:"+contO);
                System.out.println("U:"+contU);

            }
        }while (!cadena.equalsIgnoreCase("FIN"));
    }
}
