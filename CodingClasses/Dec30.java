import java.util.*;
public class Dec30 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //for-each Syntax:
        // for (dataType varName : arrayName)   { definition }
        int avg=0;
        int sum=0;
        int age[]={18,22,25,30,35};
        System.out.println("Elements in age :");
        for(int var :age)
        {
            System.out.print(var+" ");  //for -->a[i]    for each--> i
            sum=sum+var;
        }
        avg=sum/(age.length);
        System.out.print("\nAverage ="+avg);
    }
}