public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Kratos");
        Personagem p2 = new Personagem("Goku");

        int cont = 1;
        while (p1.getVida() > 0 && p2.getVida() > 0) {
            p1.ataca(p2);
            if (p1.getVida() <= 0 || p2.getVida() <= 0) {
                System.out.println("\nRodada " + cont);
                System.out.println(p1);
                System.out.println(p2);
                break;
            }
            p2.ataca(p1);
            if (p1.getVida() <= 0 || p2.getVida() <= 0) {
                System.out.println("\nRodada " + cont);
                System.out.println(p1);
                System.out.println(p2);
                break;
            }

            System.out.println("\nRodada " + cont);
            System.out.println(p1);
            System.out.println(p2);

            cont++;
        }
        if (p1.getVida() <= 0) {
            System.out.println("\n" + p2.getName() + " Venceu!");
            System.out.println("\n" + p1.getName() + " Foi derrotado!");
        } else {
            System.out.println("\n" + p1.getName() + " Venceu!");
            System.out.println("\n" + p2.getName() + " Foi derrotado!");
        }
    }
}