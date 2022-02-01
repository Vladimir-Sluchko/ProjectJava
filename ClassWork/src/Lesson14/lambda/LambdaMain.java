package Lesson14.lambda;

import Lesson5.oop.video.dto.Man;

import java.util.Comparator;

public class LambdaMain {
    public static void main(String[] args) {
        final UserName userName = new UserName();
       /* Icall device = new Icall() {
            @Override
            public boolean call(String number) {
                System.out.println("Набираем из ананонимного класса ");
                return false;
            }
        };
        System.out.println(callToNumber(device,"+54655544444"));
        System.out.println(callToNumber(new Phone(), "+37565665556666"));
        System.out.println(callToNumber((num) -> {
            System.out.println("Включаем прослушку.Набираем " + num + "......");
            return true;
        },"+99999999"));*/

        /*
        * можно записать по другому
        * */
        Icall device = new Icall() {
            @Override
            public boolean call(String number) {
                System.out.println("Набираем из ананонимного класса " + userName.getName());
                return false;
            }
        };


        Icall device2  = new Phone();
        Icall device3 = (num) -> {
            System.out.println("Включаем прослушку.Набираем " + userName.getName() + "......");
            return true;
        };
        Comparator<Man> comp = (man1, man2) -> {
            return man1.getHairLength() - man2.getHairLength();
        };
        /*две идентичные записи Comparator использую лямбду*/
        Comparator<Man> comp1 = (man1, man2) -> man1.getHairLength() - man2.getHairLength();

        System.out.println(callToNumber(device,"+54655544444"));
        userName.setName("Наташа");
        System.out.println(callToNumber(device2, "+37565665556666"));
        System.out.println(callToNumber(device3,"+99999999"));
        compare(Sort::compareFIO);
        compare2(Sort::compareScore);


    }
    public static boolean callToNumber(Icall device,String number){
        return device.call(number);
    }
    public static boolean compare (Comparator<String> comparator){
        return true;
    }

    public static boolean compare2 (Comparator<Double> comparator){
        return true;
    }



}
