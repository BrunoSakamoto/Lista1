import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int menor, meio, maior, aux;
        System.out.println("Digite três números inteiros: ");

        maior = in.nextInt();
        meio = in.nextInt();
        menor = in.nextInt();

        if (maior < menor) {
            aux = menor;
            menor = maior;
            maior = aux;
        }

        if (maior < meio) {
            aux = meio;
            meio = maior;
            maior = aux;
        }

        if (meio < menor) {
            aux = menor;
            menor = meio;
            meio = aux;
        }

        System.out.println("Esses números em ordem crescente são: " +menor+ " " +meio+ " " +maior);
    }
}
