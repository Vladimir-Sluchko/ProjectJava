package Lesson9.string;

public class StringMain5 {
    public static void main(String[] args) {
        String str = "Я люблю JAVA";

        System.out.println(str);
        System.out.println(str.substring(2));//нумерация с 0, .substring(a) берет строку с позиции и до конца строки
        System.out.println(str.substring(2,6));//.substring(a,b) берет строку с позиции a и до позиции b

    }
}
