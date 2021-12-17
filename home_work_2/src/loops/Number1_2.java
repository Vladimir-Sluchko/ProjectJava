// 1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
// Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.
//		1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
//		1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
//		1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число
package loops;

import java.util.Scanner;

public class Number1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number;
        do {
            System.out.println("Введе целое положительное число!");
            while (!scan.hasNextLong()) {
                if (scan.hasNextDouble()) {
                    System.out.println("Введено не целое число");
                    System.out.println("Введе целое положительное число!");
                } else {
                    System.out.println("Введено не число");
                    System.out.println("Введе целое положительное число!");
                }
                scan.next();
            }
            number = scan.nextLong();
        } while (number <= 0);
        long n = 1;
        long a;
        long [] data = new long[19];
        int i;
        for (i = 0; number > 0; i++){
            a = number % 10;
            data [i] = a;
            n = n * a;
            number = number / 10;
        }
        i--;
        for (int j = i; j >= 0; j--){
            System.out.print(data[j]);
            if (j > 0) {
                System.out.print(" * ");
            } else {
                System.out.print(" = ");
            }
        }
        System.out.print(n);
    }
}
