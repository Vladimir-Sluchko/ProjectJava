import java.util.Scanner;

public class prov {
    public static void main(String[] args){
        long n = 78999;
        String number = String.valueOf(n);
        for (int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            Math.pow(j, 2);
            System.out.println(j);
        }

    }
}
