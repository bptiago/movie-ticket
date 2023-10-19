import java.util.ArrayList;
class Cinema {
    private String nome;
    private String endereco;
    private ArrayList<Sessao> sessoes;
    private ArrayList<Filme> filmes;

    public Cinema(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.sessoes = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }

    public ArrayList<Sessao> getSessoes() {
        return sessoes;
    }

    public void adicionarSessao(Sessao sessao) {
        sessoes.add(sessao);
    }

    public void removerSessao(Sessao sessao) {
        sessoes.remove(sessao);
    }

    public void adicionarFilme(Filme filme) { filmes.add(filme); }
}
