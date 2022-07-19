package JavaStart.ArraysAndControls.Barmanv2;

import java.util.Scanner;

public class BarmanTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Z ilu składników ma składać się drink?");
        int x = scanner.nextInt();
        Barman barman = new Barman();
        barman.printDrink(barman.createDrink(x));
    }
}
