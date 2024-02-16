package T5;

import java.util.Scanner;

public class Ut6_01_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String cadena= sc.nextLine();
        StringBuffer salida=new StringBuffer(cadena.length());
            for(int i=0;i<cadena.length();i++){
                char c=cadena.charAt(i);
                if (c=='9'){
                    salida.append('0');
                } else if (c>='0' && c<='8') {
                    salida.append((char)(c+1));
                }else salida.append(c);
            }
        System.out.println(salida);
    }
}
