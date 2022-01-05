package Lesson9.string;

import java.util.Objects;
import java.util.Scanner;

public class StringMain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = "Я изучаю Java"; //созданны при помощи литерала хранятся в в одном пуле
        String str2 = "Я изучаю Java";//созданны при помощи литерала
        String str3 = new String("Я изучаю Java");//созданны при конструктора, в памяти создан новый объект и не попал в пул хранит другую ссылку
        System.out.println("Введите текст");
        String str4 = scan.nextLine();
        String str5 = "Я изучаю Java";
        String str6 = "Я изучаю Java";
        String str7 = "Я изучаю Java";

        System.out.println("str1 and str2 " + (str1 == str2));//нельзя сравнивать строи при помощи ==
        System.out.println("str1 and str2 " + (str1.equals(str2)));// можно использовать при сравнении
        System.out.println("str1 and str2 " + (Objects.equals(str2,str2)));// можно использовать при сравнении

        System.out.println("______БЕЗ СКОБОК_____"); //работа приоретета операций

        System.out.println("str1 and str2 " + str1 == str2);//нельзя сравнивать строи при помощи ==
        System.out.println("str1 and str2 " + str1.equals(str2));// можно использовать при сравнении
        System.out.println("str1 and str2 " + Objects.equals(str2,str2));// можно использовать при сравнении

        System.out.println("_______new String____");

        System.out.println("str1 and str3 " + (str1 == str3));//нельзя сравнивать строи при помощи ==
        System.out.println("str1 and str3 " + (str1.equals(str3)));// можно использовать при сравнении
        System.out.println("str1 and str3 " + (Objects.equals(str2,str3)));// можно использовать при сравнении

        System.out.println("_______Scanner____");

        System.out.println("str1 and str4 " + (str1 == str4)); //нельзя сравнивать строи при помощи ==
        System.out.println("str1 and str4 " + (str1.equals(str4)));// можно использовать при сравнении
        System.out.println("str1 and str4 " + (Objects.equals(str2,str4)));// можно использовать при сравнении

    }
}

