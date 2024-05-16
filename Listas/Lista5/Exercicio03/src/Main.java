import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = in.nextInt();

        System.out.print("Digite o valor de Y (um número inteiro não negativo): ");
        int y = in.nextInt();

        if (y < 0) {
            System.out.println("O expoente deve ser maior ou igual a zero.");
        } else {
            long resultado = calcularPotencia(x, y);
            System.out.println(x + " elevado a " + y + " é igual a " + resultado);
        }
    }

    public static long calcularPotencia(int x, int y) {
        long resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado *= x; // multiplica o resultado pela base X
        }
        return resultado;
    }
}
