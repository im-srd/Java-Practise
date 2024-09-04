import java.util.*;
public class Arryy {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //type 1
//        int arr[]={12,34,666,778,500};
        //type 2
        int arr1[]=new int[5];

//        arr1[0]=sc.nextInt();
//        arr1[1]=sc.nextInt();
//        arr1[2]=sc.nextInt();
        System.out.println("Enter the elements");
        for (int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }

        //Display array elements
//        System.out.print(arr1[1]);
        System.out.println("Your elements");
        for (int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" "); //0 --> arr1.length
        }
    }
}
