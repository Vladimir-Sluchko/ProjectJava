package Lesson5.visible;

public class VisibleMain1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "Xiaomi";
        setSerialNumber(phone1);
        setModel(phone1);
        System.out.println("Brand " + phone1.brand);
        System.out.println("Serial " + phone1.serial);
        System.out.println("Model " + phone1.model);

    }
    public static void setSerialNumber(Phone phone){
        phone.brand = "000001";
    }
    public static void setModel(Phone phone){
        phone.model = "A2";
    }
}
