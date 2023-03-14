/**
 * @class: FactorialCalculator
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: March 13, 2023
 * @description: This program will print out the factorial of an integer put in by the user.
 */
import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        //prompts user for integer value
        int number = in.nextInt();
        //stores input integer
        int factorial = 1;
        //placeholder value for factorial

        for(int i = 1; i <= number; i++){
            //as long as i does not exceed the value of the integer, the number will be multiplied by i
            factorial = factorial * i;
            //multiplication for factorial
        }
        System.out.println("The factorial of " + number + "!" + " is " + factorial);
        //prints out message saying factorial of user input
    }
}
