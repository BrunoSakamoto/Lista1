import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva uma temperatura em Graus Celsius: ");
        number = in.nextInt();
        result = number * 1.8 + 32;
        System.out.println("Essa temperatura em Graus Fahrenheit é: " + result);
    }
}