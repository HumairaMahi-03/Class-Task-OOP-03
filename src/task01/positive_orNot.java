package task01;
import java.util.Scanner;

public class positive_orNot {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        if(a>0){
            System.out.println("Yes it is a positive number.");
        }
        else{
            System.out.println("No, it isn't a positive number.");
        }
    }
}
