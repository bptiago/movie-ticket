public class Pessoa  {
    protected int idadePessoa;
    protected String nomePessoa;
    protected String cpf;

    public Pessoa(int idadePessoa, String nomePessoa, String cpf) {
        this.idadePessoa = idadePessoa;
        this.nomePessoa = nomePessoa;
        this.cpf = cpf;
    }

    public int getidade(){
        return idadePessoa;
    }
    public String getnome(){
        return nomePessoa;
    }
    public String getcpf(){
        return cpf;
    }
}