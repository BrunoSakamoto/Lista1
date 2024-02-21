import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um número real positivo: ");
        double a = in.nextDouble();

        if (a < 0) {
            System.out.println("Valor inválido");

        } else {

            double solucao = Math.sqrt(a);

            System.out.println("A raiz quadrada desse número é: " + solucao);

        }

    }
}