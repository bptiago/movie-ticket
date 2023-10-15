import java.util.ArrayList;
class Cinema {
    String nome;
    String endereco;
    ArrayList<Sessao> sessoes;
    ArrayList<Filme> filmes;

    public Cinema(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.sessoes = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }

    public void adicionarSessao(Sessao sessao) {
        sessoes.add(sessao);
    }

    public void removerSessao(Sessao sessao) {
        sessoes.remove(sessao);
    }

    public void adicionarFilme(Filme filme) { filmes.add(filme); }
}
