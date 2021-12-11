import java.util.Scanner;

public class Number5_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = in.next();
        String vasia = "Вася";
        String anasts = "Анастасия";
        switch (name){
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день а вы кто?");
        }


    }
}
