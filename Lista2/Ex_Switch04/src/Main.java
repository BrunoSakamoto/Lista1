import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor da compra: ");
        double compra = in.nextDouble();

        System.out.println("Menu");
        System.out.println("1 = Débito - desconto de 5%");
        System.out.println("2 = PIX - desconto de 10%");
        System.out.println("3 = Crédito - juros simples de 2% em parcelamento até 4 vezes ");
        System.out.println("ou juros simples de 5% em parcelamentos superior a 4 vezes");

        System.out.println("Escolha a forma de pagamento: ");
        int pag = in.nextInt();

        switch (pag) {

            case 1:
                System.out.println("Débito selecionado");
                System.out.println("Valor final da compra = " + (compra * 0.95) + "R$");

            case 2:
                System.out.println("PIX selecionado");
                System.out.println("Valor final da compra = " + (compra * 0.9) + "R$");

            case 3:
                System.out.println("Crédito selecionado");
                System.out.println("Informe a quantidade de parcelas:");
                int parc = in.nextInt();

                if (parc <= 4) {
                    System.out.println("O valor final da compra é " + ((compra / parc) + compra * 0.02) * parc);

                } else {
                    System.out.println("O valor final da compra é: "+ ((compra / parc) + compra * 0.05) * parc);

                }

        }
    }
}