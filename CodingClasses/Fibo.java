import java.util.*;
public class Fibo {
    public static void main(String args[]){
        //Fibo series : 0 1 1 2 3 5 8 13 .....
        Scanner sc=new Scanner(System.in);
        System.out.println("Kha tak ka dikhana h");
        int n=sc.nextInt();

        int a1=0; //first no
        int a2=1; //second no
        System.out.print(a1+" "+a2+" ");
        for(int i=2;i<n;i++)
        {
          int a3=a1+a2;
          System.out.print(a3+" ");
            a1=a2;
            a2=a3;
        }
    }
}
