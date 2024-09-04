import java.util.*;
public class Dec31_2 {
    public static void main(String args[])
    {
        //2D Array
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no of row");
        int r=sc.nextInt();  //row
        System.out.println("Enter the no of column");
        int c=sc.nextInt();  //column
        System.out.print("Enter the elements of array.");
        int a[][]=new int [r][c];

        for (int i=0; i<r ; i++){
            for (int j=0;j<c;j++){
                a[i][j]=sc.nextInt();}}

        System.out.println("Your 2D array are :");

        for (int i=0; i<r ; i++){
            System.out.println();
            for (int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");}}


    }
}
