 import java.io.*;
import java.util.*;

         public class SumOfSubsets {
 static int c=0;
 public static void main(String args[]) {
         int s[]=new int[10];
         int x[]=new int[10];
         int n,d,sum,i;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of elements");
         n=sc.nextInt();
         System.out.println("Enter the elements in ascending order");
        for(i=0;i<n;i++) {
             s[i]=sc.nextInt();
             }
         sum=0;
         System.out.println("Enter the positive value of sum");
         d=sc.nextInt();
        for(i=0;i<n;i++)
             sum+=s[i];
        if(sum<d || s[0]>d) {
             System.out.println("Solution is not possible");
             System.exit(0);
             }
         subset(0,0,sum,s,x,d);
        if(c==0) {
             System.out.println("Solution is not possible");
             }
         }
 static void subset(int cs,int k,int r,int s[],int x[],int d) {
         int i;
         x[k]=1;
         if(cs+s[k]==d) {
             c++;
            System.out.print("\nSolution"+c+"is {");
            for(i=0;i<=k;i++) {
                if(x[i]==1) {
                     System.out.print(s[i]+" ");
                    }
                 }
             System.out.println("}");
             }
         else if(cs+s[k]+s[k+1]<=d)
             subset(cs+s[k],k+1,r-s[k],s,x,d);
         if(cs+r-s[k]>=d && cs+s[k+1]<=d) {
             x[k]=0;
             subset(cs,k+1,r-s[k],s,x,d);
             }
         }

        }