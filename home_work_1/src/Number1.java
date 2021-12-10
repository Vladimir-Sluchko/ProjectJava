import java.sql.SQLOutput;

public class Number1 {
    public static void main(String[] args) {
        // задание 1.1 побитовые операции с числами 42 и 15
        byte a = 42;    //a = 00101010
        byte b = 15;    //b = 00001111
        int c;
        System.out.println(~a);//~00101010 = 11010101
        System.out.println(~b);//~00001111 = 11110000
        System.out.println(a&b);//00101010 & 00001111 = 00001010
        System.out.println(a&=b);//00101010 &= 00001111 = 00001010 и присваивает полученное значение переменной a (a=00001010)
        a = 42;
        System.out.println(b&=a);//00001111 &= 00101010 = 00001010 и присваивает полученное значение переменной b (b=00001010)
        b = 15;
        System.out.println(a|b);//00101010 | 00001111 = 00101111
        System.out.println(a|=b);//00101010 |= 00001111 = 00101111 и присваивает полученное значение переменной a (a=00101111)
        a=42;
        System.out.println(b|=a);//00001111 |= 00101010 = 00101111 и присваивает полученное значение переменной b (b=00101111)
        b=15;
        System.out.println(a^b);//00101010 ^ 00001111 = 00100101
        System.out.println(a^=b);//00101010 ^= 00001111 = 00100101 и присваивает полученное значение переменной a (a=00100101)
        a=42;
        System.out.println(b^=a);//000011110 ^= 00101010 = 00100101 и присваивает полученное значение переменной b (b=00100101)
        b=15;
        System.out.println(a>>2);//00101010 >> 2 = 00001010
        System.out.println(b>>2);//00001111 >> 2 = 00000011
        System.out.println(a<<2);//00101010 << 2 = 10101000
        System.out.println(b<<2);//00001111 << 2 = 00001100
        System.out.println(a>>>3);//00101010 >>> 3 = 00000101
        System.out.println(b>>>3);//00001111 >>> 3 = 00000001

        // задание 1.2 побитовые операции с числами -42 и -15
        byte x = -42;    //x = 11010110
        byte y = -15;    //y = 11110001
        System.out.println(~x);//~11010110 = 00101001

        System.out.println(~y);//~11110001 = 00001110
        System.out.println(x&y);//11010110 & 11110001 = 11010000
        System.out.println(x|y);//11010110 | 11110001 = 11110111
        System.out.println(x^y);//11010110 ^ 11110001 = 00100111
        System.out.println(x>>2);//11010110 >> 2 = 11110101
        System.out.println(y>>2);//11110001 >> 2 = 11111100
        System.out.println(x<<2);//11010110 << 2 = 01011000
        System.out.println(y<<2);//11110001 << 2 = 11000100
        System.out.println(x>>>3);//11010110 >>> 3 = 11111010
        System.out.println(y>>>3);//11110001 >>> 3 = 11111110

        // задание 1.4 побитовые операции с числами -42 и -15
        //double l =42.5;
        // System.out.println(~l);
        // java: bad operand type double for unary operator '~'
        // побитовые операторы работают только с целыми числами



    }
}
