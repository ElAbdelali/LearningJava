
public class AdvancedAstrology {

    public static void printStars(int number) {
        int stars = 1;
        while (stars <= number){
            System.out.print("*");
            stars++;
        }
    }

    public static void printSpaces(int number) {
        int spaces = 0;
        while (number > spaces){
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        int numOfStars = 1;
        int numOfSpaces = (size - 1);
       
        for (int i = 0; i < size; i++){
            printSpaces(numOfSpaces);
            printStars(numOfStars);
            numOfSpaces--;
            numOfStars++;
            System.out.println("");
        } 

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
