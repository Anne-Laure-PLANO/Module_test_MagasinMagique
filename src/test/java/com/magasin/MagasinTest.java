package com.magasin;

import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void testGoldenMaster() {
        Item[] items = new Item[]{
                new Item("Comté", 10, 10),
                new Item("Normal", 30, 50),
                new Item("Kryptonite", 100, 80),
                new Item("Pass VIP Concert", 20, 25),
                new Item("Pouvoirs magiques", 50, 50)
        };

        Magasin app = new Magasin(items);

        StringBuilder result = new StringBuilder();

        for (int day = 0; day < 10; day++) {
            result.append(Arrays.toString(items)).append("\n");
            app.updateQuality();
            System.out.println(result.toString());
        }

    }

    @Test
    void foo() {
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
}


