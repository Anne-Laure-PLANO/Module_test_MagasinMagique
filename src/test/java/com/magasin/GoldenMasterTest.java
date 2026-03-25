package com.magasin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GoldenMasterTest {

    private Item[] items;


    // création d'une liste d'ensemble de cas possibles à tester
    @BeforeEach
    void setUp() {
        items = new Item[]{
                (new Item("Comté", 10, 10)),
                (new Item("Normal", 30, 50)),
                (new Item("Kryptonite", 100, 80)),
                (new Item("Pass VIP Concert", 20, 25)),
                (new Item("Pouvoirs magiques", 50, 50))
        };
    }


    @Test
    void goldenMaster() {
        Magasin market = new Magasin(items);
        market.updateQuality();

        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
