package igorvsd;

import java.util.Arrays;
import java.util.List;

public class Market {

    public List<Fruit> availableFruits() {
        return Arrays.asList(new Fruit("Apple"), new Fruit("Orange"));
    }
}