package Lesson14.lambda;

public class Phone implements Icall{
    @Override
    public boolean call(String number) {
        System.out.println("Набира." + number + ".........");
        return true;
    }
}
