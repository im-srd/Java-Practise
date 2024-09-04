import java.util.*;
public class Dec28 {
    public static void main(String args[]){
        System.out.println("Enter the number you want to see the table");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
