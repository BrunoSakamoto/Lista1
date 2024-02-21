import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva uma nota:");
        double N1 = in.nextDouble();

        System.out.println("Escreva outra nota:");
        double N2 = in.nextDouble();

        System.out.println("A média dessas notas é:");
        double media = (N1 + N2) / 2;

        if (media < 50) {
            System.out.println(media+ " Reprovado!");

        } else {
            System.out.println(media+ " Aprovado!");

        }
    }
}