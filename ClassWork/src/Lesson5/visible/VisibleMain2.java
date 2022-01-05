package Lesson5.visible;

import Lesson5.visible.dto.PhonePrivate;

public class VisibleMain2 {
    public static void main(String[] args) {
        PhonePrivate phone1 = new PhonePrivate();
        phone1.setBrand("Xiaomi");

        setSerialNumber(phone1);
        setModel(phone1);

        System.out.println("Brand " + phone1.getBrand());
        System.out.println("Serial " + phone1.getSerial());
        System.out.println("Model " + phone1.getModel());

    }
    public static void setSerialNumber(PhonePrivate phone){
        phone.setSerial("000001");
    }
    public static void setModel(PhonePrivate phone){
        phone.setModel("A2");
    }
}
