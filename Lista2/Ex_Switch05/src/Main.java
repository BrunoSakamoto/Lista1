import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Máquina de Café");
        System.out.println("Insira o Dinheiro");
        double din = in.nextDouble();


        System.out.println("1 = Café Expresso - $0,50");
        System.out.println("2 = Café Longo - R$1,00");
        System.out.println("3 = Capuccino - R$2,50");
        System.out.println("4 = Chocolate Quente - R$2,00");


        System.out.println("Escolha uma opção:");
        int cafe = in.nextInt();


        System.out.println("Bebida selecionada: " + cafe);


        switch (cafe) {


            case 1:
                System.out.println("Café Expresso Selecionado");


                if (din < 0.50) {
                    System.out.println("Dinheiro insuficiente!");
                } else if (din > 0.50) {
                    System.out.println("Seu troco: " + (din - 0.50));
                } else {
                    System.out.println("Obrigado!");
                    break;
                }


            case 2:
                System.out.println("Café Longo Selecionado");


                if (din < 1.0) {
                    System.out.println("Dinheiro insuficiente!");
                } else if (din > 1.0) {
                    System.out.println("Seu troco: " + (din - 1.0));
                    System.out.println("Obrigado!");
                    break;
                }


            case 3:
                System.out.println("Capuccino Selecionado");


                if (din < 2.50) {
                    System.out.println("Dinheiro insuficiente!");
                } else if (din > 2.50)
                    System.out.println("Seu troco: " + (din - 2.50));
                break;


            case 4:
                System.out.println("Chocolate Quente Selecionado");


                if (din < 2.0) {
                    System.out.println("Dinheiro insuficiente!");
                } else if (din > 2.0) {
                    System.out.println("Seu troco: " + (din - 2.0));
                    System.out.println("Obrigado!");
                    break;
                }
        }
    }
}