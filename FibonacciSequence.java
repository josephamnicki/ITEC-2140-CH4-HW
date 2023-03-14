/**
 * @class: FibonacciSequence
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: March 13, 2023
 * @description: This program will print out the first 30 terms of the Fibonacci Sequence.
 */
public class FibonacciSequence {
    public static void main(String[] args){
        int n = 30;
        //number of terms to repeat the sequence

        int a = 0,b = 1, c, i = 0;
        //establishes first values of Fibonacci sequence
        System.out.println("The first 30 terms of the Fibonacci Sequence are: ");
        //prints out message saying the first 30 terms of the sequence

        while(i < n){
            //loop continues until the 30th term is reached
            System.out.print(a + " ");
            c = a + b;
            //sum of first two numbers
            a = b;
            //sequence begins with one and adds off the last value of a
            b = c;
            //adds off the last value for the sum of a and b
            i++;
            //increases with each term printed
        }
    }
}
