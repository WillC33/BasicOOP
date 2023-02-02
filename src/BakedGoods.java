import java.util.ArrayList;

public class BakedGoods {

    private String name;
    int quantity;
    private ArrayList ingredients = new ArrayList<String>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void bake() {
        this.quantity = 20;

    }

    public void sell(int quantitySold) {
        quantity -= quantitySold;
        System.out.println("You have " + this.quantity  + " " + this.name + " left...");
        if (quantity == 0) {
            eightySix();
        }
    }

    private void eightySix() {
        System.out.println("86 the " + this.name);
    }
}
