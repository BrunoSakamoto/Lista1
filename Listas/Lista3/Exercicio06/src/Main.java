import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int N1 = in.nextInt();
        System.out.println("Digite outro número: ");
        int N2 = in.nextInt();


        if (N1 < N2) {
            int aux = N1;
            N1 = N2;
            N2 = aux;
        }

        for (int i = N1 + 1; i < N2; i++) {
            System.out.println(i);
        }
    }
}