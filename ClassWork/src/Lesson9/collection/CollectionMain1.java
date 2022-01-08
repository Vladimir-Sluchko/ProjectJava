package Lesson9.collection;

import Lesson5.oop.video.dto.Man;
import Lesson5.oop.video.dto.Man2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionMain1 {
    public static void main(String[] args) {
        List<Man2> data = new ArrayList<>();
        Man2 val = new Man2(10);
        Man2 val2 = new Man2(11);
        System.out.println("size " + data.size());
        for (int i = 0; i < 100; i++) {
            data.add(val);

        }
        System.out.println("size after " + data.size());

        data.add(0,val2);
        data.add(2,val2);

        data.set(0,val);
        data.addAll(data);

        for (Man2 datum : data) {
            System.out.println(val == datum);
        }
        data.remove(val);
        data.remove(0);

        for (int i = 0; i < data.size(); i++) {
            System.out.println(val == data.get(i));

        }



    }
}
