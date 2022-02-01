package Lesson11kontrol.dto;

import Lesson11kontrol.dto.api.IProduct;

public final class StandartProdukt implements IProduct {
    private String name;
    private double price;

    public StandartProdukt(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", Цена - " + price;
    }
}
