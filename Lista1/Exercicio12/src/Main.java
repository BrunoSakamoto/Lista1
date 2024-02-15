import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota N1:");
        double N1 = scanner.nextDouble();

        System.out.println("Digite a nota N2: ");
        double N2 = scanner.nextDouble();

        double media = (N1 + N2 * 2) /3;

        System.out.println("A media dessas duas notas é: " + media);

        if (media < 0 || media > 10) {
            System.out.println("Erro: o resultado deve estar entre 0 e 10.");
        }

    }
}