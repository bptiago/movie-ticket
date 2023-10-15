/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author danil
 */
public class Sessoes {
    private String nomeFilme;
    private String Sala;
    private String horario;
    
    public Sessoes (String nomeFilme, String Sala, String horario){
        this.nomeFilme = nomeFilme;
        this.Sala = Sala;
        this.horario = horario;
    }
    

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getSala() {
        return Sala;
    }

    public void setSala(String Sala) {
        this.Sala = Sala;
    }
    
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
        
}


