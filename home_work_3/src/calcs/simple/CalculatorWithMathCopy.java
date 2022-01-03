//3. Создать класс CalculatorWithMathCopy.
//	3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//	3.2 В классе должны присутствовать математические методы:
//		3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		Скопировать базовые математические операции из CalculatorWithOperator.
//		3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//		Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
//	3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод). В main методе требуется
//	создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
package calcs.simple;

import calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    //деление
    public double devision (double a,double b){
        return a / b;
    }
    //умножение
    public double multiplication (double a, double b){
        return a * b;
    }
    //вычитание
    public double subtraction (double a, double b){
        return a - b;
    }
    //сложение
    public double addition (double a, double b) {
        return a + b;
    }
    //Возведение в целую степень дробного положительного числа
    public double exponentiation (double a,int b){
        return Math.pow(a,b);
    }
    // модуль числа
    public double module (double a){
        return Math.abs(a);
    }
    // корень из числа
    public double sqrt (double a){
        return Math.sqrt(a);
    }

}
