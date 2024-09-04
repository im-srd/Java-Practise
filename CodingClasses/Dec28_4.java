import java.util.*;
public class Dec28_4 {
    public static void main(String args[]){
        //Divisible by 3 and 5 both (1-100)
        int count=0;
        System.out.print("Numbers divisible by 3 and 5 both are: ");
        for(int i=1;i<=100;i++)
        {
            if (i%3==0 && i%5==0)
            {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("Count ="+count);
    }
}
