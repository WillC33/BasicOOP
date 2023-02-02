import java.util.ArrayList;
import java.util.Scanner;

public class Bread extends BakedGoods implements YeastyRisings{
   private String shape;

   public Bread() {
       Scanner input = new Scanner(System.in);
       System.out.println("What is the bread?");
       setName(input.nextLine());
   }
   public void bake() {
        this.quantity += 6;
        risingTime();
        System.out.println("You now have " + this.quantity + " loaves");

    }

    public void setIngredients(ArrayList ingredients) {
        ingredients.add("flour");
        ingredients.add("salt");
        ingredients.add("yeast");
        ingredients.add("water");
    }

}
