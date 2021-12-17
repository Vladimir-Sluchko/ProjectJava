package Lesson4;

import java.util.Scanner;

public class LoopsMain1 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        int answer = console.nextInt();

       // int partNumber1 = (answer /1)% 10;
       // int partNumber2 = (answer /(1* 10) )% 100;
       // int partNumber3 = (answer /(1*10*10)) % 100;

       /* while (answer>0){
            int partNumber = answer % 10;
            System.out.println("Получили цифру " + partNumber);
            answer /=10;
        }
        */
       // System.out.println(partNumber1);
       // System.out.println(partNumber2);
       // System.out.println(partNumber3);
        int maxPartnumbe = -1;
        int countMaxPartNumber = 0;
        while (answer>0) {
            int partNumber = answer % 10;
            if (partNumber > maxPartnumbe) {
                maxPartnumbe = partNumber;
                countMaxPartNumber =1;
            } else if (partNumber == maxPartnumbe) {
                countMaxPartNumber++;
            }
            System.out.println("Получили цифру " + partNumber);
            answer /= 10;

        }
        System.out.println("мак5симальное число "+maxPartnumbe);
        System.out.println("Встречается "+countMaxPartNumber +" раза");
    }
}
