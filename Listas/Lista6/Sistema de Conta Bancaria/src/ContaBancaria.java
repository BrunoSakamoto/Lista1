public class ContaBancaria {
    //Atributos
    private int numero;
    private double saldo;
    private String titular;

    //Construtor
    public ContaBancaria(int numero, String titular){
        this.numero = numero;
        this.saldo = 0;
        this.titular = titular;
    }

    //Métodos
    public boolean depositar(double valor){
        if(valor<=0)
            return false;

        this.saldo+=valor;
        return true;
    }

    public boolean sacar(double valor){
        if (valor >= this.saldo || valor < 0)
            return false;

            this.saldo-=valor;
            return true;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}
