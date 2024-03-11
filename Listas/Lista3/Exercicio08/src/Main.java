import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n;
        boolean eprimo = true;

        do {
            System.out.println("Digite um numero: ");
            n = in.nextLong();
        } while (n < 0);

        if (n == 1)
            eprimo = false;

        for (long i = n / 2; i > 1; i--) {
            if (n % i == 0) {
                eprimo = false;
                break;
            }
        }
        if (eprimo)
            System.out.println("É primo");
        else
            System.out.println("Não é primo");
    }
}
