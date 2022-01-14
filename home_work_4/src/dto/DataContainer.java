package dto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DataContainer<T> {

    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }


    public int add(T iteam) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null){
                    data[i] = iteam;
                    return i;
                }
            }
            data = Arrays.copyOf(data, data.length + 1);
            int index = data.length - 1;
            data[index] = iteam;
            if (data[index] == null){
                return -1;
            }
            return index;
    }


    public T get (int index) {
        if (index >= 0 && index <= data.length - 1) {
            return data[index];
        } else {
            return null;
        }
    }


    public T[] getItems(){
        return data;
    }
    public boolean delete (int index){
        if (index >= 0 && index < data.length - 1){
            for (int i = index + 1; i < data.length; i++) {
                data[i - 1] = data[i];
            }
            data = Arrays.copyOf(data,data.length-1);
            return true;
        }else return false;
    }


    public boolean delete(T item){
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)){
                delete(i);
                return true;
            }
        }
        return false;
    }


    public void setData(T[] data) {
        this.data = data;
    }
    public void sort(Comparator<T> comparator){
        for (int i = 0; i < data.length -1 ; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (comparator.compare(data[j],data[j+1]) > 0){
                    T data2 = data[j];
                    data[j] = data[j+1];
                    data[j + 1] = data2;
                }
            }
        }
    }

    public static <G extends Comparable> void sort3(DataContainer<G> container) {
        for (int i = 0; i < container.data.length; i++) {
            for (int j = 0; j < container.data.length - 1; j++) {
                if(container.data[j].compareTo(container.data[j +1]) > 0){
                    G data3 = container.data[j];
                    container.data[j] = container.data[j + 1];
                    container.data[j + 1] = data3;
                }
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("data : [ ");
        for (int i = 0; i < data.length; i++) {
            if(data[i] != null){
                str.append(String.valueOf(data[i] ));
                if (i < data.length - 1){
                    str.append(", ");
                }
            }
        }
        str.append("]");
        return str.toString();
    }
}
