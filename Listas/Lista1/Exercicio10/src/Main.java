import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva uma medida em milhas: ");
        number = in.nextInt();
        result = number * 1.609;
        System.out.println("Essa medida em quilômetros é: " + result);
    }
}