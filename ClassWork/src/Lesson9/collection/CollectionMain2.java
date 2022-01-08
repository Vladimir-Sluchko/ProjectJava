package Lesson9.collection;

import Lesson5.oop.video.dto.A;
import Lesson5.oop.video.dto.Man2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionMain2 {
    public static void main(String[] args) {
        List<Man2> data = new ArrayList<>();
        Man2 val = new Man2(10);
        Man2 val2 = new Man2(11);
        System.out.println("size " + data.size());
        for (int i = 0; i < 100; i++) {
            data.add(val);

        }
        data.add(val2);
        System.out.println("list size after " + data.size());

        Set<Man2> data2 = new HashSet<>(data);
        System.out.println("set 1 size " + data2.size());

        Set<Man2> data3 = new HashSet<>();
        for (Man2 datum : data) {
            data3.add(datum);
        }
        System.out.println("set 2 size " + data3.size());
        Set<Man2> data4 = new HashSet<>();
        data4.addAll(data);
        System.out.println("set 3 size " + data4.size());

    }
}
