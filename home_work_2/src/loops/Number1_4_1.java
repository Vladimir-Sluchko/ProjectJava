// 1.4.* Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до
// переполнения и после переполнения. Умножать на:
//    	1.4.1. 3

package loops;

public class Number1_4_1 {
    public static void main(String[] args) {
        long a = 1;
        long mnojit = 3;
        boolean x = true;
        while(x == true){
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
