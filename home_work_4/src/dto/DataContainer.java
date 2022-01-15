package dto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DataContainer<T> {

    private T[] data;
    /*
    * Конструктор класса
    */

    public DataContainer(T[] data) {
        this.data = data;
    }

    /*
    * Метод добавления данных в первую позицию (ячейку) после последней
    * заполненной позиции (ячейки)  и возвращает номер позиции в которую
    * были вставленны данные, начиная с 0.
    * iteam - данные для добавления
    * Вернет -1 ели данные вставить нелься ( если передаем null)
    *        от 0 и больше если элемент был вставлен
    */
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
    /*
    * Метод получает из DataContainer'а, из поля data,
    * предварительно сохранённый объект по индексу index
    * index - индекс получаемого элемента
    * Возвращает null если объект не найден
    */
    public T get (int index) {
        if (index >= 0 && index <= data.length - 1) {
            return data[index];
        } else {
            return null;
        }
    }

    /*
    * Метод возвращает поле data
    */
    public T[] getItems(){
        return data;
    }

    /*
    * Метод удаляет элемент по индексу index. удаляет ячейку польностью.
    * Возвращает true  - удалили элемент
    *            false - не удалось удалить элемент
    */

    public boolean delete (int index){
        if (index >= 0 && index < data.length - 1){
            for (int i = index + 1; i < data.length; i++) {
                data[i - 1] = data[i];
            }
            data = Arrays.copyOf(data,data.length-1);
            return true;
        }else return false;
    }

    /*
     * Метод удаляет первый найденный идентичный элемент iteam. удаляет ячейку польностью.
     * Возвращает true  - удалили элемент
     *            false - не удалось удалить элемент
     */
    public boolean delete(T item){
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)){
                delete(i);
                return true;
            }
        }
        return false;
    }

    /*
    * Метод (не статический) сортирует данные записанные в поле data из переданного объекта comparator
    */

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
    /*
    * Метод (статический) принимающий объект DataConteiner<G>
    * с джейнериком <G extends Comparable>
    * данный метод сортирует данные
    */

    public static <G extends Comparable> void sort(DataContainer<G> container) {
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

    /*
    * Статический метод принимающий объект DataConteiner и реализацию интерфейса Comparator
    * данный метод сортирует данные
    */

    public static <G> void sort (DataContainer<G> container, Comparator<G> comparator){
        for (int i = 0; i < container.data.length; i++) {
            for (int j = 0; j < container.data.length - 1; j++) {
                if (comparator.compare(container.data[j],container.data[j +1 ]) > 0){
                    G data3 = container.data[j];
                    container.data[j] = container.data[j + 1];
                    container.data[j + 1] = data3;
                }
            }
        }
    }

    /*
    * Переопределение метода toString()
    * выводит содержимое data без ячеек в которых хранится null
    */
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
