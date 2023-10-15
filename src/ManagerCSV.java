import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagerCSV {
    private final File fileCinemas;
    private final File fileFilmes;
    private final File fileSessoes;
    public ManagerCSV() {
        this.fileCinemas = new File("resources/Cinemas.csv");
        this.fileFilmes = new File("resources/Filmes.csv");
        this.fileSessoes = new File("resources/Sessoes.csv");

        createFile(fileCinemas);
        createFile(fileFilmes);
        createFile(fileSessoes);
    }
    public void createFile(File file) {
        // Por enquanto não adiciona nenhum conteúdo aos arquivos
        try {
            if (file.createNewFile())
                System.out.println(file.getName() + " created");
            else
                System.out.println(file.getName() + " already exists");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List fileLinesToMatrix(File csvFile) {
        List<List<String>> linhas = new ArrayList<>(); // Lista bidimensional : [[linhaCSV], [linhaCSV]...];
        String linha;

        try { // Filme
            FileReader file = new FileReader(csvFile.getPath());
            BufferedReader leitor = new BufferedReader(file);

            // Se não tiver linha para ler, leitor.ready() = false
            while (leitor.ready()) {
                linha = leitor.readLine();
                List<String> palavras = Arrays.asList(linha.split(";")); // Array gerado pelo split -> List
                linhas.add(palavras);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return linhas; // linhas é uma matriz com os dados da tabela;
    }

    public File getFileCinemas() {
        return fileCinemas;
    }

    public File getFileFilmes() {
        return fileFilmes;
    }

    public File getFileSessoes() {
        return fileSessoes;
    }
}
