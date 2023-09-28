import java.lang.Math;

public class App {

    public static double funcao(double x) {
        return Math.pow(x, -2.25);
    }

    public static void main(String[] args) {

        double a = somaRiemann(1, 16, 0.0000001);

        System.out.println(a);

    }

    public static double somaRiemann(double x0, double xn, double dx) {

        double result = 0.0;
        double aux;

        for (double i = x0; i < xn; i += dx) {
            aux = funcao(i) * dx;
            result += aux;
        }

        return result;
    }
}
