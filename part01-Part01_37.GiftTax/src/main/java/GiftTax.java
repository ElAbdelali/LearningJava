
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double giftValue = Double.valueOf(scan.nextLine());
        if (giftValue < 5000){
            System.out.println("No tax!");
        }else if (5000 < giftValue && giftValue < 25000){
            System.out.println("Tax: " + (100 + (giftValue - 5000) * .08));     
        }else if (25000 <= giftValue && giftValue < 55000){
            System.out.println("Tax: " + (1700 + (giftValue - 25000) * .1));
        }else if (55000 <= giftValue && giftValue < 200000){
            System.out.println("Tax: " + (4700 + (giftValue - 55000) * .12));
        }else if (200000 <= giftValue && giftValue < 1000000){
            System.out.println("Tax: " + (22100 + (giftValue - 200000) * .15));
        }else if (giftValue >= 1000000){
            System.out.println("Tax: " + (142100 + (giftValue - 1000000) * .17));
        }
    }
}
