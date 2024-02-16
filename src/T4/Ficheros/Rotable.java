package T4.Ficheros;

public interface Rotable {
    int VERTICAL_A_APISADO = 90;
    int APISADO_A_VERTICAL = -90;

    void rotarSentidoAgujas();

    void rotarSentidoContrarioAgujas();

    default void rotar360Grados() {
        System.out.println("Se queda igual");
    }
     static double radianesAGrados(double radianes){
         return radianes*180/Math.PI;
     }
     default String describir(){
        return "Rotable";
     }
}
