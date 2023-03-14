/**
 * @class: PrimeOrNot
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: February 26, 2023
 * @description: This program will determine whether the number input is a prime number or not.
 */
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //inserts scanner
        System.out.println("Enter any positive integer: ");
        //prompts user to type in number
        int number = in.nextInt();
        //stores value put in by user

        boolean not = false;
        //assumes number is prime until put into loop
        for (int i = 2; i <= number; i++) {
            //begins to divide by two, continues to increase divisor until number can be evenly divided
            if (number % i == 0) {
                not = true;
                //changes to not a prime number if the number is divisible by a number other than 1
            }
            }
            if(not){
                System.out.println(number + " is not a prime number");
                //puts out statement saying the number is not a prime number
            }else
                System.out.println(number + " is a prime number");
            //puts out statement saying the number is a prime number
        }
    }
