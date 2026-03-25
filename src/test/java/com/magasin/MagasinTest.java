package com.magasin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

@Test
void Kryptonite_TestDatePeremption_PasDeChangement() {
    Item[] items = new Item[]{
            new Item("Kryptonite", 0, 80)
    };
    Magasin app = new Magasin(items);

    app.updateQuality();

    assertEquals(0, items[0].sellIn);
    assertEquals(80, items[0].quality);
}
    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }


}
