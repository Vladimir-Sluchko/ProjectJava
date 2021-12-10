public class Number2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        System.out.println(5 + 2 / 8);//при устном счете получаем 5.25 в среде разработки int целочисленное значение следовательно 2/8=0 , 5 + 0 = 5
        System.out.println((5 + 2) / 8);//при устном счете получаем 0.875 в среде разработки int целочисленное значение следовательно 5+2=7 , 7/8 = 0
        System.out.println((5 + b++) / 8);//в расчет берется значение b=2, 5 + 2 = 7, а 7/8 = 0, значению b присвается 3 (b=3);
        b = 2;
        System.out.println((5 + b++) / --a);// результат деления 7 / 7 = 1
        a = 8;
        b = 2;
        System.out.println((5 * 2 >> b++) / --a);// умножение по приоритету выше, следовательно 5*2=10, (00001010)>>2 =(00000010) что в десятичной системе равно 2, 2/7=0
        a = 8;
        b = 2;
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a);// первоочередно выполняется 22 * 2 = 44, и 5 + 7 = 12, выражение примет вид 12>20?68:44>>2/7 далее считается сдвиг числа 44
        // (в двоичной системе 44 записывается (00101100)) после сдвига получается 00001011  в десятичной системе 11. выражение примет вид (12>20?68:11)/7, если 12>20 то для вычисления берем 68
        // иначе для вычисления берем 11, в нашем случае выражение примет вид 11/7 = 1
        a = 8;
        b = 2;

        // System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --a);
        // java: bad operand types for binary operator '/'
        // first type:  java.lang.Object&java.io.Serializable&java.lang.Comparable<? extends java.lang.Object&java.io.Serializable&java.lang.Comparable<?>>
        // second type: int
        // выражение 68 >= 68 дает логическую переменную. Разные типы операндов
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119);// упрощенное выражение выглядит 4>3 && 144<=119. 4>3 дает true а 144<=119 дает false. Выражение true && false  выдаст false.
        System.out.println(true && false);// Оператор && всегда проверяется значение обоих операндов, является логическим оператором. Ответ false
    }
}
