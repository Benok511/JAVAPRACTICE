public class Character {
    private String name;
    private int health;
    private int strength;
    private int speed;
    private Item equipped = null;

    public Character(String name, int health, int strength, int speed) {
        if (health < 0){
            throw new IllegalArgumentException("Health must be positive");
        }
        if (strength < 0){
            throw new IllegalArgumentException("Strength must be positive");
        }
        if (speed < 0){
            throw new IllegalArgumentException("speed must be positive");
        }

        this.name = name;
        this.health = health;
        this.strength = strength;
        this.speed = speed;
        this.equipped = null;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public Item getEquipped() {
        return equipped;
    }
    public void setEquipped(Item equipped) {
        this.equipped = equipped;
    }

    @Override
    public String toString() {
        return "name=" + name + ", health=" + health + ", strength=" + strength + ", speed=" + speed;
    }

    public void equip(Item item) {
        equipped = item;
    }

    public void unequip() {
        equipped = null;
    }

    public Item getEquippedItem() {
        return equipped;
    }

    public boolean isDead(){
        return health <= 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if  (health <= 0) {
            health = 0;
        }
    }

    public int getDamage() {
        if (equipped == null || !(equipped instanceof Weapon) ){
            return strength;
        }
        else{
            return strength * equipped.getMultiplier();
        }
    }
}
