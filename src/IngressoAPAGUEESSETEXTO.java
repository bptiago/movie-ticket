public class Ingresso {
    private String nome;
    private String nomedofilme;
    private String sala;
    private String horario;
    private String cpf;

    public Ingresso (String nome, String nomedofilme, String sala, String horario, String cpf){
        this.nome = nome;
        this.nomedofilme = nomedofilme;
        this.sala = sala;
        this.horario = horario;
        this.cpf = cpf;
    }

    public String getnome(){
        return nome;
    }
    public String getnomedofilme(){
        return nomedofilme;
    }
    public String getsala(){
        return sala;
    }
    public String gethorario(){
        return horario;
    }
    public String getcpf(){
        return cpf;
    }
}

