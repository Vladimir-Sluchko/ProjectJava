package Lesson4;

import java.util.Scanner;

public class Zadacha6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        int chisl = console.nextInt();
        int m = 0;
        while (chisl > 0) {
            m = m*10 +chisl%10;
            chisl = chisl/10;
        }
        System.out.println(m);
    }
}