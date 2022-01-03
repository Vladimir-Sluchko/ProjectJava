//6. Создать класс CalculatorWithCounterAutoSuper.
//	6.1 Все методы и поля объявленные в данном классе НЕ статические (не имеют модификатор static).
//	6.2 Данный класс наследует класс CalculatorWithMathExtends.
//	6.3 Данный класс переопределяет все методы полученные в результате наследования и в этих методах должен быть
//	реализован механизм учёта их использования (учёт общий для всех методов класса),
//а вместо реализации математики при помощи ключевого слова super вызывает данный метод у родителя. Например вызвали
// метод plus(7, 3) который должен сложить два числа и вернуть результат сложения.
//Внутри метода plus() пишем реализацию учета, а после делаем вызов super.plus(7, 3). Использование super позволит
// вызвать реализацию из родительского класса.
//	6.4 В классе должен быть метод long getCountOperation() который должен возвращать количество использований данного
//	калькулятора. При вызове данного метода счётчик учёта не увеличивается.
//	6.5 Создать класс CalculatorWithCounterAutoSuperMain в котором будет точка входа (main метод). В main методе
//	требуется создать экземпляр калькулятора и используя методы из данного экземпляра
//посчитать выражения из задания 1. Вывести в консоль результаты посчитанных выражений и результат метода getCountOperation().
//Отлично, мы воспользовались наследованием и вроде получился красивый код. А теперь давайте подумаем, а если нам
// скажут что нам нужно создать такого наследника не только для CalculatorWithMathExtends
//но и для CalculatorWithOperator и CalculatorWithMathCopy..... и этот список нескончаем так как калькуляторы могут
// быть добавлены в проект в любом количестве и любым программистом. При добавлении нового
// калькулятора, который должен будет иметь функции по учёту количества использований, нам каждый раз нужно будет
// совершать подвиг (писать тот же код что и CalculatorWithCounterSuper) и это не то чтобы плохо,
//но отнимает большое количество времени, растёт количество классов которые нужно контролировать и тестировать.
// Это превращается в лавину!
//Давайте рассмотрим решение при помощи делегирования. Делегирование позволяет расширять функционал системы более гибко.
//Есть два вида делегирования: Композиция и Агрегация. Эти два способа имеют свои плюсы и минусы которые мы можем
// рассмотреть в задании ниже
//Но в нём нужно будет постоянно добавлять конструкторы для новых калькуляторов, менять код методов. Код станет
// сложнее (эту проблему мы решим дальше) но от лавины по количеству классов точно уйдём.
//Но это вы ощутите выполнив уже следующее задание
package calcs.additional;

import calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long countOperation;

    public long getCountOperation() {
        return countOperation;
    }

    public void incrementCountOperation(){
        countOperation++;
    }

    @Override
    public double exponentiation(double a, int b) {
        incrementCountOperation();
        return super.exponentiation(a, b);
    }

    @Override
    public double module(double a) {
        incrementCountOperation();
        return super.module(a);
    }

    @Override
    public double sqrt(double a) {
        incrementCountOperation();
        return super.sqrt(a);
    }

    @Override
    public double devision(double a, double b) {
        incrementCountOperation();
        return super.devision(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        incrementCountOperation();
        return super.multiplication(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        incrementCountOperation();
        return super.subtraction(a, b);
    }

    @Override
    public double addition(double a, double b) {
        incrementCountOperation();
        return super.addition(a, b);
    }
}
