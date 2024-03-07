import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int N1= in.nextInt();

        if (N1 <=1) {
            System.out.println("Número inválido.");

        }

        for (double i = 2; ; i++) {
            if (N1 % i == 0) {
                System.out.println("Este não é um número primo");

            } else {
                System.out.println("Esse número é primo");
            }

        }



    }
}