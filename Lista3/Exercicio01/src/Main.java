import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número entre 0 e 10: ");
        int i = in.nextInt();
        int m = 1;

        while(i <=10) {
            System.out.println(i*m);
            i++;
        }
    }
}