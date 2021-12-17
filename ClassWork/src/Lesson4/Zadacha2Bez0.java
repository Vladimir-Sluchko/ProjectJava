package Lesson4;

import java.util.Random;

public class Zadacha2Bez0 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int i = 0;
        int n = 0;
        int a;
        double chet = 0;
        double verChet;
        while (i<1000){
            a = rnd.nextInt();
            if (a == 0) {
                continue;
            }
            i++;
            if (a%2 == 0){
                chet++;
            }
        }
        verChet = chet / 1000 * 100;
        System.out.println("Вероятность выпадения четных чисел в % " + String.format("%.4g%n", verChet) );
    }
}
