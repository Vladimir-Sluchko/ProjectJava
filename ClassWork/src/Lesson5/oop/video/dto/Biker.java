package Lesson5.oop.video.dto;

public class Biker implements IHuman {
    public String getName(){
        return "Анатолий";
    }

    @Override
    public void setName(String firstName) {

    }

    @Override
    public int getAge() {
        return 50;
    }

    @Override
    public void setAge(int age) {

    }

    @Override
    public int getTeethCount() {
        return 32;
    }

    @Override
    public void setTeethCount(int teethCount) {

    }

}
