import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private List<gameObject> inventory;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<gameObject>();
    }
    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " recibiste " + damage + " daño. Tus vidas son: " + health);
    }
    public void colleccion (gameObject object) {
        inventory.add(object);
        System.out.println(name + " encontraste " + object.getName() + ".");
    }
    public boolean vidas(){
        return health > 0;
    }
    public void showStatus(){
        System.out.println(name + " tienes " + health + " vidas");
    }

}
