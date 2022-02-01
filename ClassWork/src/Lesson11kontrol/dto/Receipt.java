package Lesson11kontrol.dto;

import java.util.List;

public class Receipt {
    private List<String> rows;
    private double sum;

    public Receipt(List<String> rows, double sum) {
        this.rows = rows;
        this.sum = sum;
    }
}
