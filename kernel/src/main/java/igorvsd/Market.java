package igorvsd;

import java.util.Arrays;
import java.util.List;

public class Market {

    public List<Fruit> availableFruits() {
        return Arrays.asList(new Fruit("Apple2"), new Fruit("Orange"));
    }
}