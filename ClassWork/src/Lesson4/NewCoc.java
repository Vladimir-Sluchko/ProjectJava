package Lesson4;

import java.util.Scanner;

public class NewCoc {
    public static void main(String[] args) {
        // String s = "fred";  // используйте это, если вам нужно протестировать //исключение ниже
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        String stroka = scan.next();

       // String s = "100";

        try
        {
            // именно здесь String преобразуется в int
            long i = Long.parseLong(stroka.trim());
         //   int i = Integer.parseInt(s.trim());

            // выведем на экран значение после конвертации
            System.out.println("int i = " + i);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Пользователь ввёл некорректные данные: ");
        }
    }
}
