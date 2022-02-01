package Lesson13;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Writer {
    public static void main(String[] args) throws IOException {
        /*
        * Создаем фай по определенному пути
        * */
        File read2 = new File("ClassWork/read3.txt");
        FileOutputStream writer2 = new FileOutputStream(read2,true);
        String text = "Hello World 2\r\n";
        writer2.write(text.getBytes(StandardCharsets.UTF_8));
        writer2.close();
        //FileWriter writer = new FileWriter(read2,false);
        //writer.write("Hello World!");
    }
}
