package Lesson4;

import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Укажите минимум");
        int a1 = console.nextInt();
        System.out.println("Укажите максимум");
        int a2 = console.nextInt();
        System.out.println("Укажите шаг");
        int a3 = console.nextInt();
        for (int i = a1;a1<=a2;a1 += a3) {
            System.out.println(a1);
        }

    }
}
