/**
 * @class: StarPattern
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: March 13, 2023
 * @description: This program will print out a pattern of stars in descending order.
 */
public class StarPattern{
    public static void main(String[] args){

        for(int row = 0; row < 6; row++){
            //determines the number of rows in the pattern and continues until the final row is printed

            for(int column = 1; column <= 6 - row ; column++){
                //begins with one column and continues printing until the final row is reached
                System.out.print("*");
                //character being printed out in pattern
            }
            System.out.println();
            //prints out different lines for each loop completed
        }
    }
}
