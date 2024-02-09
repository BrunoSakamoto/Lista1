import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva a base e a altura de um triângulo retângulo: ");
        number1 = in.nextInt();
        number2 = in.nextInt();
        result = (number1 + number2) / 2;
        System.out.println("A area desse triângulo é: " + result);
    }
}