import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] numeros = new int[10];

        for (int i = 0; i < numeros.length; ++i) {
            System.out.println("Digite o valor " + (i + 1) + " :");
            numeros[i] = in.nextInt();
        }
        for (int numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("Ordem inversa:");

        for (int i = numeros.length-1;i>=0; i--) {
            System.out.println(numeros[i]);
        }
    }
}