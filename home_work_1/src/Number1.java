public class Number1 {
    public static void main(String[] args) {
        byte a = 42;    //a = 00101010
        byte b = 15;    //b = 00001111
        int c;
        System.out.println(~a);//~00101010 = 11010101
        System.out.println(~b);//~00001111 = 11110000
        System.out.println(String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0')); //вывод числа a = 42 в двоичной системе (8 бит)
        System.out.println(String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0')); //вывод числа b = 15 в двоичной системе (8 бит)
        c = ~a;
        System.out.println(String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'));//00101010 $ 00001111 = 00001010
        System.out.println(String.format("%8s", Integer.toBinaryString(~b)).replace(' ', '0'));//00101010 $ 00001111 = 00001010
        System.out.println(Integer.toBinaryString(b));
        System.out.println(~b);



    }
}
