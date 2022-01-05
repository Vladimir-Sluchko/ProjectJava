package Lesson5.oop.video;

import Lesson5.oop.video.dto.*;

public class ObjectMain1 {
    public static void main(String[] args) {
        Man man1 = new Man();
        man1.setAge(22);
        man1.setName("Вася");
        man1.setTeethCount(32);

        LiarMan man2 = new LiarMan();
        man2.setAge(321);
        man2.setName("Врунишка");
        man2.setTeethCount(3);

        Biker man3 = new Biker();
        man3.setAge(50);
        man3.setName("Кристина");
        man3.setTeethCount(32);

        Human1 man4 = new Human1();
        man3.setAge(30);
        man3.setName("Валера");
        man3.setTeethCount(32);

        man1.grow();
        man1.grow();
        System.out.println("______________man1 print____________________");
        print(man1);
        System.out.println("______________man1____________________");
        System.out.println("Длинна волос " + man1.getHairLength());
        System.out.println("Колличество зубов " + man1.getTeethCount());
        System.out.println("Возраст " + man1.getAge());
        System.out.println("Имя " + man1.getName());

        System.out.println("______________man2 print____________________");
        print(man2);
        System.out.println("______________man2____________________");
        System.out.println("Длинна волос " + man2.getHairLength());
        System.out.println("Колличество зубов " + man2.getTeethCount());
        System.out.println("Возраст " + man2.getAge());
        System.out.println("Имя " + man2.getName());

        System.out.println("______________man3 print____________________");
        print(man3);
        System.out.println("______________man3____________________");
        //System.out.println("Длинна волос " + man3.getHairLength());
        System.out.println("Колличество зубов " + man3.getTeethCount());
        System.out.println("Возраст " + man3.getAge());
        System.out.println("Имя " + man3.getName());



    }
    public static void print (Man man){
        System.out.println("Длинна волос " + man.getHairLength());
        System.out.println("Колличество зубов " + man.getTeethCount());
        System.out.println("Возраст " + man.getAge());
        System.out.println("Имя " + man.getName());

    }
    public static void print (IHuman man){
        System.out.println("Колличество зубов " + man.getTeethCount());
        System.out.println("Возраст " + man.getAge());
        System.out.println("Имя " + man.getName());

    }

}
