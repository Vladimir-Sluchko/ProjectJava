import comparators.DataContainerComparator;
import dto.DataContainer;

import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        //
        DataContainer<String> container = new DataContainer<>(new String[0]);
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        container.delete(text1);
        System.out.println(container.get(index1));//Как дела
        System.out.println("_________________________________");

        //Вывод поля data
        System.out.println(container.getItems());
        System.out.println("______________1-й метод сортировки___________________");
        // Вывод содержимого поля data до сортировки
        System.out.println("Вывод до сортировки ");
        System.out.println(container.toString());
        container.sort(String::compareTo);// сортировка
        System.out.println("Вывод после сортировки ");
        System.out.println(container.toString());

        System.out.println("______________2-й метод сортировки___________________");
        DataContainer<String> container2 = new DataContainer<>(new String[]{"Привет","Как дела", "Работа","Давай потом" });
        System.out.println("Вывод до сортировки ");
        System.out.println(container2.toString());//сортировка
        System.out.println("Вывод после сортировки ");
        DataContainer.sort(container2);
        System.out.println(container2.toString());

        System.out.println("______________3-й метод сортировки___________________");
        DataContainer<String> container3 = new DataContainer<>(new String[]{"Привет","Как дела", "Работа","Давай потом" });
        System.out.println("Вывод до сортировки ");
        System.out.println(container3.toString());
        System.out.println("Вывод после сортировки ");
        DataContainer.sort(container3, new DataContainerComparator());//сортировка
        System.out.println(container3.toString());

        System.out.println("______________toString without null___________________");
        DataContainer<String> containerToString = new DataContainer<>(new String[]{"Привет",null, "Как дела", null,"Работа","Давай потом" });
        System.out.println(containerToString.toString());


    }
}
