//2.2 Перебор массива при помощи do....while, while, for, foreach. Элементы массива вводить используя ранее
// озданный arrayFromConsole. Все задачи в одном классе, в отдельных методах. Должно получиться 3 метода
// (что такое метод https://metanit.com/java/tutorial/2.7.php):
//		2.2.1. Вывести все элементы в консоль.
//		2.2.2. Вывести каждый второй элемент массива в консоль.
//		2.2.3. Вывести все элементы массива в консоль в обратном порядке.

package arrays;

import static utils.ArraysUtils.arrayFromConsole;

public class Number2_2 {
    public static void printAll(){ //данный класс создает массив используя ранее созданный arrayFromConsole() и перебором массива выводит все элементы в консоль
        int [] data = arrayFromConsole();
        int i = 0;
        System.out.println(" Вывод всех элементов массива при помощи do ... while");
        do {
            System.out.print(data[i] + "   ");
            i++;
        } while (i < data.length);

        System.out.println("");
        System.out.println(" Вывод всех элементов массива при помощи while");
        i = 0;
        while ( i < data.length){
            System.out.print(data[i] + "   ");
            i++;
        }
        System.out.println("");
        System.out.println(" Вывод всех элементов массива при помощи for");
        for (i = 0; i < data.length; i++) {
            System.out.print(data[i] + "   ");
        }
        System.out.println("");
        System.out.println(" Вывод всех элементов массива при помощи for each");
        for (int elem : data) {
            System.out.print(elem + "   ");
        }
    }

    public static void printEvrySecond(){ //данный класс создает массив используя ранее созданный arrayFromConsole() и выводит каждый второй элемент массива в консоль
        int [] data = arrayFromConsole();
        int i = 0;
        System.out.println(" Вывод каждого второго элемента массива при помощи do ... while");
        do {
            if (i%2 != 0){
                System.out.print(data[i] + "   ");
            }
            i++;
        } while (i < data.length);

        System.out.println("");
        System.out.println(" Вывод каждого второго элемента массива при помощи while");
        i = 0;
        while ( i < data.length){
            if (i%2 != 0){
                System.out.print(data[i] + "   ");
            }
            i++;
        }
        System.out.println("");
        System.out.println(" Вывод каждого второго элемента массива при помощи for");
        for (i = 0; i < data.length; i++) {
            if (i%2 != 0){
                System.out.print(data[i] + "   ");
            }
        }
        System.out.println("");
        System.out.println(" Вывод каждого второго элемента массива при помощи foreach");
        int c = 0;
        for (int elem : data) {
            if (c%2 != 0){
                System.out.print(elem + "   ");
            }
            c++;
        }
    }

    public static void printInReversOrder(){ //данный класс создает массив используя ранее созданный arrayFromConsole() и выводит элементы массива в обратном порядке
        int [] data = arrayFromConsole();
        int i = data.length - 1;
        System.out.println(" Вывод массива в обратном порядке при помощи do ... while");
        do {
                System.out.print(data[i] + "   ");
            i--;
        } while (i >= 0);

        System.out.println("");
        System.out.println(" Вывод массива в обратном порядке при помощи while");
        i = data.length - 1;
        while ( i >= 0){
                System.out.print(data[i] + "   ");
            i--;
        }
        System.out.println("");
        System.out.println(" Вывод массива в обратном порядке при помощи for");
        for (i = data.length - 1; i >= 0; i--) {
                System.out.print(data[i] + "   ");
        }
        System.out.println("");
        System.out.println(" Вывод массива в обратном порядке при помощи foreach");
        i = data.length - 1;
        for (int elem : data) {
                System.out.print(data[i] + "   ");
            i--;
        }
    }
    public static void main(String[] args) {

        //printAll();
        //printEvrySecond();
        printInReversOrder();


    }
}
