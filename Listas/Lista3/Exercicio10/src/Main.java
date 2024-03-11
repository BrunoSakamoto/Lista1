import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, N1, N2, aux;

        N1 = 1;
        N2 = 1;


        System.out.println("Digite o número de termos da sequência de Fibonacci:");
        N = in.nextInt();
        System.out.println(0);

        while (N2 < N) {
            System.out.println(N2);
            aux = N1;
            N1 = N2;
            N2 = aux + N2;

            }
        }
    }

