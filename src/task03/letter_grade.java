package task03;
import java.util.Scanner;
public class letter_grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double grade=sc.nextDouble();
        String s=sc.next().toLowerCase();
        if(grade>=3.5){
            if(s.equals("yes")){
                System.out.println("congratulation, The student qualifies for a medal. ");
            }else{
                System.out.println("The student has a good grade but did not complete the semester, so no medal.");
            }
        }
        else{
            if(s.equals("yes")){
                System.out.println("the student has completed the graduation but he has a bad grade");
            }else{
                System.out.println("The student's grade is below 3.5, so they do not qualify for a medal.");
            }

        }

    }
}
