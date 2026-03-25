package com.magasin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {



    @Test
    void comte_testDatePeremption_doitRester50 (){
        Item[] product = new Item[]{new Item("Comté", 0, 50)};
        Magasin app = new Magasin(product);
        app.updateQuality();
        assertEquals(50, product[0].quality);
    }

    @Test
    void comte_testAugmentationValeur_augmenteeDe1 (){
        Item[] product = new Item[]{new Item("Comté", 5, 25)};
        Magasin app = new Magasin(product);
        app.updateQuality();
        assertEquals(26, product[0].quality);
    }

    @Test
    void comte_testAugmentationValeurSellInNeg_augmenteeDe2 (){
        Item[] product = new Item[]{new Item("Comté", -1, 25)};
        Magasin app = new Magasin(product);
        app.updateQuality();
        assertEquals(27, product[0].quality);
    }



    @Test
    void defaut_testPerteValeur_descendueDe1 (){
        Item[] product = new Item[]{new Item("Normal", 5, 25)};
        Magasin app = new Magasin(product);
        app.updateQuality();
        assertEquals(24, product[0].quality);
    }

    @Test
    void defaut_testPerteValeurSellInNeg_descendueDe2 (){
        Item[] product = new Item[]{new Item("Normal", -1, 25)};
        Magasin app = new Magasin(product);
        app.updateQuality();
        assertEquals(23, product[0].quality);
    }

    @Test
    void defaut_testPerteValeurSiQualite0_reste0 (){
        Item[] product = new Item[]{new Item("Normal", 5, 0)};
        Magasin app = new Magasin(product);
        app.updateQuality();
        assertEquals(0, product[0].quality);
    }


    @Test
    void passVIPConcert_testPerteValeurSiSellInInfA0_resultat0 (){
        Item[] product = new Item[]{new Item("Pass VIP Concert", -1, 0)};
        Magasin app = new Magasin(product);
        app.updateQuality();
        assertEquals(0, product[0].quality);
    }

    @Test
    void passVIPConcert_testAugmentationValeurSiSellSupA10_resultat6 (){
        Item[] product = new Item[]{new Item("Pass VIP Concert", 15, 5)};
        Magasin app = new Magasin(product);
        app.updateQuality();
        assertEquals(6, product[0].quality);
    }

    @Test
    void passVIPConcert_testAugmentationValeurSiSellA8_resultat7 (){
        Item[] product = new Item[]{new Item("Pass VIP Concert", 8, 5)};
        Magasin app = new Magasin(product);
        app.updateQuality();
        assertEquals(7, product[0].quality);
    }

    @Test
    void passVIPConcert_testAugmentationValeurSiSellA4_resultat8 (){
        Item[] product = new Item[]{new Item("Pass VIP Concert", 4, 5)};
        Magasin app = new Magasin(product);
        app.updateQuality();
        assertEquals(8, product[0].quality);
    }

//    @Test
//    void foo() {
//        Item[] items = new Item[] { new Item("foo", 0, 0) };
//        Magasin app = new Magasin(items);
//        app.updateQuality();
//        assertEquals("foo", app.items[0].name);
//    }

}
