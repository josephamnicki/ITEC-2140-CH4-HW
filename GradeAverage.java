/**
 * @class: GradeAverage
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: February 26, 2023
 * @description: This program will prompt the user for grades then provide an average of the grades.
 */
import java.util.Scanner;
public class GradeAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first grade to add to the average: ");
        //prompts user to type in first grade
        int grade = in.nextInt();
        //stores input for first grade
        int average;
        //variable for average
        int i = 2;
        //begins dividing sum of grades by 2 and increases with each grade
        int sum;
        //sum of grades
        int stop = 999;
        //sentinel value to stop loop

                while(grade >= 0 && grade <= 100 && grade != stop) {
                    //begins to divide the sum of both grades by two as long as the grade is between 0 and 100
                    System.out.println("Enter another grade, or type stop: ");
                    grade = grade + in.nextInt();
                    //sum of first and second grades put in
                    sum = grade;
                    //establishes sum value here
                    average = sum / i;
                    //average of sum by total number of grades
                    i++;
                    //increases with each grade added
                    //continues to average the grade scores by the number of grades typed in
                    System.out.println("Grade average is: " + average);
                    //puts out a statement saying the grade average
                }
            }
        }
