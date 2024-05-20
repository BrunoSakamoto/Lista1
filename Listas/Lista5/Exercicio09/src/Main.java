import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(palindromo(receber()));
    }

    static String receber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String word = in.nextLine();
        return word;
    }

    static boolean palindromo(String word) {
        word = word.replaceAll("\\s", "").toLowerCase(); //remover espaços e
        // transformar todas as letras em minúsculas
        for (int i = 0, j = word.length() - 1; i < j; i++, j--) {

            if (word.charAt(j) != word.charAt(i)) {
                System.out.println("Essa palavra não é um palíndromo.");
            }
        }
        System.out.println("Essa palavra é um palíndromo.");
        return true;

    }
}