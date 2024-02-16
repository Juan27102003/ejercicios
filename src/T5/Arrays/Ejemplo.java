package T5.Arrays;

public class Ejemplo {
    public static void main(String[] args) {
        int[][] ejemplo={
                {1, 2, 3},
                {10,20,30},
                {50,60,70},
                {-1,-2,4},
                {100,200,300}
        };
        System.out.println(ejemplo.length);
        for (int i=0;i<ejemplo.length;i++){
            for (int j=0;j< ejemplo[i].length;j++){
                System.out.println(ejemplo[i][j]);
            }
        }
    }
}
