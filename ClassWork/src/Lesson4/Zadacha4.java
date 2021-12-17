// ряд фибоначи
package Lesson4;



import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Укажите количество элементов ряда Фибоначи");
        int n = console.nextInt();
        int f1 = 1;
        int f2 = 2;
        int v;
        if (n == 1){
            System.out.println(f1);
        } else if (n == 2){
            System.out.println(f1);
            System.out.println(f2);
        } else {
            System.out.println(f1);
            System.out.println(f2);
            for (int i = 3; i < n; i++){
                System.out.println(f1+f2);
                v =f1;
                f1 = f2;
                f2 = v + f1;
            }
        }

    }

    }

