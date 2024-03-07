import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = in.nextInt();
        int result = 1;

        for (int i =1; i<=num; i++) {
            result *= i;
        }
        System.out.println("O fatorial de " +num+ " é: " +result);
    }
}