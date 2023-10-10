 class Ingresso extends Pessoa {
    double preco;
    String tipoIngresso;
    String assento;

    @Override
    public String getCPF() {
        return cpf;
    }

    public void atualizarPrecoIngresso(double novoPreco) {
        this.preco = novoPreco;
    }
}

