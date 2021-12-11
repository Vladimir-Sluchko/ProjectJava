import java.util.Scanner;

public class Number5_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = in.next();
        String vasia = "Вася";
        String anasts = "Анастасия";
        int x = 0;
        if (name.equals(vasia)){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
            x = ++x;
        }
        System.out.println("");
        if (name.equals(anasts)){
            System.out.println("Я тебя так долго ждал");
            x = ++x;
        }
        if (x==0){
            System.out.println("Добрый день а вы кто?");
        }

    }
}
