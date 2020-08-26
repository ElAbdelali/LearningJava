

public class Division {

    public static void main(String[] args) {
        /*Write a method public static void division(int numerator, int denominator) that prints the 
          result of the division of the numerator by the denominator. Keep in mind that the result of the 
          division of the integers is an integer — in this case we want the result to be a floating point number. */
        division(3, 5);
        
    }

    public static void division(int numerator, int denominator){
        System.out.println(numerator + " / " + denominator + " = " + (1.0 * numerator/denominator));
    }
}
