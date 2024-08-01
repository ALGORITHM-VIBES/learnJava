/*
 * @ifelse - it check all if and else if statements if any stated true it will execute that block of code otherwise else block.
 * @syntax - if(condition) { if block code } else if(condition) { else if block code } else { else block code }.
 */
import java.util.Scanner;

public class ElseIfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defaultSalary = 750;

        System.out.print("Enter your salary: ");
        int salary = scanner.nextInt();

        if(salary >= defaultSalary) {
            System.out.println("Congo, You are eligible to take loan!");
        } else if(salary < defaultSalary) {
            System.out.println("Ohho, You are not eligible to take loan!");
            System.out.print("You Should have at least monthly salary of: ");
            System.out.println(defaultSalary);
        }
        
        scanner.close();
    }
}
