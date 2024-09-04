import java.util.*;
public class Dec28_2 {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a,b;
    int temp = 0;
    System.out.println("Enter the value of a and b:");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("Your previous value of a and b \na="+a+" b="+b);
    temp=a;    // a = a+b
    a=b;       // b = a-b
    b=temp;    // a = a-b
    System.out.println("Your values of a and b after Swap\na="+a+" b="+b);
    }
}
