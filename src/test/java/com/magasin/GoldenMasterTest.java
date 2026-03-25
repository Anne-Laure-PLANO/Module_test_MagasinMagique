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
                (new Item("Pouvoirs magiques", 50, 50)),

                //La date de préremption est passée , le produit se dégrade 2fois plus vite
                (new Item("Comté", -1,3)),
                (new Item("Normal",-1,22)),
                (new Item("Kryptonite",-1,80)),
                (new Item("Pass Vip Concert",0,12)),
                (new Item("Pouvoirs magiques",-1,22)),

                //la qualité du produit ne peux ne pas être en négative
                (new Item("Comté",1,0)),
                (new Item("Normal",30,0)),
                (new Item("Kryptonite",100,0)),
                (new Item("Pass Vip Concert",4,0)),
                (new Item("Pouvoirs magiques",25,0)),

                //le produit comté augmente sa qualité plus le temps passe
                (new Item("Comté",30,50))


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
