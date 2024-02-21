import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha um número entre 5 e 9: ");
        int N1 = in.nextInt();
        System.out.println("O número escolhido foi " +N1);

        if (N1 <= 9 || N1 >= 5) {
            System.out.println("Número inválido! - O Número escolhido precisa estar entre 5 e 9. ");
        }
    }
}