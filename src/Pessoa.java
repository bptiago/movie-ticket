abstract class Pessoa {
    private int idade;
    private String nome;
    private String cpf;
    private String tipoPessoa;

    public Pessoa (int idade, String nome, String cpf, String tipoPessoa){
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.tipoPessoa = tipoPessoa;
    }

    abstract void tipoPessoa(); // Verá se é criança, PCD, Idoso...

    public int getidade(){
        return idade;
    }
    public String getnome(){
        return nome;
    }
    public String getcpf(){
        return cpf;
    }
    public String getTipoPessoa() {
        return tipoPessoa;
    }
}