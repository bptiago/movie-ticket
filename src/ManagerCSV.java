import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagerCSV {
    private final File fileCinemas;
    private final File fileFilmes;
    private final File fileSessoes;
    private final File fileIngressos;
    public ManagerCSV() {
        this.fileCinemas = new File("resources/Cinemas.csv");
        this.fileFilmes = new File("resources/Filmes.csv");
        this.fileSessoes = new File("resources/Sessoes.csv");
        this.fileIngressos = new File("resources/Ingressos.csv");

        createFile(fileCinemas);
        createFile(fileFilmes);
        createFile(fileSessoes);
        createFile(fileIngressos);
    }
    public void createFile(File file) {
        // Por enquanto não adiciona nenhum conteúdo aos arquivos
        try {
            if (file.createNewFile())
                System.out.println(file.getName() + " criado");
            else
                System.out.println(file.getName() + " já existe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List csvParaMatrizJava(File csvFile) {
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

    public void escreverLinhaNoCSV(File file, String linha) throws IOException {
        FileWriter writer = new FileWriter(file, true);
        // Adiciona linha no final do arquivo existente
        writer.append(linha);
        // Encerra FileWriter
        writer.flush();
        writer.close();
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

    public File getFileIngressos() {
        return fileIngressos;
    }
}
