/*
 * @input - get any data from console.
 * @syntax  - Scanner scanner = new Scanner(System.in);
 * Scanner, Basically an java inbuild library module/class which use to interact with user console inputs.
 * There are more methods in 'Scanner' Class that you obviously want to explore
 * @note - don't Forget to close scanner once you done working with it.
 */

import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.print("You Entered: ");
        System.out.println(number);
    }
}
