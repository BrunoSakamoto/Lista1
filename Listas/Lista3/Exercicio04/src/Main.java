public class Main {
    public static void main(String[] args) {

        int i = -80;

        System.out.println("Temperaturas em Fahrenheit: ");
        while (i <= 80 && i>= -80) {
            double F = i * 1.8 + 32;
            System.out.println(i +"° =" + F+ "F");
            i=i+10;
        }

    }
}