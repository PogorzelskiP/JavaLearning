package JavaStart.ArraysAndControls.Barmanv2;

import java.util.Scanner;

public class Barman {
    Scanner scanner = new Scanner(System.in);
    public Drink createDrink(int howManyIngredients) {
        Ingredient[] ingredients = new Ingredient[howManyIngredients];
        for (int i = 0; i < ingredients.length; i++) {
            ingredients[i] = new Ingredient();
            System.out.println("Wprowadź nazwę składnika:");
            ingredients[i].setName(scanner.nextLine());
            System.out.println("Wprowadź ilość: ");
            ingredients[i].setVolume(scanner.nextLine());
        }
        return new Drink(ingredients);
    }
    public void printDrink(Drink drink) {
        System.out.println("Drink składa się z " + drink.getIngredients().length + " składników:");
        for (Ingredient ingredient : drink.getIngredients()
        ) {
            System.out.println("- " + ingredient.getName() + " (" + ingredient.getVolume() + ")");
        }
    }
}
