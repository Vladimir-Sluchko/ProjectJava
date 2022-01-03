//9. Создать класс CalculatorWithCounterAutoAgregationInterface.
//	9.1 Внутри класса нельзя создавать объекты (использовать new), можно пользоваться только тем что передал вам
//	пользователь вашего класса.
//	9.2 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//	9.3 В данном классе должен быть только конструктор принимающий объект типа ICalculator
//	9.4 Данный класс напрямую не умеет считать математику, он умеет делегировать расчёт математики другим
//	калькуляторам переданным в конструктор
//	9.5 В классе должны присутствовать все методы объявленные в интерфейсе.
//	9.6 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного
//	калькулятора. При вызове данного метода счётчик учёта не увеличивается.
//	9.7 Создать класс CalculatorWithCounterAutoCompositeInterfaceMain в котором будет точка входа (main метод).
//	В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать
//	выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
package calcs.additional;

import calcs.api.ICalculator;
import calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {
    private long countOperation;
    private ICalculator calk;
    public CalculatorWithCounterAutoAgregationInterface(ICalculator calk){
        this.calk = calk;
    }
    public long getCountOperation(){
        return countOperation;
    }

    @Override
    public double devision(double a, double b) {
        countOperation++;
        return calk.devision(a,b);
    }

    @Override
    public double multiplication(double a, double b) {
        countOperation++;
        return calk.multiplication(a,b);
    }

    @Override
    public double subtraction(double a, double b) {
        countOperation++;
        return calk.subtraction(a,b);
    }

    @Override
    public double addition(double a, double b) {
        countOperation++;
        return calk.addition(a,b);
    }

    @Override
    public double exponentiation(double a, int b) {
        countOperation++;
        return calk.exponentiation(a,b);
    }

    @Override
    public double module(double a) {
        countOperation++;
        return calk.module(a);
    }

    @Override
    public double sqrt(double a) {
        countOperation++;
        return calk.sqrt(a);
    }
}
