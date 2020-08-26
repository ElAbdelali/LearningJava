
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());
        int remainder = number % 2;
        System.out.println("Give a number: ");
        if (remainder != 0){
            System.out.println("Number " + number + " is odd.");
        } else if(remainder == 0){
            System.out.println("Number " + number + " is even.");
        }
    }
}
