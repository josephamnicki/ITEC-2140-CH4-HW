/**
 * @class: StringComparison
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: March 13, 2023
 * @description: This program will compare the lengths of two strings put in by the user, determine which
 * comes first in alphabetical order, and combines the two strings into one sentence.
 */
import java.util.Scanner;
public class StringComparison {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first string: ");
        String one = in.nextLine();
        //prompts user for first string and stores it
        System.out.println("Enter your second string: ");
        String two = in.nextLine();
        //prompts user for second string and stores it
        int order = one.compareTo(two);
        //compares the alphabetical order of each string based on the first character of the string
        //if the comparison returns less than 0, the string appears before the other in alphabetical order

        if(one.length() > two.length()){
            System.out.println("String " + one + " is longer than String " + two);
            //prints out message saying string one is longer than string two if string one is longer
        }
        else{
            System.out.println("String " + two + " is longer than String " + one);
            //prints out message saying string two is longer than string one if string two is longer
        }
        if(order < 0){
            System.out.println("String " + one + " appears before String " + two + " in lexicographic order");
            //prints out message saying string one appears before string two in alphabetical order based on first character
        }
        else{
            System.out.println("String " + two + " appears before String " + one + " in lexicographic order");
            //prints out message saying string two appears before string one in alphabetical order based on first character
        }
        System.out.println("New sentence created is " + one + " " + two);
        //combines both strings into one sentence
    }
}
