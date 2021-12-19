//1. Циклы. Для преобразования строки в число можно использовать http://proglang.su/java/numbers-parseint, если хотите можете добавить проверки
// на корректность ввода данных. Число положительное, максимум long:
//    1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
//    Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
//    Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//    	1.1.1. Используя только цикл
package loops;

import java.util.Scanner;

public class Number1_1 {
    public static void main(String[] args) {
        long n = 1;
        System.out.println("Число которое записано в аргументе " + args[0]);
        try {
            long chislo =Long.parseLong(args[0]);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Пользователь ввёл некорректные данные.");
            return;
        }
        long chislo =Long.parseLong(args[0].strip());
        if (chislo > 20) {
            System.out.println("Значение итоговой переменной переполнено, попробуйте заново и введите число меньше!");
            return;
        }
        for (int i = 1; i <= chislo; i++){
            n = n * i;
            System.out.print(i);
            if (i != chislo){
                System.out.print(" * ");
            } else System.out.print(" = " + n);
        }


    }
}
