public class Editor {
    private String nome;
    private int tamanho;
    private StringBuilder conteudo;

    public Editor(String nome) {
        this.nome = nome;
        this.conteudo = new StringBuilder();
        this.tamanho = 0;
    }

    public void abrir() {
        System.out.println("Nome do arquivo:" + nome);
        System.out.println("Conteudo do arquivo:" +conteudo.toString());
        System.out.println("Tamanho do arquivo:" +tamanho+ "bits.");
    }

    public void editar(String newContent) {
        conteudo.append(newContent);
        tamanho = conteudo.length() * 8;
    }

    public void rename(String newName) {
        this.nome = newName;
    }

    public void clean() {
        conteudo.setLength(0);
        tamanho = 0;
    }
}

