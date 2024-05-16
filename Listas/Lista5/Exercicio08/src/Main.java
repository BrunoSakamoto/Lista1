import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("x^y=" + calcularPotencia(receberx(),recebery()));
    }

    static int receberx() {
        Scanner in = new Scanner(System.in);
        int x;

        do {
            System.out.println("Digite um número inteiro maior que 0: ");
            x = in.nextInt();
        } while (x <= 0);
        return x;
    }

    static int recebery() {
        Scanner in = new Scanner(System.in);
        int y;

        do {
            System.out.println("Digite mais um número inteiro:");
            y = in.nextInt();

        } while (y <0);
        return y;
    }

    public static long calcularPotencia(int x, int y) {
        long resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado *= x;
        }
        return resultado;
    }
}


