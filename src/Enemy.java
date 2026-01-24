public class Enemy extends Character {
    private String stat;
    private int statAmount;

    public Enemy(String name,int health,int strength, int speed, String stat,int statAmount){
        super(name,health,strength,speed);
        if (!stat.equals("health") && !stat.equals("strenght") && !stat.equals("speed")){
            throw new IllegalArgumentException("stat must be a valid stat of a character - (health,speed,strength)");

        }
        if (statAmount < 0){
            throw new IllegalArgumentException("statAmount must be a positive int!");
        }
        this.stat = stat;
        this.statAmount = statAmount;
    }

    public String getStat(){
        return stat;
    }
    public int getStatAmount(){
        return statAmount;
    }

}
