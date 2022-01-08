package Lesson10;

import java.util.ArrayList;
import java.util.List;


public class GenericMain4 {
    public static void main(String[] args) {
        //String[] arr = {"Илья", "ьалыьп","sfmgldfm"};
        //String [] data = new String[10];
        List<String> data = new ArrayList<>();
        data.add("Привет");
        for (int i = 0; i < data.size(); i++){
            data.add("Илья");
        }
        System.out.println(data.size());
    }
}
