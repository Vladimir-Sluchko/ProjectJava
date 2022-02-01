package Lesson11kontrol.dto;

import Lesson11kontrol.dto.api.IProduct;

public class ProduktOnBag {
    private IProduct produkt;
    private int count;

    public ProduktOnBag(IProduct produkt, int count) {
        this.produkt = produkt;
        this.count = count;
    }

    public IProduct getProdukt() {
        return produkt;
    }

    public int getCount() {
        return count;
    }

}
