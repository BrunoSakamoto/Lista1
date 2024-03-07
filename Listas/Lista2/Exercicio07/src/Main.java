import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o coeficiente a: ");
        double a = in.nextDouble();

        System.out.println("Escreva o coeficiente b: ");
        double b = in.nextDouble();

        System.out.println("Escreva o coeficiente c: ");
        double c = in.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("A solução dessa equação é x1 = " + x1 + "e x2 = " + x2);

        } else if (delta == 0) {

            double x = -b / (2 * a);
            System.out.println("A solução dessa equação é " +x);

        } else {
            System.out.println("A equação não possui soluções reais.");
        }
    }
}