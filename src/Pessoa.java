public class Pessoa {
    private String idade;
    private String nome;
    private String cpf;

    public Pessoa (String idade, String nome, String cpf){
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getidade(){
        return idade;
    }
    public String getnome(){
        return nome;
    }
    public String getcpf(){
        return cpf;
    }
}