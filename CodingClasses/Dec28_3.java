import java.util.*;
public class Dec28_3 {
    public static void main(String args[]){
        //Sum of first n natural numbers.
        int sum=0;
        int n=10; //we can take this from user also
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of first 10 natural numbers ="+sum);
    }
}
