//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Character p = new Character("Ben",100,100,100);
        System.out.println(p);
        System.out.println(p.getDamage());

        Weapon sword = new Weapon("Sword",100,100,2);
        System.out.println(sword);
        p.equip(sword);
        System.out.println(p);
        System.out.println(p.getDamage());
        System.out.println(p.getDamage());


    }
}