public class Item {
    private String name;
    private int value;
    private int weight;

    public Item(String name, int value, int weight) {
        this.name = name;
        this.value = value;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Have to add getMultiplier method to superclass since i declared equipped in character
    //as an item but my logic uses
    public int getMultiplier() {
        return 1;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", value=" + value + ", weight=" + weight;
    }


}
