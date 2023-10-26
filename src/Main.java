import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Instância teste cinema
        Cinema cinema = new Cinema("Teste", "Endereco");
        // Files setup
        ManagerCSV managerCSV = new ManagerCSV();

        // Instanciamento de filmes
        List matrizFilmes = managerCSV.csvParaMatrizJava(managerCSV.getFileFilmes());
        for (int i = 0; i < matrizFilmes.size(); i++) {
            if (i == 0) continue; // Não lê o título das colunas

            List linhaMatriz = (List) matrizFilmes.get(i); // [titulo, ano, classificacao...]

            String nomeFilme = null;
            String classificacaoFilme = null;
            int anoLancamento = 0;

            for (int j = 0; j < linhaMatriz.size(); j++) {
                switch (j) {
                    case 0 -> nomeFilme = (String) linhaMatriz.get(j);
                    case 1 -> anoLancamento = Integer.parseInt((String) linhaMatriz.get(j));
                    case 2 -> classificacaoFilme = (String) linhaMatriz.get(j);
                }
            }
            cinema.adicionarFilme(new Filme(nomeFilme, classificacaoFilme, anoLancamento));
        }

        // Instanciamento de sessões
        List matrizSessoes = managerCSV.csvParaMatrizJava(managerCSV.getFileSessoes());
        for (int i = 0; i < matrizSessoes.size(); i++) {
            if (i == 0) continue; // Não lê o título das colunas

            List linhaMatriz = (List) matrizSessoes.get(i);

            String nomeFilme = null;
            String sala = null;
            String horario = null;
            int numAssentos = 0;
            boolean isDublado = false;

            for (int j = 0; j < linhaMatriz.size(); j++) {
                switch (j) {
                    case 0 -> nomeFilme = (String) linhaMatriz.get(j);
                    case 1 -> sala = (String) linhaMatriz.get(j);
                    case 2 -> horario = (String) linhaMatriz.get(j);
                    case 3 -> numAssentos = Integer.parseInt((String) linhaMatriz.get(j));
                    case 4 -> isDublado = Integer.parseInt((String) linhaMatriz.get(j)) == 1;
                }
            }
            cinema.adicionarSessao(new Sessao(nomeFilme, sala, horario, numAssentos, isDublado));
        }

        // Para instanciar o ingresso automaticamente é preciso fazer integração com o Swing, até lá os inputs vão ser na mão
//        Ingresso ingressoTeste = new Ingresso(19, "Tiago", "232","A Freira 2", "S1", "G12", 20);
//
//        // Checa a qual sessão o ingresso pertence
//        for (Sessao sessao : cinema.getSessoes()) {
//            if (Objects.equals(ingressoTeste.getSala(), sessao.getSala())) {
//                System.out.println("Ingresso pertence a sessão " + sessao.getSala());
//                sessao.adicionarIngresso(ingressoTeste);
//                System.out.println(sessao.getIngressos());
//            }
//        }
//
//        // Escreve um ingresso instanciado no arquivo CSV
//        try {
//            managerCSV.escreverLinhaNoCSV(managerCSV.getFileIngressos(), ingressoTeste.stringDadosDoIngresso());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
