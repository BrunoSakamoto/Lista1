import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva uma nota: ");
        double N1 = in.nextDouble();

        System.out.println("Escreva outra nota: ");
        double N2 = in.nextDouble();

        double media = (N1 + N2) / 2;

        if (media < 5) {
            System.out.println("Nota D!");

        } if (media >= 5 && media < 7) {
            System.out.println("Nota C!");

        } if (media >= 7 && media < 8.5) {
            System.out.println("Nota B!");

        } if (media > 8.5) {
            System.out.println("Nota A!");
        }
    }
}