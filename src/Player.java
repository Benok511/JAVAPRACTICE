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


    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
         if (money < 0){
             throw new IllegalArgumentException("Money must be positive!");
         }
         this.money = money;
    }

    public void pickUp(Item item){
        if(inventory.getWeight() + item.getWeight() > getStrength()){
            throw new IllegalArgumentException("You are not strong enough to carry this item");
        }
        inventory.addItem(item);
    }

    public void dropItem(int index){
        if(index < 0 || index > inventory.length() - 1){
            throw new IndexOutOfBoundsException("Not valid cell in inventory");
        }
        inventory.removeItem(index);
    }

    public void buyStats(String stat,int amount){
        if (!stat.equals("health")  && !stat.equals("strength")  && !stat.equals("speed") ){
            throw new IllegalArgumentException( "That is not a valid stat!");
        }

        if (amount < 0){
            throw new IllegalArgumentException("amount must be positive");
        }

        if (amount > getMoney()){
            throw new IllegalArgumentException("You don't have enough money!");

        }

        setMoney(getMoney() - amount);

        if (stat.equals("health")){

            setHealth(getHealth() + amount);
            System.out.println("You purchased " + amount + " " + stat + ". You now have " + getHealth() + " " + stat);

        } else if (stat.equals("strength")){

            setStrength(getStrength() + amount);
            System.out.println("You purchased " + amount + " " + stat + ". You now have " + getStrength() + " " + stat);

        } else{

            setSpeed(getSpeed() + amount);
            System.out.println("You purchased " + amount + " " + stat + ". You now have " + getSpeed() + " " + stat);
        }
    }




}
