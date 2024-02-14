import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1, number2, number3, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva a velocidade inicial, a aceleração e o tempo de percurso: ");
        number1 = in.nextInt();
        number2 = in.nextInt();
        number3 = in.nextInt();
        result = number1 + (number2 * number3);
        System.out.println("O a velocidade final é: " + result);
    }
}