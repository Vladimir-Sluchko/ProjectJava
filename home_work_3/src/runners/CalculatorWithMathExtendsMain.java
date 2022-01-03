package runners;

import calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calk = new CalculatorWithMathExtends();
        //4.1 + 15 * 7 + (28 / 5) ^ 2=
        //запись в одну строку
        double result = calk.addition(calk.addition(4.1,calk.multiplication(15,7)),calk.exponentiation(calk.devision(28,5),2));
        System.out.println(result);
        // запись по действиям
        double operation1 = calk.devision(28,5);
        double operation2 = calk.exponentiation(operation1,2);
        double operation3 = calk.multiplication(15,7);
        double operation4 = calk.addition(4.1,operation3);
        double operation5 = calk.addition(operation4,operation2);
        System.out.println(operation5);
    }
}
