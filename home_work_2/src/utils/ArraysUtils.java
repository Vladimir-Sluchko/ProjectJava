//2.1. Создать класс ArraysUtils:
//		2.1.1. Написать метод public static int[] arrayFromConsole() рядом с main. Данный метод размер массива и каждый
//		его элемент запрашивает у пользователя через консоль.
//			2.1.1.1. Пример int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole будет запрошена
//			информация у пользователя, пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}. Соответсвенно
//			будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.
//		2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main. Данный метод
//		принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить. Второй (maxValueExclusion)
//		указывает до какого числа генерировать рандомные числа.
//			2.1.2.1. Пример: int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom будет создан массив
//			размером 5 с числами от 0 до 99 (использовать класс Random) и сохранён в переменную container.
package utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static int[] arrayFromConsole(){
        Scanner scan = new  Scanner(System.in);
        System.out.println("Какого размера создать массив: ");
        int j = scan.nextInt();
        int[] data  = new int[j];
        for (int i = 0; i < data.length; i++) {
            System.out.println("Введите элемент № " + i + " массива:");
            data[i] = scan.nextInt();
        }
        return data;
    }
    public static int [] arrayRandom (int size, int maxValueExclusion){
        Random random = new Random();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValueExclusion);
        }
        return array;

    }

    public static void main(String[] args) {
       //int [] container = arrayFromConsole();
       // System.out.println(container[1]);
        int [] container = arrayRandom(5,100);
        for (int i = 0; i < container.length; i++) {
            System.out.println(container[i]);
        }

    }
}
