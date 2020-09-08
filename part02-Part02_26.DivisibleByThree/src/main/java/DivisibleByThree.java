/*
Write a method public static void divisibleByThreeInRange(int beginning, int end) 
that prints all the numbers divisible by three in the given range. The numbers are 
to be printed in order from the smallest to the greatest.
*/


import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(1,16);
    }
    //method written
    public static void divisibleByThreeInRange(int beginning, int end){
        Scanner scanner = new Scanner(System.in);
        /*for loop here takes the value associated with int beginning, then while
        i <= end, it outputs values in increments of 1 which is called for printing out i
        */
        for (int i = beginning; i <= end; i++ ){
        // if statement is added to output numbers divisible by 3
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}