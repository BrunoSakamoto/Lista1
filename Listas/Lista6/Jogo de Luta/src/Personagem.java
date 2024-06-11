import java.util.Random;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    Random r = new Random();

    public Personagem (String nome) {
        this.nome = nome;
        this.vida = 100;
        this.ataque = r.nextInt(11)+20;
        this.defesa = r.nextInt(6)+10;
    }

    public void ataca(Personagem p){
        if(p.getVida()<=0){
            System.out.println(p.nome+" já está morto!");
        }else p.setVida(p.getVida() - (this.ataque - p.getDefesa()));
    }



    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public String getName() {
        return nome;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome= " + nome + '\'' +
                ", vida= " + vida +
                ", ataque= " + ataque +
                ", defesa= " + defesa +
                '}';
    }
}