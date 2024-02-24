import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Máquina de Café");
        System.out.println("Insira o Dinheiro");
        double din = in.nextDouble();

        System.out.println("1 = Café Expresso R$0,50");
        System.out.println("2 = Café Longo R$1,00");
        System.out.println("3 = Capuccino R$2,50");
        System.out.println("4 = Chocolate Quente R$2,00");

        System.out.println("Escolha uma opção:");
        int cafe = in.nextInt();

        System.out.println("Bebida selecionada: " + cafe);

        if (din < cafe)
            System.out.println("Dinheiro insuficiente!");

        switch (cafe) {

            case 1:
                System.out.println("Café Expresso Selecionado");

                if (din > cafe) {
                    System.out.println("Seu troco: " + (din - cafe));

                } else {
                    System.out.println("Obrigado!");
                }

            case 2:
                System.out.println("Café Longo Selecionado");

                if (din > cafe) {
                    System.out.println("Seu troco: " + (din - cafe));

                } else {
                    System.out.println("Obrigado!");
                }

            case 3:
                System.out.println("Capuccino Selecionado");

                if (din > cafe) {
                    System.out.println("Seu troco: " + (din - cafe));

                } else {
                    System.out.println("Obrigado!");
                }

            case 4:
                System.out.println("Chocolate Quente Selecionado");

                if (din > cafe) {
                    System.out.println("Seu troco: " + (din - cafe));

                } else {
                    System.out.println("Obrigado!");
                }
        }
    }
}