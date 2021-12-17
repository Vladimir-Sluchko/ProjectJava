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
        long n1;
        long n2 = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число n, чтобы перемножить целые числа от 1 до n ");
        String stroka = scan.next();
        try {
            long chislo =Long.parseLong(stroka.strip());
        }
        catch (NumberFormatException nfe) {
            System.out.println("Пользователь ввёл некорректные данные.");
            return;
        }
        long chislo =Long.parseLong(stroka.strip());
        if (chislo > 20) {
            System.out.println("Значение итоговой переменной переполнено, попробуйте заново и введите число меньше!");
            return;
        }
        System.out.println("Вы ввели число n = " + chislo);
        /*for (long i = 1; i <= chislo; i++){
            n1 = i;
            n2 = n2 * n1;
            if (n2 < 0) {
                System.out.println("Значение итоговой переменной переполнено, попробуйте заново и введите число меньше");
                return;
            }
        }
        n2 = 1;*/
        for (long i = 1; i <= chislo; i++){
            n1 = i;
            n2 = n2 * n1;
            System.out.print(i);
            if (i != chislo){
                System.out.print(" * ");
            } else System.out.print(" = " + n2);
        }


    }
}
