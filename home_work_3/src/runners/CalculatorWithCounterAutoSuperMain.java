package runners;

import calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calk = new CalculatorWithCounterAutoSuper();
        // запись по действиям
        double operation1 = calk.devision(28,5);
        double operation2 = calk.exponentiation(operation1,2);
        double operation3 = calk.multiplication(15,7);
        double operation4 = calk.addition(4.1,operation3);
        double operation5 = calk.addition(operation4,operation2);
        System.out.println(operation5);
        System.out.println("Выполнено " + calk.getCountOperation() + " операций");
    }
}
