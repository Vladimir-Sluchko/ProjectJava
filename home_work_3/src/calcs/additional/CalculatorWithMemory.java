//10*. Создать CalculatorWithMemory.
//	10.1 Данный калькулятор предназначен для того чтобы расширить возможности калькулятора и обеспечить его
//	дополнительной функцией памяти. В принципе работает как калькулятор из реальной жизни.
//	10.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//	10.3 Данный класс напрямую не умеет считать математику.
//	10.4 В классе должны присутствовать математические методы:
//		10.4.1 4 базовых математических метода (деление, умножение, вычитание, сложение).
//		10.4.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа).
//	10.5 Функция памяти работает через методы:
//		10.5.1 Записать в память результат выполнения последнего вызванного метода. У данного метода не должно быть
//		 параметров. Данный метод вызывается непосредтвенно пользователем, а не автоматический.
//		10.5.2 Получить из памяти записанное значение. При получении записи из памяти память стирается, при записи
//		нового значения память перезаписывается. Данный метод вызывается непосредтвенно пользователем, а не автоматический.
//	10.6 Создать класс CalculatorWithMemoryMain в котором будет точка входа (main метод). В main методе требуется
//	создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в
//	консоль результат. В мэйне запрещается использование переменных для хранения значений участвующих в просчёте, а также
//	результатов работы методов калькулятора, можно использовать только литералы и метод получения из памяти записанного
//	значения.
package calcs.additional;

import calcs.api.ICalculator;
import calcs.api.ICalculatorWithMemory;
import calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemory implements ICalculator, ICalculatorWithMemory {
    private ICalculator calk;
    private double result = 0;
    private double res = 0;
    public CalculatorWithMemory(CalculatorWithOperator calk){
        this.calk=calk;
    }

    @Override
    public double devision(double a, double b) {
        res = calk.devision(a,b);
        return res;
    }

    @Override
    public double multiplication(double a, double b) {
        res = calk.multiplication(a,b);
        return res;
    }

    @Override
    public double subtraction(double a, double b) {
        res = calk.subtraction(a,b);
        return res;
    }

    @Override
    public double addition(double a, double b) {
        res = calk.addition(a,b);
        return res;
    }

    @Override
    public double exponentiation(double a, int b) {
        res = calk.exponentiation(a,b);
        return res;
    }

    @Override
    public double module(double a) {
        res = calk.module(a);
        return res;
    }

    @Override
    public double sqrt(double a) {
        res = calk.sqrt(a);
        return res;
    }
    public double getMemory() {
        return result;
    }
    public void setMemory(){
        this.result = res;
    }
}
