import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Digite um número: ");
        n = in.nextInt();

        if (n <= 0) {
            System.out.println("O valor deve ser maior do que 0!");

        } else {
            int resultado = calcularFatorial(n);
            System.out.println(n + "!=" +resultado);
        }
    }

    public static int calcularFatorial(int n) {
        int resultado = 1;
        for (int i = n; i > 1; i--) {
            resultado *= i;
        }
        return resultado;
    }
}