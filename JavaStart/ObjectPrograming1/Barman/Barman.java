package JavaStart.ObjectPrograming1.Barman;
public class Barman {
    public static Drink createDrink(Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3){
        return new Drink(ingredient1,ingredient2,ingredient3);
    }
    public static void printDrink(Drink drink){
        System.out.printf("Składniki drinka to %s %s %s w proporcjach %d, %d, %d, jego pojemność to: %d ml",drink.getIngredient1().getName(),drink.getIngredient2().getName(),
        drink.getIngredient3().getName(),drink.getIngredient1().getAmount(),drink.getIngredient2().getAmount(),drink.getIngredient3().getAmount(),
                (drink.getIngredient1().getAmount()+drink.getIngredient2().getAmount()+drink.getIngredient3().getAmount()));
    }
}
