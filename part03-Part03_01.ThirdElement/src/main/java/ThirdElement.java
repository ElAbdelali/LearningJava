
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      Array of type String is created
//      While Boolean statement takes the inputs and assigns them a value in the ArrayList
//      Which is done by the list.add(input);
//      If the user doesn't input anything, we break out of the loop and end up outputting the 3rd value in the list of recorded values
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println(list.get(2));
    }
}
