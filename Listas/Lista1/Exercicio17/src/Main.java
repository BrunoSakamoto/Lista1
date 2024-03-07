import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1, number2, number3, result;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a velocidade inicial (km/h):");
        number1 = in.nextInt();

        System.out.println("Escreva a aceleração (km/h):");
        number2 = in.nextInt();

        System.out.println("Escreva o tempo de percurso em horas:");
        number3 = in.nextInt();

        result = number1 + (number2 * number3);
        System.out.println("A velocidade final é: " + result+ "km/h");
    }
}