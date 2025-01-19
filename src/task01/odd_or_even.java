package task01;

import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        if(a%2==0){
            System.out.println("it is an even number.");
        }
        else{
            System.out.println("it is an odd number.");
        }
    }
}
