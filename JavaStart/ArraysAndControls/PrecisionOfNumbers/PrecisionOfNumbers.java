package JavaStart.ArraysAndControls.PrecisionOfNumbers;

import java.util.Scanner;
public class PrecisionOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe całkowitą różną od zera");
        float a = scanner.nextFloat();

        if (a > 0) {
            for (float x = 0; x <= a + 0.1; x += 0.1) {
                System.out.printf("%.1f\n", x);
            }
        } else if (a < 0) {
            for (float x = 0; x >= a - 0.1; x -= 0.1) {
                System.out.printf("%.1f\n", x);
            }
        }
    }
}
