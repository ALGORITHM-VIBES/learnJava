/*
 * @do while - it will excuted once if the condition of while is true or false then behave like while while loop.
 * @syntax - do { block code } while(condition)
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        var doNext = false;
        int i = 0;

        do { 
            doNext = true;

            if(i == 1) {
                doNext = false;
            }

            System.out.println(i+1);

            i++;
        } while (doNext);
    }
}
