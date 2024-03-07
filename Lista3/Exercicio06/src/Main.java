import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int N1 = in.nextInt();
        int N2 = in.nextInt();

        System.out.println("Os números entre " +N1+ " e " +N2+ " são: " );

        int menorNum = Math.min(N1,N2);
        int maiorNum = Math.max(N1,N2);

        for (int i = menorNum + 1; i < maiorNum; i++) {
            System.out.println(i);
        }

    }
}