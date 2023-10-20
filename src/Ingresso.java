import java.util.ArrayList;

class Ingresso extends Pessoa{
     private double preco;
     private String assento;
     private String nomeFilme;
     private String sala; //identificador único para sessão?

    public Ingresso(int idadePessoa, String nomePessoa, String cpf, String nomeFilme, String sala, String assento, double preco) {
        super(idadePessoa, nomePessoa, cpf);
        this.nomeFilme = nomeFilme;
        this.sala = sala;
        this.assento = assento;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getAssento() {
        return assento;
    }

    public String getNomeFilme() { return nomeFilme; }
    public void atualizarPrecoIngresso(double novoPreco) {
        this.preco = novoPreco;
    }

    public String getSala() { return sala; }
    public String stringDadosDoIngresso() {
        ArrayList<String> lista = new ArrayList<>();

        lista.add(getcpf());
        lista.add(getnome());
        lista.add(Integer.toString(getidade()));
        lista.add(getNomeFilme());
        lista.add(getSala());
        lista.add(getAssento());
        lista.add(Double.toString(getPreco()));

        String linha = String.join(";", lista);
        return linha;
    }
}

