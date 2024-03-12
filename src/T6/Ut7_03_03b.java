package T6;

import java.io.*;

public class Ut7_03_03b {
    public static void main(String[] args) throws FileNotFoundException {
        try(DataInputStream d=new DataInputStream(new FileInputStream("quiniela.dat"))) {
            int jornadas=d.readInt();
            int partidos=d.readInt();
            for (int i=0;i<jornadas;i++){
                String fecha= d.readUTF();
                System.out.println("Fecha de la jornada:"+fecha);
                for (int j=1;j<=partidos;j++){
                    int golesLocal=d.readInt();
                    int golesVisitante=d.readInt();

                    String resultado;

                    if (golesLocal>golesVisitante){
                        resultado="1";
                    } else if (golesVisitante>golesLocal) {
                        resultado="2";
                    }else resultado="X";

                    System.out.println("Partido "+ j +":"+resultado);
                }
            }
        }catch (EOFException e){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
