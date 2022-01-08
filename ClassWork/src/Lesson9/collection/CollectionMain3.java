package Lesson9.collection;

import Lesson5.oop.video.dto.Man2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionMain3 {
    public static void main(String[] args) {
        List<Man2> data = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            data.add(new Man2(10));

        }

        Set<Man2> data2 = new HashSet<>(data);

        System.out.println("list size " + data.size());
        System.out.println("set 1 size " + data2.size());


    }
}
