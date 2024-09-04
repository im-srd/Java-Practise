import java.util.*;
public class Dec28_6 {
    public static void main(String args[]){
        //find the sum of numbers that will be divisible by 7 ranging from 1 to 100
        int sum=0;
        for (int i=1;i<=100;i++)
        {
            if(i%7==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum ="+sum);
    }
}
