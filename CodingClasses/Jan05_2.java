import java.util.*;
public class Jan05_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        Jan05_2 j=new Jan05_2();
        if(n<0)
            System.out.print("Not Possible.");
        else{
        int fact=j.fact(n);
        System.out.println(n+"! ="+fact);
        }
    }

    private static int fact(int n) {
        if(n==0)
            return 1;
//        else if (n<0)
//            return n * (n+1);
        else
            return n * fact(n-1);
    }
}
