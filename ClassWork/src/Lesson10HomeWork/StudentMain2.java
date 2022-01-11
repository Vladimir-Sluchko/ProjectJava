package Lesson10HomeWork;

import Lesson10HomeWork.dto.Student;

import java.util.*;

import static Lesson10HomeWork.Service.RandomeStudentService.*;

public class StudentMain2 {
    public static void main(String[] args) {
        Random random = new Random();
        String name = new String();
        /*Цикл для создания от А до Я */
        /*for (int i = 1040; i < 1072; i++) {
            int numberOfLetters = (int)i;
            char tmp = (char)(numberOfLetters);
            name = name + tmp;// Запись в строку
            System.out.println(name);
        }
        *//*Цикл для создания от а до я */
       /* for (int i = 1072; i < 1103; i++) {
            int numberOfLetters = (int)i;
            char tmp = (char)(numberOfLetters);
            System.out.println(tmp);
        }*/
        /*
         * Делаем заглавную букву
         * */
        /*char firstCharactet = (char)(randomMinMax(1040,1072));
        name = name + firstCharactet;
        System.out.println(name);
        *//*
         * Создаем рандомные символы
         * *//*
        int a = randomMinMax(3,10);
        System.out.println(a);
        for (int i = 0; i < (a - 1); i++) {
            char nextCharactet = (char)(randomMinMax(1072,1103));
            name = name + nextCharactet;
        }
        System.out.println(name);*/
        char tmp = (char)(1071);
        System.out.println(tmp);
        Integer[] array = new Integer[]{54, 2, 343, 5, 656, 76, 87, 98, 4, 4, 5};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o2-o1);
            }
        });
        System.out.println(Arrays.toString((array)));
    }
    public static int randomMinMax (int min,int max){
        max -= min;
        return (int)(Math.random()*++max) + min;
    }
}
