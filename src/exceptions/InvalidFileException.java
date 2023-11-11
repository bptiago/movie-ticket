package exceptions;

import java.io.File;

public class InvalidFileException extends Exception{
    public InvalidFileException(String mensagem) {
        super(mensagem);
    }
}
