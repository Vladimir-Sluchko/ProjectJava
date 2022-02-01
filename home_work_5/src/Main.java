import utils.*;

import java.util.Scanner;
import java.util.SortedMap;


public class Main {
    public static void main(String[] args) {
        FileToStringFileReader fileToStringFileReader = new FileToStringFileReader();
        String adressFile = "home_work_5/src/books/Война и мир_книга.txt";
        FileTextToString fileToString = new FileTextToString();
        String text = fileToString.loadText(adressFile);
        /*String text3 = text.replaceAll("(\\.|,|:|;|\"|!|\\?|\\(|\\)|\n|\t|--|-\\s+|\\s+-|\\s+)", " ").replaceAll(" +", " ");
        Set<String> word = new HashSet<>();
        String [] textWord = text3.split(" ");
        for (String wordArr:textWorld) {
            world.add(wordArr);
        }
        System.out.println(word);
        System.out.println("Колличество использованных слов: " + world.size());*/

        WordInSet wordInSet = new WordInSet(text);
        //System.out.println(wordInSet.print());
        System.out.println("Количество использованных слов :" + wordInSet.sizeSet());
        Scanner scanner = new Scanner(System.in);

        WordInMap wordInMap = new WordInMap(text);
        System.out.println(wordInMap.wordMap());
        System.out.println("Введите число для вывода топ N слов ");
        //int n = scanner.nextInt();
        int n = 4;
        System.out.println("Топ " + n +" слов :" + wordInMap.wordSortList(n));
        EasySearch easySearch = new EasySearch();
        String wordSeach = "война";
        long count = easySearch.search(text,wordSeach);
        System.out.println("колличество " + count);






    }
}
