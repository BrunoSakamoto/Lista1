import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva uma medida em polegadas: ");
        number = in.nextInt();
        result = number * 25.4;
        System.out.println("Essa medida em mm é: " + result);
    }
}