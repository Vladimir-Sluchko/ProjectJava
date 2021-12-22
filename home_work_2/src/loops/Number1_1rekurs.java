//1. Циклы. Для преобразования строки в число можно использовать http://proglang.su/java/numbers-parseint,
// если хотите можете добавить проверки на корректность ввода данных. Число положительное, максимум long:
//    1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
//    Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю. Пример: Ввели 5,
//    должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
//    	1.1.2.* Используя рекурсию
package loops;

public class Number1_1rekurs {
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

        System.out.println(rekurs(chislo));
    }

    public static long rekurs (long n){
        if (n == 1){
            System.out.print(n + " = ");
            return 1;
        }
            System.out.print(n + " * ");
        return n * rekurs(n-1);

    }

}
