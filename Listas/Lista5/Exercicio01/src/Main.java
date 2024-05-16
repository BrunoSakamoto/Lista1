import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = in.nextInt();

        long soma = soma(n);
        System.out.println("Soma ="+ soma);
    }

    public static long soma(int n) {
        if (n <= 0) {
            System.out.println("N deve ser maior que 0.");
        }

        if (n == 1) {
            return 1;
        } else {
            return n + soma(n - 1);
        }
    }
}
