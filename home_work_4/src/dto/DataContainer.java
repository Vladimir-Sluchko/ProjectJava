package dto;

import java.util.Arrays;
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
    p/*ublic void sort(Comparator<T> comparator){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (comparator.compare(data[j-1],data[j]) > 0){
                    T data2 = data[j-1];
                    data[j - 1] = data[j];
                    data[j] = data2;
                }
            }

        }
    }*/

    @Override
    public String toString() {
        return "DataContainer{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
