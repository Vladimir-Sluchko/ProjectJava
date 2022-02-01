package Lesson11kontrol.dto;

import Lesson11kontrol.dto.api.IProduct;

public class DiscountProdukt implements IProduct {
    private String name;
    private double price;
    private double discount;




    @Override
    public String toString() {
        return name + ", Цена - " + price + ", Скидка - " + discount + "%";
    }
}
