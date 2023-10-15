import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instância teste cinema
        Cinema cinema = new Cinema("Teste", "Endereco");
        // Files setup
        ManagerCSV managerCSV = new ManagerCSV();
        // Instanciamento automatizado de filmes
        List matrizFilmes = managerCSV.fileLinesToMatrix(managerCSV.getFileFilmes());
        for (int i = 0; i < matrizFilmes.size(); i++) {
            if (i == 0) continue; // Não lê o título das colunas

            List linhaMatriz = (List) matrizFilmes.get(i); // [titulo, ano, classificacao...]

            String nomeFilme = null;
            String classificacaoFilme = null;
            int anoLancamento = 0;

            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0 -> nomeFilme = (String) linhaMatriz.get(j);
                    case 1 -> anoLancamento = Integer.parseInt((String) linhaMatriz.get(j));
                    case 2 -> classificacaoFilme = (String) linhaMatriz.get(j);
                }
            }
            // Instanciar classe filme e adicionar na coleção filmes (em Cinema.java)
            cinema.adicionarFilme(new Filme(nomeFilme, classificacaoFilme, anoLancamento));
        }

        // PRECISA AUTOMATIZAR O O QUE TÁ ABAIXO AINDA
//
//
//        Sessao sessao1 = new Sessao("Sala 1", "15:00", 100, true);
//        sessao1.nomeFilme = "A Freira 2";
//
//        Sessao sessao2 = new Sessao("Sala 2", "18:30", 80, false);
//        sessao2.nomeFilme = "Mercenarios 4";
//
//
//        Ingresso ingresso1 = new Ingresso();
//        ingresso1.preco = 15.0;
//        ingresso1.tipoIngresso = "Inteira";
//        ingresso1.assento = "A1";
//
//        sessao1.adicionarIngresso(ingresso1);
//
//
//        Cinema cinema = new Cinema("Cinema Cinemark", "Rua Danilo Lindão");
//
//
//        cinema.adicionarSessao(sessao1);
//        cinema.adicionarSessao(sessao2);
//        //cinema.removerSessao(sessao2);
//
//
//        System.out.println("Nome do cinema: " + cinema.nome);
//        System.out.println("Endereço do cinema: " + cinema.endereco);
//
//        System.out.println("\nSessões no cinema:");
//        for (Sessao sessao : cinema.sessoes) {
//            System.out.println("Sala: " + sessao.sala);
//            System.out.println("Horário: " + sessao.horario);
//            System.out.println("Número de assentos: " + sessao.numAssentos);
//            System.out.println("Filme: " + sessao.nomeFilme);
//            System.out.println("Dublado: " + sessao.isDublado);
//            System.out.println("Ingressos vendidos: " + sessao.ingressos.size());
//            System.out.println("Idade"+ sessao.classificacaoFilme);
//        }
    }
}
