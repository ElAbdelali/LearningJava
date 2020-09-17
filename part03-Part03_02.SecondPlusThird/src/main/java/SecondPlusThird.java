
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// ArrayList of type Integer named numbers is created
// While statement takes the value of int (Integer) and places them in the list in order from 0-infinity
// if user inputs a 0, the while statement breaks. When it breaks, we call the 2nd and third values and sum them together
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            
            numbers.add(number);
        }

        System.out.println(numbers.get(1) + numbers.get(2));
    }
}
