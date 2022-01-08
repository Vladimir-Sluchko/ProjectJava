package Lesson9.collection;

import Lesson5.oop.video.dto.Man2;
import Lesson9.collection.dto.Passport;

import java.util.*;

public class CollectionMain4 {
    public static void main(String[] args) {
        Random rnd = new Random();

        Set<Passport> passports = new HashSet<>();

//        for (int i = 0; i < 100; i++) {
//            passports.add(new Passport(new Date(),String.valueOf(rnd.nextLong())));
//        }

        for (int i = 0; i < 100; i++) {
            passports.add(new Passport(new Date(),"123"));
        }
        System.out.println(passports);
    }
}
