import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um número entre 1 e 7 para representar os dias da semana: ");
        int numero = in.nextInt();
        switch (numero) {

                case 1:
                System.out.println("O dia escolhido foi Domingo");
                break;

                case 2:
                System.out.println("O dia escolhido foi Segunda-Feira");
                break;

                case 3:
                System.out.println("O dia escolhido foi Terça-Feira");
                break;

                case 4:
                System.out.println("O dia escolhido foi Quarta-Feira");
                break;

                case 5:
                System.out.println("O dia escolhido foi Quinta-Feira");
                break;

                case 6:
                System.out.println("O dia escolhido foi Sexta-Feira");
                break;

                case 7:
                System.out.println("O dia escolhido foi Sábado");
                break;

        }


    }
}