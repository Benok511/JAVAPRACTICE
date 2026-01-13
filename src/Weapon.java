public class Weapon extends Item {
    private int multiplier;

    public Weapon(String name,int value, int weight, int multiplier) {
        super(name, value, weight);
        this.multiplier = multiplier;
    }

    @Override
    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public String toString(){
        return super.toString() + " multiplier=" + multiplier;
    }
}
