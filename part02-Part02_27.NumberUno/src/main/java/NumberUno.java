
import java.util.Scanner;

public class NumberUno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*we then assign a variable int equal to numberUno and
      call it to display the number we assigned it to return.
    */
        int integer = numberUno();
        System.out.println(integer);
    }
    /*wanting to return a value here, thus, void is replaced with the value we want
    being a integer. We want the integer, assigned to variable (numberUno) to return 1. 
    */
    public static int numberUno(){
        return 1;
    }
}
