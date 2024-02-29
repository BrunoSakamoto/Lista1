import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double N1 = in.nextDouble();

        System.out.println("Digite outro número:");
        double N2 = in.nextDouble();

        System.out.println("Digite outro número: ");
        double N3 = in.nextDouble();

        double [] numeros = {N1,N2,N3};

        Arrays.sort(numeros);

        System.out.println("Esses números em ordem crescente são: " + Arrays.toString(numeros));
    }
}
