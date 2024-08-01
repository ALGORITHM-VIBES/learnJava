/*
 * @operators   - == equal to.
 *              - != not equal to.
 *              - > greater than.
 *              - < less than.
 *              - >= greater than or equal to.
 *              - <= less than or equal to.
 */
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        
        if(age <= 5) {
            System.out.println("Hey, cutie!");
        } else if (age < 13) {
            System.out.println("Hi, Kid please bring your parents!");
        } else if(age == 13) {
            System.out.println("Just turned 13??");
        } else if(age > 13 && age <= 17) {
            System.out.println("Hi, teenager!");
        } else if(age >= 18) {
            System.out.println("Hello, adult!");
        }

        scanner.close();
    }
}
