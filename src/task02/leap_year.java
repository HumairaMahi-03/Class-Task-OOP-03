package task02;
import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400==0 || year%4==0){
            System.out.println("the year is leap year");
        }
        else{
            System.out.println("No,the year isn't a leap year");
        }
    }
}
