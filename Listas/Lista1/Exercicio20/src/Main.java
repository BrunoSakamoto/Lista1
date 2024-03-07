import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a raiz x1:");
        double x1 = in.nextDouble();

        System.out.println("Escreva a raiz x2");
        double x2 = in.nextDouble();

        double a = 1;
        double b = -(x1 + x2);
        double c = x1 * x2;

        System.out.println("A equação do segundo grau é: " + a + "x² +" + b + "x + " + c+ "= 0");

    }
}