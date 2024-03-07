import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um número:");
        double N1 = in.nextDouble();

        System.out.println("Escreva outro núemro:");
        double N2 = in.nextDouble();

        if (N1 > N2) {
            System.out.println(N1 + " é maior que " + N2);

        } else {
            System.out.println(N2 + " é maior que " + N1);
        }
    }
}