import java.util.ArrayList;
class Sessao {
    String sala;
    String horario;
    int numAssentos;
    ArrayList<Ingresso> ingressos;
    Boolean isDublado;
    // Pensar em como adicionar um filme
    // Talvez Filme filme; e herança direta

    public Sessao(String sala, String horario, int numAssentos, Boolean isDublado) {
        this.sala = sala;
        this.horario = horario;
        this.numAssentos = numAssentos;
        this.isDublado = isDublado;
        this.ingressos = new ArrayList<>();
    }
    public void atualizarHorario(String novoHorario) {
        this.horario = novoHorario;
    }

    public void mudarSala(String novaSala) {
        this.sala = novaSala;
    }

    public void adicionarIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    public void removerIngresso(Ingresso ingresso) {
        ingressos.remove(ingresso);
    }
}