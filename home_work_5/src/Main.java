import utils.*;

import java.util.Scanner;
import java.util.SortedMap;


public class Main {
    public static void main(String[] args) {
        FileToStringFileReader fileToStringFileReader = new FileToStringFileReader();
        String adressFile = "home_work_5/src/books/Война и мир_книга.txt";
        FileTextToString fileToString = new FileTextToString();
        String text = fileToString.loadText(adressFile);

        WordInSet wordInSet = new WordInSet(text);
        System.out.println("Количество использованных слов :" + wordInSet.sizeSet());

        Scanner scanner = new Scanner(System.in);
        WordInMap wordInMap = new WordInMap(text);
        //System.out.println(wordInMap.wordMap());
        System.out.println("Введите число для вывода топ N слов ");
        //int n = scanner.nextInt();
        int n =4;
        System.out.println("Топ " + n +" слов :" + wordInMap.wordSortList(n));

        EasySearch easySearch = new EasySearch();
        System.out.println("Введите слово которое вы хотите проверить на количество повторов с учетом регистра");
        String wordSeach = scanner.next();
        //String wordSeach = "война";
        long countRegist = easySearch.search(text,wordSeach);
        System.out.println("Слово " + wordSeach + " встречается в тексте " + countRegist + " раз с учетом регистра");
        CaseConversion caseConversion = new CaseConversion(easySearch);
        long countNoRegist = caseConversion.search(text,wordSeach);
        System.out.println("Слово " + wordSeach + " встречается в тексте " + countNoRegist + " раз без учета регистра");

        System.out.println("Слова \"война\", \"и\", \"мир\" вне" + " встречаются вне зависимости от регистра");
        countNoRegist = caseConversion.search(text,"война");
        System.out.println("Слово \"война\" встречается в тексте " + countNoRegist + " раз без учета регистра");
        countNoRegist = caseConversion.search(text,"и");
        System.out.println("Слово \"и\" встречается в тексте " + countNoRegist + " раз без учета регистра");
        countNoRegist = caseConversion.search(text,"мир");
        System.out.println("Слово \"мир\" встречается в тексте " + countNoRegist + " раз без учета регистра");






    }

}
