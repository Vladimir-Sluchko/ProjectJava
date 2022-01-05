package Lesson9.string;

public class StringMain6 {
    public static void main(String[] args) {
        String str = "Я люблю JAVA";

        System.out.println(str);
        System.out.println(str.indexOf('ю'));//indexOf('ю') находит позицию символа ю и дальше не ищет
        System.out.println(str.indexOf('ю',4));//indexOf('ю',4) находит позицию символа ю и c 4 позиции
        System.out.println(str.indexOf('ю',str.indexOf('ю') + 1));
        System.out.println(str.substring(2,6));//.substring(a,b) берет строку с позиции a и до позиции b
        System.out.println(str.indexOf("люблю"));
        System.out.println(str.indexOf("люблю") + "люблю".length() - 1);
        System.out.println(str.indexOf("лю",str.indexOf("лю") + 1));
        System.out.println(str.lastIndexOf("лю"));

    }
}
