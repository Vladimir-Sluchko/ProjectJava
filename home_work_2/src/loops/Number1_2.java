// 1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
// Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
//		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
//		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
//		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
package loops;

import java.util.Scanner;

public class Number1_2 {
    public static void main(String[] args) {
        long number;
        long chislo;
        Double drobn;
        try {
            chislo = Long.parseLong(args[0]);
            System.out.println("Введено число " + chislo);
        }
        catch (NumberFormatException nfe) {
            try {
                drobn = Double.parseDouble(args[0]);
                System.out.println("Введено не целое число");
            }
            catch (NumberFormatException nfe2) {
                System.out.println("Введено не число");
                return;
            }
        }
        chislo = Long.parseLong(args[0]);
        char[] chars = args[0].toCharArray();
        long rezult = 1;
        for (int i = 0; chislo > 0; i++){
            number = chislo % 10;
            System.out.print(chars[i]);
            chislo  = chislo / 10;
            if (chislo != 0){
                System.out.print(" * ");
            }
            rezult = rezult * number;
        }
        System.out.println(" = " + rezult);

    }
}
