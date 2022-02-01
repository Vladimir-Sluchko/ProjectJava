package Lesson11kontrol.dto;

import Lesson11kontrol.dto.api.IProduct;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<IProduct> products;

    public Shop(List<IProduct> product) {
        this.products = new ArrayList<>();
    }

    public void add (IProduct product){
        this.products.add(product);
    }

    public List<IProduct> getProducts() {
        return products;
    }

    public Bag creatBag(){
        return new Bag();
    }

    /*public Receipt createRecipt(Bag bag){
        List<String> rows = new ArrayList<>();
        //List<ProduktOnBag> produkts = bag.getProdukts();
       *//* for(ProduktOnBag produkt:produkts.toArray(new ProduktOnBag[0]))
        //return new Receipt();
        return null;
    }*/
}
