import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o valor de a: ");
        int a = in.nextInt();

        System.out.println("Escreva o valor de b: ");
        int b = in.nextInt();

        System.out.println("Escreva o valor de c ");
        int c = in.nextInt();

        if (a == b && a == c)
            System.out.println("Esse triângulo é esquilátero.");

        if (a == b && b != c)
            System.out.println("Esse triângulo é isóceles");

        if (a == c && c != b)
            System.out.println("Esse triângulo é isóceles");

        if (a != b && b != c)
            System.out.println("Esse triângulo é escaleno");
    }
}