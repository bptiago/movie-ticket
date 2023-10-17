public class Pessoa {
    private int idade;
    private String nome;
    private String cpf;
    
    public Pessoa (int idade, String nome, String cpf){
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getidade(){
        return idade;
    }
    public String getnome(){
        return nome;
    }
    public String getcpf(){
        return cpf;
    }
}