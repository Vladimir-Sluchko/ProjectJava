import utils.EasySearch;
import utils.FileTextToString;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainWorkFile {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        File storageFolder = bookFolder();
        printStorage(storageFolder);
        String nameBook = selectFileToWork(storageFolder);
        String textBook = bookToString(storageFolder,nameBook);
        System.out.println(textBook);
        String wordSearch;
        do {
            System.out.println("Введите текст который хотите найти ");
            System.out.println("Если хотите завершить работу введите stop");
            wordSearch = scanner.nextLine();
            if(wordSearch.equals("stop")){
                System.out.println("Работа завершена");
                break;
            }
            EasySearch easySearch = new EasySearch();
            long count = easySearch.search(textBook,wordSearch);
            String searchResult = "«Имя файла – " + nameBook +  " слово –" + wordSearch + " количество " + count + " »" + "\n";
            try {
                FileWriter fileWriter = new FileWriter("home_work_5/src/result/result.txt",true);
                fileWriter.write(searchResult);
                fileWriter.close();
            } catch (IOException e) {
                e.getMessage();
            }
        } while (true);
    }

    public static File bookFolder(){
        String storageBooks;
        File file;
        do{
            System.out.println("Введите путь к папке с книгами ");
            storageBooks = scanner.nextLine();
            file = new File(storageBooks);
            if (!file.exists()){
                System.out.println("Неверно указан путь к папке");
            }
        } while (!file.exists());
        return file;
    }


    public static void printStorage (File storageFolder){
        File [] arrFiles = storageFolder.listFiles();
        for (File arrFile:arrFiles) {
            System.out.println(arrFile.getName());
        }
    }


    public static String selectFileToWork(File storageFolder){
        String nameBook;
        File file;
        do{
            System.out.println("Введите название книги ");
            nameBook = scanner.nextLine();
            file = new File(storageFolder + "//" + nameBook);
            if (!file.exists()){
                System.out.println("Нет такой книги. Укажите првильное название книги ");
            }
        } while (!file.exists());
            return nameBook;
    }
    public static String bookToString(File storageFolder,String nameBook){
        FileTextToString fileTextToString = new FileTextToString();
        return fileTextToString.loadText(storageFolder + "//" + nameBook);
    }

}
