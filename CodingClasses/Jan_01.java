import java.util.*;
public class Jan_01 {
    public static void main(String args[]){
       //a to the power b
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b :");
        int a=sc.nextInt();
        float b=sc.nextFloat();
//        int pdt=1;
//        for (int i=0;i<b;i++)
//            pdt=pdt*a;
//        System.out.println("a^b ="+pdt);
        // Math --> sqrt() , pow(),
        System.out.println("a^b ="+Math.pow(a,b));
        System.out.println("a^b ="+Math.pow(4.33,3.89));
        System.out.println(" sqrt of a"+Math.sqrt(a));



    }
}
