package runners;

import calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calk = new CalculatorWithCounterClassic();
        // запись по действиям
        double operation1 = calk.devision(28,5);
        calk.incrementCountOperation();
        double operation2 = calk.exponentiation(operation1,2);
        calk.incrementCountOperation();
        double operation3 = calk.multiplication(15,7);
        calk.incrementCountOperation();
        double operation4 = calk.addition(4.1,operation3);
        calk.incrementCountOperation();
        double operation5 = calk.addition(operation4,operation2);
        calk.incrementCountOperation();
        System.out.println(operation5);
        System.out.println("Выполнено " + calk.getCountOperation() + " операций");

    }
}
