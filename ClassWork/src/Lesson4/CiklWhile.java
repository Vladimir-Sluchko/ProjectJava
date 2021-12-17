package Lesson4;

public class CiklWhile {
    public static void main(String [] agrs) {
        int i = 5;
        while (i<10){
            i++;
            if (i == 8){
                System.out.println("УРААА");
                continue;

            }
            System.out.println("i = " + i );


            //break;
        }
        System.out.println("1i равно " + i );
        i = 5;

        //проверяет условие и тогда выполняет
        do {
            System.out.println("i = " + i );
            i++;


        } while (i<10);
        //выполняется хотябы один раз
        System.out.println("2i равно " + i );
    }
}
