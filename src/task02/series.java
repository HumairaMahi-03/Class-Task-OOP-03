package task02;
import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=2;i<=num;i=i+2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
