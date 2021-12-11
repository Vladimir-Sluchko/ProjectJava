import java.util.Scanner;

public class Number4 {
    public static boolean sleepIn(boolean vacation, boolean weekday) {
        if (vacation == true || weekday != true) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean day;
        boolean vocat;
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите название дня недели");
        String dayName = in.next();
        switch (dayName) {
            case "Суббота":
                day = true;
                break;
            case "Воскресенье":
                day = true;
                break;
            default:
                day = false;
        }
        System.out.println("Может быть у вас отпуск? да? нет?");
        String otp = in.next();
        switch (dayName) {
            case "да":
                vocat = true;
                break;
            default:
                vocat = false;
        }
        boolean vozmSon = sleepIn(vocat, day);
        if (vozmSon == true) {
            System.out.println("Можем спать дальше!");
        } else {
            System.out.println("Пора идти на работу");
        }
    }
}