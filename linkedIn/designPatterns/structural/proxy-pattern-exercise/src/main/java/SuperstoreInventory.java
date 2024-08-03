import java.util.ArrayList;

public class SuperstoreInventory implements Inventory {

  ArrayList<Item> inventory = new ArrayList<>();

  public SuperstoreInventory() {

  }

  public ArrayList<Item> getInventory() {
    return inventory;
  }

}
