/**
 * @class: SumOfIntegers
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: February 26, 2023
 * @description: This program will display the sum of the digits from a provided integer.
 */
import java.util.Scanner;
public class SumOfIntegers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //inserts scanner
        System.out.println("Enter any positive integer: ");
        //prompts user to type in integer
        int number = in.nextInt();
        //stores integer put in by user
        int sum = 0;
        //initial sum of digits is 0

        while(number > 0){
            sum = sum + number % 10;
            //stores value of first digit
            number = number / 10;
            //reduces value of first number represented by digit to value of digit
        }
        System.out.println("Sum of digits is: " + sum);
        //puts out statement saying the sum of the digits
    }
}
