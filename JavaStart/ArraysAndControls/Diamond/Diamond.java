package JavaStart.ArraysAndControls.Diamond;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Z ilu gwiazdek ma składać się bok rombu");
        int stars = scanner.nextInt();

        for (int i = stars; i > 0 ; i--){
            for(int x = i ; x > 0 ; x--){
                System.out.print(" ");
            }
            for (int y = stars; y > 0; y--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
