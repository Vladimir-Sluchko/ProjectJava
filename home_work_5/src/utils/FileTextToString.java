package utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileTextToString {
    /*
    * Метод перевода текста из файла в строку
    * */
    public String loadText (String fileAdress) {
        Path pathReal = Path.of(fileAdress);
        String text = null;
        try {
            text = Files.readString(pathReal);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return text;
    }
}
