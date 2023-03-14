/**
 * @class: GradeHighAndLow
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: March 13, 2023
 * @description: This program will determine whether the number input is a prime number or not.
 */
import java.util.Scanner;
public class GradeHighAndLow {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a grade, or enter 999 to stop: ");
        //prompts user for grade
        int grade = in.nextInt();
        //stores input for grade
        int minimum = 0;
        int maximum = 0;
        //minimum and maximum begin as 0 since no values have been compared yet
        int stop = 999;
        //sentinel value to stop loop

        while(grade >= 0 && grade <= 100 && grade != stop);
        //continues loop as long as grade falls between 1 and 100 and the sentinel value is not typed
        System.out.println("Enter a grade, or enter 999 to stop: ");
        {
            if(grade > maximum){
                maximum = grade;
                //stores grade as highest grade
            }
            if(grade > minimum){
                minimum = grade;
                //stores grade as lowest grade
            }
            System.out.println("Enter a grade, or enter 999 to stop: ");
            //continues printing prompt to enter grades
        }
        System.out.println("The maximum grade is " + maximum);
        System.out.println("The minimum grade is " + minimum);
        //prints out highest and lowest grades at end of loop
    }
}
