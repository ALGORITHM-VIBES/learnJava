/*
 * @input - get any data from console.
 * @syntax  - Scanner scanner = new Scanner(System.in);
 * Scanner, Basically an java inbuild library module/class which use to interact with user console inputs.
 * There are more methods in 'Scanner' Class that you obviously want to explore
 */

import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an number: ");
        int number = scanner.nextInt();

        System.out.print("You Entered: ");
        System.out.println(number);
    }
}
