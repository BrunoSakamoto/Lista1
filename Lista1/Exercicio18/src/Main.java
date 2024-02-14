import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o coeficiente A: ");
        double A = scanner.nextDouble();

        System.out.println("Escreva o coeficiente B: ");
        double B = scanner.nextDouble();

        if (A == 0) {
            System.out.println("Esta não é uma equação do 1º grau");
        } else {

            double solucao = -B / A ;

            System.out.println("A solução da equação é x = " + solucao);

        }
    }
}
