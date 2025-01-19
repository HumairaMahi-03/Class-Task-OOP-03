package task01;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int score =sc.nextInt();
        String grade;
        if (score >= 90) {
            grade = "A+";
        } else if (score >= 80) {
            grade = "A";
        } else if (score >= 70) {
            grade = "A-";
        } else if (score >= 60) {
            grade = "B";
        } else if (score >= 40) {
            grade = "C+";
        } else {
            grade = "F";
        }
        System.out.println("The grade is: " + grade);
    }

}
