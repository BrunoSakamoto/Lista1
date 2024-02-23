import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double N1 = in.nextInt();

        System.out.println("Digite mais um número: ");
        double  N2 = in.nextInt();

        System.out.println("Menu");
        System.out.println("1 = Soma");
        System.out.println("2 = Subtração");
        System.out.println("3 = Multiplicação");
        System.out.println("4 = Divisão");

        System.out.println("Escolha a operação: ");
        int menu = in.nextInt();

        switch (menu) {

            case 1:
                System.out.println("A soma desses números é igual a : " +(N1 + N2));
                break;

            case 2:
                System.out.println("A subtração desses números é igual a : " +(N1 - N2) );
                break;

            case 3:
                System.out.println("A multiplicação desses números é igual a: " +(N1 * N2));
                break;

            case 4:
                System.out.println("A divisão desses números é igual a: " +(N1 / N2));




        }

    }
}