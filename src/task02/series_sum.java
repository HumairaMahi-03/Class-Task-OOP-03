package task02;
import java.util.Scanner;

public class series_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;

        for(int i=2;i<=num;i=i+2){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
