import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instância teste cinema
        Cinema cinema = new Cinema("Teste", "Endereco");
        // Files setup
        ManagerCSV managerCSV = new ManagerCSV();

        // Instanciamento de filmes
        List matrizFilmes = managerCSV.fileLinesToMatrix(managerCSV.getFileFilmes());
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
        List matrizSessoes = managerCSV.fileLinesToMatrix(managerCSV.getFileSessoes());
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

        // PRECISA AUTOMATIZAR O O QUE TÁ ABAIXO AINDA
//        Ingresso ingresso1 = new Ingresso();
//        ingresso1.preco = 15.0;
//        ingresso1.tipoIngresso = "Inteira";
//        ingresso1.assento = "A1";
//        sessao1.adicionarIngresso(ingresso1);
//
//        Cinema cinema = new Cinema("Cinema Cinemark", "Rua Danilo Lindão");
    }
}
