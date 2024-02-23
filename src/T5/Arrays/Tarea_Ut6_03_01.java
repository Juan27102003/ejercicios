package T5.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Tarea_Ut6_03_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el indice del Array:");
        int indice=sc.nextInt();
        int[] ejemplo={1,2,3,4};
        System.out.println(existeIndice(ejemplo,indice));
        System.out.println(Arrays.toString(borrarPorIndice(ejemplo,indice)));
    }
    private static boolean existeIndice(int[] muestra,int indice){
        return indice <= muestra.length;
    }
   private static int[] borrarPorIndice(int[] original,int indice){
        int[] aux = new int[original.length-1];
        int n=0;
            for (int i=0;i<original.length;i++){
                if (i==indice){
                    n=1;
                }else if (n==1){
                    aux[i-1]=original[i];

                }else aux[i]=original[i];
            }
        return aux;
    }

}
