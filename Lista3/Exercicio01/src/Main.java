import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int N1 = 1;
    int num = in.nextInt();
    System.out.println("Tabuada do " + num);
    while (N1 <= 10 ) {
        System.out.println(num + " x " + N1 + " = " + N1 * num);
        N1++;


    }
}
}
