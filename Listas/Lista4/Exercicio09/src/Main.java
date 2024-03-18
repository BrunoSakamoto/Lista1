public class Main {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {5, 7, 8, 9, 10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};

        System.out.println("|1, 2,  3, 4, 5|");
        System.out.println("|6, 7, 8, 9, 10|");
        System.out.println("|11,12,13,14,15|");
        System.out.println("|16,17,18,19,20|");
        System.out.println("|21,22,23,24,25|");

        System.out.println("A diagonal inversa dessa matriz é: ");

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[0].length; j++) {
                if (i + j == matriz.length - 1) {
                    System.out.println(+matriz[i][j]);

            }
        }
    }
}