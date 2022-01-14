import dto.DataContainer;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[0]);
        int index1 = container.add("Привет");
        //int index2 = container.add(null);
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
       // System.out.println(container.delete("Работаю"));
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        System.out.println(container.getItems());
        System.out.println(container.toString());
        DataContainer.sort3(container);
        //container.sort(String::compareTo);
        System.out.println(container.toString());
        //container.delete(text1);
        //sout(container.get(index1)); //Как дела
        DataContainer<String> container1 = new DataContainer<>(new String[]{"Привет",null, "Как дела", });
        System.out.println(container1.toString());

    }
}
