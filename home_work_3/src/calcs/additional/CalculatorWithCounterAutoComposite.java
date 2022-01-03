package calcs.additional;

import calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathExtends calkul = new CalculatorWithMathExtends();
    private long countOperation;

    public long getCountOperation() {
        return countOperation;
    }

    public void incrementCountOperation(){
        countOperation++;
    }
    //деление
    public double devision (double a,double b){
        return calkul.devision(a,b);
    }
    //умножение
    public double multiplication (double a, double b){
        return calkul.multiplication(a,b);
    }
    //вычитание
    public double subtraction (double a, double b){
        return calkul.subtraction(a,b);
    }
    //сложение
    public double addition (double a, double b) {
        return calkul.addition(a,b);
    }
    //Возведение в целую степень дробного положительного числа
    public double exponentiation (double a,int b){
        return calkul.exponentiation(a,b);
    }
    // модуль числа
    public double module (double a){
        return calkul.module(a);
    }
    // корень из числа
    public double sqrt (double a){
        return calkul.sqrt(a);
    }

}
