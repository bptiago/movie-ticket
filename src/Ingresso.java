 class Ingresso {
     private double preco;
     private String assento;
     private String nomeFilme;
     private String sala; //identificador único para sessão?

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

