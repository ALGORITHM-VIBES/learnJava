/*
 * @switch expression - it is used to stated one case value and directly assign it to variable.
 * @syntax: variable = switch(value) { case 1-> value; case 2 -> { yield value; } default: value; }
 * @note - you case use as many cases you want.
 */
import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String message = switch (age) {
            case 12 -> "Hello, buddy!";
            case 13 -> "Congo, for becoming teenager!";
            case 18 -> {
                yield "Hello, Adult!";
            }    

            default -> "Not have much information about it.";
        };

        System.out.println(message);
    }
}
