package JavaStart.ObjectPrograming1.Barman;

public class BarmanTest {
    public static void main(String[] args) {
        Drink drink = Barman.createDrink(new Ingredient("Vodka",200),new Ingredient("Milk",200),
                new Ingredient("Syrup",50));
        Barman.printDrink(drink);
    }
}
