/**
 * @class: ReverseString
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: March 13, 2023
 * @description: This program will print the user's string in reverse.
 */
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        //prompts user to enter a string
        String s = in.nextLine();
        //stores string typed in by user

        for(int i = s.length() - 1; i >= 0; i--){
            //goes through each character's index until the end of the string
            System.out.print(s.charAt(i));
            //prints out the character at the index i
        }
    }
}
