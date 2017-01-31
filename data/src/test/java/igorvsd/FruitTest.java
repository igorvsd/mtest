package igorvsd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FruitTest {

    @Test
    public void fruitMe() {
        // setup

        // act
        Fruit langan = new Fruit("Langan");
        String name = langan.getName();

        // verify
        assertThat(name, is("Langan3"));
    }
}