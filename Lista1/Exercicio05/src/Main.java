import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva uma velocidade em Km/h: ");
        number = in.nextInt();
        result = number / 3.6;
        System.out.println("Essa velocidade em m/s é: " + result);



    }
}