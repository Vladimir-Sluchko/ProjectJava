package Lesson5.visible.dto;

public class PhonePrivate {
    private  String brand;
    private  String serial;
    private  String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (this.brand == null){
            this.brand = brand;
        }
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
