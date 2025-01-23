package task03;
import java.util.Scanner;

public class store_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        double[] number=new double[n];
        for(int i=0;i<n;i++){
            number[i]=sc.nextDouble();
            sum=sum+number[i];
        }
        System.out.println("avarage"+sum/n);


    }
}
