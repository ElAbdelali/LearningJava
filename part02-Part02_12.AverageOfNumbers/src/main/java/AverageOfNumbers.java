
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avgNum = 0;
        double amtNum = 0;
        double sumNum = 0;
        
        while (true){
            System.out.println("Give a number: ");
            double num = Double.valueOf(scanner.nextLine());
            
            if (num == 0){
                break;
            }
            sumNum = sumNum + num;
            amtNum = amtNum + 1;
            avgNum = sumNum / amtNum;
        }
        System.out.println("Average of the numbers: " + avgNum);
    }
}
