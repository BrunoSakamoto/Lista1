import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        number1 = in.nextInt();
        number2 = in.nextInt();
        result = (number1+number2) / 2;
        System.out.println("Exibir a media dos numeros: " + result);

    }
}