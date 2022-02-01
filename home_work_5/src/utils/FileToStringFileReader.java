package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileToStringFileReader {

    public StringBuilder loadText (String fileAdress){
        StringBuilder line = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(fileAdress);
            int c;
            while((c = fileReader.read()) != -1){
                line.append((char) c);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return line;

    }
}
