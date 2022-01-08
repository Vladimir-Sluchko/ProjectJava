package Lesson9.generic;

import Lesson5.oop.video.dto.Man;
import Lesson5.oop.video.dto.Man2;

public class GenericMain5 {
    public static void main(String[] args) {
        BoxGeneric<String> box1 = new BoxGeneric<>();
        box1.setItem("cxvkxcv");

        String item1 = box1.getItem();

        BoxGeneric<Man2> box2 = new BoxGeneric<>();
        box2.setItem(new Man2(10));

        Man2 item2 = box2.getItem();


    }
}
