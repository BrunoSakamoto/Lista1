import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência Fibonacci: ");
        int n = in.nextInt();

        System.out.println("A sequência de Fibonacci até o termo " + n + " é:");

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }

    }
}
