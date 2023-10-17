import java.util.ArrayList;
class Sessao {
    private String nomeFilme;
    private String sala;
    private String horario;
    private int numAssentos;
    private boolean isDublado;
    // Ingresso ingresso;
    // Pensar em como atrelar o ingresso a uma sessão

    public Sessao (String nomeFilme, String sala, String horario, int numAssentos, boolean isDublado){
        this.nomeFilme = nomeFilme;
        this.sala = sala;
        this.horario = horario;
        this.numAssentos = numAssentos;
        this.isDublado = isDublado;
    }


    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String Sala) {
        this.sala = Sala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getNumAssentos() { return numAssentos; }

    public boolean getIsDublado() { return isDublado; }
}