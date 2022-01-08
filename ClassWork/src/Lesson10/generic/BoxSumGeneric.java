package Lesson10.generic;

public class BoxSumGeneric<T extends Number> {
    private double data;

    public double getData() {
        return data;
    }

    public void addData(Number data) {
        this.data = data.doubleValue();
    }

}
