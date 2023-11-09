package T3;

public class Punto {
    double x;
    double y;
    void moverA(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}