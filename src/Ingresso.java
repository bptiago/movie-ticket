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
    public Sessao getSessao() { return sessao; }

    public String getAssento() {
        return assento;
    }

    public String getNomeFilme() { return sessao.getNomeFilme(); }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSala() { return sessao.getSala(); }
    public String stringDadosDoIngresso() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add(getcpf());
        lista.add(getnome());
        lista.add(Integer.toString(getidade()));
        lista.add(sessao.getHorario());
        lista.add(getNomeFilme());
        lista.add(getSala());
        lista.add(getAssento());
        lista.add(getTipoPessoa());
        lista.add(Double.toString(getPreco()));

        String linha = String.join(";", lista);
        return linha;
    }

    @Override
    void tipoPessoa(boolean isMeiaEntrada, double preco) {
        if (isMeiaEntrada) {
            setPreco(preco / 2);
            setTipoPessoa("Meia-Entrada");
        } else {
            setPreco(preco);
            setTipoPessoa("Entrada Inteira");
        }
    }
}

