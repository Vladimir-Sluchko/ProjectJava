import java.util.Scanner;

public class prov {
    public static void main(String[] args){
        long a = 1;
        long mnojit = 3;
        for (int i = 0;a > 0; i++ ){
            try {
                a = Math.multiplyExact(a,mnojit);
            }
            catch (ArithmeticException ext){
                System.out.println("Максимальное значение до переполнения: " + a);
                a = a * mnojit;
                System.out.println("Максимальное значение после переполнения: " + a);
            }
        }
    }
}
