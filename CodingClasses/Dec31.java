import java.util.*;
public class Dec31 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        int pdt=1;
        System.out.println("Enter the elements:");
        for(int i:a)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Array elements are :"+a[0]+""+a[1]);

        for(int i : a)
        {
            pdt=pdt*i;
        }
        System.out.println("Product ="+pdt);
    }
}
