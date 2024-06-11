public class Main {
    public static void main(String[] args) {

        ContaBancaria  C1 = new ContaBancaria(1234, "Bruno Araújo Sakamoto");
        if (C1.depositar(100))
            System.out.println("Deposito realizado com sucesso.");
        else
            System.out.println("Valor Inválido");

        System.out.println(C1.getSaldo());
        if (C1.sacar(13.40))
            System.out.println("Saque realizado com sucesso.");
        else
            System.out.println("Valor Inválido");

        System.out.println("Saldo = " +C1.getSaldo());
        System.out.println();
        System.out.println(C1.getTitular());

    }
}