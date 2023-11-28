package T3;

public class DiaSemanaMain {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.LUNES;
        DiaSemana dia2 = DiaSemana.valueOf("MARTES");
        System.out.println(dia.name());
        System.out.println(dia.ordinal());
        System.out.println(dia2.ordinal());
        DiaSemana[] dias = DiaSemana.values();

        for (DiaSemana diaSemana : dias) {
            System.out.println("El dia es " + diaSemana);
        }

        for (int i = 0; i < dias.length; i++) {
            System.out.println("El dia es " + dias[i]);
        }
    }
}
