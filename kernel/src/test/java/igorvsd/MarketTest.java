package igorvsd;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarketTest {

    @Test
    public void availableFruits_has2Items() throws Exception {
        assertThat(new Market().availableFruits().size(), is(2));
    }
}