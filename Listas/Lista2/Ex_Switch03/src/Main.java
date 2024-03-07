import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1 = Circulo");
        System.out.println("2 = Triângulo Retângulo");
        System.out.println("3 = Retângulo");

        System.out.println("Escolha uma forma geométrica: ");
        int menu = in.nextInt();

        switch (menu) {

            case 1:
                System.out.println("Informe o raio do círculo: ");
                double raio = in.nextDouble();
                System.out.println("A área dess círculo é:" +(Math.pow(raio,2) * Math.PI));
                System.out.println("O perímetro desse círculo é:" +(2 * Math.PI * raio));

            case 2:
                System.out.println("Informe a base do triângulo: ");
                double base = in.nextDouble();
                System.out.println("Informe a altura do triângulo: ");
                double altura = in.nextDouble();

                System.out.println("A área desse triângulo é: " +((base * altura) / 2));
                System.out.println("O perímetro desse triângulo é " +(base + altura + (Math.sqrt(Math.pow(base,2) + Math.pow(altura,2)))));

            case 3:
                System.out.println("Informe a base do retângulo:");
                double base_ret = in.nextDouble();
                System.out.println("Informe a altura do retângulo: ");
                double altura_ret = in.nextDouble();

                System.out.println("A área desse retângulo é: " +(base_ret * altura_ret));
                System.out.println("O perímetro desse retângulo é: " +((base_ret * 2) + (altura_ret * 2))) ;
        }

    }
}