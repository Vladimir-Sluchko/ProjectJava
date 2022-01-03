//2. Создать класс CalculatorWithOperator.
//	2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//	2.2 В классе должны присутствовать математические методы:
//		2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение) каждый из этих методов должен
//		принимать два параметра (определитесь с их типами) и должны возвращать результат (определиться с возвращаемым
//		типом результата) при помощи ключевого слово return.
//		2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа).
//	2.3 В методах можно использовать любые арифметические операторы.
//	2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня). Если у Вас плохо с математикой, то для
//	реализации метода "Квадратный корень из числа" можно воспользоваться библиотекой Math.
//	2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод). В main методе требуется
//	создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести
//	в консоль результат.
package calcs.simple;

import calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
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
    public double exponentiation (double a, int b){
        double result = a;
        if (b > 0){
            while (b > 1){
                result *= a;
                b--;
            }
        }
        if (b < 0) {
            b *= -1;
            while (b > 1){
                result *= a;
                b--;
            }
            result = 1 / result;
        }
        if ( b == 0){
            result = 1;
        }
        return result;
    }
    // модуль числа
    public double module (double a){
        return (a < 0) ? -a : a;
    }
    // квадратный корень из числа
    public double sqrt (double a){
        return Math.sqrt(a);
    }


}
