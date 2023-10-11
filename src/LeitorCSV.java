import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeitorCSV {
    // Talvez transformar isso uma classe e passar os obejtos (buffer e filereader) e path como parâmetro no construtor
    public static void main(String[] args) {
        String path = "resources/Cinemas.csv";
        String separador = ";";
        String linha;
        List<List<String>> linhas = new ArrayList<>(); // Lista bidimensional : [[linhaCSV], [linhaCSV]...];
        try {
            FileReader file = new FileReader(path);
            BufferedReader leitor = new BufferedReader(file);

            while (leitor.ready()) {
                linha = leitor.readLine();
                List<String> palavras = Arrays.asList(linha.split(separador)); // Transforma o Array gerado pelo split numa List
                linhas.add(palavras);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (List lista : linhas) {
            System.out.println(lista);
        }
    }
}
