//1.5. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке
// (динозаврика рисовать не надо): https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
package loops;

public class Number1_5 {
    public static void main(String[] args) {
        int k;
        for (int i = 1; i <= 10; i++){
            String s = " ";
            for (int j = 2; j <= 5; j++){
                k = i * j;
                if (i < 10 && k < 10){
                    System.out.print(j + " *  " + i + " =  " + k + " | ");
                }else {
                    if (i < 10) {
                        System.out.print(j + " *  " + i + " = " + k + " | ");
                    } else{
                        System.out.print(j + " * " + i + " = " + k + " | ");
                    }

                }
            }
            System.out.println(" ");
        }
        System.out.println("-------------------------------------------------------");
        for (int i = 1; i <= 10; i++){
            String s = " ";
            for (int j = 6; j <= 9; j++){
                k = i * j;
                if (i < 10 && k < 10){
                    System.out.print(j + " *  " + i + " =  " + k + " | ");
                }else {
                    if (i < 10) {
                        System.out.print(j + " *  " + i + " = " + k + " | ");
                    } else{
                        System.out.print(j + " * " + i + " = " + k + " | ");
                    }

                }
            }
            System.out.println(" ");
        }
    }
}
