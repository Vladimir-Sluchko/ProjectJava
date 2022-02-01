package Lesson11kontrol.dto;

import Lesson11kontrol.dto.api.IProduct;

public class DamageProdukt implements IProduct {
    private String name;
    private double price;
    private double discount;
    private String description;

    public DamageProdukt(String name, double price, double discont, String description) {
        this.name = name;
        this.price = price;
        this.discount = discont;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + ", Цена - " + price + ", Скидка - " + discount + "%, Уценка - " + description;
    }
}
