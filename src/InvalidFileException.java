import java.io.File;
import java.io.IOException;

public class InvalidFileException extends Exception{
    public InvalidFileException(String mensagem) {
        super(mensagem);
    }

    public void povoarCSV(File file) {
        ManagerCSV managerCSV = new ManagerCSV();
        try {
            String linhaDefault = "Pequena Miss Sunshine;S5;20:10;100;0;15";
            managerCSV.escreverLinhaNoCSV(file, linhaDefault);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
