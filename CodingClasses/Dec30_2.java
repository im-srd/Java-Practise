import java.util.*;
public class Dec30_2 {
    public static void main(String args[])
    {
        int flag=0;   //false --> not found
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element you want to search in the element:");
        int input = sc.nextInt();
        int arr[]={10,20,30,40,50};
        for(int a : arr)
        {
            if(a==input)
                flag=1;     //true--> found
        }

        if (flag==1)
            System.out.print("Match Found -->"+input);
        else
            System.out.print("Match not found.");
    }
}
