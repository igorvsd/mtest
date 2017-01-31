package igorvsd;

public class Fruit {

    private String name;

    public Fruit(String name) {
        this.name = name + "3";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}