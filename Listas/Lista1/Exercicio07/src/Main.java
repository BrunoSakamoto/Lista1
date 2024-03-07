import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva uma medida em mm: ");
        number = in.nextInt();
        result = number / 25.4;
        System.out.println(number+ "mm em polegadas é: " + result);
    }
}