import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite n" + (i + 1) + ":");
            int numero = in.nextInt();

            if (i == 0) {
                maior = numero;
                menor = numero;
            } else {

                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }


        } System.out.println("O maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " +menor);
    }
}