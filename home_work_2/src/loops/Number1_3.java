// 1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить,
// Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
// Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
//		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
//		1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
package loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Number1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число которое нужно возвести в степень");
        double chislo = scan.nextDouble();
        int step;
        System.out.println("Введите степень в которую нужно возвести число " + chislo);
        do {
            while (!scan.hasNextInt()) {
                if (scan.hasNextDouble()) {
                    System.out.println("Введено не целое число");
                    System.out.println("Введе целое положительное число!");
                } else {
                    System.out.println("Введено не число");
                    System.out.println("Введе целое положительное число!");
                }
                scan.next();
            }
            step = scan.nextInt();
        } while (step <= 0);
        System.out.println("Ответ " + Math.pow(chislo,step));
        double n = 1;
        double vozvedChislo = 1;

        for (int i = 1; i < step; i++ ){
            n = chislo * n;
            vozvedChislo = chislo * n;
        }
        System.out.println(chislo + " ^ " + step + " = " +  new DecimalFormat( "###,###.###" ).format(vozvedChislo));

    }
}
