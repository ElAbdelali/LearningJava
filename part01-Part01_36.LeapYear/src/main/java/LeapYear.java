
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());
        boolean valid = (year % 100 != 0 && year % 4 == 0 || year % 400 == 0);
        if (valid){
            System.out.println("This is a leap year.");
        } else { 
            System.out.println("The year is not a leap year.");
        }

    }
}
