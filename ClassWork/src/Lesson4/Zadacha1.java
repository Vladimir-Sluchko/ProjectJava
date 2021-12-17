//Найти наибоьшую цифру натурального числа

package Lesson4;

import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int vvodChislo = console.nextInt();
        int c;
        int cMax = -1;
        while (vvodChislo > 0){
            c = vvodChislo%10;
            if (c > cMax){
                cMax = c;
            }
            if (c == 9) break;
            vvodChislo /= 10;
        }
        System.out.println("Наибольшая цифра введенного натурального числа " + cMax);
    }
}
