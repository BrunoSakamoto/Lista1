import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva uma nota:");
        double N1 = in.nextDouble();

        System.out.println("Escreva outra nota:");
        double N2 = in.nextDouble();

        double media = (N1 + N2) / 2;
        System.out.println("A média dessas notas é: " + media);

        if (media >= 50) {
            System.out.println("Aprovado!");

        } else {
            System.out.println("Informe a nota da prova de recuperação: ");
            double NR = in.nextDouble();

            double MF = (media + NR) / 2;
            if (MF < 50) {
                System.out.println("A média dessas notas é: " + MF);
                System.out.println("Reprovado!");
            } else {
                System.out.println("A média dessas notas é " + MF);
                System.out.println("Aprovado!");
            }
        }
    }
}