import java.util.ArrayList;
public class Inventory {
    private ArrayList<Item> items;
    private int weight;

    public Inventory() {
        this.items = new ArrayList<>();
        this.weight = 0;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        for (Item item : items){
            output.append(item.toString()).append("\n");
        }

        output.append("Weight: ");
        output.append(weight);

        return output.toString();

    }

    public int getWeight(){

        return this.weight;
    }

    public Item getItem(int index){

        return items.get(index);
    }

    public void addItem(Item item){
            this.items.add(item);
            this.weight += item.getWeight();
    }

    public Item removeItem(int index){
        Item item = items.get(index);
        items.remove(index);
        this.weight -= item.getWeight();
        return item;
    }
    
    public int length(){
        return items.size();
    }


}
