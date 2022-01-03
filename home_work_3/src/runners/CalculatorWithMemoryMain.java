package runners;

import calcs.additional.CalculatorWithMemory;
import calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        //4.1 + 15 * 7 + (28 / 5) ^ 2=
        CalculatorWithMemory calkulator = new CalculatorWithMemory(new CalculatorWithOperator());
        calkulator.devision(28,5);
        calkulator.setMemory();
        calkulator.exponentiation(calkulator.getMemory(),2);
        calkulator.setMemory();
        calkulator.addition(calkulator.multiplication(15,7),calkulator.getMemory() );
        calkulator.setMemory();
        System.out.println(calkulator.addition(4.1,calkulator.getMemory()));


    }
}
