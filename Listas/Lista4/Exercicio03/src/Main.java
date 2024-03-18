import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Digite um valor:");
        int valor = in.nextInt();
        boolean not_found = true;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                System.out.println("Valor " +valor + " encontrado na posição " + i);
                not_found = false;
                break;
            }
        }
        if (not_found)
            System.out.println("Valor não encontrado!");
    }
}