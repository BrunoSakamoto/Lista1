import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o coeficiente A: ");
        double A = in.nextDouble();

        System.out.println("Escreva o coeficiente B: ");
        double B = in.nextDouble();

        if (A == 0) {
            System.out.println("Esta não é uma equação do 1º grau");
        } else {

            double solucao = -B / A ;

            System.out.println(A+ "x + (" + B +") = 0, então, x =" +solucao);

        }
    }
}
