/*
 * @nestedif - it like inside a statements of statement.
 * @syntax - if(condition) { if() { } else if() { } else { } } else if(condition) { else if block code } else { else block code }.
 */
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defaultSalary = 750;

        System.out.print("Enter your salary: ");
        int salary = scanner.nextInt();

        if(salary >= defaultSalary) {
            System.out.println("Congo, You are eligible to take loan!");
            if(salary >= 1000) {
                System.out.println("You can get upto 60000$ loan!");
            } else if(salary < 1000) {
                System.out.println("You can get upto 20000$ loan!");
            }
        } else if(salary < defaultSalary) {
            System.out.println("Ohho, You are not eligible to take loan!");
            System.out.print("You Should have at least monthly salary of: ");
            System.out.println(defaultSalary);
        }
        
        scanner.close();
    }
}
