import java.util.*;
public class Dec28_5 {
    public static void main(String args[]){
        //Enter the half String.
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the even string:");
        String str=sc.nextLine();
        if (str.length()%2==0)
        {
            for(int i=0;i<(str.length()/2);i++)
            {
                System.out.print(str.charAt(i));
            }
        }

    }
}
