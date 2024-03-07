import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Jogo da Tabudada:");
            System.out.println("Tabuada do " + i + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = ");
                int result = in.nextInt();

                if (result != i * j) {
                    System.out.println("Operação errada! - Você perdeu!");
                    System.out.println("Deseja tentar novamente? (Digite 1 para SIM e 2 para NÃO)");
                    int resp = in.nextInt();
                    if (resp == 1) {
                        System.out.println("Tabuada do " + i + ":");

                    } else if (resp == 2) {
                        System.out.println("Jogo encerrado!");
                        System.exit(0);

                    } else if (resp < 1 && resp > 2) {
                        System.out.println("Número Inválido");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("Parabéns - Você concluiu o jogo!");
    }
}
