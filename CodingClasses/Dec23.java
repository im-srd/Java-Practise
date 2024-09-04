import java.util.*;
public class Dec23 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b)
            if(a>c)
                System.out.println("Greater :"+a);
            else System.out.println("Greater :"+c);
        else if(b>a)
            if(b>c)
                System.out.println("Greater :"+b);
            else System.out.println("Greater :"+c);
        else if(c>a)
            if (c>b)
                System.out.println("Greater :"+c);
            else System.out.println("Greater :"+c);
    }
}
