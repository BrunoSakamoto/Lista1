import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva o raio de um circulo: ");
        number = in.nextInt();
        result = (number * number) * Math.PI;
        System.out.println("A area desse circulo é: " + result);
    }
}