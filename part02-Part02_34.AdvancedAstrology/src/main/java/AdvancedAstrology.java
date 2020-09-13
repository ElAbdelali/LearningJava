public class AdvancedAstrology {
 
    public static void printStars(int number) {
        int stars = 1;
        while (stars <= number){
            System.out.print("*");
            stars++;
        }
        System.out.println("");
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
        } 
 
    }
 
    public static void christmasTree(int height) {
        int numOfStars = 1;
        int numOfSpaces = (height - 1);
        for (int i = 0; i < height; i++){
            printSpaces(numOfSpaces);
            printStars(numOfStars);
            numOfSpaces--;
            numOfStars += 2;
        }
        int spaces =  height - 2;
        printSpaces(spaces);
        System.out.println("***");
        printSpaces(spaces);
        System.out.println("***");
    }
 
    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
 
        printTriangle(3);
        System.out.println("---");
        christmasTree(3);
        System.out.println("---");
        christmasTree(10);
    }
}