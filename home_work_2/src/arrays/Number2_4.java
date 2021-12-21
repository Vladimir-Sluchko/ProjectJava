//2.4 Задачи взяты с сайта https://taskcode.ru/array. На сайте есть пояснения по каждой из этих задач.
// Все задачи в одном классе, в отдельных методах. Для создания массивов использовать ранее созданный arrayRandom.
//		2.4.1. Сумма четных положительных элементов массива
//		2.4.2. Максимальный из элементов массива с четными индексами
//		2.4.3. Элементы массива, которые меньше среднего арифметического
//		2.4.4. Найти два наименьших (минимальных) элемента массива
//		2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
//		2.4.6. Сумма цифр массива

package arrays;

import static utils.ArraysUtils.arrayRandom;

public class Number2_4 {

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


    public static void main(String[] args) {
        sumEventPositive(10,10);
        maxElemWithEventIndex(10,  100);


    }
}
