//2.4 Задачи взяты с сайта https://taskcode.ru/array. На сайте есть пояснения по каждой из этих задач.
// Все задачи в одном классе, в отдельных методах. Для создания массивов использовать ранее созданный arrayRandom.
//		2.4.1. Сумма четных положительных элементов массива
//		2.4.2. Максимальный из элементов массива с четными индексами
//		2.4.3. Элементы массива, которые меньше среднего арифметического
//		2.4.4. Найти два наименьших (минимальных) элемента массива
//		2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
//		2.4.6. Сумма цифр массива

package arrays;

import java.util.Scanner;

import static utils.ArraysUtils.arrayRandom;

public class Number2_4 {

    // 2.4.1. Сумма четных положительных элементов массива
    public static void sumEventPositive(int size,  int maxValueExclusion){
        int [] data = arrayRandom(size,maxValueExclusion);
        int a;
        int sum = 0;
        System.out.println("Сформированный массив ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
            if (data[i] % 2 == 0 && data[i] > 0) {
                a = data[i];
                sum = sum + data[i];
            }
        }
        System.out.println(" ");
        System.out.println("Сумма четных положительных элементов массива " + sum);
    }


    //2.4.2. Максимальный из элементов массива с четными индексами
    public static void maxElemWithEventIndex(int size,  int maxValueExclusion){
        int [] data = arrayRandom(size, maxValueExclusion);
        System.out.println("Сформированный массив ");
        int maxElem = data[0];
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
            if (maxElem < data[i] && i%2 == 0){
                maxElem = data[i];
            }
        }
        System.out.println(" ");
        System.out.println("Максимальный из элементов массива с четными индексами " + maxElem);
    }


    //		2.4.3. Элементы массива, которые меньше среднего арифметического
    public static void maxOfMedium (int size,int maxValueExcxlusion){
        int [] data = arrayRandom(size,maxValueExcxlusion);
        System.out.println("Сформированный массив из случайных чисел");
        int sum = 0;
        int srArif;
        for (int i = 0; i < data.length; i++) {
            System.out.print(data [i] + " ");
            sum = sum + data[i];
        }
        srArif = sum / data.length;
        System.out.println("");
        System.out.println(sum);
        System.out.println("Средне-арифметическое массива " + srArif);
        System.out.println("Элементы массива которые меньше среднеарифметического ");
        for (int i = 0; i < data.length; i++) {
            if (data[i] < srArif) {
                System.out.print(data[i] + " ");
            }
        }
    }


    //		2.4.4. Найти два наименьших (минимальных) элемента массива
    public static void twoSmollestElemets (int size, int maxValueExcxlusion ){
        int [] data =arrayRandom(size,maxValueExcxlusion);
        System.out.println("Сформированный массив из случайных чисел");
        int minOne = data[0];
        int minTwo = data[0];
        int numberMin = 0;
        for (int i = 0; i < data.length; i++) {
            System.out.print(data [i] + " ");
            if (minOne > data[i]){
                minOne = data[i];
                numberMin = i;
            }
        }
        for (int j = 0; j < data.length; j++) {
            System.out.print(data [j] + " ");
            if (minTwo > data[j] && j != numberMin){
                minTwo = data[j];
            }
        }
        System.out.println("");
        System.out.println("Пераое минимальное значение " + minOne);
        System.out.println("Второе минимальное значение " + minTwo);
    }

    //2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
    public static void compressArrayDelElement (int size,int maxValueExcxlusion){
        int [] data = arrayRandom(size,maxValueExcxlusion);
        System.out.println("Сформированный массив из случайных чисел");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("Укажите нижнюю границу массива, в котором необъодимо удалить элементы:");
        Scanner scan = new Scanner(System.in);
        int bottomBound = scan.nextInt();
        System.out.println("Укажите верхнюю границу массива, в котором необъодимо удалить элементы:");
        int upperBound = scan.nextInt();
        for (int i = 0; i < data.length;) {
            if (data[i] >= bottomBound && data[i] <= upperBound){
                for (int j = i; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                }
                data[data.length-1] = 0;
                } else i++;
        }
        for (int i:data) {
            System.out.print(i + " ");

        }

    }

    //		2.4.6. Сумма цифр массива
    public static void sumOfAllDigits (int size,int maxValueExcxlusion ){
        int [] data = arrayRandom(size,maxValueExcxlusion);
        System.out.println("Сформированный массив из случайных чисел");
        for (int i: data) {
            System.out.print(i + " ");
        }
        int sum =0;
        for (int i:data) {
            while (i > 0){
                sum = sum + i%10;
                i /=10;
            }
        }
        System.out.println("");
        System.out.println("Сумма элементов массива " + sum);
    }




    public static void main(String[] args) {

        sumEventPositive(10,10);
        maxElemWithEventIndex(10,  100);
        maxOfMedium(10,10);
        twoSmollestElemets(10,10);
        compressArrayDelElement(10,10);
        sumOfAllDigits(10,10);


    }
}
