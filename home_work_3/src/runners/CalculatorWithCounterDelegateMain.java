package runners;

import calcs.additional.CalculatorWithCounterAutoAgregation;
import calcs.additional.CalculatorWithCounterAutoComposite;
import calcs.simple.CalculatorWithMathCopy;
import calcs.simple.CalculatorWithMathExtends;
import calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        // calkul CalculatorWithCounterAutoComposite
        System.out.println("_________CalculatorWithCounterAutoComposite_________");
        CalculatorWithCounterAutoComposite calk = new CalculatorWithCounterAutoComposite();
        double result = calk.addition(calk.addition(4.1,calk.multiplication(15,7)),calk.exponentiation(calk.devision(28,5),2));
        System.out.println(result);
        System.out.println("Выполнено " + calk.getCountOperation() + " операций");

        // calkul CalculatorWithCounterAutoAgregation CalculatorWithOperator
        System.out.println("_________CalculatorWithCounterAutoAgregation CalculatorWithOperator_________");
        CalculatorWithCounterAutoAgregation calk1 = new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator());
        double result1 = calk1.addition(calk1.addition(4.1,calk1.multiplication(15,7)),calk1.exponentiation(calk1.devision(28,5),2));
        System.out.println(result1);
        System.out.println("Выполнено " + calk1.getCountOperation() + " операций");

        // calkul CalculatorWithCounterAutoAgregation CalculatorWithMathExtends
        System.out.println("_________CalculatorWithCounterAutoAgregation CalculatorWithMathExtends_________");
        CalculatorWithCounterAutoAgregation calk2 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathExtends());
        double result2 = calk2.addition(calk2.addition(4.1,calk2.multiplication(15,7)),calk2.exponentiation(calk2.devision(28,5),2));
        System.out.println(result2);
        System.out.println("Выполнено " + calk2.getCountOperation() + " операций");

        // calkul CalculatorWithCounterAutoAgregation CalculatorWithMathCopy
        System.out.println("_________CalculatorWithCounterAutoAgregation CalculatorWithMathCopy_________");
        CalculatorWithCounterAutoAgregation calk3 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        double result3 = calk3.addition(calk3.addition(4.1,calk3.multiplication(15,7)),calk3.exponentiation(calk3.devision(28,5),2));
        System.out.println(result3);
        System.out.println("Выполнено " + calk3.getCountOperation() + " операций");


    }
}
