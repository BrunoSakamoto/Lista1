import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um número inteiro: ");
        int N1 = in.nextInt();

        if (N1 % 2 == 0) {
            System.out.println("Esse número é par.");

        } else {
            System.out.println("Esse número é ímpar.");


        }
    }
}