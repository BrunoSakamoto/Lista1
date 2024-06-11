public class Main {
    public static void main(String[] args) {
        Editor meuEditor = new Editor("meuArquivo.txt");
        // abrindo o arquivo
        meuEditor.abrir();

        //editando o arquivo
        meuEditor.editar("Esse é o novo conteúdo do arquivo. Aqui dentro estará o conteúdo a ser digitado.");
        // verificação de alterações
        meuEditor.abrir();

        // renomeando o arquivo
        meuEditor.rename("textoExemplo.txt");

        // limpando o arquivo
        meuEditor.clean();

        // abrindo o arquivo depois das alterações
        meuEditor.abrir();
    }
}