import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o coeficiente A: ");
        double A = in.nextDouble();

        System.out.println("Escreva o coeficiente B: ");
        double B = in.nextDouble();

        System.out.println("Escreva o coeficiente C: ");
        double C = in.nextDouble();

        double delta = Math.pow(B,2) - 4 * A * C;

        if (delta > 0) {
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.println("As soluções da equação são x1 = " + x1 +" e x2 = " + x2);
        } else if (delta == 0) {

            double x = -B / (2 * A);

            System.out.println("A solução da equação é x= " + x);
        } else {
            System.out.println("A equação não possui soluções reais. ");
        }

    }
}
