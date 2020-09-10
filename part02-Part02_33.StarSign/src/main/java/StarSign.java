
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(9, 6);
        System.out.println("\n---");
        printTriangle(8);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        /*assigning a value to int stars, 1, which is then included in the while loop
        which states that when int value stars is less than or equal to number, which is 
        given above when the method is called, print out "*" and then add to the stars value
        by increments of 1 till it is greater than number which then stops since it is false.
        */
        int stars = 1;
        while (stars <= number){
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int length = 1;
        while (length <= size){
            printStars(size);
            length++;
        }
    }

    public static void printRectangle(int width, int height) {
        int length = 1;
        while (length <= height){
            printStars(width);
            length++;
        }
    }

    public static void printTriangle(int size) {
        int initial = 1;
        while (initial <= size){
            printStars(initial);
            initial++;
        }
    }
}
