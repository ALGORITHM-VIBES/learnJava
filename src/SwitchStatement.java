/*
 * @switch case - it is used to stated one case value.
 * @syntax: switch(value) { case 1: block code; break; default: block code; }
 * @note - you case use as many case you want.
 */
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        switch (age) {
            case 12:
                System.out.println("Hello, buddy!");
            break;

            case 13:
                System.out.println("Congo, for becoming teenager!");
            break;
            default:
                throw new AssertionError("Not have much information about it.");
        }
    }
}
