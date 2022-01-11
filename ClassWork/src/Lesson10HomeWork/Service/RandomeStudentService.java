package Lesson10HomeWork.Service;

import java.util.Random;

public class RandomeStudentService {
    public static void main(String[] args) {

    }
    public static int randomAge (int min,int max){
        max -= min;
        return (int)(Math.random()*++max) + min;
    }

    public static double randomGrade (double min,double max){
        return Math.round(min + (Math.random() * max)*10.0)/10.0;
    }

    public static boolean randomPartOlimpiad (){
        Random rnd = new Random();
        return  rnd.nextBoolean();
    }

    public static int randomMinMax (int min,int max){
        max -= min;
        return (int)(Math.random()*++max) + min;
    }

    public static String randomName (){
        Random random = new Random();
        String name = new String();
        /*
         * Делаем заглавную букву
         * */
        char firstCharactet = (char)(randomMinMax(1040,1071));
        name = name + firstCharactet;
        /*
         * Создаем рандомные символы
         * */
        int a = randomMinMax(3,10);
        for (int i = 0; i < (a - 1); i++) {
            char nextCharactet = (char)(randomMinMax(1072,1103));
            name = name + nextCharactet;
        }
        return name;
    }

    public static String nameRandomArr (){
        Random random = new Random();
        String[] arr = {"Женя","Вася","Наташа","Вова","Федя","Игорь","Аня","Гена"};
        int numberName = random.nextInt(arr.length);
        String name = arr[numberName];
        return name;
    }




}
