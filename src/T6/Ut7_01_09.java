package T6;

import java.io.*;
import java.util.*;

public class Ut7_01_09 {
        public static void main(String[] args) throws IOException {
            Map<Integer,String> palabrasMasLargas = new HashMap<>();
        try(BufferedReader br=new BufferedReader(new FileReader("quijote.txt"))) {
        int cod=1;
            while (true){
                String linea= br.readLine();
                if ( linea==null) break;
                String[] palabras=linea.split(" ");
                for (String palabra: palabras) {
                    int longitud=palabra.length();
                    palabrasMasLargas.put(longitud,palabra);
                }
            }
            palabrasMasLargas.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByKey().reversed()).limit(5).forEach(entry -> System.out.println(entry.getValue() + " " + entry.getKey()+ " letras"));
        }catch (IOException e){
            System.out.println("Ha ocurrido un error");
        }
        }
    }

