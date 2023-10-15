import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Files setup
        ManagerCSV managerCSV = new ManagerCSV();

        // Globais?
        String separador = ";";

        managerCSV.fileLinesToMatrix(managerCSV.getFileFilmes());
        // verificar a tipagem dos dados
        // cinema.filmes = managerCSV.fileLinesToMatrix(managerCSV.getFileFilmes());
        // a linha acima é pra salvar os dados numa lista


        Filme filme1 = new Filme();
        filme1.nomeFilme = "A freira 2";
        filme1.classificacaoFilme = "14";

        Filme filme2 = new Filme();
        filme2.nomeFilme = "Mercenarios 4";
        filme2.classificacaoFilme = "14";


        Sessao sessao1 = new Sessao("Sala 1", "15:00", 100, true);
        sessao1.nomeFilme = "A Freira 2";

        Sessao sessao2 = new Sessao("Sala 2", "18:30", 80, false);
        sessao2.nomeFilme = "Mercenarios 4";


        Ingresso ingresso1 = new Ingresso();
        ingresso1.preco = 15.0;
        ingresso1.tipoIngresso = "Inteira";
        ingresso1.assento = "A1";

        sessao1.adicionarIngresso(ingresso1);


        Cinema cinema = new Cinema("Cinema Cinemark", "Rua Danilo Lindão");


        cinema.adicionarSessao(sessao1);
        cinema.adicionarSessao(sessao2);
        //cinema.removerSessao(sessao2);


        System.out.println("Nome do cinema: " + cinema.nome);
        System.out.println("Endereço do cinema: " + cinema.endereco);

        System.out.println("\nSessões no cinema:");
        for (Sessao sessao : cinema.sessoes) {
            System.out.println("Sala: " + sessao.sala);
            System.out.println("Horário: " + sessao.horario);
            System.out.println("Número de assentos: " + sessao.numAssentos);
            System.out.println("Filme: " + sessao.nomeFilme);
            System.out.println("Dublado: " + sessao.isDublado);
            System.out.println("Ingressos vendidos: " + sessao.ingressos.size());
            System.out.println("Idade"+ sessao.classificacaoFilme);
        }
    }
}
