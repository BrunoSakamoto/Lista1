import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" 5. opção 5 \n 6. opção 6 \n 7. opção 7 \n 8. opção 8 \n 9. opção 9\n Escolha uma opção:");
        int N1 = in.nextInt();
        System.out.println("A opção escolhida foi " +N1);

        if (N1 >9 || N1 <5)
            System.out.println("Número inválido! - O Número escolhido precisa estar entre 5 e 9. ");

    }

}