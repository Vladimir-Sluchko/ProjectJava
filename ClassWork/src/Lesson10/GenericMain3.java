package Lesson10;

import Lesson10.generic.BoxSumGeneric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class GenericMain3 {
    public static void main(String[] args) {
        //String[] arr = {"Илья", "ьалыьп","sfmgldfm"};
        String [] arr = new String[10];
        List<String> data = new ArrayList<>();
        data.add("вася1");
        data.add("вася2");
        data.add("вася3");
        data.add("вася4");

        //Arrays.sort(arr);
        //data.sort();
        System.out.println(arr.length);//полу
        System.out.println(data.size());//метод
    }
}
