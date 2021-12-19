// 1.4.* Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до
// переполнения и после переполнения. Умножать на:
// 1.4.4. Да и вообще на любое целочисленное

package loops;

import java.util.Random;

public class Number1_4_4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        long a = 1;
        long mnojit = rnd.nextLong();
        System.out.println("Случайное число " + mnojit);
        boolean x = true;
        for (int i = 0;x == true; i++ ){
            try {
                a = Math.multiplyExact(a,mnojit);
            }
            catch (ArithmeticException ext){
                System.out.println("Максимальное значение до переполнения: " + a);
                a = a * mnojit;
                x = false;
                System.out.println("Максимальное значение после переполнения: " + a);
            }
        }
    }
}
