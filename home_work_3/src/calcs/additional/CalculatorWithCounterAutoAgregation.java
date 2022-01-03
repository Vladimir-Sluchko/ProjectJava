package calcs.additional;

import calcs.simple.CalculatorWithMathCopy;
import calcs.simple.CalculatorWithMathExtends;
import calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    private long countOperation;
    private CalculatorWithOperator calk;
    private CalculatorWithMathExtends calk1;
    private CalculatorWithMathCopy calk2;

    public CalculatorWithCounterAutoAgregation (CalculatorWithOperator calk){
        this.calk = calk;
    }

    public CalculatorWithCounterAutoAgregation (CalculatorWithMathExtends calk){
        this.calk1 = calk;
    }

    public CalculatorWithCounterAutoAgregation (CalculatorWithMathCopy calk){
        this.calk2 = calk;
    }
    public long getCountOperation(){
        return countOperation;
    }
    //деление
    public double devision (double a,double b){
        countOperation++;
        double result = 0;
        if (calk != null){
            result = calk.devision(a,b);
        }
        if (calk1 != null){
            result = calk1.devision(a,b);
        }
        if (calk2 != null){
            result = calk2.devision(a,b);
        }
        return result;
    }
    //умножение
    public double multiplication (double a, double b){
        countOperation++;
        double result = 0;
        if (calk != null){
            result = calk.multiplication(a,b);
        }
        if (calk1 != null){
            result = calk1.multiplication(a,b);
        }
        if (calk2 != null){
            result = calk2.multiplication(a,b);
        }
        return result;
    }
    //вычитание
    public double subtraction (double a, double b){
        countOperation++;
        double result = 0;
        if (calk != null){
            result = calk.subtraction(a,b);
        }
        if (calk1 != null){
            result = calk1.subtraction(a,b);
        }
        if (calk2 != null){
            result = calk2.subtraction(a,b);
        }
        return result;
    }
    //сложение
    public double addition (double a, double b) {
        countOperation++;
        double result = 0;
        if (calk != null){
            result = calk.addition(a,b);
        }
        if (calk1 != null){
            result = calk1.addition(a,b);
        }
        if (calk2 != null){
            result = calk2.addition(a,b);
        }
        return result;
    }
    //Возведение в целую степень дробного положительного числа
    public double exponentiation (double a,int b){
        countOperation++;
        double result = 0;
        if (calk != null){
            result = calk.exponentiation(a,b);
        }
        if (calk1 != null){
            result = calk1.exponentiation(a,b);
        }
        if (calk2 != null){
            result = calk2.exponentiation(a,b);
        }
        return result;
    }
    // модуль числа
    public double module (double a){
        countOperation++;
        double result = 0;
        if (calk != null){
            result = calk.module(a);
        }
        if (calk1 != null){
            result = calk1.module(a);
        }
        if (calk2 != null){
            result = calk2.module(a);
        }
        return result;
    }
    // корень из числа
    public double sqrt (double a){
        countOperation++;
        double result = 0;
        if (calk != null){
            result = calk.sqrt(a);
        }
        if (calk1 != null){
            result = calk1.sqrt(a);
        }
        if (calk2 != null){
            result = calk2.sqrt(a);
        }
        return result;
    }




}
