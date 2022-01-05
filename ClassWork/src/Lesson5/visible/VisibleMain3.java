package Lesson5.visible;

import Lesson5.visible.dto.PhonePrivate;
import Lesson5.visible.dto.SmartPhone;

public class VisibleMain3 {
    public static void main(String[] args) {
        SmartPhone phone1 = new SmartPhone();
        phone1.setBrand("Xiaomi");

        setSerialNumber(phone1);
        setModel(phone1);

        System.out.println("Brand " + phone1.getBrand());
        System.out.println("Serial " + phone1.getSerial());
        System.out.println("Model " + phone1.getModel());

    }
    public static void setSerialNumber(SmartPhone phone){
        phone.setSerial("000001");
    }
    public static void setModel(SmartPhone phone){
        phone.setModel("A2");
    }
}
