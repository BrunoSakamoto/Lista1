import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        scanner.close();

        if (ePalindromo(input)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
    }

    public static boolean ePalindromo(String word) {
        word = word.replaceAll("\\s+", "").toLowerCase();//remover espaços e
        // transformar todas as letras em minúsculas

        for (int i = 0, j = word.length() - 1; i < j; i++, j--) {

            if (word.charAt(j) != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
