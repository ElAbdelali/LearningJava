
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumNum = 0;
        int amtNum = 0;
        
        while (true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            } 
            sumNum = sumNum + num;
            amtNum = amtNum + 1;
        }
        System.out.println("Number of numbers: " + amtNum);
        System.out.println("Sum of the numbers: " + sumNum);
    }
}
