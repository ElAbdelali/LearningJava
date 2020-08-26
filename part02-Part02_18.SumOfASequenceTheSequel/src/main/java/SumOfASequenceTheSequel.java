
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("First number?");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int finish = Integer.valueOf(scanner.nextLine());
        //above code asks the user for two values, a start and finish
        //integer sum initilized 
        while(start <= finish){
            sum += start;
            start++;
        }
        System.out.println("The sum is" + sum);
    }
}
