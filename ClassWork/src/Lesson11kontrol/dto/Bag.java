package Lesson11kontrol.dto;

import Lesson11kontrol.dto.api.IProduct;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<ProduktOnBag> produkts;

    public Bag() {
        this.produkts = new ArrayList<>();
    }

    public void add(IProduct produkt, int count){
        add(new ProduktOnBag(produkt,count));

    }
    public void add(ProduktOnBag produktOnBag){
        if(produktOnBag.getCount() < 99){
            produkts.add(produktOnBag);
        }

    }

    public Iterable<ProduktOnBag> getProdukts() {
        return produkts;
    }
}
