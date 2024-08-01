/*
 * @ifelse - it used to check whether condition is true or flase if true it will run if block code otherwise else block.
 * @syntax - if(condition) { if block code } else { else block code }.
 */
import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defaultSalary = 750;

        System.out.print("Enter your salary: ");
        int salary = scanner.nextInt();

        if(salary >= defaultSalary) {
            System.out.println("Congo, You are eligible to take loan!");
        } else {
            System.out.println("Ohho, You are not eligible to take loan!");
            System.out.print("You Should have at least monthly salary of: ");
            System.out.println(defaultSalary);
        }
        
        scanner.close();
    }
}
