package Lesson4;

import java.util.Random;

public class Zadanie7massiv {
    public static void main(String[] args) {
        int [] data = new int [10];
        Random rnd = new Random();
       // int[] data = {1 +2,7+4};
       // System.out.println(data[0]);
       // System.out.println(data[1]);
       // System.out.println(data[1]);
       // System.out.println(data.length); // размер массива начинается индексация с 0 до 9
         for (int i =0;i< data.length; i++){    //data.fori быстрый вызов
             System.out.print(data[i]);
             System.out.print(" ");
         }
        System.out.println("\n_____________");
         //data.fori
        for (int i =0;i< data.length; i++){    //data.fori быстрый вызов
            data[i] = rnd.nextInt(99);
        }

        for (int i =0;i< data.length; i++){    //data.fori быстрый вызов
            System.out.print(data[i]);
            System.out.print(" ");
        }
        System.out.println("\n_____________");
        for (int item : data) {
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println("\n_____________");
        int a = 0;
        for (int i:data) {
            System.out.print(i);
            if (a++ != data.length -1){
                System.out.print(", ");

            }
            /*public static  void printArray(int[] arr){
                int i = 0;
                for (int item:arr
                     ) {
                    System.out.println(item);
                    if (a++ != arr.length -1){
                        System.out.print(", ");

                }
            }*/
        }

        //data.For
    }
}
