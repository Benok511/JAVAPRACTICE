public class Player extends Character {
    private int money;
    private Inventory inventory;

    public Player(String name,int health,int strength,int speed,int money){
        super(name,health,strength,speed);
        if (money < 0){
            throw new IllegalArgumentException("Money must be positive");
        }
        this.money = money;
        this.inventory = new Inventory();
    }

    @Override
    public String toString(){
        String strMoney = Integer.toString(money);
        String strInventory = Integer.toString(inventory.length());
        return "Player | "+ super.toString() + " Money:" + strMoney  + " Inventory:" + strInventory;
    }
}
