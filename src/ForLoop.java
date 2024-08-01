/*
 * @for - okey so for loop gives us great advantage where we can declare iteration part within the body.
 * @syntax - for(variable declare; condition; increment/decrement) { block code }
 */

public class ForLoop {
    public static void main(String[] args) {
        for(var i = 0; i < 10; i++) {
            System.out.println(i+1);
        }
    }
}
