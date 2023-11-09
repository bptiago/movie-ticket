import java.util.ArrayList;

class Ingresso extends Pessoa{
     private double preco;
     private String assento;
     private Sessao sessao;

    public Ingresso(int idadePessoa, String nomePessoa, String cpf, String tipoPessoa, Sessao sessao, String assento, double preco) {
        super(idadePessoa, nomePessoa, cpf, tipoPessoa);
        this.sessao = sessao;
        this.assento = assento;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getAssento() {
        return assento;
    }

    public String getNomeFilme() { return sessao.getNomeFilme(); }
    public void atualizarPrecoIngresso(double novoPreco) {
        this.preco = novoPreco;
    }

    public String getSala() { return sessao.getSala(); }
    public String stringDadosDoIngresso() {
        ArrayList<String> lista = new ArrayList<>();

        lista.add(getcpf());
        lista.add(getnome());
        lista.add(Integer.toString(getidade()));
        lista.add(getNomeFilme());
        lista.add(getSala());
        lista.add(getAssento());
        lista.add(getTipoPessoa());
        lista.add(Double.toString(getPreco()));

        String linha = String.join(";", lista);
        return linha;
    }

    @Override
    void tipoPessoa() {
        if (getTipoPessoa() == "Criança" || getTipoPessoa() == "PCD" || getTipoPessoa() == "Idoso" || getTipoPessoa() == "Estudante") {
            this.preco = this.preco / 2;
        }
    }
}

