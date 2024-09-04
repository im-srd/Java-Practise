//print sum of the series 1 + (1+2) + (1+2+3) + ..... + (1+2+3+4+5+...n)
import java.util.*;
public class Dec28_7 {
    public static void main(String args[]){
        System.out.println("Enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
        System.out.print("(");
            for(int j=1;j<=i;j++){
                System.out.print(j);
                if(j<i)
                    System.out.print("+");
                sum=sum+j;
            }
            System.out.print(")+");
        }
        System.out.println("="+sum);
    }
}
