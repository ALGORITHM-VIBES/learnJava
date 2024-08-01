/*
 * @if - it used to check whether condition is true or flase if true it will run it's block code.
 * @syntax - if(condition) { body/block code }
 */
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defaultSalary = 750;

        System.out.print("Enter your salary: ");
        int salary = scanner.nextInt();

        if(salary >= defaultSalary) {
            System.out.println("Congo, You are eligible to take loan!");
        }

        if(salary < defaultSalary) {
            System.out.println("Ohho, You are not eligible to take loan!");
            System.out.print("You Should have at least monthly salary of: ");
            System.out.println(defaultSalary);
        }
        
        scanner.close();
    }
}
