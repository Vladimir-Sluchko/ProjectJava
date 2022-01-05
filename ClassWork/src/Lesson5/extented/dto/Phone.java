package Lesson5.extented.dto;

public class Phone {
    private final String brang;

    public Phone(){
        this.brang = "DEFAULT";
    }
    public String getBrang() {
        return brang;
    }

    public Phone(String brang) {
        this.brang = brang;
    }
}
