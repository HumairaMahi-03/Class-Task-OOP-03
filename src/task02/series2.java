package task02;
import java.util.Scanner;

public class series2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1;i<=num;i=i+2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}