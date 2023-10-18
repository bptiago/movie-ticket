 class Ingresso {
    double preco;
    String assento;
    String nomeFilme;
    String sala; //identificador único para sessão?

    public Ingresso(String nomeFilme, String sala) {
        this.nomeFilme = nomeFilme;
        this.sala = sala;
    }

    public String getNomeFilme() { return nomeFilme; }
    public void atualizarPrecoIngresso(double novoPreco) {
        this.preco = novoPreco;
    }

    public String getSala() { return sala; }
}

