package Lesson11kontrol.service;

import Lesson11kontrol.dto.Bag;
import Lesson11kontrol.dto.ProduktOnBag;
import Lesson11kontrol.dto.StandartProdukt;
import Lesson5.oop.video.dto.A;

import java.util.ArrayList;
import java.util.List;

public class WorkService1 {
    public void run(){
       /* List<StandartProdukt> data = new ArrayList<>();
        data.add(new StandartProdukt("Молоко", 2.45));
        data.add(new StandartProdukt("Молоко", 2.45));
        data.add(new StandartProdukt("Молоко", 2.45));
        data.add(new StandartProdukt("Молоко", 2.45));

        List<ProduktOnBag> data2 = new ArrayList<>();
        //data2.add(new ProduktOnBag(new StandartProdukt("Молоко",2.45),15));
        StandartProdukt produkt = new StandartProdukt("Молоко", 2.45);
        ProduktOnBag produktOnBag = new ProduktOnBag(produkt,15);
        data2.add(produktOnBag);*/
        Bag bag = new Bag();
        bag.add(new StandartProdukt("Молоко",2.45),5);
        System.out.println(bag.getProdukts());

    }
}
