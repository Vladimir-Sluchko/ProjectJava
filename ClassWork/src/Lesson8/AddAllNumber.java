package Lesson8;

import java.util.Scanner;

public class AddAllNumber {
    public static void main(String[] args) {
        for (String arg:args) {
            Scanner console = new Scanner(arg);

            if (console.hasNextLong()){
                long add =1;
                long number = Long.parseLong(arg);
                for (int i = 0; i < args.length; i++) {
                    int numberPart = Character.getNumericValue(arg.charAt(i));
                    add *= numberPart;
                    System.out.print(numberPart);
                    if (i<arg.length()-1){
                        System.out.print("*");
                    }
                }
                System.out.println(" = " + add);
            } else if (console.hasNextDouble()){
                System.out.println("Введено не целое число");
            } else {
                System.out.println("Введено не число");
            }

        }
    }
}
