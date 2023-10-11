import java.io.File;

public class CriadorCSV {
    public static void main(String[] args) {
        File file = new File("resources/Teste.txt");
        // file.isFile() retorna true se o arquivo já existe, se não existe é false
        if (!file.isFile()) {
            try {
                file.createNewFile();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
