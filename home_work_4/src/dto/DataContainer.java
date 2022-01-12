package dto;

import java.util.Arrays;

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
        if (index != -1) {
            return data[index];
        } else {
            return null;
        }
    }
    public boolean delete (int index){
        if (index < data.length-1){
            data[index] = null;
            return true;
        } else return false;
    }


}
