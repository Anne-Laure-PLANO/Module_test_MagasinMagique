package com.magasin;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {


// création d'un golden Master : ensemble de cas possibles à tester
    @BeforeEach
    void setUp(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Comté",10,10));
        items.add(new Item("Normal", 30, 50));
        items.add(new Item("Kryptonite", 100, 80));
        items.add(new Item("Pass VIP Concert", 20, 25));
        items.add(new Item("Pouvoirs magiques", 50, 50));
    }


    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

}
