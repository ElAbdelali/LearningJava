

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }
    public static void printFromNumberToOne(int number){
        int x = 1;
        while(number >= x){
            System.out.println(number--);
        }
    }
}
