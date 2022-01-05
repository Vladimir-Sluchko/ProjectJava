package Lesson5.oop.video.dto;

public class Man extends Human1 {
    int hairLength;

    public int getHairLength() {
        return hairLength;
    }

    public void setHairLength(int hairLength) {
        this.hairLength = hairLength;
    }
    public void grow(){
        hairLength = hairLength +1;
    }

}
