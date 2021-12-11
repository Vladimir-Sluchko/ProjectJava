package Lesson3;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args){
        int x = 5;
        int y = 6;
        System.out.printf("x=%x; y=%x",50,66);
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        System.out.printf("Число: %d \n",num);
        in.close();
    }
}
