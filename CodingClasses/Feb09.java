import java.util.*;
public class Feb09 {
    public static void main(String apple[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of lines : ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println();
            for (int j=0; j<(n/2); j++){
                System.out.print("*");

            }
        }

    }
}
