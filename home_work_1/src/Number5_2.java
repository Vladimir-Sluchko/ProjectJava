import java.util.Scanner;

public class Number5_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = in.next();
        String vasia = "Вася";
        String anasts = "Анастасия";
        if (name.equals(vasia)){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        else if (name.equals(anasts)){
             System.out.println("Я тебя так долго ждал");
             }
        else {
            System.out.println("Добрый день а вы кто?");
        }

    }
}
