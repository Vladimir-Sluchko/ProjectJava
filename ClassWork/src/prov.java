import java.util.Scanner;

public class prov {
    public static void main(String[] args)
            throws InterruptedException {
        String t = "Текст который необходимо переписать.";
        System.out.print(t);
        for (int i = 0; i < t.length(); i++) {
            Thread.sleep(25);
            System.out.print("\b");
        }

        System.out.print("Новый текст.");
    }
}
