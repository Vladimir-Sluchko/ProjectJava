package runners;

import calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import calcs.simple.CalculatorWithMathCopy;
import calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        System.out.println("_________CalculatorWithCounterAutoCompositeInterfaceMain CalculatorWithOperator_________");
        CalculatorWithCounterAutoAgregationInterface calkul = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        double result = calkul.addition(calkul.addition(4.1,calkul.multiplication(15,7)),calkul.exponentiation(calkul.devision(28,5),2));
        System.out.println(result);
        System.out.println("Выполнено " + calkul.getCountOperation() + " операций");

        System.out.println("_________CalculatorWithCounterAutoCompositeInterfaceMain CalculatorWithMathCopy_________");
        CalculatorWithCounterAutoAgregationInterface calkul1 = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        double result1 = calkul1.addition(calkul1.addition(4.1,calkul1.multiplication(15,7)),calkul1.exponentiation(calkul1.devision(28,5),2));
        System.out.println(result1);
        System.out.println("Выполнено " + calkul1.getCountOperation() + " операций");

    }
}
