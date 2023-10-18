import java.util.ArrayList;
class Sessao {
    private String nomeFilme;
    private String sala; // pode ser um identificador único da sessão?
    private String horario;
    private int numAssentos;
    private boolean isDublado;
    private ArrayList<Ingresso> ingressos;

    public Sessao (String nomeFilme, String sala, String horario, int numAssentos, boolean isDublado){
        this.nomeFilme = nomeFilme;
        this.sala = sala;
        this.horario = horario;
        this.numAssentos = numAssentos;
        this.isDublado = isDublado;
        this.ingressos = new ArrayList<>();
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

    public ArrayList<Ingresso> getIngressos() { return ingressos; }

    public void adicionarIngresso(Ingresso ingresso) { ingressos.add(ingresso); }
}