import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o coeficiente A: ");
        double A = scanner.nextDouble();

        System.out.println("Escreva o coeficiente B: ");
        double B = scanner.nextDouble();

        System.out.println("Escreva o coeficiente C: ");
        double C = scanner.nextDouble();

        double delta = (B * B) - 4 * A * C;

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
